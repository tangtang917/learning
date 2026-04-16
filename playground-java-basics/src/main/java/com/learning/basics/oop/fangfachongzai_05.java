package com.learning.basics.oop;

// String.indexOf()
/*
这种方法名相同，但各自的参数不同，称为方法重载（Overload）
方法重载的目的是，功能类似的方法使用同一名字，更容易记住，因此，调用起来更简单。
举个例子，String类提供了多个重载方法indexOf()，可以查找子串：
int indexOf(int ch)：根据字符的Unicode码查找；
int indexOf(String str)：根据字符串查找；
int indexOf(int ch, int fromIndex)：根据字符查找，但指定起始位置；
int indexOf(String str, int fromIndex)根据字符串查找，但指定起始位置。
 */
public class fangfachongzai_05 {
    public static void main(String[] args) {
        String s = "Test string";
        int n1 = s.indexOf('t');
        int n2 = s.indexOf("st");
        int n3 = s.indexOf("st", 4);
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
    }
}
