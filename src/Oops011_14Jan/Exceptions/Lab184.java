package src.Oops011_14Jan.Exceptions;

public class Lab184 {
    public static void main(String[] args) {

        try {


            String ip = args[0];
            int a = Integer.parseInt(args[0]);
            int b = 10 / a;
            System.out.println(a);
            System.out.println(b);
        }
        catch (ArithmeticException  | NullPointerException  | ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }
        catch (Exception ee)
        {
            System.out.println(ee.getMessage());
        }
        //System.exit(0); this will instruct the JVM to stop the execution which means the finally block will not be executed
        finally {
            System.out.println("I will be executed even if exception occours");
        }

    }
}
