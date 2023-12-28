package src.Basics004_17Dec;

import java.util.Scanner;

public class Lab022 {
    public static void main(String[] args) {

        // If, Switch -  Condition Based
        // Loops -> Which will repeat something - for, while, do while

        // Switch - Condition based - Multiple Condition

        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide the number of day and i will tell what day it is");
         int Day = sc.nextInt();

         switch (Day){
             case 1:
                 System.out.println("Monday");
                 break;
             case 2:
                 System.out.println("Tuesday");
                 break;
             case 3:
                 System.out.println("Wednesday");
                 break;
             case 4:
                 System.out.println("Thursday");
                 break;
             case 5:
                 System.out.println("Friday");
                 break;
             case 6:
                 System.out.println("Saturday");
                 break;
             case 7:
                 System.out.println("Sunday");
                 break;
             default:
                 System.out.println("Please provide a number between 1 to 7");
         }

    }
}
