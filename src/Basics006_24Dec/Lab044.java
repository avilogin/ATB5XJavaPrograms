package src.Basics006_24Dec;

public class Lab044 {
    public static void main(String[] args) {
     // Arrays

        int a[] = new int[10];

        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println(a[4]);
        System.out.println(a[5]);
        System.out.println("---------");
        a[0]= 10;
        System.out.println(a[0]);

        System.out.println("---------------");
        final int b[] = new int[5];
        //final keyword will keep the size of the array throughout the program but we can assign values into that array
        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);
        System.out.println(b[3]);
        System.out.println(b[4]);
        b[1] = 100;
        System.out.println(b[1]);






    }
}
