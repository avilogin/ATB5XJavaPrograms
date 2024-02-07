package src.Oops011_14Jan;

public class staticDemo {

    //Static Varible
    public static String colName = "Ravenshaw";

    // Non static variable -> Local variable or Instance variable
    public int version = 3;

    //static Method
    public static void printDetails()
    {
        int a = 10;//local variable
        System.out.println("College Name is "+ colName);
        // You can't have or access an Instance variable into the Static Method!!
        //System.out.println("Version is : " + version);
    }

    // Non static method
    public void printVersion() {
        int age = 40;
        System.out.println("Version is : " + version);
        System.out.println("Name is :" + colName);
    }


}
