package com.learning.basics.reflection;

import java.lang.reflect.Method;

public class a01_fanshe5 {
    public static void main(String[] args) throws Exception {
        String s = "Hello World";

        Method m = String.class.getDeclaredMethod("substring",int.class);

        String r = (String)m.invoke(s, 6);

        System.out.println(r);
    }
}
