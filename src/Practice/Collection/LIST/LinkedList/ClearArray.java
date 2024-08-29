package src.Practice.Collection.LIST.LinkedList;

import java.util.LinkedList;

public class ClearArray {
    public static void main(String[] args) {
        LinkedList<String> s = new LinkedList();
        s.add("Avijeet");
        s.add("Zima");
        s.add("Cima");
        s.add("Bima");
        s.add("Pima");
        s.add("Bima");
        System.out.println(s);
       s.clear();//clear all the elements in array
       Boolean empty =  s.isEmpty();
        if (empty)
            System.out.println("Array Is Empty");
        else
            System.out.println("Array is not Empty");




    }
}
