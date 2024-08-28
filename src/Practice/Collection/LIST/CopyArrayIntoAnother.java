package src.Practice.Collection.LIST;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CopyArrayIntoAnother {
    public static void main(String[] args) {
        List li= new ArrayList();
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);
        li.add(5);
        System.out.println("List 1 -->"+li);
        List l =  new ArrayList();
        l.add("Black");
        l.add("White");
        l.add("blue");
        l.add("gray");
        l.add("green");
        System.out.println("List 2 -->"+l);
        Collections.copy(li,l);
        System.out.println(l);
        System.out.println(li);

    }
}
