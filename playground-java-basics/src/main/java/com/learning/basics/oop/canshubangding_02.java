package com.learning.basics.oop;

public class canshubangding_02 {
    public static void main(String[] args) {
        Person1 p = new Person1();
        String[] fullname = new String[]{"Tom", "Jery"};
        p.setName(fullname);
        System.out.println(p.getName());

        fullname[0] = "dog";
//        fullname = new String[]{"dog", "cat"};
        System.out.println(p.getName());
        /*
        从结果看：引用类型参数的传递，调用方的变量，和接收方的参数变量，指向的是同一个对象。双方任意一方对这个对象的修改，都会影响对方（因为指向同一个对象嘛）
         */
    }
}

class Person1{
    private String[] name;

    public String getName(){
        return name[0] + " " +  name[1];
    }

    public void setName(String[] name) {
        this.name = name;
    }
}
