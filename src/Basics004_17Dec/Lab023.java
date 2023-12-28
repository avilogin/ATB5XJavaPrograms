package src.Basics004_17Dec;

import java.util.Scanner;

public class Lab023 {
    public static void main(String[] args) {

        //Check whether the provided alphabet is vowel or not

        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide an alphabet");
         char alpha = sc.next().toCharArray()[0];

         switch (alpha){
             case 'a':
                 System.out.println("Vowel");
                 break;
             case 'e':
                 System.out.println("Vowel");
                 break;
             case 'i':
                 System.out.println("Vowel");
                 break;
             case 'o':
                 System.out.println("Vowel");
                 break;
             case 'u':
                 System.out.println("Vowel");
                 break;
             case 'A':
                 System.out.println("Vowel");
                 break;
             case 'E':
                 System.out.println("Vowel");
                 break;
             case 'I':
                 System.out.println("Vowel");
                 break;
             case 'O':
                 System.out.println("Vowel");
                 break;
             case 'U':
                 System.out.println("Vowel");
                 break;
             default:
                 System.out.println("It is a Consonant");
         }

    }
}
