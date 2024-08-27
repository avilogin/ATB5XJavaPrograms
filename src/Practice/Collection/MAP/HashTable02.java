package src.Practice.Collection.MAP;

import java.util.Hashtable;
import java.util.Map;

public class HashTable02 {
    public static void main(String[] args) {
        Map<Integer, String> m = new Hashtable();
        m.put(0,"Mr");
        m.put(1,"Avjeet");
        m.put(2,"is");
        m.put(3,"comming");
        m.put(4,"to");
        m.put(5,"the");
        m.put(6,"party");
        m.put(7,"Avjeet");

        //Reverse the order od the insertion
        for (Map.Entry<Integer, String> e: m.entrySet())
        {
            System.out.println(e.getKey()+"-->"+e.getValue());
        }
    }
}
