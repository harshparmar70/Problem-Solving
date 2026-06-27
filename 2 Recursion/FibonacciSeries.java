
class Solution {

    int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

public class FibonacciSeries {

    public static void main(String[] args) {
        Solution s = new Solution();
        int n = 10;

        for (int i = 0; i < n; i++) {
            System.out.print(s.fibonacci(i) + " ");
        }
    }

}
