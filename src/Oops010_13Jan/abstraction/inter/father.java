package src.Oops010_13Jan.abstraction.inter;

public interface father
{
    void loan1k();//need to create the body in different class as this is an interface

    static void print()
    {
        System.out.println("I am a static method");
    }

    default  void print2(){
        System.out.println("i am a default method");
    }
}
