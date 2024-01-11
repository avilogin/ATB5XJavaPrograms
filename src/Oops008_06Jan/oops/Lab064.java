package src.Oops008_06Jan.oops;

public class Lab064 {
    public static void main(String[] args) {

        person p1 = new person();
        p1.age = 22;
        p1.address= "Plot-241, Sector-5, Niladri Vihar";
        p1.education= "MCA";
        p1.name = "Avijeet Jana";
        p1.gender = "Male";
        p1.maried();
        System.out.println(p1.address);

        person p2 = new person();
        p2.age = 27;
        p2.address= "Plot-999, Sector-5, ";
        p2.education= "BCA";
        p2.name = "Rohit Khanna";
        p2.gender = "Male";
        p2.maried();
        System.out.println(p2.address);

        //here object is created but without a reference
        new person();
        System.out.println("Printed");



    }
}
