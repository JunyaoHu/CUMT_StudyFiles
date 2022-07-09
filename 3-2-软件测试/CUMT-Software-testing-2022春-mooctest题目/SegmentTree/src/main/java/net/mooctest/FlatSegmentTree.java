package net.mooctest;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import net.mooctest.SegmentTree.Data;

/**
 * Flat segment tree is a variant of segment tree that is designed to store
 * a collection of non-overlapping segments. This structure is efficient
 * when you need to store values associated with 1 dimensional segments that
 * never overlap with each other. The end points of stored segments are
 * inclusive, that is, when a segment spans from 2 to 6, an arbitrary point
 * x within that segment can take a value of 2 <= x <= 6.
 */
public final class FlatSegmentTree<D extends Data> extends SegmentTree<D> {

    public FlatSegmentTree(List<D> data) {
        this(data, 1);
    }

    public FlatSegmentTree(List<D> data, int minLength) {
        if (data.size() <= 0)
            throw new InvalidParameterException("Segments list is empty.");

        Collections.sort(data); // Make sure they are sorted

        // Make sure they don't overlap
        if (data.size() >= 2) {
            for (int i = 0; i < (data.size() - 2); i++) {
                Data s1 = data.get(i);
                Data s2 = data.get(i + 1);
                if (s1.end > s2.start)
                    throw new InvalidParameterException("Segments are overlapping.");
            }
        }

        // Check for gaps
        final List<NonOverlappingSegment<D>> segments = new ArrayList<NonOverlappingSegment<D>>();
        for (int i = 0; i < data.size(); i++) {
            if (i < data.size() - 1) {
                final Data d1 = data.get(i);
                final NonOverlappingSegment<D> s1 = new NonOverlappingSegment<D>(minLength, d1.start, d1.end, (D) d1);
                segments.add(s1);
                final Data d2 = data.get(i + 1);
                if (d2.start - d1.end > 1) {
                    final Data d3 = d1.copy();
                    d3.clear();
                    d3.start = d1.end + 1;
                    d3.end = d2.start - 1;
                    final NonOverlappingSegment<D> s3 = new NonOverlappingSegment<D>(minLength, d3.start, d3.end, (D) d3);
                    segments.add(s3);
                }
            } else {
                final Data d1 = data.get(i);
                final NonOverlappingSegment<D> s1 = new NonOverlappingSegment<D>(minLength, d1.start, d1.end, (D) d1);
                segments.add(s1);
            }
        }

        final long start = segments.get(0).start;
        final long end = segments.get(segments.size() - 1).end;
        final int length = (int) (end - start) + 1;
        root = NonOverlappingSegment.createFromList(minLength, segments, start, length);
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

        return root.query(s, e);
    }

    /**
     * Data structure representing a non-overlapping segment.
     */
    protected static final class NonOverlappingSegment<D extends Data> extends Segment<D> {

        private Set<Segment<D>> set = new TreeSet<Segment<D>>();

        public NonOverlappingSegment(int minLength) {
            super(minLength);
        }

        public NonOverlappingSegment(int minLength, D data) {
            this(minLength, data.start, data.end, data);
        }

        public NonOverlappingSegment(int minLength, long start, long end, D data) {
            super(minLength);

            this.start = start;
            this.end = end;
            this.length = ((int) (end - start)) + 1;
            if (data == null)
                return;
            this.data = ((D) data.copy());
        }

        protected static <D extends Data> Segment<D> createFromList(int minLength, List<NonOverlappingSegment<D>> segments, long start, int length) {
            final NonOverlappingSegment<D> segment = new NonOverlappingSegment<D>(minLength);
            segment.start = start;
            segment.end = start + (length - 1);
            segment.length = length;

            for (Segment<D> s : segments) {
                if (segment.data == null)
                    segment.data = ((D) s.data.copy());
                else
                    segment.data.combined(s.data); // Update our data to reflect all children's data
            }

            // If segment is greater or equal to two, split data into children
            if (segment.length >= 2 && segment.length >= minLength) {
                segment.half = segment.length / 2;

                final List<NonOverlappingSegment<D>> s1 = new ArrayList<NonOverlappingSegment<D>>();
                final List<NonOverlappingSegment<D>> s2 = new ArrayList<NonOverlappingSegment<D>>();
                for (int i = 0; i < segments.size(); i++) {
                    final NonOverlappingSegment<D> s = segments.get(i);
                    final long middle = segment.start + segment.half;
                    if (s.end < middle) {
                        s1.add(s);
                    } else if (s.start >= middle) {
                        s2.add(s);
                    } else {
                        // Need to split across middle
                        final NonOverlappingSegment<D> ss1 = new NonOverlappingSegment<D>(minLength, s.start, middle - 1, s.data);
                        s1.add(ss1);

                        final NonOverlappingSegment<D> ss2 = new NonOverlappingSegment<D>(minLength, middle, s.end, s.data);
                        s2.add(ss2);
                    }
                }

                final Segment<D> sub1 = createFromList(minLength, s1, segment.start, segment.half);
                final Segment<D> sub2 = createFromList(minLength, s2, segment.start + segment.half, segment.length - segment.half);
                segment.segments = new Segment[] { sub1, sub2 };
            } else if (segment.length <= minLength) {
                for (Segment<D> s : segments) {
                    segment.set.add(s);
                }
            }

            return segment;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public D query(long startOfQuery, long endOfQuery) {
            if (startOfQuery == this.start && endOfQuery == this.end) {
                if (this.data == null)
                    return null;
                final D dataToReturn = ((D) this.data.query(startOfQuery, endOfQuery));
                return dataToReturn;
            }

            if (!this.hasChildren()) {
                if (endOfQuery < this.start || startOfQuery > this.end) {
                    // Ignore
                } else {
                    D dataToReturn = null;
                    if (this.set.size() == 0)
                        return dataToReturn;
                    for (Segment<D> s : this.set) {
                        if (s.start >= startOfQuery && s.end <= endOfQuery) {
                            if (dataToReturn == null)
                                dataToReturn = (D) s.data.query(startOfQuery, endOfQuery);
                            else
                                dataToReturn.combined(s.data);
                        } else if (s.start <= startOfQuery && s.end >= endOfQuery) {
                            if (dataToReturn == null)
                                dataToReturn = (D) s.data.query(startOfQuery, endOfQuery);
                            else
                                dataToReturn.combined(s.data);
                        }
                    }
                    return dataToReturn;
                }
            } 

            if (this.hasChildren()) {
                if (startOfQuery <= this.getLeftChild().end && endOfQuery > this.getLeftChild().end) {
                    final Data q1 = this.getLeftChild().query(startOfQuery, getLeftChild().end);
                    final Data q2 = this.getRightChild().query(getRightChild().start, endOfQuery);
                    if (q1 == null && q2 == null)
                        return null;
                    if (q1 != null && q2 == null)
                        return (D) q1;
                    if (q1 == null && q2 != null)
                        return (D) q2;
                    if (q1 != null && q2 != null) 
                        return ((D) q1.combined(q2));
                } else if (startOfQuery <= this.getLeftChild().end && endOfQuery <= this.getLeftChild().end) {
                    return this.getLeftChild().query(startOfQuery, endOfQuery);
                }
                return this.getRightChild().query(startOfQuery, endOfQuery);
            }

            return null;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public String toString() {
            final StringBuilder builder = new StringBuilder();
            builder.append(super.toString()).append(" ");
            builder.append("Set=").append(set);
            return builder.toString();
        }
    }
}
