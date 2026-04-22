package com.learning.basics.collection;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class a03_treemap {
    public static void main(String[] args) {
        Map<Person, Integer> map = new TreeMap<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.name.compareTo(o2.name);
            }
        });

        map.put(new Person("Tom"), 1);
        map.put(new Person("Jerry"), 2);
        map.put(new Person("Lily"), 3);
        for (Person key : map.keySet()) {
            System.out.println(key);
        }

        System.out.println(map.get(new Person("Lily")));
    }
}

class Person {
    public String name;

    public Person (String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{Person: " + name + "}";
    }
}
