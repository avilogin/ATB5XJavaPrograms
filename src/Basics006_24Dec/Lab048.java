package src.Basics006_24Dec;

import java.util.Scanner;

public class Lab048 {
    public static void main(String[] args) {

        // Take input user Marks of 5 subjects and Print the marks

        Scanner sc = new Scanner(System.in);
        System.out.println("Provide the marks of 5 subjects");

        float mar[] = new float[5];
        //For taking multiple inputs from user
        for (int i =0;i<mar.length;i++)
        {
            mar[i]= sc.nextFloat();
        }

        //For Printing the values of the array
        for (int j =0;j<mar.length;j++)
        {
            System.out.println(mar[j]);
        }

        sc.close();











    }
}
