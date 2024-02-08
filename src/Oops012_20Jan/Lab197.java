package src.Oops012_20Jan;

import java.io.FileReader;

public class Lab197 {

    public static void main(String[] args) {
        int num =0;
        if (num ==0)
        {
            throw new ArithmeticException("Number is Zero");
        }
        else {
            int a = 10 / num; //Unchecked exception
        }


        /*
        This is an unhandled exception. WE can handle it using following ways.
        1.  Try catch block
        2. Using throw keyword inside a method
        3. Using Throws with the signature of the method
         */

//        try {
//            FileReader f = new FileReader("C://a.txt");
//        }
//        catch (Exception e)
//        {
//            System.out.println(e.getMessage());
//        }


    }
}
