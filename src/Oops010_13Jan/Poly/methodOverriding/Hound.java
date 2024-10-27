package src.Oops010_13Jan.Poly.methodOverriding;

public class Hound extends Dog{
    void bark()
    {
        super.bark();//this will call the method of parent class
        System.out.println("Child Class -----I am Hound, I will Sniff!!");

    }

}
