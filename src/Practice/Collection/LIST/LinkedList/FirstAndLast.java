package src.Practice.Collection.LIST.LinkedList;

import java.util.LinkedList;

public class FirstAndLast {
    public static void main(String[] args) {
        LinkedList<String> s = new LinkedList();
        s.add("Avijeet");
        s.add("Zima");
        s.add("Cima");
        s.add("Bima");
        s.add("Pima");
        s.add("Kima");
       Integer size =  s.size();

        System.out.println("First Element ->"+s.get(0));
        System.out.println("Last Element ->"+s.get(size-1));

    }
}
