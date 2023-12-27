public class Fraction implements Pair{
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    @Override
    public int add() {
        return this.numerator + this.numerator;
    }

    @Override
    public int subtract() {
        return this.numerator - this.numerator;
    }

    @Override
    public int multiply() {
        return this.numerator * this.numerator;
    }

    @Override
    public int divide() {
        return this.numerator;
    }
}
