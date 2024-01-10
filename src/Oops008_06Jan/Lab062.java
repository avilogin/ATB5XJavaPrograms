package src.Oops008_06Jan;

public class Lab062 {
    public static void main(String[] args) {

        //We can create string in 4 different ways

        //These are immutable in nature
        //String have concat operations
        String s1= "Avijeet";
        String s2 = new String ("avijeet");
        s1.concat(" Jana");
        System.out.println(s1);//The value didn't change as they are immutable in nature


        //These are mutable in nature
        //StringBuffer and StringBuilder have append operations
        StringBuffer s3 = new StringBuffer("Avijeet");
        s3.append(" Jana");
        System.out.println(s3);//The value changed as they are mutable in nature

        StringBuilder s4 = new StringBuilder("Rohit");
        s4.append(" Shetty");
        System.out.println(s4);//The value changed as they are mutable in nature


    }
}
