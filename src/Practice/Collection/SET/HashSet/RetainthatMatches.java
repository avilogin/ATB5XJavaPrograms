package src.Practice.Collection.SET.HashSet;

import java.util.HashSet;

public class RetainthatMatches {
    public static void main(String[] args) {
        HashSet h1 =  new HashSet();
        h1.add("First");
        h1.add("Minus");
        h1.add("Third");
        h1.add("Forth");
        System.out.println("H1-> "+h1);

        HashSet h2 =  new HashSet();
        h2.add("First");
        h2.add("Second");
        h2.add("Third");
        h2.add("Sixth");
        System.out.println("H2-> "+h2);

        h1.retainAll(h2);
        System.out.println("H1-> "+h1);
        System.out.println("H2-> "+h2);




    }
}
