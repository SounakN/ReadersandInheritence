package com.BasicPractice;

public class A {

    int c=0;
    String d = "Check";

    public void nonshared(){
        System.out.println("non shared one from Parent class");
    }
    public void shared(){
        System.out.println("shared one from Parent class");
    }
}
