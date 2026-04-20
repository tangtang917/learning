package com.learning.basics.oop;

import java.util.Random;

public class gongjulei_13 {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println(r.nextInt());// 2071575453,每次都不一样
        System.out.println(r.nextInt(1000)); // 5,生成一个[0,10)之间的int
        System.out.println(r.nextLong()); // 8811649292570369305,每次都不一样
        System.out.println(r.nextFloat()); // 0.54335...生成一个[0,1)之间的float
        System.out.println(r.nextDouble()); // 0.3716...生成一个[0,1)之间的double
    }
}
