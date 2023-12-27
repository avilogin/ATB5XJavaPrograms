package src.Basics_16Dec;

public class Lab009 {
    public static void main(String[] args) {
        String s1 = "Avijeet";
        String s2 = new String("Avijeet");
        String s3 = new String("Avijeet");
        System.out.println(s1==s2);//checks for the reference of the variables
        System.out.println(s1.equalsIgnoreCase(s2));//checks for the actual value in the variable
        System.out.println(s2==s3);
        /*
        new operator is used to create the new object for class.
        It returns of the address of newly created object
         */

    }
}
