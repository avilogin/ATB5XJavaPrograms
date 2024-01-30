package src.Oops010_13Jan.abstraction.inter;

public class son1 implements father{

    @Override
    public void loan1k() {
        System.out.println("I'll pay the loan");
        father.print();//we can access this method directly as it is static in nature
    }
}
