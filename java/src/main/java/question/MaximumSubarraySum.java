package question;

/**
 * Efficient Approach: Kadane’s Algorithm
 *
 *
 * Input: [-3, -4, 5, -1, 2, -4, 6, -1]
 * Output: 8
 * Explanation: Subarray [5, -1, 2, -4, 6] is the max sum contiguous subarray with sum 8.
 *
 * Input: [-2, 3, -1, 2]
 * Output: 4
 * Explanation: Subarray [3, -1, 2] is the max sum contiguous subarray with sum 4.
 *
 *
 */
public class MaximumSubarraySum {

    public static int maximumSubarraySumLoop(int[] arr) {
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i <= n - 1; i++) {
            int currSum = 0;
            for (int j = i; j <= n - 1; j++) {
                currSum += arr[j];
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }

        return maxSum;
    }

    /**
     * @param arr Time complexity: O(N), Where N is the size of the array.
     * Space complexity: O(1)
     * @return
     */
    public int maximumSubarraySumBest(int[] arr) {
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i <= n - 1; i++) {
            currSum += arr[i];

            if (currSum > maxSum) {
                maxSum = currSum;
            }

            if (currSum < 0) {
                currSum = 0;
            }
        }

        return maxSum;
    }
    public static void main(String[] args) {
        MaximumSubarraySum ob = new MaximumSubarraySum();
        int[] input = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(ob.maximumSubarraySumBest(input));
    }
}
