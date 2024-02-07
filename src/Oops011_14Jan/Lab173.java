package src.Oops011_14Jan;

public class Lab173 {
    public static void main(String[] args) {

//        System.out.println(staticDemo.colName);
//        staticDemo.printDetails();

        staticDemo s1 = new staticDemo();
        s1.printVersion();


        staticDemo s2 = new staticDemo();
        s2.version = 5;
        s2.printVersion();

        //the value of colname changed as we changed it.
        staticDemo.colName = "UTKAL";
        staticDemo s3 = new staticDemo();
        s3.printVersion();



    }


}
