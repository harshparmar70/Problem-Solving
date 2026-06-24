
class Solution {

    int Count(int n) {

        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            n = -n;
        }
        int count = (int) (Math.log10(n) + 1);

        // int count = 0;
        // while (n > 0) {
        //     // int lastDigit = n % 10;
        //     count++;
        //     n = n / 10;
        // }
        return count;
    }

    int Reverse(int n) {
        int revNum = 0;
        while (n > 0) {
            int LastDigit = n % 10;
            revNum = (revNum * 10) + LastDigit;
            n = n / 10;
        }
        return revNum;
    }
}

public class NumberCountReverse {

    public static void main(String[] args) {

        Solution s = new Solution();

        System.out.println("No of Elements : " + s.Count(1000));
        System.out.println("Reverse Digits of A Number " + s.Reverse(1018));
    }
}
