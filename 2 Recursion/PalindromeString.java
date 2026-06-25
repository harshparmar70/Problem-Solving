
class Solution {

    boolean isPalindrome(String s, int i) {
        int n = s.length();

        if (i >= n / 2) {
            return true;
        }

        if (s.charAt(i) != s.charAt(n - i - 1)) {
            return false;
        }

        return isPalindrome(s, i + 1);
    } 
}

public class PalindromeString {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.isPalindrome("madam", 0));
    }
}
