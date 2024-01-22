package src.Oops009_07Jan.Inheritance.single;

public class Lab067 {

    public static void main(String[] args) {

        // ## What is Inheritance?
        // Inheritance provides a way to create a new class from an existing class
        // SuperClass | Parent Class | Base Class
        // SubClass | Child Class | Derived Class
        // The extends Keyword

        // SubClass extends SuperClass{
        ////contents of SubClass
        //}

        Programming p1 = new Programming();
        p1.PrintValues();
        System.out.println("--------------------");

        Programming p2 = new Programming(1,"AJ");
        p2.PrintValues();


    }
}
