package src.Practice.Collection.MAP;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap01 {
    public static void main(String[] args) {
        Map m = new TreeMap();
        m.put(1,"Avijeet");
        m.put(2,"Avijeet");
        m.put(3,"Avijeet");
        m.put(4,"Avijeet");
        m.put(5,"Avijeet");
        m.put(6,null);

        for (Object o: m.keySet())
        {
            System.out.println(o +" --> "+m.get(o));
        }
    }
}
