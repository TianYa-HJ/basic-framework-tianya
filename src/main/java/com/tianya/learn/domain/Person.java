package com.tianya.learn.domain;

public class Person {
    private String name;
    private int age;

    public String a;
    protected String b;
    String c;
    private String d;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private void eat(String thing) {
        System.out.println("eat...." + thing);
    }
}
