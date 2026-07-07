
import java.util.ArrayList;
import java.util.Collections;

public class LeadersinArray {

    static ArrayList<Integer> leadersinArray(int arr[]) {
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            boolean leader = true;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    leader = false;
                    break;
                }
            }
            if (leader == true) {
                ans.add(arr[i]);
            }
        }
        return ans;
    }

    static ArrayList<Integer> leadersinArrayopt(int arr[]) {
        ArrayList<Integer> ans = new ArrayList<>();
        int maxi = Integer.MIN_VALUE;
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] > maxi) {
                ans.add(arr[i]);
                maxi = arr[i];
            }
        }
        Collections.reverse(ans);

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 3, 1, 2};
        // leadersinArray(nums);
        // ArrayList<Integer> ans = leadersinArray(nums);
        ArrayList<Integer> ans = leadersinArrayopt(nums);

        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
}
