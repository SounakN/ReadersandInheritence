package com.BasicPractice;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /*ChildClass c1 = new ChildClass();
        c1.getFirstName();*/
        ChildClass c2 = new ChildClass("Madan","Mohan",23);
        c2.getFirstName();
        c2.getLastName();
        c2.getAge();
        c2.getSalary();

        ParentClass p1 = new ChildClass();
        p1.getFirstName();
        p1.getLastName();
        p1.getAge();
        p1.getSalary();

    }

}
