package src.Basics004_17Dec;

import java.util.Scanner;

public class Lab026 {
    public static void main(String[] args) {

//         3/ x^2+y^2-|z|
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide the value of X, Y, and Z");
        double x= sc.nextDouble();
        double y= sc.nextDouble();
        double z= sc.nextDouble();

        double result = 0;

       result =  Math.cbrt(Math.pow(x,2)+Math.pow(y,2)-Math.abs(z));
        System.out.println(result);

        sc.close();





    }
}
