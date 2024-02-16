package src.Collection014_3Feb;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab207 {
    public static void main(String[] args) {

        //LinkedHashSet will store the items the way it as inserted
        Set name = new LinkedHashSet();
        name.add("Avijeet");
        name.add("Rahul");
        name.add("Varun");
        name.add("Chinmoy");
        name.add("");
        System.out.println(name);
        System.out.println("------------");

        //Treeset will sort the items stored
        Set name2 = new TreeSet();
        name2.add("Avijeet");
        name2.add("Rahul");
        name2.add("Varun");
        name2.add("Chinmoy");
        name.add("");//cannot add null values in TreeSet
        System.out.println(name2);//it will sort the items



    }
}
