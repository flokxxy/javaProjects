public class Main_1 {
    public static void main(String[] args) {
        Money money1 = new Money(100);
        Money money2 = new Money(50);

        int addedValue = money1.add();
        int subtractedValue = money1.subtract();
        int multipliedValue = money1.multiply();
        int dividedValue = money1.divide();

        System.out.println("Money 1 value: " + money1.getValue());
        System.out.println("Money 2 value: " + money2.getValue());
        System.out.println("Added value: " + addedValue);
        System.out.println("Subtracted value: " + subtractedValue);
        System.out.println("Multiplied value: " + multipliedValue);
        System.out.println("Divided value: " + dividedValue+"\n");


        Fraction fraction1 = new Fraction(3, 4);
        Fraction fraction2 = new Fraction(1, 2);

        int addedValue2 = fraction1.add();
        int subtractedValue2 = fraction1.subtract();
        int multipliedValue2 = fraction1.multiply();
        int dividedValue2 = fraction1.divide();

        System.out.println("Fraction 1: " + fraction1.getNumerator() + "/" + fraction1.getDenominator());
        System.out.println("Fraction 2: " + fraction2.getNumerator() + "/" + fraction2.getDenominator());
        System.out.println("Added value: " + addedValue2);
        System.out.println("Subtracted value: " + subtractedValue2);
        System.out.println("Multiplied value: " + multipliedValue2);
        System.out.println("Divided value: " + dividedValue2);
    }
}