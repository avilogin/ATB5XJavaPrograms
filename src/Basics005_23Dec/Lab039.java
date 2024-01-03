package src.Basics005_23Dec;

import java.util.Scanner;

public class Lab039 {
    public static void main(String[] args) {

    //Factorial Program using for loop

        Scanner sc = new Scanner(System.in);
        System.out.println("Provide a Number");
        int num = sc.nextInt();
        long fact = 1;

        for (int i = 1; i<=num;i++)
        {
            fact = fact*i;

        }
        System.out.println("Factorial of "+num+ " is "+fact);

        sc.close();
        
    }
}
