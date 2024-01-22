package src.Oops009_07Jan;

import java.util.Scanner;

public class Lab066 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First name");
        String name1 = sc.next();

        bankname SBI = new bankname();
        SBI.PrintDetails();

        bankname HDFC = new bankname(name1,"002",199);
        HDFC.PrintDetails();
        HDFC.Balance = 220;

        System.out.println("Enter the Second name");
        String name2 = sc.next();
        bankname ICICI = new bankname(name2,"003",666);
        ICICI.bankcode  = "004";
        ICICI.Balance = 999;
        ICICI.PrintDetails();

        sc.close();


    }
}
