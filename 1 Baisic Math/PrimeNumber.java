class Solution {

    boolean isPrime(int n) {

        if (n <= 1) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}

public class PrimeNumber {
    public static void main(String[] args) {

        Solution s = new Solution();

        int n = 17;

        if (s.isPrime(n)) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not Prime Number");
        }
    }
}