
import java.util.Arrays;

public class KokoEatingBananas {

    static int calculateTotalHours(int arr[], int i) {
        int totalhours = 0;
        for (int pile : arr) {
            totalhours += (int) Math.ceil((double) pile / i);
        }
        return totalhours;
    }

    static int minEatingSpeed(int[] arr, int h) {
        int maxvlaue = Arrays.stream(arr).max().getAsInt();
        for (int i = 1; i <= maxvlaue; i++) {
            int hours = calculateTotalHours(arr, i);
            if (hours == h) {
                return i;
            }
        }

        return maxvlaue;
    }

    static int minEatingSpeedopt(int[] arr, int h) {

        int low = 1, high = Arrays.stream(arr).max().getAsInt();
        int ans = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = (low + high) / 2;
            int totalhours = calculateTotalHours(arr, mid);

            if (totalhours <= h) 
            {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    public static void main(String[] args) {
        int[] arr = {3, 6, 7, 11};
        int h = 8;
        System.out.println(minEatingSpeed(arr, h));
        System.out.println(minEatingSpeedopt(arr, h));
    }
}
