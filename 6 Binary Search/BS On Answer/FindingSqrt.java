
public class FindingSqrt {

    public static int floorSqrt(int n) {
        // Variable to store answer
        int ans = 0;

        // Run loop from 1 to n
        for (int i = 1; i <= n; i++) {
            // Check if i*i <= n
            if ((long) (i) * i <= n) {
                // Update answer
                ans = i;
            } else {
                // Break when i*i > n
                break;
            }
        }
        // Return final answer
        return ans;
    }

    public static int floorSqrtOpt(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int low = 1, high = n, ans = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if ((mid * mid) <= n) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high;
    }

    public static void main(String[] args) {
        int n = 28;
        System.out.println(floorSqrt(n));
        System.out.println(floorSqrtOpt(n));

    }
}
