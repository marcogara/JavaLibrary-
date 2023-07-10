package model;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Division implements ArithmeticStrategy {
    @Override
    public double calculate(double firstNumber, double secondNumber) {

        BigDecimal n1 = new BigDecimal(firstNumber);
        BigDecimal n2 = new BigDecimal(secondNumber);

        BigDecimal resultDivide = n1.divide(n2, 15, RoundingMode.HALF_UP);
        double res = resultDivide.doubleValue();


        return res;
    }
}
