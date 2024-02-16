package src.Collection014_3Feb;

import java.util.PriorityQueue;
import java.util.Queue;

public class Lab210 {
    public static void main(String[] args) {

        temp(10);
        temp(true);
        temp(22.22);
        temp("String");




    }
    public static <gen> void temp(gen x)//we used a generics type of datatype so that it can accept any type of values
    {
        System.out.println(x);
    }
}
