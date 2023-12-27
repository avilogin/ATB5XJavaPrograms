package src.Basics_16Dec;

public class Lab010 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String s1 = "Avijeet";
        String s2 = "Jana";
        String s3 =new String( "Avijeet");
        System.out.println(a+b+s1+s2);
        System.out.println(s1+s2+a+b);
        System.out.println(s1+s2+(a+b)); //BODMAS
        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s3));

    }
}
