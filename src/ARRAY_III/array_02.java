package ARRAY_III;

public class array_02 {
    public static void insertionSort(int[] arr){
        for(int i =1; i<arr.length; i++){
           int curr = arr[i];
           int prev = i-1;
           while(prev >=0 && arr[prev] > curr){
               arr[prev+1] = arr[prev];
               prev--;
           }
           arr[prev+1] = curr;
        }
    }

    //Function to print array;
    public static void printArray(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {13,12,9,7,3,1,4};
        insertionSort(arr);
    }
}
