
class Solution {

    // Recursive function to print name count times
    public void printName(int count, int N) {
        if (count == N) {
            return;
        }
        System.out.println("Harsh");
        printName(count + 1, N);
    }

    void print1toN(int S, int E) {
        System.out.print(S + " ");
        if (S == E) {
            return;
        }
        print1toN(S + 1, E);
    }

    void printNto1(int S, int E) {
        System.out.print(E + " ");
        if (S == E) {
            return;
        }
        print1toN(S, E - 1);
    }

    public void printNumbers(int current) { //backTracking
        // Base case: if current is less than 1, stop recursion
        if (current < 1) {
            return;
        }
        // Recursive call with previous number
        printNumbers(current - 1);
        // Print current number during backtracking
        System.out.print(current + " ");
    }

    public void printNumbersNto1(int i, int n) { //backTracking
        // Base case: if current is less than 1, stop recursion
        if (i > n) {
            return;
        }
        // Recursive call with previous number
        printNumbersNto1(i + 1, n);
        // Print current number during backtracking
        System.out.print(i + " ");
    }
}

public class BasicRecursion {

    public static void main(String[] args) {
        Solution sol = new Solution();
        // sol.printName(0, 5);
        sol.print1toN(1, 5);
        // System.out.println("");
        // sol.printNto1(1, 5);
        // System.out.println("");
        // sol.printNumbers(5);
        // System.out.println("");
        sol.printNumbersNto1(1, 5);
    }
}
