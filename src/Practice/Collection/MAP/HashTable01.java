package src.Practice.Collection.MAP;

import java.util.Hashtable;
import java.util.Map;

public class HashTable01 {
    public static void main(String[] args) {
        Map<Integer, String> m = new Hashtable();
        m.put(1,"Avjeet");
        //m.put(null ,"Avjeet");//cannot have null as a key
        m.put(3,"rahul");
        //m.put(4,null);//cannot have null as a value
        for (Map.Entry<Integer, String> e: m.entrySet())
        {
            System.out.println(e.getKey()+"-->"+e.getValue());
        }
    }
}
