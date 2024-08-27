package src.Practice.Collection.MAP;

import java.util.HashMap;
import java.util.Map;

public class map01 {
    public static void main(String[] args) {
        Map<Integer,String> m = new HashMap();

        m.put(1,"Avijeet");
        m.put(2,"Java");
        m.put(22,"Thakur");
        m.put(null,"Binu");//we can have only one null key
        m.put(5,null);//we can have only one null value
        m.put(1,"Rahul");//As the key value is same so "Avijeet" will get replaced by "Rahul". The latest values stays
        m.putIfAbsent(3,"Avijeet");//this method will add the values if it is not present


        System.out.println("----Using KeySet() to fetch the keys and values from map---");
        for (Integer o: m.keySet())
        {
            System.out.println(o+" -> "+m.get(o));//using map function to get the values of o
        }


        System.out.println("----Using EntrySet() to fetch the key and value from map---");
        //EntrySet() is a method used to get the values of a map
        for (Map.Entry<Integer,String> e : m.entrySet())
        {
            System.out.println(e.getKey()+" -> "+e.getValue());
        }



        System.out.println(m);
        System.out.println(m.size());//provides the size of the map
        System.out.println(m.isEmpty());//checks whether the map is empty or not
        System.out.println(m.containsKey(5));//checks whether it contains the provided key or not
        System.out.println(m.containsValue(1));//checks whether it contains the provided value or not
        m.remove(22);//removes the value according to the key provided
        //m.remove(22,"Thakur");//removes the data according to the key and value provided
        System.out.println(m);
        System.out.println(m.get(1));//provides the value of the key provided







    }
}
