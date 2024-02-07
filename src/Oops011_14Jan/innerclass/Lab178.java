package src.Oops011_14Jan.innerclass;

public class Lab178 {
    public static void main(String[] args) {
 //       Parent parent = new Parent(); creating parent reference
//        Child child = new Child(); creating child reference
//        parent= child; assigning child reference to parent reference
//        //child = parent;

        parent2 hello = new child2();
        parent2 hello2 = new parent2();
//        Child hai=hello;
        child2 ch1= (child2)hello; // Downcasting in class
        child2 hai2= (child2)hello2; // Downcasting in class


    }

}



class parent2{}
class child2 extends parent2{}

class parent{}
class child1 extends parent{}
