package com.learning.basics.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class a01_lambda1 {
    public static void main(String[] args) {
        String[] array = new String[]{"Apple", "Orange", "Banana", "Lemon"};
        Arrays.sort(array, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        Arrays.sort(array, (s1, s2) -> {
            return s1.compareTo(s2);
        });

        System.out.println(Arrays.toString(array));
    }
}
