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
    public void testSubtract1() {
        Fraction a = new FractionImpl(3,4);
        Fraction b = new FractionImpl(1, 2);
        Fraction c = new FractionImpl(1, 4);
        assertEquals(a.subtract(b), c);
    }

    @Test
    public void testSubtract2() {
        Fraction a = new FractionImpl(7, 8);
        Fraction b = new FractionImpl("1/3");
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
}
