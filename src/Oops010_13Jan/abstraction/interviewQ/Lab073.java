package src.Oops010_13Jan.abstraction.interviewQ;

public class Lab073 {
    public static void main(String[] args) {

    }
}
interface I1{}
interface I2{}

class A{}
class B{}
abstract class C{}
abstract class D{}

class Test1 extends A{ } //possible-- Class extends another class
//class Test2 extends A,B{ } //not possible as it's a syntax error (Multiple Inheritance)
class Test3 implements I1{ } //possible
class Test4 implements I1,I2{ } //possible --Implements multiple interfaces
class Test5 extends A implements I1,I2{ }// possible (Multiple Inheritance)
//class Test6 implements I1 extends A{ }//order of extending is wrong

//interface I3 extends A{} //an interface can only extend other interfaces, not classes.
//interface I4 implements A{} //an interface cannot "implement" a class. Only classes can implement interfaces.
//interface I5 extends A,B{} //an interface can only extend other interfaces, not classes.
interface I6 extends I1,I2{ }
