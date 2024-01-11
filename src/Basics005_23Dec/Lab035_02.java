package src.Basics005_23Dec;

public class Lab035_02 {
    public static void main(String[] args) {

//                Enhanced for loop
//                It is mainly used to traverse the array or collection elements.
//                The advantage of the for-each loop is that it eliminates the possibility of bugs and makes the code more readable.
//                It is known as the for-each loop because it traverses each element one by one.
//                The drawback of the enhanced for loop is that it cannot traverse the elements in reverse order.

//                syntax
//        for (datatype variable : array name)
//        {
//            statements
//        }

        String arr1[] = new String[5];
        arr1[0] = "Avijeet";
        arr1[1] = " Jana";
        arr1[2] = " is";
        arr1[3] = " Good";
        arr1[4] = " Boy";

//        for (int i = 0; i<arr1.length;i++)
//        {
//            System.out.print(arr1[i]);
//        }

        // Enhanced for loop
        for (String j : arr1)
        {
            System.out.print(j);
        }



    }
}
