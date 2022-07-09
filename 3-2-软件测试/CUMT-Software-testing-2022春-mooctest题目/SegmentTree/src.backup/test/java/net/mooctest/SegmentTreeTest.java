package net.mooctest;


import org.junit.Test;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SegmentTreeTest {

    @Test
    public void st() {

        SegmentTree.Data.QuadrantData data = new SegmentTree.Data.QuadrantData(0, 1, 10, 20, 30);
        data.clear();
        assertEquals(Long.MIN_VALUE, data.start);
        assertEquals(Long.MAX_VALUE, data.end);

        SegmentTree.Data data1 = new SegmentTree.Data.QuadrantData(1, 30, 20, 10, 0);
        data.combined(data1);
        assertEquals("-9223372036854775808->9223372036854775807 30,20,10,0", data.toString());
    }

    @Test
    public void st_combine() {

        SegmentTree.Data qd1 = new SegmentTree.Data.QuadrantData(0, 10, 20, 30, 40);
        SegmentTree.Data qd2 = new SegmentTree.Data.QuadrantData(1, -20, 30, -40, 60);
        qd1.combined(null);
        qd1.combined(qd2);
        assertEquals("0->0 -10,50,-10,100", qd1.toString());


        SegmentTree.Data ri1 = new SegmentTree.Data.IntervalData<Integer>(0, 2, 1);
        SegmentTree.Data ri2 = new SegmentTree.Data.IntervalData<Integer>(2, 3, -1);
        ri1.combined(ri2);
        assertEquals("0->3 set=[-1, 1]", ri1.toString());


        SegmentTree.Data rm1 = new SegmentTree.Data.RangeMinimumData<Integer>(-1, 2, 1);
        SegmentTree.Data rm2 = new SegmentTree.Data.RangeMinimumData<Integer>(2, 3, 5);
        rm1.combined(rm2);
        assertEquals("-1->2 minimum=1", rm1.toString());


        SegmentTree.Data rx1 = new SegmentTree.Data.RangeMaximumData<Integer>(0, 1, 1);
        SegmentTree.Data rx2 = new SegmentTree.Data.RangeMaximumData<Integer>(2, 3, 5);
        rx1.combined(rx2);
        assertEquals("0->1 maximum=5", rx1.toString());


        SegmentTree.Data rs1 = new SegmentTree.Data.RangeSumData<Integer>(0, 1, -1);
        SegmentTree.Data rs2 = new SegmentTree.Data.RangeSumData<Integer>(1, 3, 5);
        rs1.combined(rs2);
        assertEquals("0->1 sum=4", rs1.toString());


        assertEquals(qd1, qd1);
        assertNotEquals(qd1, qd2);
        assertNotEquals(qd1, null);
        assertEquals(ri1, ri1);
        assertNotEquals(ri1, ri2);
        assertNotEquals(ri1, null);
        assertEquals(rm1, rm1);
        assertNotEquals(rm1, rm2);
        assertNotEquals(rm1, null);
        assertEquals(rx1, rx1);
        assertNotEquals(rx1, rx2);
        assertNotEquals(rx1, null);
        assertEquals(rs1, rs1);
        assertNotEquals(rs1, rs2);
        assertNotEquals(rs1, null);


        assertEquals(4030, qd1.hashCode());
        assertEquals(155, ri1.hashCode());
        assertEquals(62, rm1.hashCode());
        assertEquals(186, rx1.hashCode());
        assertEquals(155, rs1.hashCode());

        qd1.clear();
        ri1.clear();
        rm1.clear();
        rx1.clear();
        rs1.clear();
        assertEquals("-9223372036854775808->9223372036854775807 0,0,0,0", qd1.toString());
        assertEquals("-9223372036854775808->9223372036854775807 set=[]", ri1.toString());
        assertEquals("-9223372036854775808->9223372036854775807 minimum=null", rm1.toString());
        assertEquals("-9223372036854775808->9223372036854775807 maximum=null", rx1.toString());
        assertEquals("-9223372036854775808->9223372036854775807 sum=null", rs1.toString());

        qd1.combined(null);
        ri1.combined(null);
        rm1.combined(null);
        rx1.combined(null);
        rs1.combined(null);
        assertEquals("-9223372036854775808->9223372036854775807 0,0,0,0", qd1.toString());
        assertEquals("-9223372036854775808->9223372036854775807 set=[]", ri1.toString());
        assertEquals("-9223372036854775808->9223372036854775807 minimum=null", rm1.toString());
        assertEquals("-9223372036854775808->9223372036854775807 maximum=null", rx1.toString());
        assertEquals("-9223372036854775808->9223372036854775807 sum=null", rs1.toString());
    }

    @Test
    public void st_combine_long() {

        SegmentTree.Data qd1 = new SegmentTree.Data.QuadrantData(0, 10, 20, 30, 40);
        SegmentTree.Data qd2 = new SegmentTree.Data.QuadrantData(1, 2, -1, -2, -3);
        qd1.combined(null);
        qd1.combined(qd2);
        assertEquals("0->0 12,19,28,37", qd1.toString());


        SegmentTree.Data ri1 = new SegmentTree.Data.IntervalData<Long>(0, 1, (long) 1000);
        SegmentTree.Data ri2 = new SegmentTree.Data.IntervalData<Long>(2, 3, (long) -666);
        ri1.combined(ri2);
        assertEquals("0->3 set=[-666, 1000]", ri1.toString());


        SegmentTree.Data rm1 = new SegmentTree.Data.RangeMinimumData<Long>(0, 1, (long) 999);
        SegmentTree.Data rm2 = new SegmentTree.Data.RangeMinimumData<Long>(1, 2, (long) -333);
        rm1.combined(rm2);
        assertEquals("0->1 minimum=-333", rm1.toString());


        SegmentTree.Data rx1 = new SegmentTree.Data.RangeMaximumData<Long>(0, 1, (long) -444);
        SegmentTree.Data rx2 = new SegmentTree.Data.RangeMaximumData<Long>(1, 3, (long) 333);
        rx1.combined(rx2);
        assertEquals("0->1 maximum=333", rx1.toString());


        SegmentTree.Data rs1 = new SegmentTree.Data.RangeSumData<Long>(0, 1, (long) 123);
        SegmentTree.Data rs2 = new SegmentTree.Data.RangeSumData<Long>(1, 2, (long) 321);
        rs1.combined(rs2);
        assertEquals("0->1 sum=444", rs1.toString());


        assertEquals(qd1, qd1);
        assertNotEquals(qd1, qd2);
        assertNotEquals(qd1, null);
        assertEquals(ri1, ri1);
        assertNotEquals(ri1, ri2);
        assertNotEquals(ri1, null);
        assertEquals(rm1, rm1);
        assertNotEquals(rm1, rm2);
        assertNotEquals(rm1, null);
        assertEquals(rx1, rx1);
        assertNotEquals(rx1, rx2);
        assertNotEquals(rx1, null);
        assertEquals(rs1, rs1);
        assertNotEquals(rs1, rs2);
        assertNotEquals(rs1, null);


        assertEquals(2976, qd1.hashCode());
        assertEquals(155, ri1.hashCode());
        assertEquals(10323, rm1.hashCode());
        assertEquals(10354, rx1.hashCode());
        assertEquals(13795, rs1.hashCode());

        qd1.clear();
        assertEquals("-9223372036854775808->9223372036854775807 0,0,0,0", qd1.toString());
        ri1.clear();
        assertEquals("-9223372036854775808->9223372036854775807 set=[]", ri1.toString());
        rm1.clear();
        assertEquals("-9223372036854775808->9223372036854775807 minimum=null", rm1.toString());
        rx1.clear();
        assertEquals("-9223372036854775808->9223372036854775807 maximum=null", rx1.toString());
        rs1.clear();
        assertEquals("-9223372036854775808->9223372036854775807 sum=null", rs1.toString());

        qd1.combined(null);
        ri1.combined(null);
        rm1.combined(null);
        rx1.combined(null);
        rs1.combined(null);
        assertEquals("-9223372036854775808->9223372036854775807 0,0,0,0", qd1.toString());
        assertEquals("-9223372036854775808->9223372036854775807 set=[]", ri1.toString());
        assertEquals("-9223372036854775808->9223372036854775807 minimum=null", rm1.toString());
        assertEquals("-9223372036854775808->9223372036854775807 maximum=null", rx1.toString());
        assertEquals("-9223372036854775808->9223372036854775807 sum=null", rs1.toString());
    }

    @Test
    public void st_combine_double() {

        SegmentTree.Data qd1 = new SegmentTree.Data.QuadrantData(0, 6, 5, 4, 3);
        SegmentTree.Data qd2 = new SegmentTree.Data.QuadrantData(1, 2, -1, -2, -3);
        qd1.combined(null);
        qd1.combined(qd2);
        assertEquals("0->0 8,4,2,0", qd1.toString());


        SegmentTree.Data ri1 = new SegmentTree.Data.IntervalData<Double>(0, 1, (double) 1.234519);
        SegmentTree.Data ri2 = new SegmentTree.Data.IntervalData<Double>(1, 10, (double) -19165.48526);
        ri1.combined(ri2);
        assertEquals("0->10 set=[-19165.48526, 1.234519]", ri1.toString());


        SegmentTree.Data rm1 = new SegmentTree.Data.RangeMinimumData<Double>(0, 1, (double) 15.26612);
        SegmentTree.Data rm2 = new SegmentTree.Data.RangeMinimumData<Double>(1, 20, (double) -1.11849);
        rm1.combined(rm2);
        assertEquals("0->1 minimum=-1.11849", rm1.toString());


        SegmentTree.Data rx1 = new SegmentTree.Data.RangeMaximumData<Double>(0, 1, (double) 91.26236);
        SegmentTree.Data rx2 = new SegmentTree.Data.RangeMaximumData<Double>(1, 3, (double) -41.185);
        rx1.combined(rx2);
        assertEquals("0->1 maximum=91.26236", rx1.toString());


        SegmentTree.Data rs1 = new SegmentTree.Data.RangeSumData<Double>(0, 1, (double) 1496.149);
        SegmentTree.Data rs2 = new SegmentTree.Data.RangeSumData<Double>(1, 2, (double) -1.19864);
        rs1.combined(rs2);
        assertEquals("0->1 sum=1494.9503599999998", rs1.toString());


        assertEquals(qd1, qd1);
        assertNotEquals(qd1, qd2);
        assertNotEquals(qd1, null);
        assertEquals(ri1, ri1);
        assertNotEquals(ri1, ri2);
        assertNotEquals(ri1, null);
        assertEquals(rm1, rm1);
        assertNotEquals(rm1, rm2);
        assertNotEquals(rm1, null);
        assertEquals(rx1, rx1);
        assertNotEquals(rx1, rx2);
        assertNotEquals(rx1, null);
        assertEquals(rs1, rs1);
        assertNotEquals(rs1, rs2);
        assertNotEquals(rs1, null);


        assertEquals(434, qd1.hashCode());
        assertEquals(372, ri1.hashCode());
        assertEquals(-518825360, rm1.hashCode());
        assertEquals(2012611265, rx1.hashCode());
        assertEquals(198715590, rs1.hashCode());

        qd1.clear();
        assertEquals("-9223372036854775808->9223372036854775807 0,0,0,0", qd1.toString());
        ri1.clear();
        assertEquals("-9223372036854775808->9223372036854775807 set=[]", ri1.toString());
        rm1.clear();
        assertEquals("-9223372036854775808->9223372036854775807 minimum=null", rm1.toString());
        rx1.clear();
        assertEquals("-9223372036854775808->9223372036854775807 maximum=null", rx1.toString());
        rs1.clear();
        assertEquals("-9223372036854775808->9223372036854775807 sum=null", rs1.toString());

        qd1.combined(null);
        ri1.combined(null);
        rm1.combined(null);
        rx1.combined(null);
        rs1.combined(null);
        assertEquals("-9223372036854775808->9223372036854775807 0,0,0,0", qd1.toString());
        assertEquals("-9223372036854775808->9223372036854775807 set=[]", ri1.toString());
        assertEquals("-9223372036854775808->9223372036854775807 minimum=null", rm1.toString());
        assertEquals("-9223372036854775808->9223372036854775807 maximum=null", rx1.toString());
        assertEquals("-9223372036854775808->9223372036854775807 sum=null", rs1.toString());
    }

    @Test
    public void st_combine_float() {

        SegmentTree.Data qd1 = new SegmentTree.Data.QuadrantData(0, 1, 1, 2, 3);
        SegmentTree.Data qd2 = new SegmentTree.Data.QuadrantData(1, 2, -1, -2, -3);
        qd1.combined(null);
        qd1.combined(qd2);
        assertEquals("0->0 3,0,0,0", qd1.toString());


        SegmentTree.Data ri1 = new SegmentTree.Data.IntervalData<Float>(0, 1, (float) 1);
        SegmentTree.Data ri2 = new SegmentTree.Data.IntervalData<Float>(1, 2, (float) -1);
        ri1.combined(ri2);
        assertEquals("0->2 set=[-1.0, 1.0]", ri1.toString());


        SegmentTree.Data rm1 = new SegmentTree.Data.RangeMinimumData<Float>(0, 1, (float) 1);
        SegmentTree.Data rm2 = new SegmentTree.Data.RangeMinimumData<Float>(1, 2, (float) -1);
        rm1.combined(rm2);
        assertEquals("0->1 minimum=-1.0", rm1.toString());


        SegmentTree.Data rx1 = new SegmentTree.Data.RangeMaximumData<Float>(0, 1, (float) 1);
        SegmentTree.Data rx2 = new SegmentTree.Data.RangeMaximumData<Float>(1, 2, (float) -1);
        rx1.combined(rx2);
        assertEquals("0->1 maximum=1.0", rx1.toString());


        SegmentTree.Data rs1 = new SegmentTree.Data.RangeSumData<Float>(0, 1, (float) 1);
        SegmentTree.Data rs2 = new SegmentTree.Data.RangeSumData<Float>(1, 2, (float) -1);
        rs1.combined(rs2);
        assertEquals("0->1 sum=0.0", rs1.toString());


        assertEquals(qd1, qd1);
        assertNotEquals(qd1, qd2);
        assertNotEquals(qd1, null);
        assertEquals(ri1, ri1);
        assertNotEquals(ri1, ri2);
        assertNotEquals(ri1, null);
        assertEquals(rm1, rm1);
        assertNotEquals(rm1, rm2);
        assertNotEquals(rm1, null);
        assertEquals(rx1, rx1);
        assertNotEquals(rx1, rx2);
        assertNotEquals(rx1, null);
        assertEquals(rs1, rs1);
        assertNotEquals(rs1, rs2);
        assertNotEquals(rs1, null);


        assertEquals(93, qd1.hashCode());
        assertEquals(124, ri1.hashCode());
        assertEquals(813695007, rm1.hashCode());
        assertEquals(-1333788641, rx1.hashCode());
        assertEquals(31, rs1.hashCode());

        qd1.clear();
        assertEquals("-9223372036854775808->9223372036854775807 0,0,0,0", qd1.toString());
        ri1.clear();
        assertEquals("-9223372036854775808->9223372036854775807 set=[]", ri1.toString());
        rm1.clear();
        assertEquals("-9223372036854775808->9223372036854775807 minimum=null", rm1.toString());
        rx1.clear();
        assertEquals("-9223372036854775808->9223372036854775807 maximum=null", rx1.toString());
        rs1.clear();
        assertEquals("-9223372036854775808->9223372036854775807 sum=null", rs1.toString());

        qd1.combined(null);
        ri1.combined(null);
        rm1.combined(null);
        rx1.combined(null);
        rs1.combined(null);
        assertEquals("-9223372036854775808->9223372036854775807 0,0,0,0", qd1.toString());
        assertEquals("-9223372036854775808->9223372036854775807 set=[]", ri1.toString());
        assertEquals("-9223372036854775808->9223372036854775807 minimum=null", rm1.toString());
        assertEquals("-9223372036854775808->9223372036854775807 maximum=null", rx1.toString());
        assertEquals("-9223372036854775808->9223372036854775807 sum=null", rs1.toString());
    }

    @Test
    public void st_combine_biginteger() {

        SegmentTree.Data qd1 = new SegmentTree.Data.QuadrantData(0, 1, 1, 2, 3);
        SegmentTree.Data qd2 = new SegmentTree.Data.QuadrantData(1, 2, -1, -2, -3);
        qd1.combined(null);
        qd1.combined(qd2);
        assertEquals("0->0 3,0,0,0", qd1.toString());


        SegmentTree.Data ri1 = new SegmentTree.Data.IntervalData<BigInteger>(0, 1, new BigInteger("1"));
        SegmentTree.Data ri2 = new SegmentTree.Data.IntervalData<BigInteger>(1, 2, new BigInteger("-1"));
        ri1.combined(ri2);
        assertEquals("0->2 set=[-1, 1]", ri1.toString());


        SegmentTree.Data rm1 = new SegmentTree.Data.RangeMinimumData<BigInteger>(0, 1, new BigInteger("1"));
        SegmentTree.Data rm2 = new SegmentTree.Data.RangeMinimumData<BigInteger>(1, 2, new BigInteger("-1"));
        rm1.combined(rm2);
        assertEquals("0->1 minimum=-1", rm1.toString());


        SegmentTree.Data rx1 = new SegmentTree.Data.RangeMaximumData<BigInteger>(0, 1, new BigInteger("1"));
        SegmentTree.Data rx2 = new SegmentTree.Data.RangeMaximumData<BigInteger>(1, 2, new BigInteger("-1"));
        rx1.combined(rx2);
        assertEquals("0->1 maximum=1", rx1.toString());


        SegmentTree.Data rs1 = new SegmentTree.Data.RangeSumData<BigInteger>(0, 1, new BigInteger("1"));
        SegmentTree.Data rs2 = new SegmentTree.Data.RangeSumData<BigInteger>(1, 2, new BigInteger("-1"));
        rs1.combined(rs2);
        assertEquals("0->1 sum=0", rs1.toString());


        assertEquals(qd1, qd1);
        assertNotEquals(qd1, qd2);
        assertNotEquals(qd1, null);
        assertEquals(ri1, ri1);
        assertNotEquals(ri1, ri2);
        assertNotEquals(ri1, null);
        assertEquals(rm1, rm1);
        assertNotEquals(rm1, rm2);
        assertNotEquals(rm1, null);
        assertEquals(rx1, rx1);
        assertNotEquals(rx1, rx2);
        assertNotEquals(rx1, null);
        assertEquals(rs1, rs1);
        assertNotEquals(rs1, rs2);
        assertNotEquals(rs1, null);


        assertEquals(93, qd1.hashCode());
        assertEquals(124, ri1.hashCode());
        assertEquals(0, rm1.hashCode());
        assertEquals(62, rx1.hashCode());
        assertEquals(31, rs1.hashCode());

        qd1.clear();
        assertEquals("-9223372036854775808->9223372036854775807 0,0,0,0", qd1.toString());
        ri1.clear();
        assertEquals("-9223372036854775808->9223372036854775807 set=[]", ri1.toString());
        rm1.clear();
        assertEquals("-9223372036854775808->9223372036854775807 minimum=null", rm1.toString());
        rx1.clear();
        assertEquals("-9223372036854775808->9223372036854775807 maximum=null", rx1.toString());
        rs1.clear();
        assertEquals("-9223372036854775808->9223372036854775807 sum=null", rs1.toString());

        qd1.combined(null);
        ri1.combined(null);
        rm1.combined(null);
        rx1.combined(null);
        rs1.combined(null);
        assertEquals("-9223372036854775808->9223372036854775807 0,0,0,0", qd1.toString());
        assertEquals("-9223372036854775808->9223372036854775807 set=[]", ri1.toString());
        assertEquals("-9223372036854775808->9223372036854775807 minimum=null", rm1.toString());
        assertEquals("-9223372036854775808->9223372036854775807 maximum=null", rx1.toString());
        assertEquals("-9223372036854775808->9223372036854775807 sum=null", rs1.toString());
    }

    @Test
    public void st_combine_bigdecimal() {

        SegmentTree.Data qd1 = new SegmentTree.Data.QuadrantData(0, 1, 1, 2, 3);
        SegmentTree.Data qd2 = new SegmentTree.Data.QuadrantData(1, 2, -1, -2, -3);
        qd1.combined(null);
        qd1.combined(qd2);
        assertEquals("0->0 3,0,0,0", qd1.toString());


        SegmentTree.Data ri1 = new SegmentTree.Data.IntervalData<BigDecimal>(0, 1, new BigDecimal("1"));
        SegmentTree.Data ri2 = new SegmentTree.Data.IntervalData<BigDecimal>(1, 2, new BigDecimal("-1"));
        ri1.combined(ri2);
        assertEquals("0->2 set=[-1, 1]", ri1.toString());


        SegmentTree.Data rm1 = new SegmentTree.Data.RangeMinimumData<BigDecimal>(0, 1, new BigDecimal("1"));
        SegmentTree.Data rm2 = new SegmentTree.Data.RangeMinimumData<BigDecimal>(1, 2, new BigDecimal("-1"));
        rm1.combined(rm2);
        assertEquals("0->1 minimum=-1", rm1.toString());


        SegmentTree.Data rx1 = new SegmentTree.Data.RangeMaximumData<BigDecimal>(0, 1, new BigDecimal("1"));
        SegmentTree.Data rx2 = new SegmentTree.Data.RangeMaximumData<BigDecimal>(1, 2, new BigDecimal("-1"));
        rx1.combined(rx2);
        assertEquals("0->1 maximum=1", rx1.toString());


        SegmentTree.Data rs1 = new SegmentTree.Data.RangeSumData<BigDecimal>(0, 1, new BigDecimal("1"));
        SegmentTree.Data rs2 = new SegmentTree.Data.RangeSumData<BigDecimal>(1, 2, new BigDecimal("-1"));
        rs1.combined(rs2);
        assertEquals("0->1 sum=0", rs1.toString());


        assertEquals(qd1, qd1);
        assertNotEquals(qd1, qd2);
        assertNotEquals(qd1, null);
        assertEquals(ri1, ri1);
        assertNotEquals(ri1, ri2);
        assertNotEquals(ri1, null);
        assertEquals(rm1, rm1);
        assertNotEquals(rm1, rm2);
        assertNotEquals(rm1, null);
        assertEquals(rx1, rx1);
        assertNotEquals(rx1, rx2);
        assertNotEquals(rx1, null);
        assertEquals(rs1, rs1);
        assertNotEquals(rs1, rs2);
        assertNotEquals(rs1, null);


        assertEquals(93, qd1.hashCode());
        assertEquals(124, ri1.hashCode());
        assertEquals(-930, rm1.hashCode());
        assertEquals(992, rx1.hashCode());
        assertEquals(31, rs1.hashCode());

        qd1.clear();
        assertEquals("-9223372036854775808->9223372036854775807 0,0,0,0", qd1.toString());
        ri1.clear();
        assertEquals("-9223372036854775808->9223372036854775807 set=[]", ri1.toString());
        rm1.clear();
        assertEquals("-9223372036854775808->9223372036854775807 minimum=null", rm1.toString());
        rx1.clear();
        assertEquals("-9223372036854775808->9223372036854775807 maximum=null", rx1.toString());
        rs1.clear();
        assertEquals("-9223372036854775808->9223372036854775807 sum=null", rs1.toString());

        qd1.combined(null);
        ri1.combined(null);
        rm1.combined(null);
        rx1.combined(null);
        rs1.combined(null);
        assertEquals("-9223372036854775808->9223372036854775807 0,0,0,0", qd1.toString());
        assertEquals("-9223372036854775808->9223372036854775807 set=[]", ri1.toString());
        assertEquals("-9223372036854775808->9223372036854775807 minimum=null", rm1.toString());
        assertEquals("-9223372036854775808->9223372036854775807 maximum=null", rx1.toString());
        assertEquals("-9223372036854775808->9223372036854775807 sum=null", rs1.toString());
    }

    @Test
    public void dt() {

        List<SegmentTree.Data> list = new ArrayList<>();

        list.add(new SegmentTree.Data.QuadrantData(0, 1, 0, 0, 0));
        list.add(new SegmentTree.Data.IntervalData<Integer>(1, 2, 233));
        list.add(new SegmentTree.Data.RangeMinimumData<Integer>(2, 3));
        list.add(new SegmentTree.Data.RangeMaximumData<Integer>(3, 4));
        list.add(new SegmentTree.Data.RangeSumData<Integer>(5, 6));

        DynamicSegmentTree<SegmentTree.Data> tree = new DynamicSegmentTree<>(list);

        SegmentTree.Data query = tree.query(0);
        assertEquals("0->0 1,0,0,0", query.toString());

        SegmentTree.Data query1 = tree.query(0, 1);
        assertEquals("0->1 1,0,0,0", query1.toString());

        SegmentTree.Data query2 = tree.query(0);
        assertEquals("0->0 1,0,0,0", query2.toString());

        SegmentTree.Data query3 = tree.query(6);
        assertEquals("6->6 sum=null", query3.toString());
    }

    @Test
    public void ft() {
        List<SegmentTree.Data> list = new ArrayList<>();

        list.add(new SegmentTree.Data.QuadrantData(0, 6, 4, 7, 3));
        list.add(new SegmentTree.Data.IntervalData<Integer>(1, 2, 142));
        list.add(new SegmentTree.Data.RangeMinimumData<Integer>(4, 5));
        list.add(new SegmentTree.Data.RangeMaximumData<Integer>(5, 10));
        list.add(new SegmentTree.Data.RangeSumData<Integer>(12, 15));
        list.add(new SegmentTree.Data.RangeSumData<Integer>(18, 20));

        FlatSegmentTree<SegmentTree.Data> tree = new FlatSegmentTree<>(list);


        assertEquals("â””â”€â”? 0->20 Length=21 Data={0->0 6,4,7,3} Set=[]\n" +
                "    â”œâ”€â”? 0->9 Length=10 Data={0->0 6,4,7,3} Set=[]\n" +
                "    â”?   â”œâ”€â”? 0->4 Length=5 Data={0->0 6,4,7,3} Set=[]\n" +
                "    â”?   â”?   â”œâ”€â”? 0->1 Length=2 Data={0->0 6,4,7,3} Set=[]\n" +
                "    â”?   â”?   â”?   â”œâ”€â”? 0->0 Length=1 Data={0->0 6,4,7,3} Set=[0->0 Length=1 Data={0->0 6,4,7,3} Set=[]]\n" +
                "    â”?   â”?   â”?   â””â”€â”? 1->1 Length=1 Data={1->2 set=[142]} Set=[1->1 Length=1 Data={1->2 set=[142]} Set=[]]\n" +
                "    â”?   â”?   â””â”€â”? 2->4 Length=3 Data={1->3 set=[142]} Set=[]\n" +
                "    â”?   â”?       â”œâ”€â”? 2->2 Length=1 Data={1->2 set=[142]} Set=[2->2 Length=1 Data={1->2 set=[142]} Set=[]]\n" +
                "    â”?   â”?       â””â”€â”? 3->4 Length=2 Data={3->3 set=[]} Set=[]\n" +
                "    â”?   â”?           â”œâ”€â”? 3->3 Length=1 Data={3->3 set=[]} Set=[3->3 Length=1 Data={3->3 set=[]} Set=[]]\n" +
                "    â”?   â”?           â””â”€â”? 4->4 Length=1 Data={4->5 minimum=null} Set=[4->4 Length=1 Data={4->5 minimum=null} Set=[]]\n" +
                "    â”?   â””â”€â”? 5->9 Length=5 Data={4->5 minimum=null} Set=[]\n" +
                "    â”?       â”œâ”€â”? 5->6 Length=2 Data={4->5 minimum=null} Set=[]\n" +
                "    â”?       â”?   â”œâ”€â”? 5->5 Length=1 Data={4->5 minimum=null} Set=[5->5 Length=1 Data={4->5 minimum=null} Set=[]]\n" +
                "    â”?       â”?   â””â”€â”? 6->6 Length=1 Data={5->10 maximum=null} Set=[6->6 Length=1 Data={5->10 maximum=null} Set=[]]\n" +
                "    â”?       â””â”€â”? 7->9 Length=3 Data={5->10 maximum=null} Set=[]\n" +
                "    â”?           â”œâ”€â”? 7->7 Length=1 Data={5->10 maximum=null} Set=[7->7 Length=1 Data={5->10 maximum=null} Set=[]]\n" +
                "    â”?           â””â”€â”? 8->9 Length=2 Data={5->10 maximum=null} Set=[]\n" +
                "    â”?               â”œâ”€â”? 8->8 Length=1 Data={5->10 maximum=null} Set=[8->8 Length=1 Data={5->10 maximum=null} Set=[]]\n" +
                "    â”?               â””â”€â”? 9->9 Length=1 Data={5->10 maximum=null} Set=[9->9 Length=1 Data={5->10 maximum=null} Set=[]]\n" +
                "    â””â”€â”? 10->20 Length=11 Data={5->10 maximum=null} Set=[]\n" +
                "        â”œâ”€â”? 10->14 Length=5 Data={5->10 maximum=null} Set=[]\n" +
                "        â”?   â”œâ”€â”? 10->11 Length=2 Data={5->10 maximum=null} Set=[]\n" +
                "        â”?   â”?   â”œâ”€â”? 10->10 Length=1 Data={5->10 maximum=null} Set=[10->10 Length=1 Data={5->10 maximum=null} Set=[]]\n" +
                "        â”?   â”?   â””â”€â”? 11->11 Length=1 Data={11->11 maximum=null} Set=[11->11 Length=1 Data={11->11 maximum=null} Set=[]]\n" +
                "        â”?   â””â”€â”? 12->14 Length=3 Data={12->15 sum=null} Set=[]\n" +
                "        â”?       â”œâ”€â”? 12->12 Length=1 Data={12->15 sum=null} Set=[12->12 Length=1 Data={12->15 sum=null} Set=[]]\n" +
                "        â”?       â””â”€â”? 13->14 Length=2 Data={12->15 sum=null} Set=[]\n" +
                "        â”?           â”œâ”€â”? 13->13 Length=1 Data={12->15 sum=null} Set=[13->13 Length=1 Data={12->15 sum=null} Set=[]]\n" +
                "        â”?           â””â”€â”? 14->14 Length=1 Data={12->15 sum=null} Set=[14->14 Length=1 Data={12->15 sum=null} Set=[]]\n" +
                "        â””â”€â”? 15->20 Length=6 Data={12->15 sum=null} Set=[]\n" +
                "            â”œâ”€â”? 15->17 Length=3 Data={12->15 sum=null} Set=[]\n" +
                "            â”?   â”œâ”€â”? 15->15 Length=1 Data={12->15 sum=null} Set=[15->15 Length=1 Data={12->15 sum=null} Set=[]]\n" +
                "            â”?   â””â”€â”? 16->17 Length=2 Data={16->17 sum=null} Set=[]\n" +
                "            â”?       â”œâ”€â”? 16->16 Length=1 Data={16->17 sum=null} Set=[16->16 Length=1 Data={16->17 sum=null} Set=[]]\n" +
                "            â”?       â””â”€â”? 17->17 Length=1 Data={16->17 sum=null} Set=[17->17 Length=1 Data={16->17 sum=null} Set=[]]\n" +
                "            â””â”€â”? 18->20 Length=3 Data={18->20 sum=null} Set=[]\n" +
                "                â”œâ”€â”? 18->18 Length=1 Data={18->20 sum=null} Set=[18->18 Length=1 Data={18->20 sum=null} Set=[]]\n" +
                "                â””â”€â”? 19->20 Length=2 Data={18->20 sum=null} Set=[]\n" +
                "                    â”œâ”€â”? 19->19 Length=1 Data={18->20 sum=null} Set=[19->19 Length=1 Data={18->20 sum=null} Set=[]]\n" +
                "                    â””â”€â”? 20->20 Length=1 Data={18->20 sum=null} Set=[20->20 Length=1 Data={18->20 sum=null} Set=[]]\n", tree.toString().replace("\r", ""));


        SegmentTree.Data query = tree.query(0);
        assertEquals("0->0 6,4,7,3", query.toString());

        SegmentTree.Data query1 = tree.query(7, 14);
        assertEquals("5->10 maximum=null", query1.toString());


        SegmentTree.Data query2 = tree.query(17, 18);
        assertEquals("16->17 sum=null", query2.toString());

        assertNull(tree.query(-233));


        SegmentTree.Data query3 = tree.query(5, 100);
        assertEquals("4->5 minimum=null", query3.toString());


        SegmentTree.Data query4 = tree.query(-20, 10);
        assertEquals("0->0 6,4,7,3", query4.toString());


        SegmentTree.Data queryx = tree.query(19);
        assertEquals("18->20 sum=null", queryx.toString());

    }
}
