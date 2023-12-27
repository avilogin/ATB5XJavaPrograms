package src.Basics_16Dec;

public class Lab015 {
    public static void main(String[] args) {
        // Increment operator.
        // Pre and Post

        int a =10;
        System.out.println(a++ + a++ + a++ + a++ + ++a + ++a);
        System.out.println(a);
        /*
       A - ex-10 A -11 O-10
       B - ex-11 A -12 O-11
       C - ex-12 A -13 O-12
       D - ex-13 A -14 O-13
       E - ex-15 A -15 O-15
       F - ex-16 A -16 O-16
        ans-77
        16
         */
    }
}
