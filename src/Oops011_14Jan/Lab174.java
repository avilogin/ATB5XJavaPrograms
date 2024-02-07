package src.Oops011_14Jan;

public class Lab174 {
    public static void main(String[] args) {

        //Both the static and non static method will called
        P01 p1 = new P01();

        System.out.println("-------------");
        //Only non static method will be called as static method is only called once
        P01 p2 = new P01();

        p1.M1();
        System.out.println("-------------");
        p1.M2();

        System.out.println("--------------");
        P01 p3 = null;
        //p3.M1();//Exception will occour as the variable is assigned null
        p3.M2();//this will call the M2 method as static method is call before the object creation.

    }
}

class P01
{

    static
    {
        System.out.println("Static");
    }
    {
        System.out.println("non static");
    }
    int a = 10;
    static int b = 20;
    void M1()
    {
        System.out.println("m1");
        System.out.println(a);
        System.out.println(b);
    }
    static void M2()
    {
        //System.out.println(a); / You can't have or access an Instance variable into the Static Method!!
        System.out.println(b);
    }
}