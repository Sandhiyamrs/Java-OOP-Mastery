package com.example.oop.model;

public class Person {
    private String name;
    private int age;

    public Person() {}
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){ return name; }
    public void setName(String name){ this.name = name; }

    public int getAge(){ return age; }
    public void setAge(int age){ this.age = age; }

    public void speak(){
        System.out.println("Hi, my name is " + name);
    }

    @Override
    public String toString(){
        return "Person{name='"+name+"', age="+age+"}";
    }
}

