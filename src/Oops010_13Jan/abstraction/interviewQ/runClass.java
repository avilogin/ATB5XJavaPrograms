package src.Oops010_13Jan.abstraction.interviewQ;

public class runClass {
    public static void main(String[] args) {
        class1 c = new class1();
        c.hello();
        c.world();

        System.out.println("---------------");
        inter1 i = new class1();
        i.hello();
        i.world();

        //inter1 i = new inter1();
        //The above is not possible as we cannot create object of an Interface
    }
}
