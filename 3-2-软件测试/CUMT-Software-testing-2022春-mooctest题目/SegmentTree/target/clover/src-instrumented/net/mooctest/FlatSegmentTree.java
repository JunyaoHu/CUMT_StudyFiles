/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

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
public final class FlatSegmentTree<D extends Data> extends SegmentTree<D> {public static class __CLR4_4_16363l4dxkzvg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0036\u0035\u0038\u0038\u005c\u005c\u0031\u0031\u0038\u0035\u0037\u0030\u005c\u005c\u0053\u0065\u0067\u006d\u0065\u006e\u0074\u0054\u0072\u0065\u0065\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1655197042198L,8589935092L,415,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public FlatSegmentTree(List<D> data) {
        this(data, 1);__CLR4_4_16363l4dxkzvg.R.inc(220);try{__CLR4_4_16363l4dxkzvg.R.inc(219);
    }finally{__CLR4_4_16363l4dxkzvg.R.flushNeeded();}}

    public FlatSegmentTree(List<D> data, int minLength) {try{__CLR4_4_16363l4dxkzvg.R.inc(221);
        __CLR4_4_16363l4dxkzvg.R.inc(222);if ((((data.size() <= 0)&&(__CLR4_4_16363l4dxkzvg.R.iget(223)!=0|true))||(__CLR4_4_16363l4dxkzvg.R.iget(224)==0&false)))
            {__CLR4_4_16363l4dxkzvg.R.inc(225);throw new InvalidParameterException("Segments list is empty.");

        }__CLR4_4_16363l4dxkzvg.R.inc(226);Collections.sort(data); // Make sure they are sorted

        // Make sure they don't overlap
        __CLR4_4_16363l4dxkzvg.R.inc(227);if ((((data.size() >= 2)&&(__CLR4_4_16363l4dxkzvg.R.iget(228)!=0|true))||(__CLR4_4_16363l4dxkzvg.R.iget(229)==0&false))) {{
            __CLR4_4_16363l4dxkzvg.R.inc(230);for (int i = 0; (((i < (data.size() - 2))&&(__CLR4_4_16363l4dxkzvg.R.iget(231)!=0|true))||(__CLR4_4_16363l4dxkzvg.R.iget(232)==0&false)); i++) {{
                __CLR4_4_16363l4dxkzvg.R.inc(233);Data s1 = data.get(i);
                __CLR4_4_16363l4dxkzvg.R.inc(234);Data s2 = data.get(i + 1);
                __CLR4_4_16363l4dxkzvg.R.inc(235);if ((((s1.end > s2.start)&&(__CLR4_4_16363l4dxkzvg.R.iget(236)!=0|true))||(__CLR4_4_16363l4dxkzvg.R.iget(237)==0&false)))
                    {__CLR4_4_16363l4dxkzvg.R.inc(238);throw new InvalidParameterException("Segments are overlapping.");
            }}
        }}

        // Check for gaps
        }__CLR4_4_16363l4dxkzvg.R.inc(239);final List<NonOverlappingSegment<D>> segments = new ArrayList<NonOverlappingSegment<D>>();
        __CLR4_4_16363l4dxkzvg.R.inc(240);for (int i = 0; (((i < data.size())&&(__CLR4_4_16363l4dxkzvg.R.iget(241)!=0|true))||(__CLR4_4_16363l4dxkzvg.R.iget(242)==0&false)); i++) {{
            __CLR4_4_16363l4dxkzvg.R.inc(243);if ((((i < data.size() - 1)&&(__CLR4_4_16363l4dxkzvg.R.iget(244)!=0|true))||(__CLR4_4_16363l4dxkzvg.R.iget(245)==0&false))) {{
                __CLR4_4_16363l4dxkzvg.R.inc(246);final Data d1 = data.get(i);
                __CLR4_4_16363l4dxkzvg.R.inc(247);final NonOverlappingSegment<D> s1 = new NonOverlappingSegment<D>(minLength, d1.start, d1.end, (D) d1);
                __CLR4_4_16363l4dxkzvg.R.inc(248);segments.add(s1);
                __CLR4_4_16363l4dxkzvg.R.inc(249);final Data d2 = data.get(i + 1);
                __CLR4_4_16363l4dxkzvg.R.inc(250);if ((((d2.start - d1.end > 1)&&(__CLR4_4_16363l4dxkzvg.R.iget(251)!=0|true))||(__CLR4_4_16363l4dxkzvg.R.iget(252)==0&false))) {{
                    __CLR4_4_16363l4dxkzvg.R.inc(253);final Data d3 = d1.copy();
                    __CLR4_4_16363l4dxkzvg.R.inc(254);d3.clear();
                    __CLR4_4_16363l4dxkzvg.R.inc(255);d3.start = d1.end + 1;
                    __CLR4_4_16363l4dxkzvg.R.inc(256);d3.end = d2.start - 1;
                    __CLR4_4_16363l4dxkzvg.R.inc(257);final NonOverlappingSegment<D> s3 = new NonOverlappingSegment<D>(minLength, d3.start, d3.end, (D) d3);
                    __CLR4_4_16363l4dxkzvg.R.inc(258);segments.add(s3);
                }
            }} }else {{
                __CLR4_4_16363l4dxkzvg.R.inc(259);final Data d1 = data.get(i);
                __CLR4_4_16363l4dxkzvg.R.inc(260);final NonOverlappingSegment<D> s1 = new NonOverlappingSegment<D>(minLength, d1.start, d1.end, (D) d1);
                __CLR4_4_16363l4dxkzvg.R.inc(261);segments.add(s1);
            }
        }}

        }__CLR4_4_16363l4dxkzvg.R.inc(262);final long start = segments.get(0).start;
        __CLR4_4_16363l4dxkzvg.R.inc(263);final long end = segments.get(segments.size() - 1).end;
        __CLR4_4_16363l4dxkzvg.R.inc(264);final int length = (int) (end - start) + 1;
        __CLR4_4_16363l4dxkzvg.R.inc(265);root = NonOverlappingSegment.createFromList(minLength, segments, start, length);
    }finally{__CLR4_4_16363l4dxkzvg.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public D query(long index) {try{__CLR4_4_16363l4dxkzvg.R.inc(266);
        __CLR4_4_16363l4dxkzvg.R.inc(267);return this.query(index, index);
    }finally{__CLR4_4_16363l4dxkzvg.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public D query(long startOfQuery, long endOfQuery) {try{__CLR4_4_16363l4dxkzvg.R.inc(268);
        __CLR4_4_16363l4dxkzvg.R.inc(269);if ((((root == null)&&(__CLR4_4_16363l4dxkzvg.R.iget(270)!=0|true))||(__CLR4_4_16363l4dxkzvg.R.iget(271)==0&false)))
            {__CLR4_4_16363l4dxkzvg.R.inc(272);return null;

        }__CLR4_4_16363l4dxkzvg.R.inc(273);long s = startOfQuery;
        __CLR4_4_16363l4dxkzvg.R.inc(274);long e = endOfQuery;
        __CLR4_4_16363l4dxkzvg.R.inc(275);if ((((s < root.start)&&(__CLR4_4_16363l4dxkzvg.R.iget(276)!=0|true))||(__CLR4_4_16363l4dxkzvg.R.iget(277)==0&false)))
            {__CLR4_4_16363l4dxkzvg.R.inc(278);s = root.start;
        }__CLR4_4_16363l4dxkzvg.R.inc(279);if ((((e > root.end)&&(__CLR4_4_16363l4dxkzvg.R.iget(280)!=0|true))||(__CLR4_4_16363l4dxkzvg.R.iget(281)==0&false)))
            {__CLR4_4_16363l4dxkzvg.R.inc(282);e = root.end;

        }__CLR4_4_16363l4dxkzvg.R.inc(283);return root.query(s, e);
    }finally{__CLR4_4_16363l4dxkzvg.R.flushNeeded();}}

    /**
     * Data structure representing a non-overlapping segment.
     */
    protected static final class NonOverlappingSegment<D extends Data> extends Segment<D> {

        private Set<Segment<D>> set = new TreeSet<Segment<D>>();

        public NonOverlappingSegment(int minLength) {
            super(minLength);__CLR4_4_16363l4dxkzvg.R.inc(285);try{__CLR4_4_16363l4dxkzvg.R.inc(284);
        }finally{__CLR4_4_16363l4dxkzvg.R.flushNeeded();}}

        public NonOverlappingSegment(int minLength, D data) {
            this(minLength, data.start, data.end, data);__CLR4_4_16363l4dxkzvg.R.inc(287);try{__CLR4_4_16363l4dxkzvg.R.inc(286);
        }finally{__CLR4_4_16363l4dxkzvg.R.flushNeeded();}}

        public NonOverlappingSegment(int minLength, long start, long end, D data) {
            super(minLength);__CLR4_4_16363l4dxkzvg.R.inc(289);try{__CLR4_4_16363l4dxkzvg.R.inc(288);

            __CLR4_4_16363l4dxkzvg.R.inc(290);this.start = start;
            __CLR4_4_16363l4dxkzvg.R.inc(291);this.end = end;
            __CLR4_4_16363l4dxkzvg.R.inc(292);this.length = ((int) (end - start)) + 1;
            __CLR4_4_16363l4dxkzvg.R.inc(293);if ((((data == null)&&(__CLR4_4_16363l4dxkzvg.R.iget(294)!=0|true))||(__CLR4_4_16363l4dxkzvg.R.iget(295)==0&false)))
                {__CLR4_4_16363l4dxkzvg.R.inc(296);return;
            }__CLR4_4_16363l4dxkzvg.R.inc(297);this.data = ((D) data.copy());
        }finally{__CLR4_4_16363l4dxkzvg.R.flushNeeded();}}

        protected static <D extends Data> Segment<D> createFromList(int minLength, List<NonOverlappingSegment<D>> segments, long start, int length) {try{__CLR4_4_16363l4dxkzvg.R.inc(298);
            __CLR4_4_16363l4dxkzvg.R.inc(299);final NonOverlappingSegment<D> segment = new NonOverlappingSegment<D>(minLength);
            __CLR4_4_16363l4dxkzvg.R.inc(300);segment.start = start;
            __CLR4_4_16363l4dxkzvg.R.inc(301);segment.end = start + (length - 1);
            __CLR4_4_16363l4dxkzvg.R.inc(302);segment.length = length;

            __CLR4_4_16363l4dxkzvg.R.inc(303);for (Segment<D> s : segments) {{
                __CLR4_4_16363l4dxkzvg.R.inc(304);if ((((segment.data == null)&&(__CLR4_4_16363l4dxkzvg.R.iget(305)!=0|true))||(__CLR4_4_16363l4dxkzvg.R.iget(306)==0&false)))
                    {__CLR4_4_16363l4dxkzvg.R.inc(307);segment.data = ((D) s.data.copy());
                }else
                    {__CLR4_4_16363l4dxkzvg.R.inc(308);segment.data.combined(s.data); // Update our data to reflect all children's data
            }}

            // If segment is greater or equal to two, split data into children
            }__CLR4_4_16363l4dxkzvg.R.inc(309);if ((((segment.length >= 2 && segment.length >= minLength)&&(__CLR4_4_16363l4dxkzvg.R.iget(310)!=0|true))||(__CLR4_4_16363l4dxkzvg.R.iget(311)==0&false))) {{
                __CLR4_4_16363l4dxkzvg.R.inc(312);segment.half = segment.length / 2;

                __CLR4_4_16363l4dxkzvg.R.inc(313);final List<NonOverlappingSegment<D>> s1 = new ArrayList<NonOverlappingSegment<D>>();
                __CLR4_4_16363l4dxkzvg.R.inc(314);final List<NonOverlappingSegment<D>> s2 = new ArrayList<NonOverlappingSegment<D>>();
                __CLR4_4_16363l4dxkzvg.R.inc(315);for (int i = 0; (((i < segments.size())&&(__CLR4_4_16363l4dxkzvg.R.iget(316)!=0|true))||(__CLR4_4_16363l4dxkzvg.R.iget(317)==0&false)); i++) {{
                    __CLR4_4_16363l4dxkzvg.R.inc(318);final NonOverlappingSegment<D> s = segments.get(i);
                    __CLR4_4_16363l4dxkzvg.R.inc(319);final long middle = segment.start + segment.half;
                    __CLR4_4_16363l4dxkzvg.R.inc(320);if ((((s.end < middle)&&(__CLR4_4_16363l4dxkzvg.R.iget(321)!=0|true))||(__CLR4_4_16363l4dxkzvg.R.iget(322)==0&false))) {{
                        __CLR4_4_16363l4dxkzvg.R.inc(323);s1.add(s);
                    } }else {__CLR4_4_16363l4dxkzvg.R.inc(324);if ((((s.start >= middle)&&(__CLR4_4_16363l4dxkzvg.R.iget(325)!=0|true))||(__CLR4_4_16363l4dxkzvg.R.iget(326)==0&false))) {{
                        __CLR4_4_16363l4dxkzvg.R.inc(327);s2.add(s);
                    } }else {{
                        // Need to split across middle
                        __CLR4_4_16363l4dxkzvg.R.inc(328);final NonOverlappingSegment<D> ss1 = new NonOverlappingSegment<D>(minLength, s.start, middle - 1, s.data);
                        __CLR4_4_16363l4dxkzvg.R.inc(329);s1.add(ss1);

                        __CLR4_4_16363l4dxkzvg.R.inc(330);final NonOverlappingSegment<D> ss2 = new NonOverlappingSegment<D>(minLength, middle, s.end, s.data);
                        __CLR4_4_16363l4dxkzvg.R.inc(331);s2.add(ss2);
                    }
                }}}

                }__CLR4_4_16363l4dxkzvg.R.inc(332);final Segment<D> sub1 = createFromList(minLength, s1, segment.start, segment.half);
                __CLR4_4_16363l4dxkzvg.R.inc(333);final Segment<D> sub2 = createFromList(minLength, s2, segment.start + segment.half, segment.length - segment.half);
                __CLR4_4_16363l4dxkzvg.R.inc(334);segment.segments = new Segment[] { sub1, sub2 };
            } }else {__CLR4_4_16363l4dxkzvg.R.inc(335);if ((((segment.length <= minLength)&&(__CLR4_4_16363l4dxkzvg.R.iget(336)!=0|true))||(__CLR4_4_16363l4dxkzvg.R.iget(337)==0&false))) {{
                __CLR4_4_16363l4dxkzvg.R.inc(338);for (Segment<D> s : segments) {{
                    __CLR4_4_16363l4dxkzvg.R.inc(339);segment.set.add(s);
                }
            }}

            }}__CLR4_4_16363l4dxkzvg.R.inc(340);return segment;
        }finally{__CLR4_4_16363l4dxkzvg.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public D query(long startOfQuery, long endOfQuery) {try{__CLR4_4_16363l4dxkzvg.R.inc(341);
            __CLR4_4_16363l4dxkzvg.R.inc(342);if ((((startOfQuery == this.start && endOfQuery == this.end)&&(__CLR4_4_16363l4dxkzvg.R.iget(343)!=0|true))||(__CLR4_4_16363l4dxkzvg.R.iget(344)==0&false))) {{
                __CLR4_4_16363l4dxkzvg.R.inc(345);if ((((this.data == null)&&(__CLR4_4_16363l4dxkzvg.R.iget(346)!=0|true))||(__CLR4_4_16363l4dxkzvg.R.iget(347)==0&false)))
                    {__CLR4_4_16363l4dxkzvg.R.inc(348);return null;
                }__CLR4_4_16363l4dxkzvg.R.inc(349);final D dataToReturn = ((D) this.data.query(startOfQuery, endOfQuery));
                __CLR4_4_16363l4dxkzvg.R.inc(350);return dataToReturn;
            }

            }__CLR4_4_16363l4dxkzvg.R.inc(351);if ((((!this.hasChildren())&&(__CLR4_4_16363l4dxkzvg.R.iget(352)!=0|true))||(__CLR4_4_16363l4dxkzvg.R.iget(353)==0&false))) {{
                __CLR4_4_16363l4dxkzvg.R.inc(354);if ((((endOfQuery < this.start || startOfQuery > this.end)&&(__CLR4_4_16363l4dxkzvg.R.iget(355)!=0|true))||(__CLR4_4_16363l4dxkzvg.R.iget(356)==0&false))) {{
                    // Ignore
                } }else {{
                    __CLR4_4_16363l4dxkzvg.R.inc(357);D dataToReturn = null;
                    __CLR4_4_16363l4dxkzvg.R.inc(358);if ((((this.set.size() == 0)&&(__CLR4_4_16363l4dxkzvg.R.iget(359)!=0|true))||(__CLR4_4_16363l4dxkzvg.R.iget(360)==0&false)))
                        {__CLR4_4_16363l4dxkzvg.R.inc(361);return dataToReturn;
                    }__CLR4_4_16363l4dxkzvg.R.inc(362);for (Segment<D> s : this.set) {{
                        __CLR4_4_16363l4dxkzvg.R.inc(363);if ((((s.start >= startOfQuery && s.end <= endOfQuery)&&(__CLR4_4_16363l4dxkzvg.R.iget(364)!=0|true))||(__CLR4_4_16363l4dxkzvg.R.iget(365)==0&false))) {{
                            __CLR4_4_16363l4dxkzvg.R.inc(366);if ((((dataToReturn == null)&&(__CLR4_4_16363l4dxkzvg.R.iget(367)!=0|true))||(__CLR4_4_16363l4dxkzvg.R.iget(368)==0&false)))
                                {__CLR4_4_16363l4dxkzvg.R.inc(369);dataToReturn = (D) s.data.query(startOfQuery, endOfQuery);
                            }else
                                {__CLR4_4_16363l4dxkzvg.R.inc(370);dataToReturn.combined(s.data);
                        }} }else {__CLR4_4_16363l4dxkzvg.R.inc(371);if ((((s.start <= startOfQuery && s.end >= endOfQuery)&&(__CLR4_4_16363l4dxkzvg.R.iget(372)!=0|true))||(__CLR4_4_16363l4dxkzvg.R.iget(373)==0&false))) {{
                            __CLR4_4_16363l4dxkzvg.R.inc(374);if ((((dataToReturn == null)&&(__CLR4_4_16363l4dxkzvg.R.iget(375)!=0|true))||(__CLR4_4_16363l4dxkzvg.R.iget(376)==0&false)))
                                {__CLR4_4_16363l4dxkzvg.R.inc(377);dataToReturn = (D) s.data.query(startOfQuery, endOfQuery);
                            }else
                                {__CLR4_4_16363l4dxkzvg.R.inc(378);dataToReturn.combined(s.data);
                        }}
                    }}}
                    }__CLR4_4_16363l4dxkzvg.R.inc(379);return dataToReturn;
                }
            }} 

            }__CLR4_4_16363l4dxkzvg.R.inc(380);if ((((this.hasChildren())&&(__CLR4_4_16363l4dxkzvg.R.iget(381)!=0|true))||(__CLR4_4_16363l4dxkzvg.R.iget(382)==0&false))) {{
                __CLR4_4_16363l4dxkzvg.R.inc(383);if ((((startOfQuery <= this.getLeftChild().end && endOfQuery > this.getLeftChild().end)&&(__CLR4_4_16363l4dxkzvg.R.iget(384)!=0|true))||(__CLR4_4_16363l4dxkzvg.R.iget(385)==0&false))) {{
                    __CLR4_4_16363l4dxkzvg.R.inc(386);final Data q1 = this.getLeftChild().query(startOfQuery, getLeftChild().end);
                    __CLR4_4_16363l4dxkzvg.R.inc(387);final Data q2 = this.getRightChild().query(getRightChild().start, endOfQuery);
                    __CLR4_4_16363l4dxkzvg.R.inc(388);if ((((q1 == null && q2 == null)&&(__CLR4_4_16363l4dxkzvg.R.iget(389)!=0|true))||(__CLR4_4_16363l4dxkzvg.R.iget(390)==0&false)))
                        {__CLR4_4_16363l4dxkzvg.R.inc(391);return null;
                    }__CLR4_4_16363l4dxkzvg.R.inc(392);if ((((q1 != null && q2 == null)&&(__CLR4_4_16363l4dxkzvg.R.iget(393)!=0|true))||(__CLR4_4_16363l4dxkzvg.R.iget(394)==0&false)))
                        {__CLR4_4_16363l4dxkzvg.R.inc(395);return (D) q1;
                    }__CLR4_4_16363l4dxkzvg.R.inc(396);if ((((q1 == null && q2 != null)&&(__CLR4_4_16363l4dxkzvg.R.iget(397)!=0|true))||(__CLR4_4_16363l4dxkzvg.R.iget(398)==0&false)))
                        {__CLR4_4_16363l4dxkzvg.R.inc(399);return (D) q2;
                    }__CLR4_4_16363l4dxkzvg.R.inc(400);if ((((q1 != null && q2 != null)&&(__CLR4_4_16363l4dxkzvg.R.iget(401)!=0|true))||(__CLR4_4_16363l4dxkzvg.R.iget(402)==0&false))) 
                        {__CLR4_4_16363l4dxkzvg.R.inc(403);return ((D) q1.combined(q2));
                }} }else {__CLR4_4_16363l4dxkzvg.R.inc(404);if ((((startOfQuery <= this.getLeftChild().end && endOfQuery <= this.getLeftChild().end)&&(__CLR4_4_16363l4dxkzvg.R.iget(405)!=0|true))||(__CLR4_4_16363l4dxkzvg.R.iget(406)==0&false))) {{
                    __CLR4_4_16363l4dxkzvg.R.inc(407);return this.getLeftChild().query(startOfQuery, endOfQuery);
                }
                }}__CLR4_4_16363l4dxkzvg.R.inc(408);return this.getRightChild().query(startOfQuery, endOfQuery);
            }

            }__CLR4_4_16363l4dxkzvg.R.inc(409);return null;
        }finally{__CLR4_4_16363l4dxkzvg.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public String toString() {try{__CLR4_4_16363l4dxkzvg.R.inc(410);
            __CLR4_4_16363l4dxkzvg.R.inc(411);final StringBuilder builder = new StringBuilder();
            __CLR4_4_16363l4dxkzvg.R.inc(412);builder.append(super.toString()).append(" ");
            __CLR4_4_16363l4dxkzvg.R.inc(413);builder.append("Set=").append(set);
            __CLR4_4_16363l4dxkzvg.R.inc(414);return builder.toString();
        }finally{__CLR4_4_16363l4dxkzvg.R.flushNeeded();}}
    }
}
