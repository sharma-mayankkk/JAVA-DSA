package ARRAY;

//PRINT ALL THE POSSIBLE PAIRS OF ARRAYS:
public class array_04 {
    public static void arrayPairs(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                System.out.print("{" + arr[i] + "," + arr[j] + "}");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 12, 13, 46, 78, 49, 56};
        arrayPairs(arr);
    }
}
