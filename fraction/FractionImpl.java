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

    public FractionImpl(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;

        if (denominator == 0) { // Deal with denominator of 0
            throw new ArithmeticException("Error occurred: Numerator divided by zero");
        }

        else if (denominator < 0 && numerator > 0) { // Ensure denominator is not negative for negative fraction
            this.numerator *= -1;
            this.denominator *= -1;
        }

        else if (numerator == 0) {  // Zero should be represented as 0/1
            this.numerator = 0;
            this.denominator = 1;
        }

        this.numerator /= GCD(numerator, denominator);
        this.denominator /= GCD(numerator, denominator);
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

        if (numDen.length == 1) {       // Following second constructor
            this.numerator = Integer.parseInt(numDen[0]);
            this.denominator = 1;
        }
        else if (numDen.length == 2) {      // Following first constructor
            this.numerator = Integer.parseInt(numDen[0]);
            this.denominator = Integer.parseInt(numDen[1]);
        }

        if (denominator == 0) { // Deal with denominator of 0
            throw new ArithmeticException("Error occurred: Numerator divided by zero");
        }

        else if (denominator < 0 && numerator > 0) { // Ensure denominator is not negative for negative fraction
            this.numerator *= -1;
            this.denominator *= -1;
        }

        else if (numerator == 0) {  // Zero should be represented as 0/1
            this.numerator = 0;
            this.denominator = 1;
        }

        this.numerator /= GCD(numerator, denominator);      // Divide both num and dem by GCD to normalise fraction
        this.denominator /= GCD(numerator, denominator);
    }

    int GCD(int a, int b) {     // Recursive implementation of Euclid's Algorithm
        if (b == 0) {
            return a;
        }
        return GCD(b, a % b);
        }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction add(Fraction f) {
        FractionImpl fNew = new FractionImpl(f.toString());
        int sum;
        sum = ((this.numerator * fNew.denominator) + (this.denominator * fNew.numerator)/(this.denominator * fNew.numerator));
        Fraction result = new FractionImpl(sum);
        return result;
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction subtract(Fraction f) {
        FractionImpl fNew = new FractionImpl(f.toString());
        int sum;
        sum = ((this.numerator * fNew.denominator) - (this.denominator * fNew.numerator)/(this.denominator * fNew.numerator));
        Fraction result = new FractionImpl(sum);
        return result;
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction multiply(Fraction f) {
        FractionImpl fNew = new FractionImpl(f.toString());
        int sum;
        sum = ((this.numerator * fNew.numerator) / (this.denominator * fNew.denominator));
        Fraction result = new FractionImpl(sum);
        return result;
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction divide(Fraction f) {
        FractionImpl fNew = new FractionImpl(f.toString());
        int sum;
        sum = ((this.numerator * fNew.denominator) / (this.denominator * fNew.numerator));
        Fraction result = new FractionImpl(sum);
        return result;
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction abs() {
        this.numerator = Math.abs(this.numerator);
        this.denominator = Math.abs(this.denominator);
        return this;
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction negate() {
        this.numerator *= -1;
        return this;
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
    public boolean equals(Object obj) {
        return super.equals(obj);
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
    public Fraction inverse() {
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
        return 0;
    }

    /**
     * @inheritDoc
     */
    @Override
    public String toString() {
        String result = this.numerator + "/" + this.denominator;
        return result;
    }
}