package model;

public class Subtraction implements ArithmeticStrategy {

    @Override
    public double calculate(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }
}
