package src.Oops009_07Jan.Inheritance.hierarchical;

public class vehicle {

    String name;
    int tire;

    vehicle()
    {
        System.out.println("Parent Class");

    }
    vehicle(String naam, int cakka)
    {
        this.name = naam;
        this.tire = cakka;
    }

    void giveDetils()
    {
        System.out.println("The name of vehicle is "+ name);
        System.out.println("The tire of vehicle are "+ tire);
    }
}
