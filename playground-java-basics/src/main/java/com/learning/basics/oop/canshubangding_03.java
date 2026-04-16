package com.learning.basics.oop;

// 引用类型参数绑定
public class canshubangding_03 {
    public static void main(String[] args) {
        Person2 p = new Person2();
        String bob = "Bob";
        p.setName(bob); // 传入bob变量
        System.out.println(p.getName()); // "Bob"
        bob = "Alice"; // bob改名为Alice
        System.out.println(p.getName()); // "Bob"还是"Alice"?

        /*
         答案是输出为“Bob”，这与引用参数绑定的机制有关
         因为我们在canshubangding_02中，改变的是共享对象本身
         而在canshubangding_03中，我们改变了bob这个引用的指向

         */
    }
}

class Person2 {
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
