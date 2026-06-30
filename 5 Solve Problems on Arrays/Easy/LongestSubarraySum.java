
import java.util.HashMap;

public class LongestSubarraySum {

    static int longestSubarray(int arr[], int k) {
        int maxLen = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }
        return maxLen;
    }

    static int longestSubarrayHashmap(int[] arr, int k) {

        HashMap<Long, Integer> preSumMap = new HashMap<>();

        long sum = 0;
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            // If subarray starts from index 0
            if (sum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }

            long rem = sum - k;

            // Check if (sum - k) exists
            if (preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            // Store only the first occurrence of the prefix sum
            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }

        return maxLen;
    }

    static int longestSubarrayOptimal(int[] arr, int k) {
        int left = 0, right = 0;
        int sum = 0, maxLen = 0;
        while (right < arr.length) {
            sum += arr[right];
            while (sum > k) {
                sum -= arr[left];
                left++;
            }
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
            right++;

        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 1, 1, 4, 2, 3};
        int k = 3;

        System.out.println(longestSubarray(arr, k));
        System.out.println(longestSubarrayHashmap(arr, k));
        System.out.println(longestSubarrayOptimal(arr, k));

    }
}
