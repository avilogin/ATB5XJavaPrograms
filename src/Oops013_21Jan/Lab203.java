package src.Oops013_21Jan;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Lab203 {

    //Sorting the array using collections class
    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<>();
        marks.add(20);
        marks.add(50);
        marks.add(60);
        marks.add(10);
        marks.add(0);
        marks.add(30);
        Collections.sort(marks);
        System.out.println(marks);
        System.out.println("-------------");

//        List stringList = null;
//        stringList.add(200);
//        NullList can't have a values as stringList is assigned with null
    }
}
