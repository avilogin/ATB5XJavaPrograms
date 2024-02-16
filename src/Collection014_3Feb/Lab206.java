package src.Collection014_3Feb;

import java.util.*;

public class Lab206 {
    public static void main(String[] args) {

        //HashSet
        Set fr = new HashSet();
        fr.add("Apples");
        fr.add("Oranges");
        fr.add("Banana");
        fr.add("Apples");//cannot have duplicate values
        System.out.println(fr);
        fr.add("Water Melon");
        System.out.println(fr);//the values will store in a random order in HashSet
        System.out.println(fr.isEmpty());
        System.out.println(fr.size());
        System.out.println(fr.contains("Oranges"));
        System.out.println(fr.contains("oranges"));//Case sensitive
        System.out.println("-----------");


        //to print using for each loop
        for (Object o : fr)
        {
            System.out.println(o);
        }
        System.out.println("------------");
        fr.add("chiku");

        //to Print using Iterator
        Iterator it = fr.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }





    }
}
