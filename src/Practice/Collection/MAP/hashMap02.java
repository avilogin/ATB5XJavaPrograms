package src.Practice.Collection.MAP;

import java.util.HashMap;
import java.util.Map;

public class hashMap02 {
    public static void main(String[] args) {
        Map m = new HashMap<>();
        m.put(1,"Avijeet");
        m.put(true,"tuku");
        m.put(null,"jana");
        m.put("Name","rahul");
        m.put(22.56,"pillu");
        m.put(69,null);
        m.put(9,null);

        System.out.println(m);

        for (Object o : m.keySet())
        {
            System.out.println(o +" --> "+m.get(o));
        }




    }
}
