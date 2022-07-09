/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Segment tree using objects and pointers. A segment tree is a tree data
 * structure for storing intervals, or segments. It allows querying which of the
 * stored segments contain a given point. It is, in principle, a static
 * structure; that is, its content cannot be modified once the structure is
 * built.
 * <p>
 * This class is meant to be somewhat generic, all you'd have to do is extend
 * the Data abstract class to store your custom data. I've also included a range
 * minimum, range maximum, range sum, and interval stabbing implementations.
 * <p>
 * @see <a href="https://en.wikipedia.org/wiki/Segment_tree">Segment Tree (Wikipedia)</a>
 * <br>
 */
@SuppressWarnings("unchecked")
public abstract class SegmentTree<D extends SegmentTree.Data> {public static class __CLR4_4_1bjbjl4dxkzx4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0036\u0035\u0038\u0038\u005c\u005c\u0031\u0031\u0038\u0035\u0037\u0030\u005c\u005c\u0053\u0065\u0067\u006d\u0065\u006e\u0074\u0054\u0072\u0065\u0065\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1655197042198L,8589935092L,906,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    protected Segment<D> root = null;

    /**
     * Stabbing query
     * 
     * @param index
     *            index to query
     * @return data at index.
     */
    public abstract D query(long index);

    /**
     * Range query
     * 
     * @param start
     *            start of range (inclusive)
     * @param end
     *            end of range to (inclusive)
     * @return data for range.
     */
    public abstract D query(long start, long end);

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {try{__CLR4_4_1bjbjl4dxkzx4.R.inc(415);
        __CLR4_4_1bjbjl4dxkzx4.R.inc(416);StringBuilder builder = new StringBuilder();
        __CLR4_4_1bjbjl4dxkzx4.R.inc(417);builder.append(SegmentTreePrinter.getString(this));
        __CLR4_4_1bjbjl4dxkzx4.R.inc(418);return builder.toString();
    }finally{__CLR4_4_1bjbjl4dxkzx4.R.flushNeeded();}}

    public abstract static class Data implements Comparable<Data> {

        protected long start = Long.MIN_VALUE;
        protected long end = Long.MAX_VALUE;

        /**
         * Constructor for data at index
         * 
         * @param index
         *            of data.
         */
        public Data(long index) {try{__CLR4_4_1bjbjl4dxkzx4.R.inc(419);
            __CLR4_4_1bjbjl4dxkzx4.R.inc(420);this.start = index;
            __CLR4_4_1bjbjl4dxkzx4.R.inc(421);this.end = index;
        }finally{__CLR4_4_1bjbjl4dxkzx4.R.flushNeeded();}}

        /**
         * Constructor for data at range (inclusive)
         * 
         * @param start
         *            start of range for data.
         * @param end
         *            end of range for data.
         */
        public Data(long start, long end) {try{__CLR4_4_1bjbjl4dxkzx4.R.inc(422);
            __CLR4_4_1bjbjl4dxkzx4.R.inc(423);this.start = start;
            __CLR4_4_1bjbjl4dxkzx4.R.inc(424);this.end = end;
        }finally{__CLR4_4_1bjbjl4dxkzx4.R.flushNeeded();}}

        /**
         * Clear the indices
         */
        public void clear() {try{__CLR4_4_1bjbjl4dxkzx4.R.inc(425);
            __CLR4_4_1bjbjl4dxkzx4.R.inc(426);start = Long.MIN_VALUE;
            __CLR4_4_1bjbjl4dxkzx4.R.inc(427);end = Long.MAX_VALUE;
        }finally{__CLR4_4_1bjbjl4dxkzx4.R.flushNeeded();}}

        /**
         * Combined this data with the Data parameter
         * 
         * @param data
         *            Data to combined
         * @return Data which represents the combination.
         */
        public abstract Data combined(Data data);

        /**
         * Deep copy of data.
         * 
         * @return deep copy.
         */
        public abstract Data copy();

        /**
         * Query inside this data object.
         * 
         * @param startOfRange
         *            start of range (inclusive)
         * @param endOfRange
         *            end of range (inclusive)
         * @return Data queried for or NULL if it doesn't match the query.
         */
        public abstract Data query(long startOfRange, long endOfRange);

        /**
         * {@inheritDoc}
         */
        @Override
        public String toString() {try{__CLR4_4_1bjbjl4dxkzx4.R.inc(428);
            __CLR4_4_1bjbjl4dxkzx4.R.inc(429);final StringBuilder builder = new StringBuilder();
            __CLR4_4_1bjbjl4dxkzx4.R.inc(430);builder.append(start).append("->").append(end);
            __CLR4_4_1bjbjl4dxkzx4.R.inc(431);return builder.toString();
        }finally{__CLR4_4_1bjbjl4dxkzx4.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        public int compareTo(Data d) {try{__CLR4_4_1bjbjl4dxkzx4.R.inc(432);
            __CLR4_4_1bjbjl4dxkzx4.R.inc(433);if ((((this.end < d.end)&&(__CLR4_4_1bjbjl4dxkzx4.R.iget(434)!=0|true))||(__CLR4_4_1bjbjl4dxkzx4.R.iget(435)==0&false)))
                {__CLR4_4_1bjbjl4dxkzx4.R.inc(436);return -1;
            }__CLR4_4_1bjbjl4dxkzx4.R.inc(437);if ((((d.end < this.end)&&(__CLR4_4_1bjbjl4dxkzx4.R.iget(438)!=0|true))||(__CLR4_4_1bjbjl4dxkzx4.R.iget(439)==0&false)))
                {__CLR4_4_1bjbjl4dxkzx4.R.inc(440);return 1;
            }__CLR4_4_1bjbjl4dxkzx4.R.inc(441);return 0;
        }finally{__CLR4_4_1bjbjl4dxkzx4.R.flushNeeded();}}

        /**
         * Data structure representing points in the x,y space and their
         * location in the quadrants.
         */
        public static final class QuadrantData extends Data {

            public long quad0 = 0;
            public long quad1 = 0;
            public long quad2 = 0;
            public long quad3 = 0;

            public QuadrantData(long start, long end) {
                super(start, end);__CLR4_4_1bjbjl4dxkzx4.R.inc(443);try{__CLR4_4_1bjbjl4dxkzx4.R.inc(442);
            }finally{__CLR4_4_1bjbjl4dxkzx4.R.flushNeeded();}}

            public QuadrantData(long index, long quad1, long quad2, long quad3, long quad4) {
                super(index);__CLR4_4_1bjbjl4dxkzx4.R.inc(445);try{__CLR4_4_1bjbjl4dxkzx4.R.inc(444);

                __CLR4_4_1bjbjl4dxkzx4.R.inc(446);this.quad0 = quad1;
                __CLR4_4_1bjbjl4dxkzx4.R.inc(447);this.quad1 = quad2;
                __CLR4_4_1bjbjl4dxkzx4.R.inc(448);this.quad2 = quad3;
                __CLR4_4_1bjbjl4dxkzx4.R.inc(449);this.quad3 = quad4;
            }finally{__CLR4_4_1bjbjl4dxkzx4.R.flushNeeded();}}

            /**
             * {@inheritDoc}
             */
            @Override
            public void clear() {try{__CLR4_4_1bjbjl4dxkzx4.R.inc(450);
                __CLR4_4_1bjbjl4dxkzx4.R.inc(451);super.clear();

                __CLR4_4_1bjbjl4dxkzx4.R.inc(452);quad0 = 0;
                __CLR4_4_1bjbjl4dxkzx4.R.inc(453);quad1 = 0;
                __CLR4_4_1bjbjl4dxkzx4.R.inc(454);quad2 = 0;
                __CLR4_4_1bjbjl4dxkzx4.R.inc(455);quad3 = 0;
            }finally{__CLR4_4_1bjbjl4dxkzx4.R.flushNeeded();}}

            /**
             * {@inheritDoc}
             */
            @Override
            public QuadrantData copy() {try{__CLR4_4_1bjbjl4dxkzx4.R.inc(456);
                __CLR4_4_1bjbjl4dxkzx4.R.inc(457);final QuadrantData copy = new QuadrantData(start, end);
                __CLR4_4_1bjbjl4dxkzx4.R.inc(458);copy.quad0 = this.quad0;
                __CLR4_4_1bjbjl4dxkzx4.R.inc(459);copy.quad1 = this.quad1;
                __CLR4_4_1bjbjl4dxkzx4.R.inc(460);copy.quad2 = this.quad2;
                __CLR4_4_1bjbjl4dxkzx4.R.inc(461);copy.quad3 = this.quad3;
                __CLR4_4_1bjbjl4dxkzx4.R.inc(462);return copy;
            }finally{__CLR4_4_1bjbjl4dxkzx4.R.flushNeeded();}}

            /**
             * {@inheritDoc}
             */
            @Override
            public Data query(long startOfQuery, long endOfQuery) {try{__CLR4_4_1bjbjl4dxkzx4.R.inc(463);
                __CLR4_4_1bjbjl4dxkzx4.R.inc(464);if ((((endOfQuery < this.start || startOfQuery > this.end)&&(__CLR4_4_1bjbjl4dxkzx4.R.iget(465)!=0|true))||(__CLR4_4_1bjbjl4dxkzx4.R.iget(466)==0&false)))
                    {__CLR4_4_1bjbjl4dxkzx4.R.inc(467);return null;
                }__CLR4_4_1bjbjl4dxkzx4.R.inc(468);return copy();
            }finally{__CLR4_4_1bjbjl4dxkzx4.R.flushNeeded();}}

            /**
             * {@inheritDoc}
             */
            @Override
            public Data combined(Data data) {try{__CLR4_4_1bjbjl4dxkzx4.R.inc(469);
                __CLR4_4_1bjbjl4dxkzx4.R.inc(470);QuadrantData q = null;
                __CLR4_4_1bjbjl4dxkzx4.R.inc(471);if ((((data instanceof QuadrantData)&&(__CLR4_4_1bjbjl4dxkzx4.R.iget(472)!=0|true))||(__CLR4_4_1bjbjl4dxkzx4.R.iget(473)==0&false))) {{
                    __CLR4_4_1bjbjl4dxkzx4.R.inc(474);q = (QuadrantData) data;
                    __CLR4_4_1bjbjl4dxkzx4.R.inc(475);this.combined(q);
                }
                }__CLR4_4_1bjbjl4dxkzx4.R.inc(476);return this;
            }finally{__CLR4_4_1bjbjl4dxkzx4.R.flushNeeded();}}

            private void combined(QuadrantData data) {try{__CLR4_4_1bjbjl4dxkzx4.R.inc(477);
                __CLR4_4_1bjbjl4dxkzx4.R.inc(478);this.quad0 += data.quad0;
                __CLR4_4_1bjbjl4dxkzx4.R.inc(479);this.quad1 += data.quad1;
                __CLR4_4_1bjbjl4dxkzx4.R.inc(480);this.quad2 += data.quad2;
                __CLR4_4_1bjbjl4dxkzx4.R.inc(481);this.quad3 += data.quad3;
            }finally{__CLR4_4_1bjbjl4dxkzx4.R.flushNeeded();}}

            /**
             * {@inheritDoc}
             */
            @Override
            public int hashCode() {try{__CLR4_4_1bjbjl4dxkzx4.R.inc(482);
                __CLR4_4_1bjbjl4dxkzx4.R.inc(483);return 31 * (int)(this.start + this.end + this.quad0 + this.quad1 + this.quad2 + this.quad3);
            }finally{__CLR4_4_1bjbjl4dxkzx4.R.flushNeeded();}}

            /**
             * {@inheritDoc}
             */
            @Override
            public boolean equals(Object obj) {try{__CLR4_4_1bjbjl4dxkzx4.R.inc(484);
                __CLR4_4_1bjbjl4dxkzx4.R.inc(485);if ((((!(obj instanceof QuadrantData))&&(__CLR4_4_1bjbjl4dxkzx4.R.iget(486)!=0|true))||(__CLR4_4_1bjbjl4dxkzx4.R.iget(487)==0&false)))
                    {__CLR4_4_1bjbjl4dxkzx4.R.inc(488);return false;
                }__CLR4_4_1bjbjl4dxkzx4.R.inc(489);QuadrantData data = (QuadrantData) obj;
                __CLR4_4_1bjbjl4dxkzx4.R.inc(490);if ((((this.start == data.start && this.end == data.end && this.quad0 == data.quad0
                    && this.quad1 == data.quad1 && this.quad2 == data.quad2 && this.quad3 == data.quad3)&&(__CLR4_4_1bjbjl4dxkzx4.R.iget(491)!=0|true))||(__CLR4_4_1bjbjl4dxkzx4.R.iget(492)==0&false))) 
                {{
                    __CLR4_4_1bjbjl4dxkzx4.R.inc(493);return true;
                }
                }__CLR4_4_1bjbjl4dxkzx4.R.inc(494);return false;
            }finally{__CLR4_4_1bjbjl4dxkzx4.R.flushNeeded();}}

            /**
             * {@inheritDoc}
             */
            @Override
            public String toString() {try{__CLR4_4_1bjbjl4dxkzx4.R.inc(495);
                __CLR4_4_1bjbjl4dxkzx4.R.inc(496);final StringBuilder builder = new StringBuilder();
                __CLR4_4_1bjbjl4dxkzx4.R.inc(497);builder.append(super.toString()).append(" ");
                __CLR4_4_1bjbjl4dxkzx4.R.inc(498);builder.append(quad0).append(",");
                __CLR4_4_1bjbjl4dxkzx4.R.inc(499);builder.append(quad1).append(",");
                __CLR4_4_1bjbjl4dxkzx4.R.inc(500);builder.append(quad2).append(",");
                __CLR4_4_1bjbjl4dxkzx4.R.inc(501);builder.append(quad3);
                __CLR4_4_1bjbjl4dxkzx4.R.inc(502);return builder.toString();
            }finally{__CLR4_4_1bjbjl4dxkzx4.R.flushNeeded();}}
        }

        /**
         * Data structure representing maximum in the range.
         */
        public static final class RangeMaximumData<N extends Number> extends Data {

            public N maximum = null;

            public RangeMaximumData(long start, long end) {
                super(start, end);__CLR4_4_1bjbjl4dxkzx4.R.inc(504);try{__CLR4_4_1bjbjl4dxkzx4.R.inc(503);
            }finally{__CLR4_4_1bjbjl4dxkzx4.R.flushNeeded();}}

            public RangeMaximumData(long index, N number) {
                super(index);__CLR4_4_1bjbjl4dxkzx4.R.inc(506);try{__CLR4_4_1bjbjl4dxkzx4.R.inc(505);

                __CLR4_4_1bjbjl4dxkzx4.R.inc(507);this.maximum = number;
            }finally{__CLR4_4_1bjbjl4dxkzx4.R.flushNeeded();}}

            public RangeMaximumData(long start, long end, N number) {
                super(start, end);__CLR4_4_1bjbjl4dxkzx4.R.inc(509);try{__CLR4_4_1bjbjl4dxkzx4.R.inc(508);

                __CLR4_4_1bjbjl4dxkzx4.R.inc(510);this.maximum = number;
            }finally{__CLR4_4_1bjbjl4dxkzx4.R.flushNeeded();}}

            /**
             * {@inheritDoc}
             */
            @Override
            public void clear() {try{__CLR4_4_1bjbjl4dxkzx4.R.inc(511);
                __CLR4_4_1bjbjl4dxkzx4.R.inc(512);super.clear();

                __CLR4_4_1bjbjl4dxkzx4.R.inc(513);maximum = null;
            }finally{__CLR4_4_1bjbjl4dxkzx4.R.flushNeeded();}}

            /**
             * {@inheritDoc}
             */
            @Override
            public Data copy() {try{__CLR4_4_1bjbjl4dxkzx4.R.inc(514);
                __CLR4_4_1bjbjl4dxkzx4.R.inc(515);return new RangeMaximumData<N>(start, end, maximum);
            }finally{__CLR4_4_1bjbjl4dxkzx4.R.flushNeeded();}}

            /**
             * {@inheritDoc}
             */
            @Override
            public Data query(long startOfQuery, long endOfQuery) {try{__CLR4_4_1bjbjl4dxkzx4.R.inc(516);
                __CLR4_4_1bjbjl4dxkzx4.R.inc(517);if ((((endOfQuery < this.start || startOfQuery > this.end)&&(__CLR4_4_1bjbjl4dxkzx4.R.iget(518)!=0|true))||(__CLR4_4_1bjbjl4dxkzx4.R.iget(519)==0&false)))
                    {__CLR4_4_1bjbjl4dxkzx4.R.inc(520);return null;

                }__CLR4_4_1bjbjl4dxkzx4.R.inc(521);return copy();
            }finally{__CLR4_4_1bjbjl4dxkzx4.R.flushNeeded();}}

            /**
             * {@inheritDoc}
             */
            @Override
            public Data combined(Data data) {try{__CLR4_4_1bjbjl4dxkzx4.R.inc(522);
                __CLR4_4_1bjbjl4dxkzx4.R.inc(523);RangeMaximumData<N> q = null;
                __CLR4_4_1bjbjl4dxkzx4.R.inc(524);if ((((data instanceof RangeMaximumData)&&(__CLR4_4_1bjbjl4dxkzx4.R.iget(525)!=0|true))||(__CLR4_4_1bjbjl4dxkzx4.R.iget(526)==0&false))) {{
                    __CLR4_4_1bjbjl4dxkzx4.R.inc(527);q = (RangeMaximumData<N>) data;
                    __CLR4_4_1bjbjl4dxkzx4.R.inc(528);this.combined(q);
                }
                }__CLR4_4_1bjbjl4dxkzx4.R.inc(529);return this;
            }finally{__CLR4_4_1bjbjl4dxkzx4.R.flushNeeded();}}

            private void combined(RangeMaximumData<N> data) {try{__CLR4_4_1bjbjl4dxkzx4.R.inc(530);
                __CLR4_4_1bjbjl4dxkzx4.R.inc(531);if ((((this.maximum == null && data.maximum == null)&&(__CLR4_4_1bjbjl4dxkzx4.R.iget(532)!=0|true))||(__CLR4_4_1bjbjl4dxkzx4.R.iget(533)==0&false)))
                    {__CLR4_4_1bjbjl4dxkzx4.R.inc(534);return;
                }else {__CLR4_4_1bjbjl4dxkzx4.R.inc(535);if ((((this.maximum != null && data.maximum == null)&&(__CLR4_4_1bjbjl4dxkzx4.R.iget(536)!=0|true))||(__CLR4_4_1bjbjl4dxkzx4.R.iget(537)==0&false)))
                    {__CLR4_4_1bjbjl4dxkzx4.R.inc(538);return;
                }else {__CLR4_4_1bjbjl4dxkzx4.R.inc(539);if ((((this.maximum == null && data.maximum != null)&&(__CLR4_4_1bjbjl4dxkzx4.R.iget(540)!=0|true))||(__CLR4_4_1bjbjl4dxkzx4.R.iget(541)==0&false)))
                    {__CLR4_4_1bjbjl4dxkzx4.R.inc(542);this.maximum = data.maximum;
                }else {{
                    /* TODO: This is ugly */
                    __CLR4_4_1bjbjl4dxkzx4.R.inc(543);if ((((this.maximum instanceof BigDecimal || data.maximum instanceof BigDecimal)&&(__CLR4_4_1bjbjl4dxkzx4.R.iget(544)!=0|true))||(__CLR4_4_1bjbjl4dxkzx4.R.iget(545)==0&false))) {{
                        __CLR4_4_1bjbjl4dxkzx4.R.inc(546);if ((((((BigDecimal)data.maximum).compareTo(((BigDecimal)this.maximum))==1)&&(__CLR4_4_1bjbjl4dxkzx4.R.iget(547)!=0|true))||(__CLR4_4_1bjbjl4dxkzx4.R.iget(548)==0&false)))
                            {__CLR4_4_1bjbjl4dxkzx4.R.inc(549);this.maximum = data.maximum;
                    }} }else {__CLR4_4_1bjbjl4dxkzx4.R.inc(550);if ((((this.maximum instanceof BigInteger || data.maximum instanceof BigInteger)&&(__CLR4_4_1bjbjl4dxkzx4.R.iget(551)!=0|true))||(__CLR4_4_1bjbjl4dxkzx4.R.iget(552)==0&false))) {{
                        __CLR4_4_1bjbjl4dxkzx4.R.inc(553);if ((((((BigInteger)data.maximum).compareTo(((BigInteger)this.maximum))==1)&&(__CLR4_4_1bjbjl4dxkzx4.R.iget(554)!=0|true))||(__CLR4_4_1bjbjl4dxkzx4.R.iget(555)==0&false)))
                            {__CLR4_4_1bjbjl4dxkzx4.R.inc(556);this.maximum = data.maximum;
                    }} }else {__CLR4_4_1bjbjl4dxkzx4.R.inc(557);if ((((this.maximum instanceof Long || data.maximum instanceof Long)&&(__CLR4_4_1bjbjl4dxkzx4.R.iget(558)!=0|true))||(__CLR4_4_1bjbjl4dxkzx4.R.iget(559)==0&false))) {{
                        __CLR4_4_1bjbjl4dxkzx4.R.inc(560);if ((((((Long)data.maximum).compareTo(((Long)this.maximum))==1)&&(__CLR4_4_1bjbjl4dxkzx4.R.iget(561)!=0|true))||(__CLR4_4_1bjbjl4dxkzx4.R.iget(562)==0&false)))
                            {__CLR4_4_1bjbjl4dxkzx4.R.inc(563);this.maximum = data.maximum;
                    }} }else {__CLR4_4_1bjbjl4dxkzx4.R.inc(564);if ((((this.maximum instanceof Double || data.maximum instanceof Double)&&(__CLR4_4_1bjbjl4dxkzx4.R.iget(565)!=0|true))||(__CLR4_4_1bjbjl4dxkzx4.R.iget(566)==0&false))) {{
                        __CLR4_4_1bjbjl4dxkzx4.R.inc(567);if ((((((Double)data.maximum).compareTo(((Double)this.maximum))==1)&&(__CLR4_4_1bjbjl4dxkzx4.R.iget(568)!=0|true))||(__CLR4_4_1bjbjl4dxkzx4.R.iget(569)==0&false)))
                            {__CLR4_4_1bjbjl4dxkzx4.R.inc(570);this.maximum = data.maximum;
                    }} }else {__CLR4_4_1bjbjl4dxkzx4.R.inc(571);if ((((this.maximum instanceof Float || data.maximum instanceof Float)&&(__CLR4_4_1bjbjl4dxkzx4.R.iget(572)!=0|true))||(__CLR4_4_1bjbjl4dxkzx4.R.iget(573)==0&false))) {{
                        __CLR4_4_1bjbjl4dxkzx4.R.inc(574);if ((((((Float)data.maximum).compareTo(((Float)this.maximum))==1)&&(__CLR4_4_1bjbjl4dxkzx4.R.iget(575)!=0|true))||(__CLR4_4_1bjbjl4dxkzx4.R.iget(576)==0&false)))
                            {__CLR4_4_1bjbjl4dxkzx4.R.inc(577);this.maximum = data.maximum;
                    }} }else {{
                        // Integer
                        __CLR4_4_1bjbjl4dxkzx4.R.inc(578);if ((((((Integer)data.maximum).compareTo(((Integer)this.maximum))==1)&&(__CLR4_4_1bjbjl4dxkzx4.R.iget(579)!=0|true))||(__CLR4_4_1bjbjl4dxkzx4.R.iget(580)==0&false)))
                            {__CLR4_4_1bjbjl4dxkzx4.R.inc(581);this.maximum = data.maximum;
                    }}
                }}}}}}
            }}}}finally{__CLR4_4_1bjbjl4dxkzx4.R.flushNeeded();}}

            /**
             * {@inheritDoc}
             */
            @Override
            public int hashCode() {try{__CLR4_4_1bjbjl4dxkzx4.R.inc(582);
                __CLR4_4_1bjbjl4dxkzx4.R.inc(583);return 31 * (int)(this.start + this.end + this.maximum.hashCode());
            }finally{__CLR4_4_1bjbjl4dxkzx4.R.flushNeeded();}}

            /**
             * {@inheritDoc}
             */
            @Override
            public boolean equals(Object obj) {try{__CLR4_4_1bjbjl4dxkzx4.R.inc(584);
                __CLR4_4_1bjbjl4dxkzx4.R.inc(585);if ((((!(obj instanceof RangeMaximumData))&&(__CLR4_4_1bjbjl4dxkzx4.R.iget(586)!=0|true))||(__CLR4_4_1bjbjl4dxkzx4.R.iget(587)==0&false)))
                    {__CLR4_4_1bjbjl4dxkzx4.R.inc(588);return false;

                }__CLR4_4_1bjbjl4dxkzx4.R.inc(589);final RangeMaximumData<N> data = (RangeMaximumData<N>) obj;
                __CLR4_4_1bjbjl4dxkzx4.R.inc(590);if ((((this.start == data.start && this.end == data.end && this.maximum.equals(data.maximum))&&(__CLR4_4_1bjbjl4dxkzx4.R.iget(591)!=0|true))||(__CLR4_4_1bjbjl4dxkzx4.R.iget(592)==0&false)))
                    {__CLR4_4_1bjbjl4dxkzx4.R.inc(593);return true;
                }__CLR4_4_1bjbjl4dxkzx4.R.inc(594);return false;
            }finally{__CLR4_4_1bjbjl4dxkzx4.R.flushNeeded();}}

            /**
             * {@inheritDoc}
             */
            @Override
            public String toString() {try{__CLR4_4_1bjbjl4dxkzx4.R.inc(595);
                __CLR4_4_1bjbjl4dxkzx4.R.inc(596);StringBuilder builder = new StringBuilder();
                __CLR4_4_1bjbjl4dxkzx4.R.inc(597);builder.append(super.toString()).append(" ");
                __CLR4_4_1bjbjl4dxkzx4.R.inc(598);builder.append("maximum=").append(maximum);
                __CLR4_4_1bjbjl4dxkzx4.R.inc(599);return builder.toString();
            }finally{__CLR4_4_1bjbjl4dxkzx4.R.flushNeeded();}}
        }

        /**
         * Data structure representing minimum in the range.
         */
        public static final class RangeMinimumData<N extends Number> extends Data {

            public N minimum = null;

            public RangeMinimumData(long start, long end) {
                super(start, end);__CLR4_4_1bjbjl4dxkzx4.R.inc(601);try{__CLR4_4_1bjbjl4dxkzx4.R.inc(600);
            }finally{__CLR4_4_1bjbjl4dxkzx4.R.flushNeeded();}}

            public RangeMinimumData(long index, N number) {
                super(index);__CLR4_4_1bjbjl4dxkzx4.R.inc(603);try{__CLR4_4_1bjbjl4dxkzx4.R.inc(602);

                __CLR4_4_1bjbjl4dxkzx4.R.inc(604);this.minimum = number;
            }finally{__CLR4_4_1bjbjl4dxkzx4.R.flushNeeded();}}

            public RangeMinimumData(long start, long end, N number) {
                super(start, end);__CLR4_4_1bjbjl4dxkzx4.R.inc(606);try{__CLR4_4_1bjbjl4dxkzx4.R.inc(605);

                __CLR4_4_1bjbjl4dxkzx4.R.inc(607);this.minimum = number;
            }finally{__CLR4_4_1bjbjl4dxkzx4.R.flushNeeded();}}

            /**
             * {@inheritDoc}
             */
            @Override
            public void clear() {try{__CLR4_4_1bjbjl4dxkzx4.R.inc(608);
                __CLR4_4_1bjbjl4dxkzx4.R.inc(609);super.clear();

                __CLR4_4_1bjbjl4dxkzx4.R.inc(610);minimum = null;
            }finally{__CLR4_4_1bjbjl4dxkzx4.R.flushNeeded();}}

            /**
             * {@inheritDoc}
             */
            @Override
            public Data copy() {try{__CLR4_4_1bjbjl4dxkzx4.R.inc(611);
                __CLR4_4_1bjbjl4dxkzx4.R.inc(612);return new RangeMinimumData<N>(start, end, minimum);
            }finally{__CLR4_4_1bjbjl4dxkzx4.R.flushNeeded();}}

            /**
             * {@inheritDoc}
             */
            @Override
            public Data query(long startOfQuery, long endOfQuery) {try{__CLR4_4_1bjbjl4dxkzx4.R.inc(613);
                __CLR4_4_1bjbjl4dxkzx4.R.inc(614);if ((((endOfQuery < this.start || startOfQuery > this.end)&&(__CLR4_4_1bjbjl4dxkzx4.R.iget(615)!=0|true))||(__CLR4_4_1bjbjl4dxkzx4.R.iget(616)==0&false)))
                    {__CLR4_4_1bjbjl4dxkzx4.R.inc(617);return null;

                }__CLR4_4_1bjbjl4dxkzx4.R.inc(618);return copy();
            }finally{__CLR4_4_1bjbjl4dxkzx4.R.flushNeeded();}}

            /**
             * {@inheritDoc}
             */
            @Override
            public Data combined(Data data) {try{__CLR4_4_1bjbjl4dxkzx4.R.inc(619);
                __CLR4_4_1bjbjl4dxkzx4.R.inc(620);RangeMinimumData<N> q = null;
                __CLR4_4_1bjbjl4dxkzx4.R.inc(621);if ((((data instanceof RangeMinimumData)&&(__CLR4_4_1bjbjl4dxkzx4.R.iget(622)!=0|true))||(__CLR4_4_1bjbjl4dxkzx4.R.iget(623)==0&false))) {{
                    __CLR4_4_1bjbjl4dxkzx4.R.inc(624);q = (RangeMinimumData<N>) data;
                    __CLR4_4_1bjbjl4dxkzx4.R.inc(625);this.combined(q);
                }
                }__CLR4_4_1bjbjl4dxkzx4.R.inc(626);return this;
            }finally{__CLR4_4_1bjbjl4dxkzx4.R.flushNeeded();}}

            private void combined(RangeMinimumData<N> data) {try{__CLR4_4_1bjbjl4dxkzx4.R.inc(627);
                __CLR4_4_1bjbjl4dxkzx4.R.inc(628);if ((((this.minimum == null && data.minimum == null)&&(__CLR4_4_1bjbjl4dxkzx4.R.iget(629)!=0|true))||(__CLR4_4_1bjbjl4dxkzx4.R.iget(630)==0&false)))
                    {__CLR4_4_1bjbjl4dxkzx4.R.inc(631);return;
                }else {__CLR4_4_1bjbjl4dxkzx4.R.inc(632);if ((((this.minimum != null && data.minimum == null)&&(__CLR4_4_1bjbjl4dxkzx4.R.iget(633)!=0|true))||(__CLR4_4_1bjbjl4dxkzx4.R.iget(634)==0&false)))
                    {__CLR4_4_1bjbjl4dxkzx4.R.inc(635);return;
                }else {__CLR4_4_1bjbjl4dxkzx4.R.inc(636);if ((((this.minimum == null && data.minimum != null)&&(__CLR4_4_1bjbjl4dxkzx4.R.iget(637)!=0|true))||(__CLR4_4_1bjbjl4dxkzx4.R.iget(638)==0&false)))
                    {__CLR4_4_1bjbjl4dxkzx4.R.inc(639);this.minimum = data.minimum;
                }else {{
                    /* TODO: This is ugly */
                    __CLR4_4_1bjbjl4dxkzx4.R.inc(640);if ((((this.minimum instanceof BigDecimal || data.minimum instanceof BigDecimal)&&(__CLR4_4_1bjbjl4dxkzx4.R.iget(641)!=0|true))||(__CLR4_4_1bjbjl4dxkzx4.R.iget(642)==0&false))) {{
                        __CLR4_4_1bjbjl4dxkzx4.R.inc(643);if ((((((BigDecimal)data.minimum).compareTo(((BigDecimal)this.minimum))==-1)&&(__CLR4_4_1bjbjl4dxkzx4.R.iget(644)!=0|true))||(__CLR4_4_1bjbjl4dxkzx4.R.iget(645)==0&false)))
                            {__CLR4_4_1bjbjl4dxkzx4.R.inc(646);this.minimum = data.minimum;
                    }} }else {__CLR4_4_1bjbjl4dxkzx4.R.inc(647);if ((((this.minimum instanceof BigInteger || data.minimum instanceof BigInteger)&&(__CLR4_4_1bjbjl4dxkzx4.R.iget(648)!=0|true))||(__CLR4_4_1bjbjl4dxkzx4.R.iget(649)==0&false))) {{
                        __CLR4_4_1bjbjl4dxkzx4.R.inc(650);if ((((((BigInteger)data.minimum).compareTo(((BigInteger)this.minimum))==-1)&&(__CLR4_4_1bjbjl4dxkzx4.R.iget(651)!=0|true))||(__CLR4_4_1bjbjl4dxkzx4.R.iget(652)==0&false)))
                            {__CLR4_4_1bjbjl4dxkzx4.R.inc(653);this.minimum = data.minimum;
                    }} }else {__CLR4_4_1bjbjl4dxkzx4.R.inc(654);if ((((this.minimum instanceof Long || data.minimum instanceof Long)&&(__CLR4_4_1bjbjl4dxkzx4.R.iget(655)!=0|true))||(__CLR4_4_1bjbjl4dxkzx4.R.iget(656)==0&false))) {{
                        __CLR4_4_1bjbjl4dxkzx4.R.inc(657);if ((((((Long)data.minimum).compareTo(((Long)this.minimum))==-1)&&(__CLR4_4_1bjbjl4dxkzx4.R.iget(658)!=0|true))||(__CLR4_4_1bjbjl4dxkzx4.R.iget(659)==0&false)))
                            {__CLR4_4_1bjbjl4dxkzx4.R.inc(660);this.minimum = data.minimum;
                    }} }else {__CLR4_4_1bjbjl4dxkzx4.R.inc(661);if ((((this.minimum instanceof Double || data.minimum instanceof Double)&&(__CLR4_4_1bjbjl4dxkzx4.R.iget(662)!=0|true))||(__CLR4_4_1bjbjl4dxkzx4.R.iget(663)==0&false))) {{
                        __CLR4_4_1bjbjl4dxkzx4.R.inc(664);if ((((((Double)data.minimum).compareTo(((Double)this.minimum))==-1)&&(__CLR4_4_1bjbjl4dxkzx4.R.iget(665)!=0|true))||(__CLR4_4_1bjbjl4dxkzx4.R.iget(666)==0&false)))
                            {__CLR4_4_1bjbjl4dxkzx4.R.inc(667);this.minimum = data.minimum;
                    }} }else {__CLR4_4_1bjbjl4dxkzx4.R.inc(668);if ((((this.minimum instanceof Float || data.minimum instanceof Float)&&(__CLR4_4_1bjbjl4dxkzx4.R.iget(669)!=0|true))||(__CLR4_4_1bjbjl4dxkzx4.R.iget(670)==0&false))) {{
                        __CLR4_4_1bjbjl4dxkzx4.R.inc(671);if ((((((Float)data.minimum).compareTo(((Float)this.minimum))==-1)&&(__CLR4_4_1bjbjl4dxkzx4.R.iget(672)!=0|true))||(__CLR4_4_1bjbjl4dxkzx4.R.iget(673)==0&false)))
                            {__CLR4_4_1bjbjl4dxkzx4.R.inc(674);this.minimum = data.minimum;
                    }} }else {{
                        // Integer
                        __CLR4_4_1bjbjl4dxkzx4.R.inc(675);if ((((((Integer)data.minimum).compareTo(((Integer)this.minimum))==-1)&&(__CLR4_4_1bjbjl4dxkzx4.R.iget(676)!=0|true))||(__CLR4_4_1bjbjl4dxkzx4.R.iget(677)==0&false)))
                            {__CLR4_4_1bjbjl4dxkzx4.R.inc(678);this.minimum = data.minimum;
                    }}
                }}}}}}
            }}}}finally{__CLR4_4_1bjbjl4dxkzx4.R.flushNeeded();}}

            /**
             * {@inheritDoc}
             */
            @Override
            public int hashCode() {try{__CLR4_4_1bjbjl4dxkzx4.R.inc(679);
                __CLR4_4_1bjbjl4dxkzx4.R.inc(680);return 31 * (int)(this.start + this.end + this.minimum.hashCode());
            }finally{__CLR4_4_1bjbjl4dxkzx4.R.flushNeeded();}}

            /**
             * {@inheritDoc}
             */
            @Override
            public boolean equals(Object obj) {try{__CLR4_4_1bjbjl4dxkzx4.R.inc(681);
                __CLR4_4_1bjbjl4dxkzx4.R.inc(682);if ((((!(obj instanceof RangeMinimumData))&&(__CLR4_4_1bjbjl4dxkzx4.R.iget(683)!=0|true))||(__CLR4_4_1bjbjl4dxkzx4.R.iget(684)==0&false)))
                    {__CLR4_4_1bjbjl4dxkzx4.R.inc(685);return false;
 
                }__CLR4_4_1bjbjl4dxkzx4.R.inc(686);final RangeMinimumData<N> data = (RangeMinimumData<N>) obj;
                __CLR4_4_1bjbjl4dxkzx4.R.inc(687);if ((((this.start == data.start && this.end == data.end && this.minimum.equals(data.minimum))&&(__CLR4_4_1bjbjl4dxkzx4.R.iget(688)!=0|true))||(__CLR4_4_1bjbjl4dxkzx4.R.iget(689)==0&false)))
                    {__CLR4_4_1bjbjl4dxkzx4.R.inc(690);return true;

                }__CLR4_4_1bjbjl4dxkzx4.R.inc(691);return false;
            }finally{__CLR4_4_1bjbjl4dxkzx4.R.flushNeeded();}}

            /**
             * {@inheritDoc}
             */
            @Override
            public String toString() {try{__CLR4_4_1bjbjl4dxkzx4.R.inc(692);
                __CLR4_4_1bjbjl4dxkzx4.R.inc(693);StringBuilder builder = new StringBuilder();
                __CLR4_4_1bjbjl4dxkzx4.R.inc(694);builder.append(super.toString()).append(" ");
                __CLR4_4_1bjbjl4dxkzx4.R.inc(695);builder.append("minimum=").append(minimum);
                __CLR4_4_1bjbjl4dxkzx4.R.inc(696);return builder.toString();
            }finally{__CLR4_4_1bjbjl4dxkzx4.R.flushNeeded();}}
        }

        /**
         * Data structure representing sum of the range.
         */
        public static final class RangeSumData<N extends Number> extends Data {

            public N sum = null;

            public RangeSumData(long start, long end) {
                super(start, end);__CLR4_4_1bjbjl4dxkzx4.R.inc(698);try{__CLR4_4_1bjbjl4dxkzx4.R.inc(697);
            }finally{__CLR4_4_1bjbjl4dxkzx4.R.flushNeeded();}}

            public RangeSumData(long index, N number) {
                super(index);__CLR4_4_1bjbjl4dxkzx4.R.inc(700);try{__CLR4_4_1bjbjl4dxkzx4.R.inc(699);

                __CLR4_4_1bjbjl4dxkzx4.R.inc(701);this.sum = number;
            }finally{__CLR4_4_1bjbjl4dxkzx4.R.flushNeeded();}}

            public RangeSumData(long start, long end, N number) {
                super(start, end);__CLR4_4_1bjbjl4dxkzx4.R.inc(703);try{__CLR4_4_1bjbjl4dxkzx4.R.inc(702);

                __CLR4_4_1bjbjl4dxkzx4.R.inc(704);this.sum = number;
            }finally{__CLR4_4_1bjbjl4dxkzx4.R.flushNeeded();}}

            /**
             * {@inheritDoc}
             */
            @Override
            public void clear() {try{__CLR4_4_1bjbjl4dxkzx4.R.inc(705);
                __CLR4_4_1bjbjl4dxkzx4.R.inc(706);super.clear();

                __CLR4_4_1bjbjl4dxkzx4.R.inc(707);sum = null;
            }finally{__CLR4_4_1bjbjl4dxkzx4.R.flushNeeded();}}

            /**
             * {@inheritDoc}
             */
            @Override
            public Data copy() {try{__CLR4_4_1bjbjl4dxkzx4.R.inc(708);
                __CLR4_4_1bjbjl4dxkzx4.R.inc(709);return new RangeSumData<N>(start, end, sum);
            }finally{__CLR4_4_1bjbjl4dxkzx4.R.flushNeeded();}}

            /**
             * {@inheritDoc}
             */
            @Override
            public Data query(long startOfQuery, long endOfQuery) {try{__CLR4_4_1bjbjl4dxkzx4.R.inc(710);
                __CLR4_4_1bjbjl4dxkzx4.R.inc(711);if ((((endOfQuery < this.start || startOfQuery > this.end)&&(__CLR4_4_1bjbjl4dxkzx4.R.iget(712)!=0|true))||(__CLR4_4_1bjbjl4dxkzx4.R.iget(713)==0&false)))
                    {__CLR4_4_1bjbjl4dxkzx4.R.inc(714);return null;

                }__CLR4_4_1bjbjl4dxkzx4.R.inc(715);return copy();
            }finally{__CLR4_4_1bjbjl4dxkzx4.R.flushNeeded();}}

            /**
             * {@inheritDoc}
             */
            @Override
            public Data combined(Data data) {try{__CLR4_4_1bjbjl4dxkzx4.R.inc(716);
                __CLR4_4_1bjbjl4dxkzx4.R.inc(717);RangeSumData<N> q = null;
                __CLR4_4_1bjbjl4dxkzx4.R.inc(718);if ((((data instanceof RangeSumData)&&(__CLR4_4_1bjbjl4dxkzx4.R.iget(719)!=0|true))||(__CLR4_4_1bjbjl4dxkzx4.R.iget(720)==0&false))) {{
                    __CLR4_4_1bjbjl4dxkzx4.R.inc(721);q = (RangeSumData<N>) data;
                    __CLR4_4_1bjbjl4dxkzx4.R.inc(722);this.combined(q);
                }
                }__CLR4_4_1bjbjl4dxkzx4.R.inc(723);return this;
            }finally{__CLR4_4_1bjbjl4dxkzx4.R.flushNeeded();}}

            private void combined(RangeSumData<N> data) {try{__CLR4_4_1bjbjl4dxkzx4.R.inc(724);
                __CLR4_4_1bjbjl4dxkzx4.R.inc(725);if ((((this.sum == null && data.sum == null)&&(__CLR4_4_1bjbjl4dxkzx4.R.iget(726)!=0|true))||(__CLR4_4_1bjbjl4dxkzx4.R.iget(727)==0&false)))
                    {__CLR4_4_1bjbjl4dxkzx4.R.inc(728);return;
                }else {__CLR4_4_1bjbjl4dxkzx4.R.inc(729);if ((((this.sum != null && data.sum == null)&&(__CLR4_4_1bjbjl4dxkzx4.R.iget(730)!=0|true))||(__CLR4_4_1bjbjl4dxkzx4.R.iget(731)==0&false)))
                    {__CLR4_4_1bjbjl4dxkzx4.R.inc(732);return;
                }else {__CLR4_4_1bjbjl4dxkzx4.R.inc(733);if ((((this.sum == null && data.sum != null)&&(__CLR4_4_1bjbjl4dxkzx4.R.iget(734)!=0|true))||(__CLR4_4_1bjbjl4dxkzx4.R.iget(735)==0&false)))
                    {__CLR4_4_1bjbjl4dxkzx4.R.inc(736);this.sum = data.sum;
                }else {{
                    /* TODO: This is ugly and how to handle number overflow? */
                    __CLR4_4_1bjbjl4dxkzx4.R.inc(737);if ((((this.sum instanceof BigDecimal || data.sum instanceof BigDecimal)&&(__CLR4_4_1bjbjl4dxkzx4.R.iget(738)!=0|true))||(__CLR4_4_1bjbjl4dxkzx4.R.iget(739)==0&false))) {{
                        __CLR4_4_1bjbjl4dxkzx4.R.inc(740);BigDecimal result = ((BigDecimal)this.sum).add((BigDecimal)data.sum);
                        __CLR4_4_1bjbjl4dxkzx4.R.inc(741);this.sum = (N)result;
                    } }else {__CLR4_4_1bjbjl4dxkzx4.R.inc(742);if ((((this.sum instanceof BigInteger || data.sum instanceof BigInteger)&&(__CLR4_4_1bjbjl4dxkzx4.R.iget(743)!=0|true))||(__CLR4_4_1bjbjl4dxkzx4.R.iget(744)==0&false))) {{
                        __CLR4_4_1bjbjl4dxkzx4.R.inc(745);BigInteger result = ((BigInteger)this.sum).add((BigInteger)data.sum);
                        __CLR4_4_1bjbjl4dxkzx4.R.inc(746);this.sum = (N)result;
                    } }else {__CLR4_4_1bjbjl4dxkzx4.R.inc(747);if ((((this.sum instanceof Long || data.sum instanceof Long)&&(__CLR4_4_1bjbjl4dxkzx4.R.iget(748)!=0|true))||(__CLR4_4_1bjbjl4dxkzx4.R.iget(749)==0&false))) {{
                        __CLR4_4_1bjbjl4dxkzx4.R.inc(750);Long result = (this.sum.longValue() + data.sum.longValue());
                        __CLR4_4_1bjbjl4dxkzx4.R.inc(751);this.sum = (N)result;
                    } }else {__CLR4_4_1bjbjl4dxkzx4.R.inc(752);if ((((this.sum instanceof Double || data.sum instanceof Double)&&(__CLR4_4_1bjbjl4dxkzx4.R.iget(753)!=0|true))||(__CLR4_4_1bjbjl4dxkzx4.R.iget(754)==0&false))) {{
                        __CLR4_4_1bjbjl4dxkzx4.R.inc(755);Double result = (this.sum.doubleValue() + data.sum.doubleValue());
                        __CLR4_4_1bjbjl4dxkzx4.R.inc(756);this.sum = (N)result;
                    } }else {__CLR4_4_1bjbjl4dxkzx4.R.inc(757);if ((((this.sum instanceof Float || data.sum instanceof Float)&&(__CLR4_4_1bjbjl4dxkzx4.R.iget(758)!=0|true))||(__CLR4_4_1bjbjl4dxkzx4.R.iget(759)==0&false))) {{
                        __CLR4_4_1bjbjl4dxkzx4.R.inc(760);Float result = (this.sum.floatValue() + data.sum.floatValue());
                        __CLR4_4_1bjbjl4dxkzx4.R.inc(761);this.sum = (N)result;
                    } }else {{
                        // Integer
                        __CLR4_4_1bjbjl4dxkzx4.R.inc(762);Integer result = (this.sum.intValue() + data.sum.intValue());
                        __CLR4_4_1bjbjl4dxkzx4.R.inc(763);this.sum = (N)result;
                    }
                }}}}}}
            }}}}finally{__CLR4_4_1bjbjl4dxkzx4.R.flushNeeded();}}

            /**
             * {@inheritDoc}
             */
            @Override
            public int hashCode() {try{__CLR4_4_1bjbjl4dxkzx4.R.inc(764);
                __CLR4_4_1bjbjl4dxkzx4.R.inc(765);return 31 * (int)(this.start + this.end + this.sum.hashCode());
            }finally{__CLR4_4_1bjbjl4dxkzx4.R.flushNeeded();}}

            /**
             * {@inheritDoc}
             */
            @Override
            public boolean equals(Object obj) {try{__CLR4_4_1bjbjl4dxkzx4.R.inc(766);
                __CLR4_4_1bjbjl4dxkzx4.R.inc(767);if ((((!(obj instanceof RangeSumData))&&(__CLR4_4_1bjbjl4dxkzx4.R.iget(768)!=0|true))||(__CLR4_4_1bjbjl4dxkzx4.R.iget(769)==0&false)))
                    {__CLR4_4_1bjbjl4dxkzx4.R.inc(770);return false;

                }__CLR4_4_1bjbjl4dxkzx4.R.inc(771);final RangeSumData<N> data = (RangeSumData<N>) obj;
                __CLR4_4_1bjbjl4dxkzx4.R.inc(772);if ((((this.start == data.start && this.end == data.end && this.sum.equals(data.sum))&&(__CLR4_4_1bjbjl4dxkzx4.R.iget(773)!=0|true))||(__CLR4_4_1bjbjl4dxkzx4.R.iget(774)==0&false)))
                    {__CLR4_4_1bjbjl4dxkzx4.R.inc(775);return true;

                }__CLR4_4_1bjbjl4dxkzx4.R.inc(776);return false;
            }finally{__CLR4_4_1bjbjl4dxkzx4.R.flushNeeded();}}

            /**
             * {@inheritDoc}
             */
            @Override
            public String toString() {try{__CLR4_4_1bjbjl4dxkzx4.R.inc(777);
                __CLR4_4_1bjbjl4dxkzx4.R.inc(778);final StringBuilder builder = new StringBuilder();
                __CLR4_4_1bjbjl4dxkzx4.R.inc(779);builder.append(super.toString()).append(" ");
                __CLR4_4_1bjbjl4dxkzx4.R.inc(780);builder.append("sum=").append(sum);
                __CLR4_4_1bjbjl4dxkzx4.R.inc(781);return builder.toString();
            }finally{__CLR4_4_1bjbjl4dxkzx4.R.flushNeeded();}}
        }

        /**
         * Data structure representing an interval.
         */
        public static final class IntervalData<O extends Object> extends Data {

            private Set<O> set = new TreeSet<O>(); // Sorted

            /**
             * Interval data using O as it's unique identifier
             * 
             * @param object
             *            Object which defines the interval data
             */
            public IntervalData(long index, O object) {
                super(index);__CLR4_4_1bjbjl4dxkzx4.R.inc(783);try{__CLR4_4_1bjbjl4dxkzx4.R.inc(782);

                __CLR4_4_1bjbjl4dxkzx4.R.inc(784);this.set.add(object);
            }finally{__CLR4_4_1bjbjl4dxkzx4.R.flushNeeded();}}

            /**
             * Interval data using O as it's unique identifier
             * 
             * @param object
             *            Object which defines the interval data
             */
            public IntervalData(long start, long end, O object) {
                super(start, end);__CLR4_4_1bjbjl4dxkzx4.R.inc(786);try{__CLR4_4_1bjbjl4dxkzx4.R.inc(785);

                __CLR4_4_1bjbjl4dxkzx4.R.inc(787);this.set.add(object);
            }finally{__CLR4_4_1bjbjl4dxkzx4.R.flushNeeded();}}

            /**
             * Interval data list which should all be unique
             * 
             * @param set
             *            of interval data objects
             */
            public IntervalData(long start, long end, Set<O> set) {
                super(start, end);__CLR4_4_1bjbjl4dxkzx4.R.inc(789);try{__CLR4_4_1bjbjl4dxkzx4.R.inc(788);

                __CLR4_4_1bjbjl4dxkzx4.R.inc(790);this.set = set;
            }finally{__CLR4_4_1bjbjl4dxkzx4.R.flushNeeded();}}

            /**
             * Get the data set in this interval
             * 
             * @return Unmodifiable collection of data objects
             */
            public Collection<O> getData() {try{__CLR4_4_1bjbjl4dxkzx4.R.inc(791);
                __CLR4_4_1bjbjl4dxkzx4.R.inc(792);return Collections.unmodifiableCollection(this.set);
            }finally{__CLR4_4_1bjbjl4dxkzx4.R.flushNeeded();}}

            /**
             * {@inheritDoc}
             */
            @Override
            public void clear() {try{__CLR4_4_1bjbjl4dxkzx4.R.inc(793);
                __CLR4_4_1bjbjl4dxkzx4.R.inc(794);super.clear();

                __CLR4_4_1bjbjl4dxkzx4.R.inc(795);this.set.clear();
            }finally{__CLR4_4_1bjbjl4dxkzx4.R.flushNeeded();}}

            /**
             * {@inheritDoc}
             */
            @Override
            public Data copy() {try{__CLR4_4_1bjbjl4dxkzx4.R.inc(796);
                __CLR4_4_1bjbjl4dxkzx4.R.inc(797);final Set<O> listCopy = new TreeSet<O>();
                __CLR4_4_1bjbjl4dxkzx4.R.inc(798);listCopy.addAll(set);
                __CLR4_4_1bjbjl4dxkzx4.R.inc(799);return new IntervalData<O>(start, end, listCopy);
            }finally{__CLR4_4_1bjbjl4dxkzx4.R.flushNeeded();}}

            /**
             * {@inheritDoc}
             */
            @Override
            public Data query(long startOfQuery, long endOfQuery) {try{__CLR4_4_1bjbjl4dxkzx4.R.inc(800);
                __CLR4_4_1bjbjl4dxkzx4.R.inc(801);if ((((endOfQuery < this.start || startOfQuery > this.end)&&(__CLR4_4_1bjbjl4dxkzx4.R.iget(802)!=0|true))||(__CLR4_4_1bjbjl4dxkzx4.R.iget(803)==0&false)))
                    {__CLR4_4_1bjbjl4dxkzx4.R.inc(804);return null;

                }__CLR4_4_1bjbjl4dxkzx4.R.inc(805);return copy();
            }finally{__CLR4_4_1bjbjl4dxkzx4.R.flushNeeded();}}

            /**
             * {@inheritDoc}
             */
            @Override
            public Data combined(Data data) {try{__CLR4_4_1bjbjl4dxkzx4.R.inc(806);
                __CLR4_4_1bjbjl4dxkzx4.R.inc(807);IntervalData<O> q = null;
                __CLR4_4_1bjbjl4dxkzx4.R.inc(808);if ((((data instanceof IntervalData)&&(__CLR4_4_1bjbjl4dxkzx4.R.iget(809)!=0|true))||(__CLR4_4_1bjbjl4dxkzx4.R.iget(810)==0&false))) {{
                    __CLR4_4_1bjbjl4dxkzx4.R.inc(811);q = (IntervalData<O>) data;
                    __CLR4_4_1bjbjl4dxkzx4.R.inc(812);this.combined(q);
                }
                }__CLR4_4_1bjbjl4dxkzx4.R.inc(813);return this;
            }finally{__CLR4_4_1bjbjl4dxkzx4.R.flushNeeded();}}

            /**
             * Combined for interval specific data.
             * 
             * @param data
             *            resulted from combination.
             */
            private void combined(IntervalData<O> data) {try{__CLR4_4_1bjbjl4dxkzx4.R.inc(814);
                __CLR4_4_1bjbjl4dxkzx4.R.inc(815);if ((((data.start < this.start)&&(__CLR4_4_1bjbjl4dxkzx4.R.iget(816)!=0|true))||(__CLR4_4_1bjbjl4dxkzx4.R.iget(817)==0&false)))
                    {__CLR4_4_1bjbjl4dxkzx4.R.inc(818);this.start = data.start;
                }__CLR4_4_1bjbjl4dxkzx4.R.inc(819);if ((((data.end > this.end)&&(__CLR4_4_1bjbjl4dxkzx4.R.iget(820)!=0|true))||(__CLR4_4_1bjbjl4dxkzx4.R.iget(821)==0&false)))
                    {__CLR4_4_1bjbjl4dxkzx4.R.inc(822);this.end = data.end;
                }__CLR4_4_1bjbjl4dxkzx4.R.inc(823);this.set.addAll(data.set);
            }finally{__CLR4_4_1bjbjl4dxkzx4.R.flushNeeded();}}

            /**
             * {@inheritDoc}
             */
            @Override
            public int hashCode() {try{__CLR4_4_1bjbjl4dxkzx4.R.inc(824);
                __CLR4_4_1bjbjl4dxkzx4.R.inc(825);return 31 * (int)(this.start + this.end + this.set.size());
            }finally{__CLR4_4_1bjbjl4dxkzx4.R.flushNeeded();}}

            /**
             * {@inheritDoc}
             */
            @Override
            public boolean equals(Object obj) {try{__CLR4_4_1bjbjl4dxkzx4.R.inc(826);
                __CLR4_4_1bjbjl4dxkzx4.R.inc(827);if ((((!(obj instanceof IntervalData))&&(__CLR4_4_1bjbjl4dxkzx4.R.iget(828)!=0|true))||(__CLR4_4_1bjbjl4dxkzx4.R.iget(829)==0&false)))
                    {__CLR4_4_1bjbjl4dxkzx4.R.inc(830);return false;

                }__CLR4_4_1bjbjl4dxkzx4.R.inc(831);final IntervalData<O> data = (IntervalData<O>) obj;
                __CLR4_4_1bjbjl4dxkzx4.R.inc(832);if ((((this.start == data.start && this.end == data.end)&&(__CLR4_4_1bjbjl4dxkzx4.R.iget(833)!=0|true))||(__CLR4_4_1bjbjl4dxkzx4.R.iget(834)==0&false))) {{
                    __CLR4_4_1bjbjl4dxkzx4.R.inc(835);if ((((this.set.size() != data.set.size())&&(__CLR4_4_1bjbjl4dxkzx4.R.iget(836)!=0|true))||(__CLR4_4_1bjbjl4dxkzx4.R.iget(837)==0&false)))
                        {__CLR4_4_1bjbjl4dxkzx4.R.inc(838);return false;
                    }__CLR4_4_1bjbjl4dxkzx4.R.inc(839);for (O o : set) {{
                        __CLR4_4_1bjbjl4dxkzx4.R.inc(840);if ((((!data.set.contains(o))&&(__CLR4_4_1bjbjl4dxkzx4.R.iget(841)!=0|true))||(__CLR4_4_1bjbjl4dxkzx4.R.iget(842)==0&false)))
                            {__CLR4_4_1bjbjl4dxkzx4.R.inc(843);return false;
                    }}
                    }__CLR4_4_1bjbjl4dxkzx4.R.inc(844);return true;
                }
                }__CLR4_4_1bjbjl4dxkzx4.R.inc(845);return false;
            }finally{__CLR4_4_1bjbjl4dxkzx4.R.flushNeeded();}}

            /**
             * {@inheritDoc}
             */
            @Override
            public String toString() {try{__CLR4_4_1bjbjl4dxkzx4.R.inc(846);
                __CLR4_4_1bjbjl4dxkzx4.R.inc(847);final StringBuilder builder = new StringBuilder();
                __CLR4_4_1bjbjl4dxkzx4.R.inc(848);builder.append(super.toString()).append(" ");
                __CLR4_4_1bjbjl4dxkzx4.R.inc(849);builder.append("set=").append(set);
                __CLR4_4_1bjbjl4dxkzx4.R.inc(850);return builder.toString();
            }finally{__CLR4_4_1bjbjl4dxkzx4.R.flushNeeded();}}
        }
    }

    /**
     * Data structure representing a segment.
     */
    protected abstract static class Segment<D extends Data> implements Comparable<Segment<D>> {

        protected Segment<D>[] segments = null;
        protected int length = 0;
        protected int half = 0;
        protected long start = 0;
        protected long end = 0;
        protected D data = null;
        protected int minLength = 0;

        public Segment(int minLength) {try{__CLR4_4_1bjbjl4dxkzx4.R.inc(851);
            __CLR4_4_1bjbjl4dxkzx4.R.inc(852);this.minLength = minLength;
        }finally{__CLR4_4_1bjbjl4dxkzx4.R.flushNeeded();}}

        /**
         * Query for data in range.
         * 
         * @param startOfQuery
         *            of the range to query for.
         * @param endOfQuery
         *            of range to query for.
         * @return Data in the range.
         */
        public abstract D query(long startOfQuery, long endOfQuery);

        protected boolean hasChildren() {try{__CLR4_4_1bjbjl4dxkzx4.R.inc(853);
            __CLR4_4_1bjbjl4dxkzx4.R.inc(854);return (segments != null);
        }finally{__CLR4_4_1bjbjl4dxkzx4.R.flushNeeded();}}

        protected Segment<D> getLeftChild() {try{__CLR4_4_1bjbjl4dxkzx4.R.inc(855);
            __CLR4_4_1bjbjl4dxkzx4.R.inc(856);return segments[0];
        }finally{__CLR4_4_1bjbjl4dxkzx4.R.flushNeeded();}}

        protected Segment<D> getRightChild() {try{__CLR4_4_1bjbjl4dxkzx4.R.inc(857);
            __CLR4_4_1bjbjl4dxkzx4.R.inc(858);return segments[1];
        }finally{__CLR4_4_1bjbjl4dxkzx4.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public String toString() {try{__CLR4_4_1bjbjl4dxkzx4.R.inc(859);
            __CLR4_4_1bjbjl4dxkzx4.R.inc(860);final StringBuilder builder = new StringBuilder();
            __CLR4_4_1bjbjl4dxkzx4.R.inc(861);builder.append(start).append("->");
            __CLR4_4_1bjbjl4dxkzx4.R.inc(862);builder.append(end).append(" ");
            __CLR4_4_1bjbjl4dxkzx4.R.inc(863);builder.append("Length=").append(length).append(" ");
            __CLR4_4_1bjbjl4dxkzx4.R.inc(864);builder.append("Data={").append(data).append("}");
            __CLR4_4_1bjbjl4dxkzx4.R.inc(865);return builder.toString();
        }finally{__CLR4_4_1bjbjl4dxkzx4.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        public int compareTo(Segment<D> p) {try{__CLR4_4_1bjbjl4dxkzx4.R.inc(866);
            __CLR4_4_1bjbjl4dxkzx4.R.inc(867);if ((((this.end < p.end)&&(__CLR4_4_1bjbjl4dxkzx4.R.iget(868)!=0|true))||(__CLR4_4_1bjbjl4dxkzx4.R.iget(869)==0&false)))
                {__CLR4_4_1bjbjl4dxkzx4.R.inc(870);return -1;
            }__CLR4_4_1bjbjl4dxkzx4.R.inc(871);if ((((p.end < this.end)&&(__CLR4_4_1bjbjl4dxkzx4.R.iget(872)!=0|true))||(__CLR4_4_1bjbjl4dxkzx4.R.iget(873)==0&false)))
                {__CLR4_4_1bjbjl4dxkzx4.R.inc(874);return 1;
            }__CLR4_4_1bjbjl4dxkzx4.R.inc(875);return 0;
        }finally{__CLR4_4_1bjbjl4dxkzx4.R.flushNeeded();}}
    }

    protected static class SegmentTreePrinter {

        public static <D extends SegmentTree.Data> String getString(SegmentTree<D> tree) {try{__CLR4_4_1bjbjl4dxkzx4.R.inc(876);
            __CLR4_4_1bjbjl4dxkzx4.R.inc(877);if ((((tree.root == null)&&(__CLR4_4_1bjbjl4dxkzx4.R.iget(878)!=0|true))||(__CLR4_4_1bjbjl4dxkzx4.R.iget(879)==0&false)))
                {__CLR4_4_1bjbjl4dxkzx4.R.inc(880);return "Tree has no nodes.";
            }__CLR4_4_1bjbjl4dxkzx4.R.inc(881);return getString(tree.root, "", true);
        }finally{__CLR4_4_1bjbjl4dxkzx4.R.flushNeeded();}}

        private static <D extends SegmentTree.Data> String getString(Segment<D> segment, String prefix, boolean isTail) {try{__CLR4_4_1bjbjl4dxkzx4.R.inc(882);
            __CLR4_4_1bjbjl4dxkzx4.R.inc(883);final StringBuilder builder = new StringBuilder();
            __CLR4_4_1bjbjl4dxkzx4.R.inc(884);builder.append(prefix + ((((isTail )&&(__CLR4_4_1bjbjl4dxkzx4.R.iget(885)!=0|true))||(__CLR4_4_1bjbjl4dxkzx4.R.iget(886)==0&false))? "\u9239\u65ba\u6522\u9239\ufffd " : "\u9239\u6ebe\u6522\u9239\ufffd ") + segment.toString() + "\n");

            __CLR4_4_1bjbjl4dxkzx4.R.inc(887);final List<Segment<D>> children = new ArrayList<Segment<D>>();
            __CLR4_4_1bjbjl4dxkzx4.R.inc(888);if ((((segment.segments != null)&&(__CLR4_4_1bjbjl4dxkzx4.R.iget(889)!=0|true))||(__CLR4_4_1bjbjl4dxkzx4.R.iget(890)==0&false))) {{
                __CLR4_4_1bjbjl4dxkzx4.R.inc(891);for (Segment<D> c : segment.segments)
                    {__CLR4_4_1bjbjl4dxkzx4.R.inc(892);children.add(c);
            }}

            }__CLR4_4_1bjbjl4dxkzx4.R.inc(893);for (int i = 0; (((i < children.size() - 1)&&(__CLR4_4_1bjbjl4dxkzx4.R.iget(894)!=0|true))||(__CLR4_4_1bjbjl4dxkzx4.R.iget(895)==0&false)); i++)
                {__CLR4_4_1bjbjl4dxkzx4.R.inc(896);builder.append(getString(children.get(i), prefix + ((((isTail )&&(__CLR4_4_1bjbjl4dxkzx4.R.iget(897)!=0|true))||(__CLR4_4_1bjbjl4dxkzx4.R.iget(898)==0&false))? "    " : "\u9239\ufffd   "), false));

            }__CLR4_4_1bjbjl4dxkzx4.R.inc(899);if ((((children.size() > 1)&&(__CLR4_4_1bjbjl4dxkzx4.R.iget(900)!=0|true))||(__CLR4_4_1bjbjl4dxkzx4.R.iget(901)==0&false)))
                {__CLR4_4_1bjbjl4dxkzx4.R.inc(902);builder.append(getString(children.get(children.size() - 1), prefix + ((((isTail )&&(__CLR4_4_1bjbjl4dxkzx4.R.iget(903)!=0|true))||(__CLR4_4_1bjbjl4dxkzx4.R.iget(904)==0&false))? "    " : "\u9239\ufffd   "), true));

            }__CLR4_4_1bjbjl4dxkzx4.R.inc(905);return builder.toString();
        }finally{__CLR4_4_1bjbjl4dxkzx4.R.flushNeeded();}}
    }
}
