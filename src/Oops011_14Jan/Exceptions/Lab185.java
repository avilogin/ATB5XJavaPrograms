package src.Oops011_14Jan.Exceptions;

public class Lab185 {
    public static void main(String[] args) {

        extracted2();
        System.out.println("Main block");

    }
    private static void extracted2()
    {
        extracted1();
        System.out.println("Extracted 2");
    }


    private static void extracted1()
    {
        extracted();
        System.out.println("Extracted 1");
    }
    private static void extracted()
    {
        try {

            String name = null;
            name.length();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

        //////////////31:57
    }
}
