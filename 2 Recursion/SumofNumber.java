
class Solution {

    void paramerFun(int i, int sum) {
        if (i < 1) {
            System.out.println("Sum : " + sum);
            return;
        }
        paramerFun(i - 1, sum + i);
    }

    int functionalFun(int n) {
        if (n == 0) {
            return 0;
        }
        return n + functionalFun(n - 1);
    }
}

public class SumofNumber {

    public static void main(String[] args) {
        Solution s = new Solution();
        // s.paramerFun(10, 0);
        s.paramerFun(10, 0);

        System.out.println(s.functionalFun(10));

    }
}
