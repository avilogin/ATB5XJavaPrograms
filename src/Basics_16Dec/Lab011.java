package src.Basics_16Dec;

public class Lab011 {
    public static void main(String[] args) {
        String s1 = "Pramod";
        System.out.println(s1 instanceof String);
        System.out.println(s1 instanceof Object);
        //Result of instanceof operator is boolean value.


        // Ternary operator.

        //int a =  condition ?  if this is true print do this :  If false do this

//        int a = true ? 10: 20;
//        int a1 = (30>40) ? 10: 20;
//        System.out.println(a);
//        System.out.println(a1);

        String str= 10 > 20 ? "10" : "TWENTY";
        System.out.println(str);

        String anil_status = true ? "Yes" : "No";
        System.out.println(anil_status);
    }
}
