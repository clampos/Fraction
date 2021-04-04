package fraction;

public class FractionDemo {
    public static void main(String[] args) {
        /*
        Several Fraction objects are initialised and
        the results of a variety of operations are printed.
        */
        Fraction test = new FractionImpl(1, 2);
        Fraction test2 = new FractionImpl(3, 4);
        Fraction test3 = new FractionImpl(-20, 40);
        Fraction test4 = new FractionImpl(-50, -200);

        Fraction addResult = test.add(test2);
        System.out.println("Expecting addResult to equal 5/4:");
        System.out.println("addResult = " + addResult.toString());

        Fraction subResult = test.subtract(test2);
        System.out.println("Expecting subResult to equal -1/4:");
        System.out.println("subResult = " + subResult.toString());

        Fraction mulResult = test.multiply(test2);
        System.out.println("Expecting mulResult to equal 3/8:");
        System.out.println("mulResult = " + mulResult.toString());

        Fraction divResult = test.divide(test2);
        System.out.println("Expecting divResult to equal 2/3:");
        System.out.println("divResult = " + divResult);

        System.out.println("Expecting the absolute value of test3 to equal 1/2:");
        System.out.println("Absolute value of test3 = " + test3.abs().toString());

        System.out.println("Expecting the negated value of test to equal -1/2:");
        System.out.println("Negated value of test = " + test.negate().toString());

        System.out.println("Expecting the inverted value of test to equal 2:");
        System.out.println("Inverted value of test = " + test.inverse().toString());

        System.out.println("Expecting the boolean result of test.equals(test2) to equal false:");
        System.out.println("Boolean result of test.equals(test2) = " + test.equals(test2));

        System.out.println("Expecting the int value of test.compareTo(test2) to be less than 0 (because 1 comes before 3):");
        System.out.println("Int value of test.compareTo(test2) = " + test.compareTo(test2));

        System.out.println("Expecting the int value of test.compareTo(test3) to be greater than 0 (because - comes before 1):");
        System.out.println("Int value of test.compareTo(test3) = " + test.compareTo(test3));

        System.out.println("Expecting the string value of test4 to be 1/4:");
        System.out.println("String value of test4 = " + test4.toString());
    }
}
