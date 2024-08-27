package src.Practice.Collection.MAP;

import java.util.HashMap;
import java.util.Map;

public class hashMap01 {
    public static void main(String[] args) {
        Map<Integer, String> m = new HashMap<>();
        m.put(1,"Avijeet");
        m.put(5,"tuku");
        m.put(null,"jana");
        m.put(100,"rahul");
        m.put(75,"pillu");
        m.put(69,null);
        m.put(9,null);
        m.put(75,"darling");

        System.out.println(m);

        for (Integer o : m.keySet())
        {
            System.out.println(o +" --> "+m.get(o));
        }
        System.out.println("----------------------");
        for (Map.Entry e : m.entrySet())
        {
            System.out.println(e.getKey()+" --> "+e.getValue());
        }






    }
}
