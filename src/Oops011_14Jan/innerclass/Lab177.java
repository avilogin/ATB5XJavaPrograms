package src.Oops011_14Jan.innerclass;

public class Lab177 {
    public static void main(String[] args) {
        Student s1 = new Student() {
            //This is an anonymous Class
            @Override
            public void setId() {

            }
        };
        s1.setId();
    }
    B b = new B() {
        //This is an ananomous class
    };
}

abstract class B{
    int var_b = 12;
}
interface Student{
    int id = 11;
    void setId();
}