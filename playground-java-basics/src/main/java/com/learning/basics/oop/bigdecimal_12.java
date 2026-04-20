package com.learning.basics.oop;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class bigdecimal_12 {

    public static void main(String[] args) {
        // BigDecimal用scale()表示小数位数
        BigDecimal d1 = new BigDecimal("123.45");
        BigDecimal d2 = new BigDecimal("123.4500");
        BigDecimal d3 = new BigDecimal("1234500");
        System.out.println(d1.scale()); // 2,两位小数
        System.out.println(d2.scale()); // 4
        System.out.println(d3.scale()); // 0
        System.out.println("==============================");

        // 通过BigDecimal的stripTrailingZeros()方法，可以将一个BigDecimal格式化为一个相等的，但去掉了末尾0的BigDecimal：
        BigDecimal d4 = new BigDecimal("123.4500");
        BigDecimal d5 = d4.stripTrailingZeros();
        System.out.println(d4.scale()); // 4
        System.out.println(d5.scale()); // 2,因为去掉了00

        BigDecimal d6 = new BigDecimal("1234500");
        BigDecimal d7 = d6.stripTrailingZeros();
        System.out.println(d6.scale()); // 0
        System.out.println(d7.scale()); // -2
        System.out.println("==============================");

        BigDecimal d8 = new BigDecimal("123.456789");
        BigDecimal d9 = d8.setScale(4, RoundingMode.HALF_UP); // 四舍五入，123.4568
        BigDecimal d10 = d8.setScale(4, RoundingMode.DOWN); // 直接截断，123.4567
        System.out.println(d9); // 123.4568
        System.out.println(d10); // 123.4567
        System.out.println("==============================");

        // 对BigDecimal做加、减、乘时，精度不会丢失，但是做除法时，存在无法除尽的情况，这时，就必须指定精度以及如何进行截断：
        BigDecimal d11 = new BigDecimal("123.456");
        BigDecimal d12 = new BigDecimal("23.456789");
        BigDecimal d13 = d11.divide(d12, 10, RoundingMode.HALF_UP); // 保留10位小数并四舍五入
        System.out.println(d13);
        BigDecimal d14 = d11.divide(d12); // 报错：ArithmeticException，因为除不尽

        // 在比较两个BigDecimal的值是否相等时，要特别注意，使用equals()方法不但要求两个BigDecimal的值相等，还要求它们的scale()相等：
        // 总是使用compareTo()比较两个BigDecimal的值，不要使用equals()！
    }
}
