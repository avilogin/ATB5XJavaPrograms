package src.Oops011_14Jan.innerclass;

public class Lab174 {
    public static void main(String[] args) {
        outter out = new outter(20);
        outter.InnerClass in = out.new InnerClass();
        in.m1();

    }
}

    class outter
    {
        int i = 10;//instance variable
        public outter(int j)
        {
        this.i = j;

        }

        public class InnerClass
        {
            int b = 20;
            void m1()
            {
                System.out.println(i);
                System.out.println(b);
                System.out.println("I am inner class");
            }
        }
    }

