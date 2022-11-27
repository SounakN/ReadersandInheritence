package com.BasicPractice;

public class ChildClass extends  ParentClass{

    private static String Firstname = "Ram";
    private  String Lastname = "Mohan";
    private  double age = 21;



    public ChildClass() {
       /* super("human","Chuwman",23,23.7);*/
        System.out.println("In the Child constructor with no args");
    }

    public ChildClass(String Firstname, String Lastname, int age) {
        this.Firstname=Firstname;
        this.Lastname = Lastname;
        this.age = age;
        System.out.println("In the Child constructor with  args");
    }

    public static void getFirstName(){
        System.out.println(Firstname);
    }
    public void getLastName(){
        System.out.println(Lastname);
    }
    public void getAge(){
        System.out.println(age);
    }
}
