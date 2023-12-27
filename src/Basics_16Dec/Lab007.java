package src.Basics_16Dec;

public class Lab007 {
    public static void main(String[] args) {

        //Logical Operators
        // !, &&, ||
        //! -> Not It is only allowed with boolean or conditions
        boolean a = true;
        System.out.println(a);
        System.out.println(!a);
        System.out.println(!(10>20));

        // || - OR
        // T || T -> T
        // T || F -> T
        // F || T -> T
        // F || F -> F

        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        //  And  &&

        // T || T -> T
        // T || F -> F
        // F || T -> F
        // F || F -> F

        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        System.out.println("-----------------------");

        int c = 12;
        boolean b = !(c > 10 || c < 5);
        boolean d = c > 10 || c < 5;
        System.out.println(b);
        System.out.println(d);

    }
}
