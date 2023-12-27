public class Money implements Pair{
    private int value;

    public Money(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public int add() {
        return this.value + this.value;
    }

    @Override
    public int subtract() {
        return this.value - this.value;
    }

    @Override
    public int multiply() {
        return this.value * this.value;
    }

    @Override
    public int divide() {
        return this.value / this.value;
    }
}
