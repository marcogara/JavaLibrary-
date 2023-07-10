package model;

public class Moltiplication implements ArithmeticStrategy {
    @Override
    public double calculate(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }
}
