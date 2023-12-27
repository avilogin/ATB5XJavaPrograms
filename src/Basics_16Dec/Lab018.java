package src.Basics_16Dec;

import java.util.Scanner;
import java.util.SortedMap;

public class Lab018 {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
        System.out.println("Please Provide two numbers");

       int Num1 = sc.nextInt();
       int Num2 = sc.nextInt();

       if (Num1>Num2)
       {
           System.out.println(Num1 +" is the Biggest ");
       }
       else {
           System.out.println(Num2 + " is the Biggest");
       }
    }
}

