package src.Basics005_23Dec;

import java.util.Scanner;

public class Lab042_PrimeNumber {
    public static void main(String[] args) {

    //Prime Number

        Scanner sc = new Scanner(System.in);
        System.out.print("Provide a Number = ");
        int num = sc.nextInt();
        boolean isPrime = true;
        if (num>-1) {
            for (int i = 2; i * i < num; i++) {
                if (num % 2 == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.println(num + " is a Prime Number");
            } else {
                System.out.println(num + " is not a Prime Number");
            }
        }
        else
        {
            System.out.println(num +" is a negative number");
        }

        sc.close();
        
    }
}
