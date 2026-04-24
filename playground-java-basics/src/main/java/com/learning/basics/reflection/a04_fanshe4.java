package com.learning.basics.reflection;

public class a04_fanshe4 {
    public static void main(String[] args) throws Exception {
        Class<Student1> stdclass = Student1.class;
        System.out.println(stdclass.getMethod("getScore", String.class));
        System.out.println(stdclass.getMethod("getName"));
        System.out.println(stdclass.getDeclaredMethod("getGrade", int.class));
    }
}

class Student1 extends Person1 {
    public int getScore(String type) {
        return 99;
    }
    private int getGrade(int year) {
        return 1;
    }
}

class Person1 {
    public String getName() {
        return "Person";
    }
}
