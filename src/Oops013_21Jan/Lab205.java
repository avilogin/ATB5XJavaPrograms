package src.Oops013_21Jan;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab205 {
    public static void main(String[] args) {
        Student student = new Student(1,"Avijeet");
        Student student2 = new Student(7,"Zora");
        Student student3 = new Student(10,"Nakul");
        Student student4 = new Student(8,"Orion");
        Student student5 = new Student(2,"Wasim");

        List<Student> stud = new ArrayList<>();
        stud.add(student);
        stud.add(student2);
        stud.add(student3);
        stud.add(student4);
        stud.add(student5);
        System.out.println(stud);

        System.out.println("--------");

//        Collections.sort(stud);//this will sort according to the compareTo method in the Student class
//        System.out.println(stud);

//        //Sorting using Comparator and sortByIdAsc class
//        Collections.sort(stud, new sortByIdAsc());
//        System.out.println(stud);


//        //Sorting using Comparator and sortByIdDesc class
//        Collections.sort(stud, new sortByIdDesc());
//        System.out.println(stud);
//
//
//        //Sorting using Comparator and sortByNameAsc class
//        Collections.sort(stud, new sortByNameAsc());
//        System.out.println(stud);
//
//
        //Sorting using Comparator and sortByNameDesc class
        Collections.sort(stud, new sortByNameDesc());
        System.out.println(stud);

    }
}
