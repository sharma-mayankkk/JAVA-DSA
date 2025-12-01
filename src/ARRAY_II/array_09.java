package ARRAY_II;

//Find maximum subarray sum: Kadane's Algorithm : TC - O(n);
public class array_09 {
    public static void maxSubarraySum(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for(int i =0; i< arr.length; i++){
            currentSum += arr[i];
            if(currentSum<0){
                currentSum =0;
            }
            maxSum = Math.max(currentSum,maxSum);
        }
        System.out.println(maxSum);
    }
    public static void main(String[] args){
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        maxSubarraySum(arr);
    }
}
