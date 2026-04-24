package com.learning.basics.reflection;

public class a01_fanshe1 {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        Class<String> cls = String.class;
        String s = cls.newInstance();
    }
}

