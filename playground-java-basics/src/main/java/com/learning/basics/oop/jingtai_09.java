package com.learning.basics.oop;

/**
 * 类增加一个静态字段count和静态方法getCount()，统计实例创建的个数。
 */
public class jingtai_09 {

    public String name;
    public int age;

    public static int count;
    public jingtai_09(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }

    public static int getCount() {
        return count;
    }
}
