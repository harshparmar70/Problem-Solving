
class Solution {

    boolean palindromeNo(int n) {
        int original = n;
        int revNum = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            revNum = (revNum * 10) + lastDigit;
            n = n / 10;
        }

        return original == revNum;
    }
}

public class PalindromeNo {

    public static void main(String[] args) {
        Solution s = new Solution();

        if (s.palindromeNo(121)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
