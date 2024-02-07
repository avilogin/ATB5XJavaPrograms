package src.Oops011_14Jan.Exceptions;

public class Lab181 {

    // Exception -?>
//  event that occurs during the execution of a program
//  that disrupts the normal flow of instructions.
    public static void main(String[] args) {
        try {
            String a = null;
            a.trim();

        }
        catch (Exception e)
        {
            System.out.println("Its not allowed in Java");
        }

        System.out.println("End...");

    }
}
