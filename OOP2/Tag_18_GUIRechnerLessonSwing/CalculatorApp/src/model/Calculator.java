package model;

// Die Kontexklasse:
public class Calculator {
    private ArithmeticStrategy arithmeticStrategy;

    public void setArithmeticStrategy(ArithmeticStrategy arithmeticStrategy) {
        this.arithmeticStrategy = arithmeticStrategy;
    }

    public void calculate(double firstNumber, double secondNumber) {
        this.arithmeticStrategy.calculate(firstNumber, secondNumber);
    }

}
