package src.Basics_16Dec;

public class Lab006 {
    public static void main(String[] args) {

        int a =10, b=20;


        //Compound assignments operators
        //+=, -+, *=, /= , %=
        b += 30;
        System.out.println(b);

        //Relational operators
        // <, >, <=, >=, ==, !=,
        int c = 10, d = 106;
        boolean res = c != d;
        System.out.println(res);

        //Interview question
        System.out.println('A'== 65);//ASCII value of 'A' is 65 that is why it is true

        byte e = 65;
        System.out.println('A'== e);//in SOP statements the data type converts into integer

        //System.out.println(true == 1);not possible



    }

}
