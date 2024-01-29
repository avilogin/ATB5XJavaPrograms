package src.Oops010_13Jan;

public class IV2 {

    public static void main(String[] args) {
        Person02 h1=new Person02();
        Person02 h2=new Person02();
        Person02 h3=null;
        h1.run();
        h2.run();
        //h3.run(); not possible as the object is not created

    }
}
class Person02 {
    int a;
    void run(){
        System.out.println("Run called");
    }
}
