//// SUM OF MAXIMUM OF SUB-ARRAY USING ----------"KADANES ALGORITHM"

public class MaxSubarraySum {

 public static void KADANES(int numbers[]) {
  int currSum = 0;
  int maxSum = Integer.MIN_VALUE;

  for (int i = 0; i < numbers.length; i++) {

   currSum += numbers[i];
   if (currSum < 0) {
    currSum = 0;
   }

   maxSum = Math.max(currSum, maxSum);

  }

  System.out.println("your maxSubarray : " + maxSum);
 }

 public static void main(String[] args) {
  int numbers[] = { 2, -3, 4, -6 };

  KADANES(numbers);
 }
}

// Max SubArray Sum Brute Force Approach ///
// public class MaxSubarraySum {

// public static void MaxSubarraySum(int numbers[]) {
// int currSum = 0;
// int maxSum = Integer.MIN_VALUE;

// for (int i = 0; i < numbers.length; i++) {
// int start = i;
// for (int j = i; j < numbers.length; j++) {
// int end = j;
// currSum = 0;
// for (int k = start; k <= end; k++) {
// currSum += numbers[k];
// }
// System.out.println(currSum);
// if (maxSum < currSum) {
// maxSum = currSum;

// }

// }
// }
// }

// public static void main(String[] args) {
// int numbers[] = { 2, 4, 6, 8, 10 };

// MaxSubarraySum(numbers);
// }

// }
