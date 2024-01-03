package src.Basics005_23Dec;

import java.util.Scanner;

public class Lab032 {
    public static void main(String[] args) {

        //Multiplication table of a number

        Scanner sc = new Scanner(System.in);
        System.out.println("Provide a number");
        int num = sc.nextInt();

        for (int i=1; i<=20;i++)
        {
            System.out.println(num +" X "+i+" = "+(num*i));
        }









    }
}
