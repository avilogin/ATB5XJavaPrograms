package src.Basics005_23Dec;

class student
{
    String name;
    int roll;
    int marks;
}
public class Lab035_03 {

    public static void main(String[] args) {

        student s1 = new student();
        s1.name = "Akash";
        s1.roll = 01;
        s1.marks = 22;

        student s2 = new student();
        s2.name = "Mukesh";
        s2.roll = 02;
        s2.marks = 55;

        student s3 = new student();
        s3.name = "Avijeet";
        s3.roll = 03;
        s3.marks = 99;

         student studants[] = new student[3];
         studants[0]= s1;
         studants[1]= s2;
         studants[2]= s3;

         for (student stud : studants )
         {
             System.out.println(stud.name+" : "+stud.marks+" : "+stud.roll);
         }


    }
}
