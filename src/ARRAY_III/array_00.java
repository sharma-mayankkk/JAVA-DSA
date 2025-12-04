package ARRAY_III;
//BUBBLE SORT:
public class array_00 {
    public static void bubbleSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    //Function to print array;
    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {8,4,13,11,17,15};
        bubbleSort(arr);
        printArray(arr);
    }
}
