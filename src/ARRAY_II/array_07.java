package ARRAY_II;

//MAX SUBARRAYS SUM : PREFIX SUM METHOD
public class array_07 {
    public static void maxSubArraySum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        int[] prefixSum = new int[arr.length];

        //Calculate prefix array:
        prefixSum[0] = arr[0];
        for (int i = 1; i < prefixSum.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = 0; j < arr.length; j++) {
                int end = j;
                currentSum = start == 0 ? prefixSum[end] : prefixSum[end] - prefixSum[start - 1];
                if (maxSum < currentSum) {
                    maxSum = currentSum;
                }
            }
        }
        System.out.println(maxSum);
    }

    public static void main(String[] args) {
        int[] arr = {3,4,7,8,9,11,8};
        maxSubArraySum(arr);
    }
}
