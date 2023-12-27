package src.Basics_16Dec;

public class Lab008 {
    public static void main(String[] args) {

        //Casting
        byte a = 10;
        int b = a;//Implicit casting
        //System.out.println(b);

        int c = 300;
        byte d = (byte)c; //Explicit casting
        /*
        The 300 will convert into binary of 32 bits out of which only last 8 bits will be
        stored into byte variable as the size of byte is 8 bits and the 8 bits that was stored
        in byte variable d is of 44 in value
         */


        System.out.println(d);

    }
}
