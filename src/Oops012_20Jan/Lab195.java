package src.Oops012_20Jan;

public class Lab195 {
    public static void main(String[] args) throws Exception{
        extracted(0);
        throw new Exception("Hello");
    }


    private static void extracted(int b)
    {
        int a;
//We can either throw a type of exception or we can let JVM handle it

        if (b == 0) {
            throw new ArithmeticException("B can't be zero");
        }else{
            a = 10 / b;
        }
        System.out.println(a);



//Or we can use the Try catch block

//        try {
//            a = 10 / b;
//        }catch (Exception e)
//        {
//            System.out.println(e.getMessage());
//        }
    }

}


