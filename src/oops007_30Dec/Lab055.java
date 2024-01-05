package src.oops007_30Dec;

public class Lab055 {
    public static void main(String[] args) {

        //Below are the calling to the functions
        //passing 2 arguments
        int c = sum(2,3);
        System.out.println(c);
        //passing one argument
        int y = sum2(2);
        System.out.println(y);
        //passing string values
        String s1 = names("Avijeet ", "Jana");
        System.out.println(s1);

        //calling a void method
        hello();
    }

    //Below are the definition of the functions
    static int sum(int a, int b)
    {
    return a+b;
    }
    static int sum2(int x)
    {
        return x;
    }
    static String names(String a1, String a2)
    {
        return a1+a2;
    }

    static void hello()
    {
        System.out.println("Holaa");
    }

}
