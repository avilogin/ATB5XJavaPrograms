package src.Oops010_13Jan;

public class IV1 {

    public static void main(String[] args) {

        Person h = new Person();
        System.out.println(h.a);//10

        Person h2 = new Person(23);
        System.out.println(h2.a);//23


        Person h3 = new Person(23, true);
       System.out.println(h3.a);//23
        System.out.println(h3.b);//true

        System.out.println(h.b);//false as the default value of b is false
        h.a = 99;
        System.out.println(h.a);

    }
}

    class Person {
        int a;
        boolean b;

        // Default
        Person(){
            this.a = 10;
        }

        // Parameter Constructor
        Person(int b){
            this.a = b; //  h2.a
        }

        Person(int b,boolean a){
            this.a = b;
            this.b = a;
        }
    }

