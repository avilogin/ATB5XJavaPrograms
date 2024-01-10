package src.Oops008_06Jan;

public class Lab061 {
    public static void main(String[] args) {

        String s1= "Avijeet";
        String s2 = new String ("avijeet");
        System.out.println(s1==s2);//False as references are not the same
        System.out.println(s1.equals(s2));//False as the case is different
        System.out.println(s1.equalsIgnoreCase(s2));//true as it will ignore the case.
    }
}
