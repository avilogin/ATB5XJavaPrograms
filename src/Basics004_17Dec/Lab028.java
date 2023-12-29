package src.Basics004_17Dec;

public class Lab028 {
    public static void main(String[] args) {

// JDK > 13
        // ->
        //if we are using -> then we do not have to add break , it will work as the normal switch statement.
        //Only issue with this method is we cannot add multiple SOP statements.

        int itemCode = 001;
        switch (itemCode) {
            case 001 -> System.out.println("It's a laptop!");
            case 002 -> System.out.println("It's a desktop!");
            case 003,004 -> System.out.println("It's a mobile phone!");
            default -> System.out.println("Heloo!");
        }




    }
}
