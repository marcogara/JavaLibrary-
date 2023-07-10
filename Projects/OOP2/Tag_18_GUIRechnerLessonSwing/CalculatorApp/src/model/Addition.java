package model;

// Die konkreten Strategy Klassen implementiernen das Artithmetic Interface:
public class Addition implements ArithmeticStrategy {

    @Override
    public double calculate(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }
}
