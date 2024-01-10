package src.Oops008_06Jan;

public class Lab060 {
    public static void main(String[] args) {
        String str = "Avijeet";                     //String Pool
        String str2 = new String("Jana");   //Heap Area


        String str3 = "Hello";
        String str4 = str3.concat("World");//String is Immutable in nature
        System.out.println(str3);

        System.out.println("-----------------------");
        String str5 = "Password123";
        String str6 = "password123";

        if (str5.equalsIgnoreCase(str6))
        {
            System.out.println("Yes..It is same");
        }
    }
}
