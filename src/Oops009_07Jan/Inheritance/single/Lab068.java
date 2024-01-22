package src.Oops009_07Jan.Inheritance.single;

public class Lab068 {
    public static void main(String[] args) {


        //Programming p = new Programming();  only the default constructor will be called
        // java j = new java(); both default and child constructor will be called
//        Programming p2 = new Java(); this is possible in java
//        // Java j2 = new Programming(); this is not possible

        java j = new java();
        j.PrintValues();
        j.car();
        j.house();
        System.out.println("-------------------");
        Programming p1 = new Programming("to create Program");
        p1.PrintValues();
        System.out.println("----------------------");
        Programming p2 = new Programming(1,"AJ");
        p2.PrintValues();
    }
}
