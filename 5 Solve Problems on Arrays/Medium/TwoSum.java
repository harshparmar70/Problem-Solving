
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    static int[] twoSum(int[] arr, int target) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    static int[] twoSumMap(int[] arr, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            int remaining = target - arr[i];

            if (map.containsKey(remaining)) {
                return new int[]{map.get(remaining), i};
            }

            map.put(arr[i], i);
        }

        return new int[]{-1, -1};
    }

    static boolean twoSumOptimal(int[] arr, int target) {
        Arrays.sort(arr);
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return true;
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {2, 7, 11, 15};
        // int ans[] = twoSum(arr, 17);
        int ans[] = twoSumMap(arr, 16);
        System.out.println(ans[0] + " " + ans[1]);
        System.out.println(twoSumOptimal(arr, 16));

    }
}
