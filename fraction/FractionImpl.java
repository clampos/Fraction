package fraction;

public class FractionImpl implements Fraction {
    /**
     * Parameters are the <em>numerator</em> and the <em>denominator</em>.
     * Normalize the fraction as you create it.
     * For instance, if the parameters are <pre>(8, -12)</pre>, create a <pre>Fraction</pre> with numerator
     * <pre>-2</pre> and denominator <pre>3</pre>.
     *
     * The constructor should throw an <pre>ArithmeticException</pre> if the denominator is zero.
     *
     * @param numerator
     * @param denominator
     */

    private int numerator;  // Instance variables (note that these are private to the class)
    private int denominator;

    public FractionImpl(int numerator, int denominator) throws ArithmeticException {
        this.numerator = numerator;
        this.denominator = denominator;



        // Deal with edge cases
        if (denominator == 0) { // Deal with denominator of 0
            throw new ArithmeticException("Error occurred: Numerator divided by zero");
        }
        else if (denominator < 0 && numerator > 0) { // Ensure denominator is not negative for negative fraction
            this.numerator *= -1;
            this.denominator *= -1;
        }
        else if (denominator < 0 && numerator < 0) {    // A negative numerator and denominator is evaluated to a
            this.numerator *= -1;                       // positive fraction
            this.denominator *= -1;
        }
        else if (numerator == 0) {  // Zero should be represented as 0/1
            this.numerator = 0;
            this.denominator = 1;
        }

        int gcd = GCD(this.numerator, this.denominator);
        this.numerator /= gcd;
        this.denominator /= gcd;
    }

    /**
     * The parameter is the numerator and <pre>1</pre> is the implicit denominator.
     *
     * @param wholeNumber representing the numerator
     */
    public FractionImpl(int wholeNumber) {
        this.numerator = wholeNumber;   // Numerator is implicitly wholeNumber
        this.denominator = 1;   // Denominator is automatically 1
    }

    /**
     * The parameter is a <pre>String</pre> containing either a whole number, such as `5` or `-3`, or a fraction,
     * such as "8/-12".
     * Allow blanks around (but not within) integers.
     * The constructor should throw an <pre>ArithmeticException</pre>
     * if given a string representing a fraction whose denominator is zero.
     * <p>
     * You may find it helpful to look at the available String API methods in the Java API.
     *
     * @param fraction the string representation of the fraction
     */
    public FractionImpl(String fraction) {
        String [] numDen = fraction.split("/");     // Split String on forward slash

        if (numDen.length < 1 || numDen.length > 2) {       // Deal with cases where number of integers is not 1 or 2
            throw new ArrayIndexOutOfBoundsException("numDem must contain either one or two elements.");
        }

        if (numDen.length == 1) {       // Following second constructor
            this.numerator = Integer.parseInt(numDen[0]);
            this.denominator = 1;
        }

        else if (numDen.length == 2) {      // Following first constructor
            this.numerator = Integer.parseInt(numDen[0]);
            this.denominator = Integer.parseInt(numDen[1]);
        }

        // Deal with edge cases
        if (denominator == 0) { // Deal with denominator of 0
            throw new ArithmeticException("Error occurred: Numerator divided by zero");
        }
        if (denominator < 0 && numerator > 0) { // Ensure denominator is not negative for negative fraction
            this.numerator *= -1;
            this.denominator *= -1;
        }
        else if (numerator == 0) {  // Zero should be represented as 0/1
            this.numerator = 0;
            this.denominator = 1;
        }

        int gcd = GCD(this.numerator, this.denominator);
        this.numerator /= gcd;    // Divide both num and dem by GCD to normalise fraction
        this.denominator /= gcd;

    }

    int GCD(int a, int b) {
        // Recursive implementation of Euclid's Algorithm
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0)
            return b;

        return GCD(b % a, a);
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction add(Fraction f) {
        // a/b + c/d is (ad + bc)/bd
        FractionImpl fNew = new FractionImpl(f.toString());
        Fraction result = new FractionImpl((this.numerator * fNew.denominator) + (this.denominator * fNew.numerator), this.denominator * fNew.denominator);
        return result;
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction subtract(Fraction f) {
        // a/b - c/d is (ad - bc)/bd
        FractionImpl fNew = new FractionImpl(f.toString());
        Fraction result = new FractionImpl((this.numerator * fNew.denominator) - (this.denominator * fNew.numerator), this.denominator * fNew.denominator);
        return result;
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction multiply(Fraction f) {
        // (a/b) * (c/d) is (a*c)/(b*d)
        FractionImpl fNew = new FractionImpl(f.toString());
        Fraction result = new FractionImpl(this.numerator * fNew.numerator, this.denominator * fNew.denominator);
        return result;
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction divide(Fraction f) {
        // (a/b) / (c/d) is (a*d)/(b*c)
        FractionImpl fNew = new FractionImpl(f.toString());
        Fraction result = new FractionImpl(this.numerator * fNew.denominator, this.denominator * fNew.numerator);
        return result;
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction abs() {
        // Returns a new Fraction that is the absolute value of this fraction
        this.numerator = Math.abs(this.numerator);
        this.denominator = Math.abs(this.denominator);
        return this;
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction negate() {
        /* Returns a new Fraction that has the same numeric value of this fraction,
        but the opposite sign. */
        int num = this.numerator;
        int den = this.denominator;
        Fraction negated = new FractionImpl(num * -1, den);
        return negated;
    }

    /**
     * @inheritDoc
     */
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    /**
     * @inheritDoc
     */
    @Override
    public boolean equals(Object obj) { // Returns true if o is a Fraction equal to this, and false in all other cases
        if (obj instanceof Fraction) {
            FractionImpl f = new FractionImpl(obj.toString());
            if (f.numerator == this.numerator && f.denominator == this.denominator) {
                return true;
            }
            else return false;
        }
        else return false;
    }

    /**
     * @inheritDoc
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction inverse() { // The inverse of a/b is b/a
        int num = this.numerator;
        int den = this.denominator;
        this.numerator = den;
        this.denominator = num;
        return this;
    }

    /**
     * @inheritDoc
     */
    @Override
    public int compareTo(Fraction o) {
        /* This method returns:
        A negative int if this is less than o.
        Zero if this is equal to o.
        A positive int if this is greater than o. */
        String thisString = this.toString();
        String oString = o.toString();
        return thisString.compareTo(oString);
    }

    /**
     * @inheritDoc
     */
    @Override
    public String toString() {
        /* Returns a String of the form n/d, where n is the numerator and d is the denominator.
        However, if d is 1, just return n (as a String).
        The returned String should not contain any blanks.
        If the fraction represents a negative number, a minus sign should precede n.
        This should be one of the first methods you write, because it will help you in debugging.
        Note that, for the purposes of this assignment,
        there is no need to implement the related clone() and hashCode() methods. */
        String result;
        if (this.denominator == 1 && this.numerator != 0) {
            result = String.valueOf(this.numerator);
        }
        else {
            result = String.valueOf(this.numerator) + "/" + String.valueOf(this.denominator);
        }
        return result;
    }
}