package src.Basics_16Dec;

import java.util.Scanner;

public class Lab017 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide a Number");
        int a = sc.nextInt();


        if(a%2 == 1){
            System.out.println("ODD Number");
        }else{
            System.out.println("Even Number");
        }
    }
}

