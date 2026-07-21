
public class NthRoot {

    public static int nthRoot(int n, int m) {
        for (int i = 1; i < m; i++) {
            if (Math.pow(i, n) == m) {
                return i;
            } else if (Math.pow(i, n) > m) {
                break;
            }
        }
        return -1;
    }

    static int power(int mid, int n) {
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans *= mid;
            if (ans > Integer.MAX_VALUE) {
                return ans;
            }
        }
        return ans;
    }

    public static int nthRootOpt(int n, int m) {
        int low = 1, high = m;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int value = power(mid, n);

            if (value == m) {
                return mid;
            } else if (value > m) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int n = 3;
        int m = 29;
        System.out.println(nthRoot(n, m));
        System.out.println(nthRootOpt(n, m));
    }
}
