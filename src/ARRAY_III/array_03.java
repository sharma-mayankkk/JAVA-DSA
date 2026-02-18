package ARRAY_III;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

// In-built function to do sorting in the arrays in JAVA:
public class array_03 {
    //function to print array:
    public static void printArr(Integer[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Integer[] arr = {5,3,8,11,2,7};
        // It will sort the whole array:
//         Arrays.sort(arr);
        //If we want to sort the particular subarray in an array we can use the function giving parameter of si and ei.
//        Arrays.sort(arr, 0, 3); // here the ending index is no-inclusive that means it will not consider the ending index element in the sorting process.

        //to perform descending order sorting :
        Arrays.sort(arr, Collections.reverseOrder()); //It o
        printArr(arr);
    }
}
