package src.Basics006_24Dec;

public class Lab045 {
    public static void main(String[] args) {
     // Arrays

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5};
        //Though the size and values of the two arrays are same but as they are stored in different location so their references are not equal.
        System.out.println(arr1==arr2);
        System.out.println(arr1.equals(arr2));
        System.out.println("The references of the two arrays are below");
        System.out.println("-> "+arr1);
        System.out.println("-> "+arr2);
        System.out.println("---------------");

        //As array 1 is assigned to array 3 then the reference is same for both
        int[] arr3 = arr1;
        System.out.println("Reference of array 1 is "+arr1);
        System.out.println("Reference of array 3 is "+arr3);
        System.out.println(arr3==arr1);

        System.out.println("----------------");

        System.out.println(arr3[0]);
        System.out.println(arr3[1]);
        System.out.println(arr3[2]);
        System.out.println(arr3[3]);
        System.out.println(arr3[4]);

        System.out.println("---------------------------");

        //As they are pointing to the same reference so the value changes in both the arrays.
        arr3[0] = 22;
        System.out.println(arr3[0]);
        System.out.println(arr1[0]);












    }
}
