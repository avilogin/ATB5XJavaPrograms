package src.Practice.Collection.MAP;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap01 {
    public static void main(String[] args) {
        Map<String, String> m = new LinkedHashMap<>();
        m.put("first", "Avijeet");
        m.put("second", "Jana");
        m.put("third", "Is");
        m.put("forth", "Good");
        m.put("fifth", "Boy");
        m.put("eleventh","Avijeet");
        m.put(null,null);

        for (Map.Entry<String, String> m1 : m.entrySet())
        {
            System.out.println(m1.getKey() +" --> "+m1.getValue());
        }

        System.out.println("------------------------------");
        Map<String, String> m2 = new LinkedHashMap<>();
        m2.put("sixth", "Avijeet");
        m2.put("seventh", "Jana");
        m2.put("eighth", "Is");
        m2.put("ninth", "Good");
        m2.put("tenth", "Boy");

        for (Map.Entry<String, String> p : m2.entrySet())
        {
            System.out.println(p.getKey() +" --> "+p.getValue());
        }
        m2.putAll(m);

        System.out.println("-----------------------");
        for (Map.Entry<String, String> pa : m2.entrySet())
        {
            System.out.println(pa.getKey() +" --> "+pa.getValue());
        }
    }
}
