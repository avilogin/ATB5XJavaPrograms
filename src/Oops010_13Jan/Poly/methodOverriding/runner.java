package src.Oops010_13Jan.Poly.methodOverriding;

public class runner {
    public static void main(String[] args) {

        //call the method of dog class as the object is created for dog class
        Dog d = new Dog();
        d.bark();

        //call the method of hound class as the object is created for hound class
        Hound h = new Hound();
        h.bark();

        //call the method of hound class as the object is created for hound class
        Dog f = new Hound();
        f.bark();


        //Hound a = new Dog(); // Java 22 This is not possible
        // Latest java 22 - It is never possible in JAVA
    }
}
