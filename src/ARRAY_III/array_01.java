package ARRAY_III;

public class array_01 {
    public static void selectionSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            int minPos = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[minPos]>arr[j]){
                    minPos = j;
                }
            }

            //Swapping
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
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
        int[] arr = {15,11,13,20,55};
        selectionSort(arr);
        printArray(arr);
    }
}
