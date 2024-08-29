package src.Practice.Collection.LIST.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class RevereseArray {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        arr.add(20);
        arr.add(99);
        arr.add(0);
        arr.add(56);
        arr.add(02);
        arr.add(5);
        arr.add(1);

        System.out.println(arr);

        System.out.println("--------After Sorting-----");
        Collections.sort(arr);
        System.out.println(arr);

        Collections.reverse(arr);

        System.out.println("-------After Reverse-----");
        System.out.println(arr);
        System.out.println("-----Half Array-----");

        System.out.println(arr.subList(0,3));




    }

}
