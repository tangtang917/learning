package com.learning.basics.oop;

import java.math.BigInteger;

public class biginteger_11 {
    public static void main(String[] args) {

        // 定义
        BigInteger bi = new BigInteger("12345567890");

        // 乘法
        System.out.println(bi.pow(5));

        // 加法
        System.out.println(bi.add(new BigInteger("12345678901234567890")));

        BigInteger i = new BigInteger("123456789000");
        System.out.println(i.longValue()); // 123456789000
        System.out.println(i.multiply(i).longValueExact()); // Exception in thread "main" java.lang.ArithmeticException: BigInteger out of long range
    }
}
