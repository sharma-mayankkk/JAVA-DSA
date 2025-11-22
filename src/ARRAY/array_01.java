package ARRAY;
//SEARCHING IN ARRAY:
public class array_01 {
    public static int linearSearch(int[] arr, int key){
        for(int i =0; i<arr.length; i++){
            if(arr[i] == key){
                System.out.println(i);
            }
        }
        return -1;
    }
    //BINARY SEARCH;
    public static int binarySearch(int[] arr, int key){
        int si = 0;
        int ei = arr.length-1;
        while(si<=ei){
            int mid = (si+ei)/2;
            if(arr[mid]==key){
                return mid;
            } else if (arr[mid]>key) {
                ei = mid-1;
            } else {
                si = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {45,99,188,711,1145,2455,9988,10000};
        System.out.println(binarySearch(arr,99));
    }
}
