
import java.util.*;

class Solution {

    void printDivisors(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("");
        // for (int i = 1; i <= Math.sqrt(n); i++) //Time Complexity: O(√n)
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                if (n / i != i) {
                    System.out.print(n / i + " ");
                }
            }

        }
        System.out.println("");

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                list.add(i);

                if (i != n / i) {
                    list.add(n / i);
                }
            }
        }
        Collections.sort(list);
        for (int x : list) {
            System.out.print(x + " ");
        }

    }

}

class GetDivisors {

    public static void main(String[] args) {
        Solution s = new Solution();
        s.printDivisors(36);
    }
}
