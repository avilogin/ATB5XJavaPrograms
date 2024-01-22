package src.Oops009_07Jan.Inheritance.hierarchical;

public class Lab070 {
    public static void main(String[] args) {
        car c = new car();
        c.giveDetils();


        System.out.println("-----------------");
        truck t = new truck();
        t.giveDetils();

        System.out.println("---------------");
        vehicle v = new vehicle("kia",4);
        v.giveDetils();

        System.out.println("----------------");
        vehicle v2 = new vehicle("TATA",12);
        v2.giveDetils();


    }
}
