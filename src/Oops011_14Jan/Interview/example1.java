package src.Oops011_14Jan.Interview;

public class example1 {
    public static void main(String[] args) {
        System.out.println(i1.a);
        System.out.println("-------------");
        c1 c = new c1();
        System.out.println(c.a);
        c.m1();


    }


}

interface i1
{
    //public static variables by default
    int a = 10;

    //abstract method
    void m1();

}

class c1 implements i1{

    @Override
    public void m1() {
        System.out.println("I am a abstract method");
    }
}
