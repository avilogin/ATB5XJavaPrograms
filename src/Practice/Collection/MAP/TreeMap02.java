package src.Practice.Collection.MAP;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap02 {
    public static void main(String[] args) {
        TreeMap<Integer,String> t = new TreeMap();
        t.put(1,"known");
        t.put(2,"army");
        t.put(3,"is");
        t.put(4,"towards");
        t.put(5,"us");
        for (Map.Entry<Integer,String> m : t.entrySet())
        {
            System.out.println(m.getKey()+"-->"+m.getValue());
        }
        System.out.println("----------------------");
        System.out.println(t.descendingMap());



    }
}
