package src.Practice.Collection.LIST;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class linkedList01 {

    //adding ArrayList to LinkedList
    public static void main(String[] args) {

        List arr = new ArrayList();

        arr.add("Avijeet");
        arr.add(12345);
        arr.add(22.56);
        arr.add(true);
        arr.add("c");
        arr.add(234.657845656);


        List link = new LinkedList();
        link.add("-----ADDING----");
        link.add("jana");
        link.add(67890);
        link.add(22.99);
        link.add(false);
        link.add("d");
        link.add(235.56367567356);



        arr.addAll(link);

        Iterator it = arr.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }



    }
}
