package model;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Multiplication implements ArithmeticStrategy {
    @Override
    public double calculate(double firstNumber, double secondNumber) {
        BigDecimal n1 = new BigDecimal(firstNumber);
        BigDecimal n2 = new BigDecimal(secondNumber);
        BigDecimal resultMultiplication = n1.multiply(n2).setScale(15, RoundingMode.HALF_UP);
        double res = resultMultiplication.doubleValue();

        return res;
    }
}

