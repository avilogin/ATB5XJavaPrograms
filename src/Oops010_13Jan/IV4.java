package src.Oops010_13Jan;

public class IV4 {
    public static void main(String[] args) {
        //System.out.println(P04.a);
        System.out.println(P04.b);
        P04.run2();
        System.out.println();
        //System.out.println(P04.run());cannot access without creating an object
    }


}
class P04 {
    int a;
    static int b;

    static void run2(){
        System.out.println("I am a Static block");
    }

    void run(){

    }
}
