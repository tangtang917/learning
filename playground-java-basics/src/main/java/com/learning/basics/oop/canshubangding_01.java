package com.learning.basics.oop;

public class canshubangding_01 {
    public static void main(String[] args) {
        Person person = new Person();
        int n = 25;
        person.setAge(n);
        System.out.println(person.getAge());

        n = 20;
        System.out.println(person.getAge());

        /*
        从结果看：修改外部的局部变量n，不影响实例p的age字段，原因是setAge()方法获得的参数，复制了n的值
         */
    }
}

class Person{
    private int age;

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }
}
