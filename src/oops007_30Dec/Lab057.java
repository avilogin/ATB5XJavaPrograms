package src.oops007_30Dec;

import java.util.Scanner;

public class Lab057 {

    //Providing values to the main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide a value");
        System.out.println(sc.next());

        main(2);
        int c =  main(3,4);
        System.out.println(c);
    }

    //creating another main function but with different arguments
    public static void main(int a)
    {
        System.out.println("Printing second main function");
    }

    public static int main(int a, int b)
    {

        return a+b;
    }



}
