package src.Oops012_20Jan.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Lab200 {

    public static void main(String[] args) {
        List myList = new ArrayList();
        myList.add("Avijeet");
        myList.add(112300);
        myList.add(true);
        myList.add(22.5);
        myList.get(2);
        System.out.println(myList);

        myList.set(1,22);//changes the value according to the index number
        System.out.println(myList);
        myList.remove(1);//removed the value in the provided index number
        System.out.println(myList);
        System.out.println("------------------");

        for (int i=0; i<myList.size();i++)
        {
            System.out.println(myList.get(i));//gives the values in the array
        }


        System.out.println("------------------");


        //Enhanced For loop
        for (Object o : myList)//using Object as datatype because the values are of different data types
        {
            System.out.println(o);
        }

        System.out.println("------------------");


        //Iterator
        Iterator it = myList.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
