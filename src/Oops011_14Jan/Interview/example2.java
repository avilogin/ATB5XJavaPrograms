package src.Oops011_14Jan.Interview;

public class example2 {
    public static void main(String[] args) {

        System.out.println(inter1.a);//static variable
        System.out.println("-------------");

        inter1 i = new conClass(); // Dynamic Dispatch
        System.out.println(i.a);
        i.i1();
        System.out.println("-------------");

        class1 c = new conClass(); // Dynamic Dispatch
        System.out.println(c.a);
        System.out.println(c.b);
        c.cl1();
        System.out.println("------------");

        conClass con = new conClass();
        System.out.println(con.a);
        System.out.println(con.b);
        con.i1();
        con.cl1();
        con.meth();


    }
}

interface inter1
{
    int a =10;

    void i1();

}

abstract class class1 implements inter1
{
    int b = 20;

    abstract  void cl1();
}

class conClass extends class1
{

    @Override
    public void i1() {
        System.out.println(a);
        System.out.println(b);
        System.out.println("i belong to an Interface");
    }


    @Override
    void cl1() {
        System.out.println(a);
        System.out.println(b);
        System.out.println("I belong to an abstract class");

    }
    public void meth()
    {
        System.out.println("I am a simple method");
    }
}
