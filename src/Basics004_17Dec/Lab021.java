package src.Basics004_17Dec;

import java.util.Scanner;

public class Lab021 {
    public static void main(String[] args) {

        //✅ Triangle Classifier:
        //
        //   Write a program that classifies a triangle based on its side lengths.
        //   Given three input values representing the lengths of the sides, determine

        //   if the triangle is equilateral (all sides are equal),
        //   isosceles (exactly two sides are equal), or
        //   scalene (no sides are equal).
        //   Use an if-else statement to classify the triangle.


        //  side 1, side 2, side 3 ->  side1 == side 2 == side 3 ->  equilatera
        // (side1 == side 2) or side 2 == side 3 -> isosceles
        // scalene

        Scanner sc = new Scanner(System.in);
        System.out.println("Provide the three sides od the triangle");
        double Side1 = sc.nextDouble();
        double Side2 = sc.nextDouble();
        double Side3 = sc.nextDouble();

        if ((Side1 == Side2) && (Side2 == Side3) && (Side3 == Side1))
        {
            System.out.println("It is a equilateral Triangle");
        }
        else if ((Side1 == Side2) || (Side2 == Side3) || (Side1 == Side3))
        {
            System.out.println("It is a isosceles Triangle");
        }
        else
        {
            System.out.println("It is a scalene Triangle");
        }
    }
}
