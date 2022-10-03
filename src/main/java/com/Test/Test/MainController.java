package com.Test.Test;

import java.math.BigDecimal;

public class MainController {

    public BigDecimal divide(BigDecimal num1, BigDecimal num2) throws Exception {
        if (num2.equals(new BigDecimal(0))) {
            throw new RuntimeException("can't divide on zero");
        }
        return num1.divide(num2);
    }

    public BigDecimal multiply(BigDecimal num1, BigDecimal num2) throws Exception {
        return num1.multiply(num2);
    }
}
