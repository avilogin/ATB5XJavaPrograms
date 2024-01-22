package src.Oops009_07Jan;

public class Lab065 {
    public static void main(String[] args) {

        AtbPerson p = new AtbPerson();
        //p.name = "Avijeet";
        System.out.println(p.name);
      p.printDetails();

        System.out.println("------------------------");

      AtbPerson p2 = new AtbPerson("New Value");
      p2.printDetails();


    }
}
