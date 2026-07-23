
import java.util.Arrays;

public class ShipWithinDays {

    static int daysNeeded(int weights[], int capacity) {
        // Initialize day count to 1
        int days = 1;
        // Current load for the day
        int currentLoad = 0;

        // Iterate over all package weights
        for (int w : weights) {
            // If adding weight exceeds capacity
            if (currentLoad + w > capacity) {
                // Increase day count and reset load
                days++;
                currentLoad = w;
            } else {
                // Otherwise, add weight to current load
                currentLoad += w;
            }
        }
        // Return total days needed
        return days;
    }

    static int shipWithinDays(int[] weights, int d) {
        // Find maximum weight as minimum capacity
        int left = Arrays.stream(weights).max().getAsInt();
        // Find total sum as maximum capacity
        int right = Arrays.stream(weights).sum();

        // Iterate from minimum to maximum capacity
        for (int capacity = left; capacity <= right; capacity++) {
            // Calculate days needed for current capacity
            int needed = daysNeeded(weights, capacity);
            // If days needed are less than or equal to d, return capacity
            if (needed <= d) {
                return capacity;

            }
        }
        // Should never reach here given constraints
        return right;
    }

    static int shipWithinDaysOp(int[] weights, int d) {
        // Calculate minimum capacity as max weight in packages
        int left = Arrays.stream(weights).max().getAsInt();
        // Calculate maximum capacity as sum of all weights
        int right = Arrays.stream(weights).sum();

        // Binary search between left and right capacity values
        while (left < right) {
            // Calculate mid value to test
            int mid = left + (right - left) / 2;
            // Calculate how many days needed for capacity mid
            int needed = daysNeeded(weights, mid);

            // If days needed is less or equal to allowed days,
            // try to find smaller capacity on left side
            if (needed <= d) {
                right = mid;
            } else {
                // Else, need more capacity, search on right side
                left = mid + 1;
            }
        }
        // Return minimum capacity found
        return left;
    }

    public static void main(String[] args) {
        int[] weights = {5, 4, 5, 2, 3, 4, 5, 6};
        int d = 5;
        System.out.println(shipWithinDays(weights, d));
        System.out.println(shipWithinDaysOp(weights, d));

    }
}
