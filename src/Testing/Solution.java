package src.Testing;

import java.util.Scanner;



public class Solution

{

    public static void main(String[] args)

    {

        Scanner s = new Scanner(System.in);

        int i = s.nextInt();

        double j = s.nextDouble();

        String k = s.nextLine();



        System.out.println("String: " + k);

        System.out.println("Double: " + j);

        System.out.println("Int: " + i);

        s.close();

    }

}