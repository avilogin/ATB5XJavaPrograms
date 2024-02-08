package src.Oops012_20Jan.Collection;

import java.util.ArrayList;
import java.util.List;

public class Lab201 {

    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();//we can restrict the input data by specifying the data types
        myList.add("Avijeet");
        myList.add("112300");
//        myList.add(true);
//        myList.add(22.5);
        System.out.println(myList);

        //Enhanced For loop
        for (Object o : myList)
        {
            System.out.println(o);
        }
    }
}
