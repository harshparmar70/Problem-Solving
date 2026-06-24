
class Solution {

    boolean armstrong(int n) {
        if (n < 0) {
            return false;
        }

        int original = n;
        int count = (n == 0) ? 1 : (int) Math.log10(n) + 1;

        int sum = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            sum = (int) (sum + Math.pow(lastDigit, count));
            n = n / 10;
        }

        return sum == original;
    }
}

public class ArmstrongNo {

    public static void main(String[] args) {

        Solution s = new Solution();
        if (s.armstrong(371)) {
            System.out.println("Armstrong number.");
        } else {
            System.out.println("Not Armstrong number.");
        }

    }
}
