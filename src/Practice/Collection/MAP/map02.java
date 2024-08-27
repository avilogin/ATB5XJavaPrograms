package src.Practice.Collection.MAP;

import java.util.HashMap;
import java.util.Map;

public class map02 {
    //Find the average of values in map
    public static void main(String[] args) {
        Integer sum = 0,count=0, avg;
        Map<String, Integer> map = new HashMap<>();

        map.put("a",10);
        map.put("b",20);
        map.put("c",30);

        for (Object o : map.keySet())
        {
           sum = sum+ map.get(o);
           count++;
        }
        avg = sum/count;
        System.out.println("Average is "+avg);

    }
}
