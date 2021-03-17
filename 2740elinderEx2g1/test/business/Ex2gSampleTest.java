package business;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex2gSampleTest {

    @Test
    void getI1() {
        Ex2gSample obj1 = new Ex2gSample(0, 2, 3.0, 4.0, "Aaaa", "Bbbb");
        int result = obj1.getI1();
        assertEquals(0, result);
    }

    @Test
    void getI2() {
        Ex2gSample obj1 = new Ex2gSample(0, 2, 3.0, 4.0, "Aaaa", "Bbbb");
        int result = obj1.getI2();
        assertEquals(2, result);
    }

    @Test
    void getD1() {
        Ex2gSample obj1 = new Ex2gSample(0, 2, 3.0, 4.0, "Aaaa", "Bbbb");
        double result = obj1.getD1();
        assertEquals(3.0, result);
    }

    @Test
    void getD2() {
        Ex2gSample obj1 = new Ex2gSample(0, 2, 3.0, 4.0, "Aaaa", "Bbbb");
        double result = obj1.getD2();
        assertEquals(4.0, result);
    }

    @Test
    void getS1() {
        Ex2gSample obj1 = new Ex2gSample(0, 2, 3.0, 4.0, "Aaaa", "Bbbb");
        String result = obj1.getS1();
        assertEquals("Aaaa", result);
    }

    @Test
    void getS2() {
        Ex2gSample obj1 = new Ex2gSample(0, 2, 3.0, 4.0, "Aaaa", "Bbbb");
        String result = obj1.getS2();
        assertEquals("Bbbb", result);
    }


    @Test
    void test1_1() {
        Ex2gSample objl = new Ex2gSample(0, 2, 3.0, 4.0, "Aaaa", "Bbbb");
        assertFalse(objl.test1(), "Testing i1 below valid range.");
    }

    @Test
    void test1_2() {
        Ex2gSample objl = new Ex2gSample(1, 2, 3.0, 4.0, "Aaaa", "Bbbb");
        assertTrue(objl.test1(), "Testing i1 = lowest value in range.");
    }

    @Test
    void test1_3() {
        Ex2gSample objl = new Ex2gSample(10, 2, 3.0, 4.0, "Aaaa", "Bbbb");
        assertTrue(objl.test1(), "Testing i1 = highest value in range.");
    }

    @Test
    void test1_4() {
        Ex2gSample objl = new Ex2gSample(11, 2, 3.0, 4.0, "Aaaa", "Bbbb");
        assertFalse(objl.test1(), "Testing i1 = above valid range");
    }

    @Test
    void test2_1() {
        Ex2gSample objl = new Ex2gSample(1, 1, 3.0, 4.0, "Aaaa", "Bbbb");
        assertFalse(objl.test2(), "Testing 1 < 1 and 1 < 4.0");
    }

    @Test
    void test2_2() {
        Ex2gSample objl = new Ex2gSample(2, 1, 3.0, 4.0, "Aaaa", "Bbbb");
        assertTrue(objl.test2(), "Testing 1 < 2 and 1 < 4.0");
    }

    @Test
    void test2_3() {
        Ex2gSample objl = new Ex2gSample(3, 1, 3.0, 4.0, "Aaaa", "Bbbb");
        assertFalse(objl.test2(), "Testing 1 < 3 and 1 < 4.0");
    }

    @Test
    void test3_1() {
        Ex2gSample objl = new Ex2gSample(2, 1, 3.0, 4.0, "Aaaa", "Bbbb");
        assertEquals(objl.test3(), "Aaaa");
    }

    @Test
    void test3_2() {
        Ex2gSample objl = new Ex2gSample(2, 1, 3.0, 4.0, "Bbbb", "Bbbb");
        assertEquals(objl.test3(), "Bbbb");
    }

    @Test
    void test3_3() {
        Ex2gSample objl = new Ex2gSample(2, 1, 3.0, 4.0, "Bbb", "Bbbb");
        assertEquals(objl.test3(), "Bbb");
    }

    @Test
    void test3_4() {
        Ex2gSample objl = new Ex2gSample(2, 1, 3.0, 4.0, "C", "Bbbb");
        assertEquals(objl.test3(), "Bbbb");
    }

    @Test
    void test3_5() {
        Ex2gSample objl = new Ex2gSample(2, 1, 3.0, 4.0, "Bbbb ", "Bbbb");
        assertEquals(objl.test3(), "Bbbb");
    }

    @Test
    void test3_6() {
        Ex2gSample objl = new Ex2gSample(2, 1, 3.0, 4.0, "99", "100");
        assertEquals(objl.test3(), "100");
    }
    @Test
    void test4_1() {
        Ex2gSample objl = new Ex2gSample(1, 2, 0, 7.50, "Aaaa", "Bbbb");
        assertEquals(objl.test4(), -1);
    }

    @Test
    void test4_2() {
        Ex2gSample objl = new Ex2gSample(1, 2, 168.1, 7.50, "Aaaa", "Bbbb");
        assertEquals(objl.test4(), -1);
    }

    @Test
    void test4_3() {
        Ex2gSample objl = new Ex2gSample(1, 2, 40.0, 7.50, "Aaaa", "Bbbb");
        assertEquals(objl.test4(), -1);
    }

    @Test
    void test4_4() {
        Ex2gSample objl = new Ex2gSample(1, 2, 0, 100.0, "Aaaa", "Bbbb");
        assertEquals(objl.test4(), -1);
    }

    @Test
    void test4_5() {
        Ex2gSample objl = new Ex2gSample(1, 2, 0, 10, "Aaaa", "Bbbb");
        assertEquals(objl.test4(), 0.0);
    }


    @Test
    void test4_6() {
        Ex2gSample objl = new Ex2gSample(1, 2, 50, 7.50, "Aaaa", "Bbbb");
        assertEquals(objl.test4(), -1);
    }


    @Test
    void test5_1() {
        Ex2gSample objl = new Ex2gSample(1, 2, 0, 7.50, "Aaaa", "Bbbb");
        assertEquals(objl.test4(), -1);
    }

    @Test
    void test5_2() {
        Ex2gSample objl = new Ex2gSample(1, 2, 168.1, 7.50, "Aaaa", "Bbbb");
        assertEquals(objl.test4(), -1);
    }

    @Test
    void test5_3() {
        Ex2gSample objl = new Ex2gSample(1, 2, 40, 7.50, "Aaaa", "Bbbb");
        assertEquals(objl.test4(), -1);
    }

    @Test
    void test5_4() {
        Ex2gSample objl = new Ex2gSample(1, 2, 0, 100.0, "Aaaa", "Bbbb");
        assertEquals(objl.test4(), -1);
    }

    @Test
    void test5_5() {
        Ex2gSample objl = new Ex2gSample(1, 2, 0, 10, "Aaaa", "Bbbb");
        assertEquals(objl.test4(), 0.0);
    }

    @Test
    void test5_6() {
        Ex2gSample objl = new Ex2gSample(1, 2, 50, 7.50, "Aaaa", "Bbbb");
        assertEquals(objl.test4(), -1);
    }

    @Test
    void test6_1() {
        Ex2gSample objl = new Ex2gSample();
        assertFalse(objl.test6());
    }

    @Test
    void test6_2() {
        Ex2gSample objl = new Ex2gSample(0, 2, 3.0, 4.0, "", "Bbbb");
        assertFalse(objl.test6());
    }

    @Test
    void test6_3() {
        Ex2gSample objl = new Ex2gSample(0, 2, 3.0, 4.0, "aaaa ", "Bbbb");
        assertFalse(objl.test6());
    }

    @Test
    void test6_4() {
        Ex2gSample objl = new Ex2gSample(0, 2, 3.0, 4.0, "dddd", "Bbbb");
        assertFalse(objl.test6());
    }

    @Test
    void test6_5() {
        Ex2gSample objl = new Ex2gSample(0, 2, 3.0, 4.0, "aaaa", "Bbbb");
        assertTrue(objl.test6());
    }


    @Test
    void test6_6() {
        Ex2gSample objl = new Ex2gSample(0, 2, 3.0, 4.0, "cccc", "Bbbb");
        assertTrue(objl.test6());
    }
}