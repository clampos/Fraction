package fraction;
import org.junit.Test;
import static org.junit.Assert.*;

public class FractionTest {
    @Test
    public void testAdd1() {
        Fraction a = new FractionImpl(3, 4);
        Fraction b = new FractionImpl(1, 2);
        Fraction c = new FractionImpl(5, 4);
        assertEquals(a.add(b), c);
    }

    @Test
    public void testAdd2() {
        Fraction a = new FractionImpl(17, 20);
        Fraction b = new FractionImpl(13, 15);
        Fraction c = new FractionImpl(103, 60);
        assertEquals(a.add(b), c);
    }

    @Test
    public void testAdd3() {
        Fraction a = new FractionImpl(33, 35);
        Fraction b = new FractionImpl(41, 43);
        Fraction c = new FractionImpl(2854, 1505);
        assertEquals(a.add(b), c);
    }

    @Test
    public void testAdd4() {
        Fraction a = new FractionImpl(7, 8);
        Fraction b = new FractionImpl(1, 3);
        Fraction c = new FractionImpl(29, 24);
        assertEquals(a.add(b), c);
    }

    @Test
    public void testAdd5() {
        Fraction a = new FractionImpl(80, 100);
        Fraction b = new FractionImpl(4, 5);
        Fraction c = new FractionImpl(8, 5);
        assertEquals(a.add(b), c);
    }

    @Test
    public void testAdd6() {
        Fraction a = new FractionImpl(-1,2);
        Fraction b = new FractionImpl(1, 2);
        Fraction c = new FractionImpl(0);
        assertEquals(a.add(b), c);
    }

    @Test
    public void testAdd7() {
        Fraction a = new FractionImpl(-1, 2);
        Fraction b = new FractionImpl(2);
        Fraction c = new FractionImpl(3, 2);
        assertEquals(a.add(b), c);
    }

    @Test
    public void testAdd8() {
        Fraction a = new FractionImpl("-1/2");
        Fraction b = new FractionImpl("4");
        Fraction c = new FractionImpl("7/2");
        assertEquals(a.add(b), c);
    }

    @Test
    public void testAdd9() {
        Fraction a = new FractionImpl(1, 2);
        Fraction b = new FractionImpl(1, 4);
        Fraction c = new FractionImpl(1, 6);
        assertNotEquals(a.add(b), c);
    }

    @Test
    public void testAdd10() {
        Fraction a = new FractionImpl(-1, 2);
        Fraction b = new FractionImpl(4);
        Fraction c = new FractionImpl(3, 10);
        assertNotEquals(a.add(b), c);
    }

    @Test
    public void testSubtract1() {
        Fraction a = new FractionImpl(3,4);
        Fraction b = new FractionImpl(1, 2);
        Fraction c = new FractionImpl(1, 4);
        assertEquals(a.subtract(b), c);
    }

    @Test
    public void testSubtract2() {
        Fraction a = new FractionImpl(7, 8);
        Fraction b = new FractionImpl(1, 3);
        Fraction c = new FractionImpl(13, 24);
        assertEquals(a.subtract(b), c);
    }

    @Test
    public void testSubtract3() {
        Fraction a = new FractionImpl("4/5");
        Fraction b = new FractionImpl("3/5");
        Fraction c = new FractionImpl("1/5");
        assertEquals(a.subtract(b), c);
    }

    @Test
    public void testSubtract4() {
        Fraction a = new FractionImpl("20/25");
        Fraction b = new FractionImpl("15/25");
        Fraction c = new FractionImpl("1/5");
        assertEquals(a.subtract(b), c);
    }

    @Test
    public void testSubtract5() {
        Fraction a = new FractionImpl("65/70");
        Fraction b = new FractionImpl(64, 70);
        Fraction c = new FractionImpl(1, 70);
        assertEquals(a.subtract(b), c);
    }

    @Test
    public void testSubtract6() {
        Fraction a = new FractionImpl(3, 4);
        Fraction b = new FractionImpl(1, 2);
        Fraction c = new FractionImpl(3, 4);
        assertNotEquals(a.subtract(b), c);
    }

    @Test
    public void testSubtract7() {
        Fraction a = new FractionImpl("4/5");
        Fraction b = new FractionImpl("3/5");
        Fraction c = new FractionImpl("1/6");
        assertNotEquals(a.subtract(b), c);
    }

    @Test
    public void testSubtract8() {
        Fraction a = new FractionImpl(7, 8);
        Fraction b = new FractionImpl(1, 3);
        Fraction c = new FractionImpl(11, 24);
        assertNotEquals(a.subtract(b), c);
    }

    @Test
    public void testMultiply1() {
        Fraction a = new FractionImpl(3,8);
        Fraction b = new FractionImpl(2);
        Fraction c = new FractionImpl(3, 4);
        assertEquals(a.multiply(b), c);
    }

    @ Test
    public void testMultiply2() {
        Fraction a = new FractionImpl(1,2);
        Fraction b = new FractionImpl(1, 2);
        Fraction c = new FractionImpl(1, 4);
        assertEquals(a.multiply(b), c);
    }

    @Test
    public void testMultiply3() {
        Fraction a = new FractionImpl(3, 15);
        Fraction b = new FractionImpl(3);
        Fraction c = new FractionImpl("3/5");
        assertEquals(a.multiply(b), c);
    }

    @Test
    public void testMultiply4() {
        Fraction a = new FractionImpl("3/15");
        Fraction b = new FractionImpl("3");
        Fraction c = new FractionImpl(3, 5);
        assertEquals(a.multiply(b), c);
    }

    @Test
    public void testMultiply5() {
        Fraction a = new FractionImpl("21/27");
        Fraction b = new FractionImpl("2/1");
        Fraction c = new FractionImpl("14/9");
        assertEquals(a.multiply(b), c);
    }

    @Test
    public void testMultiply6() {
        Fraction a = new FractionImpl("21/27");
        Fraction b = new FractionImpl("2/1");
        Fraction c = new FractionImpl("14/8");
        assertNotEquals(a.multiply(b), c);
    }

    @Test
    public void testMultiply7() {
        Fraction a = new FractionImpl(2);
        Fraction b = new FractionImpl(0);
        Fraction c = new FractionImpl("0/1");
        assertEquals(a.multiply(b), c);
    }

    @Test
    public void testMultiply8() {
        Fraction a = new FractionImpl(-1, 2);
        Fraction b = new FractionImpl(1, -1);
        Fraction c = new FractionImpl(1, -2);
        assertNotEquals(a.multiply(b), c);
    }

    @Test
    public void testDivide1() {
        Fraction a = new FractionImpl(50,100);
        Fraction b = new FractionImpl(100, 200);
        Fraction c = new FractionImpl(1);
        assertEquals(a.divide(b), c);
    }

    @Test
    public void testDivide2() {
        Fraction a = new FractionImpl(3, 4);
        Fraction b = new FractionImpl(17, 20);
        Fraction c = new FractionImpl(15, 17);
        assertEquals(a.divide(b), c);
    }

    @Test
    public void testDivide3() {
        Fraction a = new FractionImpl("3/4");
        Fraction b = new FractionImpl("17/20");
        Fraction c = new FractionImpl("15/17");
        assertEquals(a.divide(b), c);
    }

    @Test
    public void testDivide4() {
        Fraction a = new FractionImpl("50/100");
        Fraction b = new FractionImpl("100/200");
        Fraction c = new FractionImpl("1");
        assertEquals(a.divide(b), c);
    }

    @Test
    public void testDivide5() {
        Fraction a = new FractionImpl(500, 2);
        Fraction b = new FractionImpl(2, -4);
        Fraction c = new FractionImpl(-500);
        assertEquals(a.divide(b), c);
    }

    @Test
    public void testDivide6() {
        Fraction a = new FractionImpl(1, 2);
        Fraction b = new FractionImpl("1/2");
        Fraction c = new FractionImpl(1);
        assertEquals(a.divide(b), c);
    }

    @Test
    public void testDivide7() {
        Fraction a = new FractionImpl(1, 2);
        Fraction b = new FractionImpl("1/2");
        Fraction c = new FractionImpl(1, 4);
        assertNotEquals(a.divide(b), c);
    }

    @Test
    public void testDivide8() {
        Fraction a = new FractionImpl(-1, 2);
        Fraction b = new FractionImpl(1, 2);
        Fraction c = new FractionImpl("1");
        assertNotEquals(a.divide(b), c);
    }

    @Test
    public void testAbs1() {
        Fraction a = new FractionImpl(-1, 4);
        Fraction b = new FractionImpl(1, 4);
        assertEquals(a.abs(), b);
    }

    @Test
    public void testAbs2() {
        Fraction a = new FractionImpl(-3);
        Fraction b = new FractionImpl(3, 1);
        assertEquals(a.abs(), b);
    }

    @Test
    public void testAbs3() {
        Fraction a = new FractionImpl(3, 4);
        Fraction b = new FractionImpl(3, 4);
        assertEquals(a.abs(), b);
    }

    @Test
    public void testAbs4() {
        Fraction a = new FractionImpl(-102, 2);
        Fraction b = new FractionImpl("102/2");
        assertEquals(a.abs(), b);
    }

    @Test
    public void testAbs5() {
        Fraction a = new FractionImpl(" -1/4");
        Fraction b = new FractionImpl(1, 4);
        assertEquals(a.abs(), b);
    }

    @Test
    public void testAbs6() {
        Fraction a = new FractionImpl(-102, 2);
        Fraction b = new FractionImpl("-102/2");
        assertNotEquals(a.abs(), b);
    }

    @Test
    public void testExceptions1() {
        Fraction a = new FractionImpl("1 /4");
        Fraction b = new FractionImpl(1, 4);
        assertTrue(a.equals(b));
    }

    @Test(expected = ArithmeticException.class)
    public void testExceptions2() {
        new FractionImpl(2,0);
    }

    @Test(expected = NumberFormatException.class)
    public void testExceptions3() {
        new FractionImpl("1/ 4 04");
    }

    @Test(expected = ArithmeticException.class)
    public void testExceptions4() {
        new FractionImpl("1/0");
    }

    @Test(expected = NumberFormatException.class)
    public void testExceptions5() {
        new FractionImpl(" 1 /1-1");
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testExceptions6() {
        new FractionImpl("1/2/3");
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testExceptions7() {
        new FractionImpl("/");
    }

    @Test(expected = NumberFormatException.class)
    public void testExceptions8() {
        new FractionImpl(" / ");
    }

    @Test(expected = NumberFormatException.class)
    public void testExceptions9() {
        new FractionImpl(" -1/ -");
    }

    @Test
    public void testExceptions10() {
        Fraction a = new FractionImpl(" 3 / 5 ");
        Fraction b = new FractionImpl(3, 5);
        assertTrue(a.equals(b));
    }

    @Test
    public void testNegate1() {
        Fraction a = new FractionImpl(1, 4);
        Fraction b = new FractionImpl(-1, 4);
        assertEquals(a.negate(), b);
    }

    @Test
    public void testNegate2() {
        Fraction a = new FractionImpl(-1, 4);
        Fraction b = new FractionImpl(1, 4);
        assertEquals(a.negate(), b);
    }

    @Test
    public void testNegate3() {
        Fraction a = new FractionImpl(-1);
        Fraction b = new FractionImpl(1);
        assertEquals(a.negate(), b);
    }

    @Test
    public void testNegate4() {
        Fraction a = new FractionImpl("-1");
        Fraction b = new FractionImpl("1");
        assertEquals(a.negate(), b);
        }

    @Test
    public void testNegate5() {
        Fraction a = new FractionImpl("-20");
        Fraction b = new FractionImpl(20, 1);
        assertEquals(a.negate(), b);
    }

    @Test
    public void testNegate6() {
        Fraction a = new FractionImpl("-1");
        Fraction b = new FractionImpl("-1");
        assertNotEquals(a.negate(), b);
    }

    @Test
    public void testEquals1() {
        Fraction a = new FractionImpl(80, 100);
        Fraction b = new FractionImpl(8, 10);
        assertEquals(a.equals(b), true);
    }

    @Test
    public void testEquals2() {
        Fraction a = new FractionImpl(-2, -8);
        Fraction b = new FractionImpl(1, 4);
        assertEquals(a.equals(b), true);
    }

    @Test
    public void testEquals3() {
        Fraction a = new FractionImpl(" 1/ 1");
        Fraction b = new FractionImpl(1);
        assertEquals(a.equals(b), true);
    }

    @Test
    public void testEquals4() {
        Fraction a = new FractionImpl(" 3       / 3     ");
        Fraction b = new FractionImpl(1);
        assertEquals(a.equals(b), true);
    }

    @Test
    public void testEquals5() {
        Fraction a = new FractionImpl(0, 1);
        Fraction b = new FractionImpl(0);
        assertEquals(a.equals(b), true);
    }

    @Test
    public void testEquals6() {
        Fraction a = new FractionImpl(1, 2);
        String b = "A half";
        assertEquals(a.equals(b), false);
    }

    @Test
    public void testEquals7() {
        Fraction a = new FractionImpl("2/-4");
        Fraction b = new FractionImpl(2, 4);
        assertNotEquals(a.equals(b), true);
    }

    @Test
    public void testEquals8() {
        Fraction a = new FractionImpl(3, 1);
        Fraction b = new FractionImpl(1, 3);
        assertNotEquals(a.equals(b), true);
    }

    @Test
    public void testInverse1() {
        Fraction a = new FractionImpl(3, 4);
        Fraction b = new FractionImpl(4, 3);
        assertEquals(a.inverse(), b);
    }

    @Test
    public void testInverse2() {
    Fraction a = new FractionImpl("3/4");
    Fraction b = new FractionImpl("4/3");
    assertEquals(a.inverse(), b);
    }

    @Test
    public void testInverse3() {
        Fraction a = new FractionImpl("3");
        Fraction b = new FractionImpl(1, 3);
        assertEquals(a.inverse(), b);
    }

    @Test
    public void testInverse4() {
        Fraction a = new FractionImpl(1, 3);
        Fraction b = new FractionImpl(3);
        assertEquals(a.inverse(), b);
    }

    @Test
    public void testInverse5() {
        Fraction a = new FractionImpl("21/24");
        Fraction b = new FractionImpl(8, 7);
        assertEquals(a.inverse(), b);
    }

    @Test
    public void testInverse6() {
        Fraction a = new FractionImpl(3, 4);
        Fraction b = new FractionImpl(3, 4);
        assertNotEquals(a.inverse(), b);
    }

    @Test
    public void testCompareTo1() {
        Fraction a = new FractionImpl(1, 4);
        Fraction b = new FractionImpl(1, 3);
        assert a.compareTo(b) > 0;
    }

    @Test
    public void testCompareTo2() {
        Fraction a = new FractionImpl(1, 4);
        Fraction b = new FractionImpl(0, 1);
        assert a.compareTo(b) > 0;
    }

    @Test
    public void testCompareTo3() {
        Fraction a = new FractionImpl("2/3");
        Fraction b = new FractionImpl("5/9");
        assert a.compareTo(b) < 0;
    }

    @Test
    public void testCompareTo4() {
        Fraction a = new FractionImpl(1, 2);
        Fraction b = new FractionImpl(3, 400);
        assert a.compareTo(b) < 0;
    }

    @Test
    public void testCompareTo5() {
        Fraction a = new FractionImpl(1, 2);
        Fraction b = new FractionImpl("1/2");
        assert a.compareTo(b) == 0;
    }

    @Test
    public void testCompareTo6() {
        Fraction a = new FractionImpl(1, 4);
        Fraction b = new FractionImpl(250, 1000);
        assert a.compareTo(b) == 0;
    }

    @ Test
    public void testCompareTo7() {
        Fraction a = new FractionImpl(1, 2);
        Fraction b = new FractionImpl(-1, 2);
        assert a.compareTo(b) > 0;
    }

    @Test
    public void testCompareTo8() {
        Fraction a = new FractionImpl(-1, 2);
        Fraction b = new FractionImpl(-1, 4);
        assert a.compareTo(b) < 0;
    }

    @Test
    public void testCompareTo9() {
            Fraction a = new FractionImpl(-1, 4);
            Fraction b = new FractionImpl(-2, 8);
            assert a.compareTo(b) == 0;
    }

    @Test
    public void testCompareTo10() {
        Fraction a = new FractionImpl(0, 1);
        Fraction b = new FractionImpl(0, 3);
        assert a.compareTo(b) == 0;
    }

    @Test
    public void testToString1() {
        Fraction a = new FractionImpl(7, 8);
        String b = "7/8";
        assertEquals(a.toString(), b);
    }

    @Test
    public void testToString2() {
        Fraction a = new FractionImpl(0);
        String b = "0/1";
        assertEquals(a.toString(), b);
    }

    @Test
    public void testToString3() {
        Fraction a = new FractionImpl(0, 1);
        String b = "0/1";
        assertEquals(a.toString(), b);
    }

    @Test
    public void testToString4() {
        Fraction a = new FractionImpl(-1, 4);
        String b = "-1/4";
        assertEquals(a.toString(), b);
    }

    @Test
    public void testToString5() {
        Fraction a = new FractionImpl(-1, -4);
        String b = "1/4";
        assertEquals(a.toString(), b);
    }

    @Test
    public void testToString6() {
        Fraction a = new FractionImpl(8, -12);
        String b = "-2/3";
        assertEquals(a.toString(), b);
    }

    @Test
    public void testToString7() {
        Fraction a = new FractionImpl(1, -2);
        String b = "1/-2";
        assertNotEquals(a.toString(), b);
    }

    @Test
    public void testToString8() {
        Fraction a = new FractionImpl(-2, -4);
        String b = "-2/-4";
        assertNotEquals(a.toString(), b);
    }
}
