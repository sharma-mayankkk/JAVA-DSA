package ARRAY;

public class array_02 {
    //LARGEST ELEMENT IN THE ARRAY:
    public static int largestElement(int[] arr) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int[] arr = {41, 22, 54, 82, 33, 99, 114, 74, 514};
        System.out.println(largestElement(arr));
    }
}
