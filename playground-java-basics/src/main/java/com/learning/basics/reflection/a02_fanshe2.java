package com.learning.basics.reflection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.reflect.Field;

public class a02_fanshe2 {
    public static void main(String[] args) throws Exception {
        Object p = new Person("xiaohong");
        Class<Person> c = Person.class;
        Field f = c.getDeclaredField("name");
        f.setAccessible(true);
        Object value = f.get(p);
        System.out.println(value);
    }
}

@NoArgsConstructor
@AllArgsConstructor
@Data
class Person{
    private String name;
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class Student extends Person{
    private int Score;
    private int grade;
}
