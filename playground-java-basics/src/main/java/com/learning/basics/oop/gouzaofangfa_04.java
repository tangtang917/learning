package com.learning.basics.oop;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// 构造方法
public class gouzaofangfa_04 {
    public static void main(String[] args) {
        int age = 18; String name ="ren";
        Person4 p1 = new Person4("Xiao Ming", 15); // 既可以调用带参数的构造方法
        Person4 p2 = new Person4(); // 也可以调用无参数构造方法

        System.out.println(p1);
        System.out.println(p2);

        /*
        问题来了：既对字段进行初始化，又在构造方法中对字段进行初始化：当我们创建对象的时候，new Person4("Xiao Ming", 12)得到的对象实例，字段的初始值是啥？
        在Java中，创建对象实例的时候，按照如下顺序进行初始化：
        先初始化字段，例如，int age = 10;表示字段初始化为10，double salary;表示字段默认初始化为0，String s;表示引用类型字段默认初始化为null；
        执行构造方法的代码进行初始化。
        因此，构造方法的代码由于后运行，所以，new Person("Xiao Ming", 12)的字段值最终由构造方法的代码确定。
         */
    }
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class Person4 {
    private String name = "Unamed";
    private int age = 20;
}

/*
可以定义多个构造方法，在通过new操作符调用的时候，编译器通过构造方法的参数数量、位置和类型自动区分：
如果调用new Person5("Xiao Ming", 20);，会自动匹配到构造方法public Person5(String, int)。
如果调用new Person5("Xiao Ming");，会自动匹配到构造方法public Person5(String)。
如果调用new Person5();，会自动匹配到构造方法public Person5()。
 */
class Person5 {
    private String name;
    private int age;

    public Person5(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person5(String name) {
        this.name = name;
        this.age = 12;
    }

    public Person5() {
    }
}


