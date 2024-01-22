package src.Oops009_07Jan;

public class AtbPerson {

    String name;
    long roll;
    String email;
    boolean isMarried;
    int age;

    public void talk() {
        System.out.println("Talking");
    }

    //Default constructor
    AtbPerson()
    {
        name = "Avijeet";
        System.out.println("I am a default constructor");
    }

    AtbPerson(String valufromobj)
    {
        this.name = valufromobj;
        System.out.println("parameterized constructor ");

    }


    public void printDetails()
    {
        System.out.println(name);
        System.out.println(roll);
        System.out.println(email);
        System.out.println(isMarried);
        System.out.println(age);


    }



}
