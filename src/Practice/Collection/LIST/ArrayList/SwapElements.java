package src.Practice.Collection.LIST.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SwapElements {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        System.out.println(l);

        Collections.swap(l,2,4);//list , index, index
        System.out.println(l);





    }
}
