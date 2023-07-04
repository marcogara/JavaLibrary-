package model;

// Die Kontexklasse:
public class Calculator {
    private ArithmeticStrategy arithmeticStrategy;

    public double calculate(double firstNumber, double secondNumber) {

        return this.arithmeticStrategy.calculate(firstNumber, secondNumber);
    }

    public Object getArithmeticStrategy() {
        return arithmeticStrategy;
    }

    public void setArithmeticStrategy(ArithmeticStrategy arithmeticStrategy) {
        this.arithmeticStrategy = arithmeticStrategy;
    }
}
