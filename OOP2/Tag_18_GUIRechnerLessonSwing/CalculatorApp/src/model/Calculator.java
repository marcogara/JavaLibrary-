package model;

// Die Kontexklasse:
public class Calculator {
    private ArithmeticStrategy arithmeticStrategy;

    public void setArithmeticStrategy(ArithmeticStrategy arithmeticStrategy) {
        this.arithmeticStrategy = arithmeticStrategy;
    }

    public double calculate(double firstNumber, double secondNumber) {

        return this.arithmeticStrategy.calculate(firstNumber, secondNumber);
    }

}
