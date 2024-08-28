package src.Practice.Collection.LIST;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CloneArray {
    public static void main(String[] args) {
        ArrayList<String> l =  new ArrayList();
        l.add("Black");
        l.add("White");
        l.add("blue");
        l.add("gray");
        l.add("green");
        System.out.println("Original Array -> "+l);

        ArrayList<String> li =  (ArrayList<String>)l.clone();

        System.out.println("Cloned Array -> "+li);








    }
}
