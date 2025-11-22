package ARRAY;

import java.util.Scanner;
public class array_00 {
    public static void updateRuns(int[] arr){
        for(int i = 0; i<arr.length; i++ ){
            arr[i] += 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        //creating an array:
//        int[] arr = new int[50];
//        arr[0] = sc.nextInt();
//        arr[1] = sc.nextInt();
//
//        System.out.println("Phy:" + arr[0]);
//        System.out.println("Chem:"+ arr[1]);
//
//        float percentage = ((float)(arr[0] + arr[1]) / 200) * 100;

        //Arrays as a function argument:
        int[] runs = {82,129,55};
        updateRuns(runs);

        //Printing arrays
        for(int i = 0; i<runs.length; i++){
            System.out.print(runs[i]+",");
        }
    }
}
