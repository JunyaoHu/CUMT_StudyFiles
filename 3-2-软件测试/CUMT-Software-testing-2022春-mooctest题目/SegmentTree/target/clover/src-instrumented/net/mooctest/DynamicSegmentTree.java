/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

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
public final class DynamicSegmentTree<D extends Data> extends SegmentTree<D> {public static class __CLR4_4_100l4dxkztw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0036\u0035\u0038\u0038\u005c\u005c\u0031\u0031\u0038\u0035\u0037\u0030\u005c\u005c\u0053\u0065\u0067\u006d\u0065\u006e\u0074\u0054\u0072\u0065\u0065\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1655197042198L,8589935092L,219,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final Comparator<OverlappingSegment<?>> START_COMPARATOR = new Comparator<OverlappingSegment<?>>() {
        /**
         * {@inheritDoc}
         */
        public int compare(OverlappingSegment<?> arg0, OverlappingSegment<?> arg1) {try{__CLR4_4_100l4dxkztw.R.inc(0);
            __CLR4_4_100l4dxkztw.R.inc(1);if ((((arg0.start < arg1.start)&&(__CLR4_4_100l4dxkztw.R.iget(2)!=0|true))||(__CLR4_4_100l4dxkztw.R.iget(3)==0&false)))
                {__CLR4_4_100l4dxkztw.R.inc(4);return -1;
            }__CLR4_4_100l4dxkztw.R.inc(5);if ((((arg1.start < arg0.start)&&(__CLR4_4_100l4dxkztw.R.iget(6)!=0|true))||(__CLR4_4_100l4dxkztw.R.iget(7)==0&false)))
                {__CLR4_4_100l4dxkztw.R.inc(8);return 1;
            }__CLR4_4_100l4dxkztw.R.inc(9);return 0;
        }finally{__CLR4_4_100l4dxkztw.R.flushNeeded();}}
    };

    private static final Comparator<OverlappingSegment<?>> END_COMPARATOR = new Comparator<OverlappingSegment<?>>() {
        /**
         * {@inheritDoc}
         */
        public int compare(OverlappingSegment<?> arg0, OverlappingSegment<?> arg1) {try{__CLR4_4_100l4dxkztw.R.inc(10);
            __CLR4_4_100l4dxkztw.R.inc(11);if ((((arg0.end < arg1.end)&&(__CLR4_4_100l4dxkztw.R.iget(12)!=0|true))||(__CLR4_4_100l4dxkztw.R.iget(13)==0&false)))
                {__CLR4_4_100l4dxkztw.R.inc(14);return -1;
            }__CLR4_4_100l4dxkztw.R.inc(15);if ((((arg1.end < arg0.end)&&(__CLR4_4_100l4dxkztw.R.iget(16)!=0|true))||(__CLR4_4_100l4dxkztw.R.iget(17)==0&false)))
                {__CLR4_4_100l4dxkztw.R.inc(18);return 1;
            }__CLR4_4_100l4dxkztw.R.inc(19);return 0;
        }finally{__CLR4_4_100l4dxkztw.R.flushNeeded();}}
    };

    public DynamicSegmentTree(List<D> data) {
        this(data, 1);__CLR4_4_100l4dxkztw.R.inc(21);try{__CLR4_4_100l4dxkztw.R.inc(20);
    }finally{__CLR4_4_100l4dxkztw.R.flushNeeded();}}

    public DynamicSegmentTree(List<D> data, int minLength) {try{__CLR4_4_100l4dxkztw.R.inc(22);
        __CLR4_4_100l4dxkztw.R.inc(23);if ((((data.size() <= 0)&&(__CLR4_4_100l4dxkztw.R.iget(24)!=0|true))||(__CLR4_4_100l4dxkztw.R.iget(25)==0&false)))
            {__CLR4_4_100l4dxkztw.R.inc(26);return;

        // Check for gaps
        }__CLR4_4_100l4dxkztw.R.inc(27);final List<OverlappingSegment<D>> segments = new ArrayList<OverlappingSegment<D>>();
        __CLR4_4_100l4dxkztw.R.inc(28);for (int i = 0; (((i < data.size())&&(__CLR4_4_100l4dxkztw.R.iget(29)!=0|true))||(__CLR4_4_100l4dxkztw.R.iget(30)==0&false)); i++) {{
            __CLR4_4_100l4dxkztw.R.inc(31);if ((((i < data.size() - 1)&&(__CLR4_4_100l4dxkztw.R.iget(32)!=0|true))||(__CLR4_4_100l4dxkztw.R.iget(33)==0&false))) {{
                __CLR4_4_100l4dxkztw.R.inc(34);final Data d1 = data.get(i);
                __CLR4_4_100l4dxkztw.R.inc(35);final OverlappingSegment<D> s1 = new OverlappingSegment<D>(minLength, d1.start, d1.end, (D) d1);
                __CLR4_4_100l4dxkztw.R.inc(36);segments.add(s1);

                __CLR4_4_100l4dxkztw.R.inc(37);final Data d2 = data.get(i + 1);
                __CLR4_4_100l4dxkztw.R.inc(38);if ((((d2.start - d1.end > 1)&&(__CLR4_4_100l4dxkztw.R.iget(39)!=0|true))||(__CLR4_4_100l4dxkztw.R.iget(40)==0&false))) {{
                    __CLR4_4_100l4dxkztw.R.inc(41);final Data d3 = d1.copy();
                    __CLR4_4_100l4dxkztw.R.inc(42);d3.clear();
                    __CLR4_4_100l4dxkztw.R.inc(43);d3.start = d1.end + 1;
                    __CLR4_4_100l4dxkztw.R.inc(44);d3.end = d2.start - 1;

                    __CLR4_4_100l4dxkztw.R.inc(45);final OverlappingSegment<D> s3 = new OverlappingSegment<D>(minLength, d3.start, d3.end, (D) d3);
                    __CLR4_4_100l4dxkztw.R.inc(46);segments.add(s3);
                }
            }} }else {{
                __CLR4_4_100l4dxkztw.R.inc(47);final Data d1 = data.get(i);
                __CLR4_4_100l4dxkztw.R.inc(48);final OverlappingSegment<D> s1 = new OverlappingSegment<D>(minLength, d1.start, d1.end, (D) d1);
                __CLR4_4_100l4dxkztw.R.inc(49);segments.add(s1);
            }
        }}

        // First start first
        }__CLR4_4_100l4dxkztw.R.inc(50);Collections.sort(segments, START_COMPARATOR);
        __CLR4_4_100l4dxkztw.R.inc(51);final OverlappingSegment<D> startNode = segments.get(0);
        __CLR4_4_100l4dxkztw.R.inc(52);final long start = startNode.start - 1;
        __CLR4_4_100l4dxkztw.R.inc(53);final OverlappingSegment<D> s1 = new OverlappingSegment<D>(minLength, start, startNode.start, null);
        __CLR4_4_100l4dxkztw.R.inc(54);segments.add(0, s1);

        // Last end last
        __CLR4_4_100l4dxkztw.R.inc(55);Collections.sort(segments, END_COMPARATOR);
        __CLR4_4_100l4dxkztw.R.inc(56);final OverlappingSegment<D> endNode = segments.get(segments.size() - 1);
        __CLR4_4_100l4dxkztw.R.inc(57);final long end = endNode.end + 1;
        __CLR4_4_100l4dxkztw.R.inc(58);final OverlappingSegment<D> s2 = new OverlappingSegment<D>(minLength, endNode.end, end, null);
        __CLR4_4_100l4dxkztw.R.inc(59);segments.add(s2);

        __CLR4_4_100l4dxkztw.R.inc(60);final int length = (int) (end - start) + 1;
        __CLR4_4_100l4dxkztw.R.inc(61);root = OverlappingSegment.createFromList(minLength, segments, start, length);
    }finally{__CLR4_4_100l4dxkztw.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public D query(long index) {try{__CLR4_4_100l4dxkztw.R.inc(62);
        __CLR4_4_100l4dxkztw.R.inc(63);return this.query(index, index);
    }finally{__CLR4_4_100l4dxkztw.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public D query(long startOfQuery, long endOfQuery) {try{__CLR4_4_100l4dxkztw.R.inc(64);
        __CLR4_4_100l4dxkztw.R.inc(65);if ((((root == null)&&(__CLR4_4_100l4dxkztw.R.iget(66)!=0|true))||(__CLR4_4_100l4dxkztw.R.iget(67)==0&false)))
            {__CLR4_4_100l4dxkztw.R.inc(68);return null;

        }__CLR4_4_100l4dxkztw.R.inc(69);long s = startOfQuery;
        __CLR4_4_100l4dxkztw.R.inc(70);long e = endOfQuery;
        __CLR4_4_100l4dxkztw.R.inc(71);if ((((s < root.start)&&(__CLR4_4_100l4dxkztw.R.iget(72)!=0|true))||(__CLR4_4_100l4dxkztw.R.iget(73)==0&false)))
            {__CLR4_4_100l4dxkztw.R.inc(74);s = root.start;
        }__CLR4_4_100l4dxkztw.R.inc(75);if ((((e > root.end)&&(__CLR4_4_100l4dxkztw.R.iget(76)!=0|true))||(__CLR4_4_100l4dxkztw.R.iget(77)==0&false)))
            {__CLR4_4_100l4dxkztw.R.inc(78);e = root.end;

        }__CLR4_4_100l4dxkztw.R.inc(79);final D result = root.query(s, e);
        // reset the start and end, it can change during the query
        __CLR4_4_100l4dxkztw.R.inc(80);result.start = startOfQuery;
        __CLR4_4_100l4dxkztw.R.inc(81);result.end = endOfQuery;
        __CLR4_4_100l4dxkztw.R.inc(82);return result;
    }finally{__CLR4_4_100l4dxkztw.R.flushNeeded();}}

    /**
     * Data structure representing a possibly overlapping segment.
     */
    protected static final class OverlappingSegment<D extends Data> extends Segment<D> {

        // Separate range set for fast range queries
        protected Set<Segment<D>> range = new HashSet<Segment<D>>();

        public OverlappingSegment(int minLength) {
            super(minLength);__CLR4_4_100l4dxkztw.R.inc(84);try{__CLR4_4_100l4dxkztw.R.inc(83);
        }finally{__CLR4_4_100l4dxkztw.R.flushNeeded();}}

        public OverlappingSegment(int minLength, long start, long end, D data) {
            super(minLength);__CLR4_4_100l4dxkztw.R.inc(86);try{__CLR4_4_100l4dxkztw.R.inc(85);

            __CLR4_4_100l4dxkztw.R.inc(87);this.start = start;
            __CLR4_4_100l4dxkztw.R.inc(88);this.end = end;
            __CLR4_4_100l4dxkztw.R.inc(89);this.length = ((int) (end - start)) + 1;
            __CLR4_4_100l4dxkztw.R.inc(90);if ((((data == null)&&(__CLR4_4_100l4dxkztw.R.iget(91)!=0|true))||(__CLR4_4_100l4dxkztw.R.iget(92)==0&false)))
                {__CLR4_4_100l4dxkztw.R.inc(93);return;
            }__CLR4_4_100l4dxkztw.R.inc(94);this.data = ((D) data.copy());
        }finally{__CLR4_4_100l4dxkztw.R.flushNeeded();}}

        protected static <D extends Data> Segment<D> createFromList(int minLength, List<OverlappingSegment<D>> segments, long start, int length) {try{__CLR4_4_100l4dxkztw.R.inc(95);
            __CLR4_4_100l4dxkztw.R.inc(96);final OverlappingSegment<D> segment = new OverlappingSegment<D>(minLength);
            __CLR4_4_100l4dxkztw.R.inc(97);segment.start = start;
            __CLR4_4_100l4dxkztw.R.inc(98);segment.end = start + (length - 1);
            __CLR4_4_100l4dxkztw.R.inc(99);segment.length = length;

            __CLR4_4_100l4dxkztw.R.inc(100);for (Segment<D> s : segments) {{
                __CLR4_4_100l4dxkztw.R.inc(101);if ((((s.data == null)&&(__CLR4_4_100l4dxkztw.R.iget(102)!=0|true))||(__CLR4_4_100l4dxkztw.R.iget(103)==0&false)))
                    {__CLR4_4_100l4dxkztw.R.inc(104);continue;
                }__CLR4_4_100l4dxkztw.R.inc(105);if ((((s.end < segment.start || s.start > segment.end)&&(__CLR4_4_100l4dxkztw.R.iget(106)!=0|true))||(__CLR4_4_100l4dxkztw.R.iget(107)==0&false))) {{
                    // Ignore
                } }else {{
                    __CLR4_4_100l4dxkztw.R.inc(108);segment.range.add(s);
                }
                }__CLR4_4_100l4dxkztw.R.inc(109);if ((((s.start == segment.start && s.end == segment.end)&&(__CLR4_4_100l4dxkztw.R.iget(110)!=0|true))||(__CLR4_4_100l4dxkztw.R.iget(111)==0&false))) {{
                    __CLR4_4_100l4dxkztw.R.inc(112);if ((((segment.data == null)&&(__CLR4_4_100l4dxkztw.R.iget(113)!=0|true))||(__CLR4_4_100l4dxkztw.R.iget(114)==0&false)))
                        {__CLR4_4_100l4dxkztw.R.inc(115);segment.data = ((D) s.data.copy());
                    }else
                        {__CLR4_4_100l4dxkztw.R.inc(116);segment.data.combined(s.data); // Update our data to reflect all children's data
                }} }else {__CLR4_4_100l4dxkztw.R.inc(117);if ((((!segment.hasChildren() && s.start >= segment.start && s.end <= segment.end)&&(__CLR4_4_100l4dxkztw.R.iget(118)!=0|true))||(__CLR4_4_100l4dxkztw.R.iget(119)==0&false))) {{
                    __CLR4_4_100l4dxkztw.R.inc(120);if ((((segment.data == null)&&(__CLR4_4_100l4dxkztw.R.iget(121)!=0|true))||(__CLR4_4_100l4dxkztw.R.iget(122)==0&false)))
                        {__CLR4_4_100l4dxkztw.R.inc(123);segment.data = ((D) s.data.copy());
                    }else
                        {__CLR4_4_100l4dxkztw.R.inc(124);segment.data.combined(s.data); // Update our data to reflect all children's data
                }}
            }}}

            // If segment is greater or equal to two, split data into children
            }__CLR4_4_100l4dxkztw.R.inc(125);if ((((segment.length >= 2 && segment.length >= minLength)&&(__CLR4_4_100l4dxkztw.R.iget(126)!=0|true))||(__CLR4_4_100l4dxkztw.R.iget(127)==0&false))) {{
                __CLR4_4_100l4dxkztw.R.inc(128);segment.half = segment.length / 2;

                __CLR4_4_100l4dxkztw.R.inc(129);final List<OverlappingSegment<D>> s1 = new ArrayList<OverlappingSegment<D>>();
                __CLR4_4_100l4dxkztw.R.inc(130);final List<OverlappingSegment<D>> s2 = new ArrayList<OverlappingSegment<D>>();
                __CLR4_4_100l4dxkztw.R.inc(131);for (int i = 0; (((i < segments.size())&&(__CLR4_4_100l4dxkztw.R.iget(132)!=0|true))||(__CLR4_4_100l4dxkztw.R.iget(133)==0&false)); i++) {{
                    __CLR4_4_100l4dxkztw.R.inc(134);final OverlappingSegment<D> s = segments.get(i);
                    __CLR4_4_100l4dxkztw.R.inc(135);final long middle = segment.start + segment.half;
                    __CLR4_4_100l4dxkztw.R.inc(136);if ((((s.end < middle)&&(__CLR4_4_100l4dxkztw.R.iget(137)!=0|true))||(__CLR4_4_100l4dxkztw.R.iget(138)==0&false))) {{
                        __CLR4_4_100l4dxkztw.R.inc(139);s1.add(s);
                    } }else {__CLR4_4_100l4dxkztw.R.inc(140);if ((((s.start >= middle)&&(__CLR4_4_100l4dxkztw.R.iget(141)!=0|true))||(__CLR4_4_100l4dxkztw.R.iget(142)==0&false))) {{
                        __CLR4_4_100l4dxkztw.R.inc(143);s2.add(s);
                    } }else {{
                        // Need to split across middle
                        __CLR4_4_100l4dxkztw.R.inc(144);final OverlappingSegment<D> ss1 = new OverlappingSegment<D>(minLength, s.start, middle - 1, s.data);
                        __CLR4_4_100l4dxkztw.R.inc(145);s1.add(ss1);

                        __CLR4_4_100l4dxkztw.R.inc(146);final OverlappingSegment<D> ss2 = new OverlappingSegment<D>(minLength, middle, s.end, s.data);
                        __CLR4_4_100l4dxkztw.R.inc(147);s2.add(ss2);
                    }
                }}}

                }__CLR4_4_100l4dxkztw.R.inc(148);final Segment<D> sub1 = createFromList(minLength, s1, segment.start, segment.half);
                __CLR4_4_100l4dxkztw.R.inc(149);final Segment<D> sub2 = createFromList(minLength, s2, segment.start + segment.half, segment.length - segment.half);
                __CLR4_4_100l4dxkztw.R.inc(150);segment.segments = new Segment[] { sub1, sub2 };
            }

            }__CLR4_4_100l4dxkztw.R.inc(151);return segment;
        }finally{__CLR4_4_100l4dxkztw.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public D query(long startOfQuery, long endOfQuery) {try{__CLR4_4_100l4dxkztw.R.inc(152);
            __CLR4_4_100l4dxkztw.R.inc(153);D result = null;

            // Use the range data to make range queries faster
            __CLR4_4_100l4dxkztw.R.inc(154);if ((((startOfQuery == this.start && endOfQuery == this.end)&&(__CLR4_4_100l4dxkztw.R.iget(155)!=0|true))||(__CLR4_4_100l4dxkztw.R.iget(156)==0&false))) {{
                __CLR4_4_100l4dxkztw.R.inc(157);for (Segment<D> s : this.range) {{
                    __CLR4_4_100l4dxkztw.R.inc(158);final D temp = (D) s.data.query(startOfQuery, endOfQuery);
                    __CLR4_4_100l4dxkztw.R.inc(159);if ((((temp != null)&&(__CLR4_4_100l4dxkztw.R.iget(160)!=0|true))||(__CLR4_4_100l4dxkztw.R.iget(161)==0&false))) {{
                        __CLR4_4_100l4dxkztw.R.inc(162);if ((((result == null)&&(__CLR4_4_100l4dxkztw.R.iget(163)!=0|true))||(__CLR4_4_100l4dxkztw.R.iget(164)==0&false)))
                            {__CLR4_4_100l4dxkztw.R.inc(165);result = (D) temp.copy();
                        }else
                            {__CLR4_4_100l4dxkztw.R.inc(166);result.combined(temp);
                    }}
                }}
            }} }else {__CLR4_4_100l4dxkztw.R.inc(167);if ((((!this.hasChildren())&&(__CLR4_4_100l4dxkztw.R.iget(168)!=0|true))||(__CLR4_4_100l4dxkztw.R.iget(169)==0&false))) {{
                __CLR4_4_100l4dxkztw.R.inc(170);if ((((endOfQuery < this.start || startOfQuery > this.end)&&(__CLR4_4_100l4dxkztw.R.iget(171)!=0|true))||(__CLR4_4_100l4dxkztw.R.iget(172)==0&false))) {{
                    // Ignore
                } }else {{
                    __CLR4_4_100l4dxkztw.R.inc(173);for (Segment<D> s : this.range) {{
                        __CLR4_4_100l4dxkztw.R.inc(174);if ((((endOfQuery < s.start || startOfQuery > s.end)&&(__CLR4_4_100l4dxkztw.R.iget(175)!=0|true))||(__CLR4_4_100l4dxkztw.R.iget(176)==0&false))) {{
                            // Ignore
                        } }else {{
                            __CLR4_4_100l4dxkztw.R.inc(177);final D temp = (D) s.data.query(startOfQuery, endOfQuery);
                            __CLR4_4_100l4dxkztw.R.inc(178);if ((((temp != null)&&(__CLR4_4_100l4dxkztw.R.iget(179)!=0|true))||(__CLR4_4_100l4dxkztw.R.iget(180)==0&false))) {{
                                __CLR4_4_100l4dxkztw.R.inc(181);if ((((result == null)&&(__CLR4_4_100l4dxkztw.R.iget(182)!=0|true))||(__CLR4_4_100l4dxkztw.R.iget(183)==0&false)))
                                    {__CLR4_4_100l4dxkztw.R.inc(184);result = (D) temp.copy();
                                }else
                                    {__CLR4_4_100l4dxkztw.R.inc(185);result.combined(temp);
                            }}
                        }}
                    }}
                }}
            }} }else {{
                __CLR4_4_100l4dxkztw.R.inc(186);final long middle = this.start + this.half;
                __CLR4_4_100l4dxkztw.R.inc(187);D temp = null;
                __CLR4_4_100l4dxkztw.R.inc(188);if ((((startOfQuery < middle && endOfQuery >= middle)&&(__CLR4_4_100l4dxkztw.R.iget(189)!=0|true))||(__CLR4_4_100l4dxkztw.R.iget(190)==0&false))) {{
                    __CLR4_4_100l4dxkztw.R.inc(191);temp = this.getLeftChild().query(startOfQuery, middle - 1);
                    __CLR4_4_100l4dxkztw.R.inc(192);D temp2 = this.getRightChild().query(middle, endOfQuery);
                    __CLR4_4_100l4dxkztw.R.inc(193);if ((((temp2 != null)&&(__CLR4_4_100l4dxkztw.R.iget(194)!=0|true))||(__CLR4_4_100l4dxkztw.R.iget(195)==0&false))) {{
                        __CLR4_4_100l4dxkztw.R.inc(196);if ((((temp == null)&&(__CLR4_4_100l4dxkztw.R.iget(197)!=0|true))||(__CLR4_4_100l4dxkztw.R.iget(198)==0&false)))
                            {__CLR4_4_100l4dxkztw.R.inc(199);temp = (D) temp2.copy();
                        }else
                            {__CLR4_4_100l4dxkztw.R.inc(200);temp.combined(temp2);
                    }}
                }} }else {__CLR4_4_100l4dxkztw.R.inc(201);if ((((endOfQuery < middle)&&(__CLR4_4_100l4dxkztw.R.iget(202)!=0|true))||(__CLR4_4_100l4dxkztw.R.iget(203)==0&false))) {{
                    __CLR4_4_100l4dxkztw.R.inc(204);temp = this.getLeftChild().query(startOfQuery, endOfQuery);
                } }else {__CLR4_4_100l4dxkztw.R.inc(205);if ((((startOfQuery >= middle)&&(__CLR4_4_100l4dxkztw.R.iget(206)!=0|true))||(__CLR4_4_100l4dxkztw.R.iget(207)==0&false))) {{
                    __CLR4_4_100l4dxkztw.R.inc(208);temp = this.getRightChild().query(startOfQuery, endOfQuery);
                }
                }}}__CLR4_4_100l4dxkztw.R.inc(209);if ((((temp != null)&&(__CLR4_4_100l4dxkztw.R.iget(210)!=0|true))||(__CLR4_4_100l4dxkztw.R.iget(211)==0&false)))
                    {__CLR4_4_100l4dxkztw.R.inc(212);result = (D) temp.copy();
            }}

            }}__CLR4_4_100l4dxkztw.R.inc(213);return result;
        }finally{__CLR4_4_100l4dxkztw.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public String toString() {try{__CLR4_4_100l4dxkztw.R.inc(214);
            __CLR4_4_100l4dxkztw.R.inc(215);StringBuilder builder = new StringBuilder();
            __CLR4_4_100l4dxkztw.R.inc(216);builder.append(super.toString()).append(" ");
            __CLR4_4_100l4dxkztw.R.inc(217);builder.append("Range=").append(range);
            __CLR4_4_100l4dxkztw.R.inc(218);return builder.toString();
        }finally{__CLR4_4_100l4dxkztw.R.flushNeeded();}}
    }
}