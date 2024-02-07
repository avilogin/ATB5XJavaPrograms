package src.Oops011_14Jan.Exceptions;

public class Lab182 {
    public static void main(String[] args) {
        String sh = args[0]; //if no argument is passed then we will get java.lang.ArrayIndexOutOfBoundsException

        int x = Integer.parseInt(sh);// if we will pass any other data type other than integer
        // then it will give java.lang.NumberFormatException

        int a = 10/x;//if we pass the argument as 0 then it will give us java.lang.ArithmeticException

        System.out.println(x);
        System.out.println(a);
    }
}
