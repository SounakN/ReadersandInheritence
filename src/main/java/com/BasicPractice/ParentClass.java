package com.BasicPractice;

public class ParentClass {

    public static String Firstname = "ParentRAM";
    public static String Lastname="ParentLastMohan";
    public static int age = 99;
    public static double Salary=3355.2;

    public ParentClass() {
        System.out.println("In the Parent constructor with no args");
    }

    public ParentClass(String Firstname, String Lastname, int age) {
        System.out.println("In the Parent constructor with args");
        this.age = age;
        this.Firstname = Firstname;
        this.Lastname = Lastname;
    }
    public static void getFirstName(){
        System.out.println(Firstname);
    }
    protected void getLastName(){
        System.out.println(Lastname);
    }
    public void getAge(){
        System.out.println(age);
    }
    public void getSalary(){
        System.out.println(Salary);
    }

}
