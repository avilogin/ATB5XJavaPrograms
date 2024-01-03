package src.Basics005_23Dec;

import java.util.Scanner;

public class Lab040 {
    public static void main(String[] args) {

    //Sum of the Digits

        Scanner sc = new Scanner(System.in);
        System.out.println("Provide a Number");
        int num = sc.nextInt();
        long sum = 0;

        for (int i = 1; i<=num;i++)
        {
            sum = sum+i;

        }
        System.out.println("Factorial of "+num+ " is "+sum);

        sc.close();
        
    }
}
