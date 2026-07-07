
import java.util.Arrays;

public class LongestConsecutiveSequence {

    static int LCS(int arr[]) {
        int longest = 1;

        for (int i = 0; i < arr.length; i++) {
            int n = arr[i];
            int cnt = 1;

            while (ls(arr, n + 1) == true) {
                n = n + 1;
                cnt = cnt + 1;
            }
            longest = Math.max(longest, cnt);
        }
        return longest;
    }

    static int LCS1(int arr[]) {
        Arrays.sort(arr);
        int longest = 1;
        int cnt = 0;
        int lastsmaller = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] - 1 == lastsmaller) {
                cnt = cnt + 1;;
                lastsmaller = arr[i];
            } else if (arr[i] != lastsmaller) {
                cnt = 1;
                lastsmaller = arr[i];
            }
            longest = Math.max(longest, cnt);
        }
        return longest;
    }

    static boolean ls(int arr[], int num) {
        for (int i : arr) {
            if (i == num) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {100, 4, 200, 1, 3, 2};
        System.out.println(LCS(arr));
        System.out.println(LCS1(arr));
    }
}
