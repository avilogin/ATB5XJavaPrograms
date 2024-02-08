package src.Oops012_20Jan;

import java.io.FileNotFoundException;

public class Lab196 {
    public static void main(String[] args)throws Exception {
        readFile("C://avi.txt");
        throw new FileNotFoundException("File is not available");

    }

    static void readFile(String fileName) {
        int a = 10;
        int a1 = 0;
        int a2 = 20;
        int a3 = 30;
        int a4 = 40;

        int b;
        if (a1 == 0) {
            throw new ArithmeticException("Number is Zero");
        } else {
            b = 10 / a1;
        }
        System.out.println(b);


    }
}
