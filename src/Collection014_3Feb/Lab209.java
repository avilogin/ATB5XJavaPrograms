package src.Collection014_3Feb;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

public class Lab209 {
    public static void main(String[] args) {
        //HashMap
        Map m = new HashMap();
        m.put("Key1",1);
        m.put(22,2);
        System.out.println(m);
        System.out.println("-------------");

        //We can specify what type of values the arguments will be

        Map<String, Integer> m2 = new HashMap<>();
        m2.put("id1", 22);
        m2.put("id2", 33);
        m2.put("id1", 22);//Duplicate values are not allowed in HashMap
        m2.put("id3", 22);//values can be duplicate but not ID
        m2.put("id2", 44);//It will rewrite the value for id2 and show the latest value
        System.out.println(m2);
        System.out.println(m2.get("id2"));//it will show the value for the key
        System.out.println(m2.keySet());//show us all the keys
        System.out.println(m2.values());//show us all the values
        System.out.println("-----------");

        for(Map.Entry<String,Integer> item: m2.entrySet()){
            System.out.println(item.getKey() + " -> " + item
                    .getValue());

        }


    }
}
