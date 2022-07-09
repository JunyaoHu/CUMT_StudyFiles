package net.mooctest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import net.mooctest.SegmentTree.Data;

/**
 * Segment tree is a balanced-binary-tree based data structure efficient for
 * detecting all intervals (or segments) that contain a given point. The
 * segments may overlap with each other. The end points of stored segments
 * are inclusive, that is, when an interval spans from 2 to 6, an arbitrary
 * point x within that interval can take a value of 2 <= x <=6.
 */
public final class DynamicSegmentTree<D extends Data> extends SegmentTree<D> {

    private static final Comparator<OverlappingSegment<?>> START_COMPARATOR = new Comparator<OverlappingSegment<?>>() {
        /**
         * {@inheritDoc}
         */
        public int compare(OverlappingSegment<?> arg0, OverlappingSegment<?> arg1) {
            if (arg0.start < arg1.start)
                return -1;
            if (arg1.start < arg0.start)
                return 1;
            return 0;
        }
    };

    private static final Comparator<OverlappingSegment<?>> END_COMPARATOR = new Comparator<OverlappingSegment<?>>() {
        /**
         * {@inheritDoc}
         */
        public int compare(OverlappingSegment<?> arg0, OverlappingSegment<?> arg1) {
            if (arg0.end < arg1.end)
                return -1;
            if (arg1.end < arg0.end)
                return 1;
            return 0;
        }
    };

    public DynamicSegmentTree(List<D> data) {
        this(data, 1);
    }

    public DynamicSegmentTree(List<D> data, int minLength) {
        if (data.size() <= 0)
            return;

        // Check for gaps
        final List<OverlappingSegment<D>> segments = new ArrayList<OverlappingSegment<D>>();
        for (int i = 0; i < data.size(); i++) {
            if (i < data.size() - 1) {
                final Data d1 = data.get(i);
                final OverlappingSegment<D> s1 = new OverlappingSegment<D>(minLength, d1.start, d1.end, (D) d1);
                segments.add(s1);

                final Data d2 = data.get(i + 1);
                if (d2.start - d1.end > 1) {
                    final Data d3 = d1.copy();
                    d3.clear();
                    d3.start = d1.end + 1;
                    d3.end = d2.start - 1;

                    final OverlappingSegment<D> s3 = new OverlappingSegment<D>(minLength, d3.start, d3.end, (D) d3);
                    segments.add(s3);
                }
            } else {
                final Data d1 = data.get(i);
                final OverlappingSegment<D> s1 = new OverlappingSegment<D>(minLength, d1.start, d1.end, (D) d1);
                segments.add(s1);
            }
        }

        // First start first
        Collections.sort(segments, START_COMPARATOR);
        final OverlappingSegment<D> startNode = segments.get(0);
        final long start = startNode.start - 1;
        final OverlappingSegment<D> s1 = new OverlappingSegment<D>(minLength, start, startNode.start, null);
        segments.add(0, s1);

        // Last end last
        Collections.sort(segments, END_COMPARATOR);
        final OverlappingSegment<D> endNode = segments.get(segments.size() - 1);
        final long end = endNode.end + 1;
        final OverlappingSegment<D> s2 = new OverlappingSegment<D>(minLength, endNode.end, end, null);
        segments.add(s2);

        final int length = (int) (end - start) + 1;
        root = OverlappingSegment.createFromList(minLength, segments, start, length);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public D query(long index) {
        return this.query(index, index);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public D query(long startOfQuery, long endOfQuery) {
        if (root == null)
            return null;

        long s = startOfQuery;
        long e = endOfQuery;
        if (s < root.start)
            s = root.start;
        if (e > root.end)
            e = root.end;

        final D result = root.query(s, e);
        // reset the start and end, it can change during the query
        result.start = startOfQuery;
        result.end = endOfQuery;
        return result;
    }

    /**
     * Data structure representing a possibly overlapping segment.
     */
    protected static final class OverlappingSegment<D extends Data> extends Segment<D> {

        // Separate range set for fast range queries
        protected Set<Segment<D>> range = new HashSet<Segment<D>>();

        public OverlappingSegment(int minLength) {
            super(minLength);
        }

        public OverlappingSegment(int minLength, long start, long end, D data) {
            super(minLength);

            this.start = start;
            this.end = end;
            this.length = ((int) (end - start)) + 1;
            if (data == null)
                return;
            this.data = ((D) data.copy());
        }

        protected static <D extends Data> Segment<D> createFromList(int minLength, List<OverlappingSegment<D>> segments, long start, int length) {
            final OverlappingSegment<D> segment = new OverlappingSegment<D>(minLength);
            segment.start = start;
            segment.end = start + (length - 1);
            segment.length = length;

            for (Segment<D> s : segments) {
                if (s.data == null)
                    continue;
                if (s.end < segment.start || s.start > segment.end) {
                    // Ignore
                } else {
                    segment.range.add(s);
                }
                if (s.start == segment.start && s.end == segment.end) {
                    if (segment.data == null)
                        segment.data = ((D) s.data.copy());
                    else
                        segment.data.combined(s.data); // Update our data to reflect all children's data
                } else if (!segment.hasChildren() && s.start >= segment.start && s.end <= segment.end) {
                    if (segment.data == null)
                        segment.data = ((D) s.data.copy());
                    else
                        segment.data.combined(s.data); // Update our data to reflect all children's data
                }
            }

            // If segment is greater or equal to two, split data into children
            if (segment.length >= 2 && segment.length >= minLength) {
                segment.half = segment.length / 2;

                final List<OverlappingSegment<D>> s1 = new ArrayList<OverlappingSegment<D>>();
                final List<OverlappingSegment<D>> s2 = new ArrayList<OverlappingSegment<D>>();
                for (int i = 0; i < segments.size(); i++) {
                    final OverlappingSegment<D> s = segments.get(i);
                    final long middle = segment.start + segment.half;
                    if (s.end < middle) {
                        s1.add(s);
                    } else if (s.start >= middle) {
                        s2.add(s);
                    } else {
                        // Need to split across middle
                        final OverlappingSegment<D> ss1 = new OverlappingSegment<D>(minLength, s.start, middle - 1, s.data);
                        s1.add(ss1);

                        final OverlappingSegment<D> ss2 = new OverlappingSegment<D>(minLength, middle, s.end, s.data);
                        s2.add(ss2);
                    }
                }

                final Segment<D> sub1 = createFromList(minLength, s1, segment.start, segment.half);
                final Segment<D> sub2 = createFromList(minLength, s2, segment.start + segment.half, segment.length - segment.half);
                segment.segments = new Segment[] { sub1, sub2 };
            }

            return segment;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public D query(long startOfQuery, long endOfQuery) {
            D result = null;

            // Use the range data to make range queries faster
            if (startOfQuery == this.start && endOfQuery == this.end) {
                for (Segment<D> s : this.range) {
                    final D temp = (D) s.data.query(startOfQuery, endOfQuery);
                    if (temp != null) {
                        if (result == null)
                            result = (D) temp.copy();
                        else
                            result.combined(temp);
                    }
                }
            } else if (!this.hasChildren()) {
                if (endOfQuery < this.start || startOfQuery > this.end) {
                    // Ignore
                } else {
                    for (Segment<D> s : this.range) {
                        if (endOfQuery < s.start || startOfQuery > s.end) {
                            // Ignore
                        } else {
                            final D temp = (D) s.data.query(startOfQuery, endOfQuery);
                            if (temp != null) {
                                if (result == null)
                                    result = (D) temp.copy();
                                else
                                    result.combined(temp);
                            }
                        }
                    }
                }
            } else {
                final long middle = this.start + this.half;
                D temp = null;
                if (startOfQuery < middle && endOfQuery >= middle) {
                    temp = this.getLeftChild().query(startOfQuery, middle - 1);
                    D temp2 = this.getRightChild().query(middle, endOfQuery);
                    if (temp2 != null) {
                        if (temp == null)
                            temp = (D) temp2.copy();
                        else
                            temp.combined(temp2);
                    }
                } else if (endOfQuery < middle) {
                    temp = this.getLeftChild().query(startOfQuery, endOfQuery);
                } else if (startOfQuery >= middle) {
                    temp = this.getRightChild().query(startOfQuery, endOfQuery);
                }
                if (temp != null)
                    result = (D) temp.copy();
            }

            return result;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder();
            builder.append(super.toString()).append(" ");
            builder.append("Range=").append(range);
            return builder.toString();
        }
    }
}
