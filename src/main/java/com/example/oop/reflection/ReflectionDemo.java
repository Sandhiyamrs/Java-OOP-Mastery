package com.example.oop.reflection;

import java.lang.reflect.Method;

public class ReflectionDemo {
    public static void main(String[] args) throws Exception {

        Class<?> clazz = Class.forName("com.example.oop.reflection.Person");
        Object obj = clazz.getDeclaredConstructor().newInstance();

        Method method = clazz.getDeclaredMethod("greet");
        method.invoke(obj);
    }
}
