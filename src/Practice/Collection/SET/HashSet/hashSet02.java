package src.Practice.Collection.SET.HashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class hashSet02 {
    public static void main(String[] args) {

        Set name2 = new HashSet();
        //doesn't follow the order
        name2.add("Avijeet");
        name2.add("Rahul");
        name2.add("Varun");
        name2.add("Chinmoy");
        name2.add(null);
        System.out.println(name2);

        System.out.println("---------LinkedHashSet----------");
        //keeps the insertion order
        Set name = new LinkedHashSet();
        name.add("Avijeet");
        name.add("Rahul");
        name.add("Varun");
        name.add("Chinmoy");
        name.add(null);
        System.out.println(name);

        System.out.println("------------TreeSet---------");
        //sorted in ascending order
        Set name3 = new TreeSet();
        name3.add("Avijeet");
        name3.add("Rahul");
        name3.add("Varun");
        name3.add("Chinmoy");
        name3.add("");
        System.out.println(name3);
    }
}
