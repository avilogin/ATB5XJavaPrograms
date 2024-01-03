package src.Basics005_23Dec;

import java.util.Scanner;

public class Lab038 {
    public static void main(String[] args) {

    //Factorial Program using while loop

        Scanner sc = new Scanner(System.in);
        System.out.println("Provide a Number");
        int num = sc.nextInt();
        long fact = 1;
        int i= 1;

        while (i<=num)
        {
            fact = fact*i;
            i++;
        }
        System.out.println("Factorial of "+num + " is "+fact);

        sc.close();
        
    }
}
