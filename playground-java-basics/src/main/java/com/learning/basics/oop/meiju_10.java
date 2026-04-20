package com.learning.basics.oop;

// enum
public class meiju_10 {
    public static void main(String[] args) {
        /*Weekday day = Weekday.SUN;
        if (day == Weekday.SAT || day == Weekday.SUN) {
            System.out.println("Work at home!");
        } else {
            System.out.println("Work at office!");
        }*/

        /*int day = 1;
        if (day == Weekday.SUN) { // Operator '==' cannot be applied to 'int', 'com.learning.basics.oop
        }*/

        /*Weekday x = Weekday.SUN; // ok!
        Weekday y = Color.RED; // Compile error: incompatible types*/

        /*
        使用enum定义的枚举类是一种引用类型。
        引用类型比较，要使用equals()方法，如果使用==比较，它比较的是两个引用类型的变量是否是同一个对象。
        但enum类型可以例外。
        这是因为enum类型的每个常量在JVM中只有一个唯一实例，所以可以直接用==比较。
         */
        /*Weekday day = Weekday.MON;
        if (day == Weekday.FRI) { // ok!
        }
        if (day.equals(Weekday.SUN)) { // ok, but more code!
        }*/

        System.out.println(Weekday.MON.name()); // MON
        System.out.println(Weekday.THU.ordinal()); // 4
    }
}

enum Weekday {
    SUN, MON, TUE, WED, THU, FRI, SAT;
}

enum Color {
    RED, GREEN, BLUE;
}
