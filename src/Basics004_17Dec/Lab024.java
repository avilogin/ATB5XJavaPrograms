package src.Basics004_17Dec;

import java.util.Scanner;

public class Lab024 {
    public static void main(String[] args) {

        // JDK 13
        int itemCode = 001;
        switch (itemCode) {
            case 001, 002, 003 :
                System.out.println("It's an electronic gadget!");
                break;
            case 004, 005:
                System.out.println("It's a mechanical device!");
                break;
            default:
                System.out.println("It's a software product!");
        }

    }
}
