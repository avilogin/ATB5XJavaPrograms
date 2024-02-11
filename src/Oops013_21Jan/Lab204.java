package src.Oops013_21Jan;

import java.util.Stack;

public class Lab204 {
    public static void main(String[] args) {
        Stack<String> s = new Stack();
        s.add("Apple");
        s.add("Banana");
        s.add("Orange");
        s.add("Pineapple");
        s.add("Grapes");
        System.out.println(s);
        s.push("Dragon Fruit");
        System.out.println(s);
        s.pop();
        System.out.println(s);
        s.peek();
        System.out.println(s);
        s.pop();
        s.pop();
        System.out.println(s);
    }

}
