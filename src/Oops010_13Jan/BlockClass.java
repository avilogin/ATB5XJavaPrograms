package src.Oops010_13Jan;

public class BlockClass {
    {
        //This will be executed second
        System.out.println("i am IIB");
    }
    BlockClass()
    {
        //This will be executed third
        System.out.println("I am default Constructor");
    }
    static
    {
        //this will be executed first
        //This will only be executed once
        System.out.println("I am a Static Block");
    }
}
