package src.Oops009_07Jan;

public class bankname {

    //Instance variables
    String BankName;
    int Balance;
    String bankcode;

    bankname()
    {

        System.out.println("I am a Default Constructor");
        bankcode = "001";
        Balance= 100;

    }

    bankname(String Bank, String code, int bal)
    {
        System.out.println("Parameteried");
        this.BankName = Bank;
        this.bankcode = code;
        this.Balance = bal;
    }

    void PrintDetails()
    {
        System.out.println("BankName - > " + BankName);
        System.out.println("Balance -> " +Balance);
        System.out.println("BankCode - > " + bankcode);
    }

}
