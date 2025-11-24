package ARRAY_II;

//MAX SUBARRAYS SUM:
public class array_06 {
    public static void maxSubarraySum(int[] arr){
        int maxSum = 0;
        for (int i = 0; i<arr.length; i++){
            for(int j = i; j<arr.length; j++){
                int currentSum = 0;
                for(int k=i; k<=j; k++){
                    currentSum += arr[k];
                    if(currentSum>maxSum){
                        maxSum = currentSum;
                    }
                }
                System.out.println(currentSum);
            }
        }
        System.out.println("Max sum is:"+ maxSum);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 7, 9};
        maxSubarraySum(arr);
    }
}
