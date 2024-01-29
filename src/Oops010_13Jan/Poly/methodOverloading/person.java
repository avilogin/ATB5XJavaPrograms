package src.Oops010_13Jan.Poly.methodOverloading;

public class person {

    // Method OverLoading -> multiple methods with same name, but different argument.

    void Gift(String a)
    {
        System.out.println("A is a String "+ a);
    }

    int Gift(int x){
        System.out.println("X is a Int " +  x);
        return x;
    }


    float Gift(float y){
        System.out.println("X is a Float " +  y);
        return y;
    }

    void Gift(double x){
        System.out.println("X is a double " +  x);
    }
}
