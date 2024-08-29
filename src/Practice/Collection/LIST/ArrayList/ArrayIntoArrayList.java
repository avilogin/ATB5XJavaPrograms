package src.Practice.Collection.LIST.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayIntoArrayList {
    public static void main(String[] args) {
        String arr[] = {"String","is","not","good"};
        for (String a :arr)
        {
            System.out.print(a+"\t");
        }
        System.out.println();


        List<String> li = Arrays.asList(arr);
        System.out.println(li);



    }
}
