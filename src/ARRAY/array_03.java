package ARRAY;

public class array_03 {
    public static void reverseArray(int[] arr) {
        int si = 0;
        int ei = arr.length - 1;
        while (si <= ei) {
            int temp = arr[si];
            arr[si] = arr[ei];
            arr[ei] = temp;

            si++;
            ei--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        reverseArray(arr);

        for (int i : arr) {
            System.out.print(i + ",");
        }
    }
}
