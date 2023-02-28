package com.BasicPractice;

public class B extends A{

    int c=1;
    String d = "Check11";
    public void nonsharedChild(){
        System.out.println("non shared one from Child class");
    }
    public void shared(){
        System.out.println("shared one from Child class");
    }

    public static void main(String... f){
        A a = new A();
        a.nonshared();
        a.shared();
        System.out.println(a.c+" "+a.d);

        B b = new B();
        b.nonshared();
        b.nonsharedChild();
        b.shared();
        System.out.println(b.c+" "+b.d);

        A aa = new B();
        aa.shared();
        aa.nonshared();
        System.out.println(aa.c+" "+aa.d);

    }
}
