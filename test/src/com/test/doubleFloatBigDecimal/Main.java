package com.test.doubleFloatBigDecimal;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        double d = 1.112233445566778899;
        float f = 1.112233445566778899F;
        BigDecimal bigDecimal = BigDecimal.valueOf(1.112233445566778899).setScale(20, BigDecimal.ROUND_HALF_UP);


        System.out.println(f + " | " + d + " | " + bigDecimal);
        
        double result = 0.1 + 0.2 - 0.3;
        System.out.println("0.1 + 0.2 - 0.3 = " + result);


        BigDecimal resultRounded = new BigDecimal(result).setScale(4, BigDecimal.ROUND_HALF_UP);
        System.out.println("0.1 + 0.2 - 0.3 = " + resultRounded);

        BigDecimal string = new BigDecimal("1.112233445566778899").setScale(40, BigDecimal.ROUND_HALF_UP);
        System.out.println(string);
    }
}
