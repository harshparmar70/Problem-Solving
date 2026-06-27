
import java.util.Scanner;

class Solution {

    int BFFC(int arr[], int number) {
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                cnt++;
            }
        }
        return cnt;
    }

}

public class FrequencyCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

// Input array size
        System.out.print("Enter Array length : ");
        int n = sc.nextInt();

// Input array elements
        int arr[] = new int[n];
        System.out.print("Enter array Elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

// Precomputation (Frequency Count)
        int[] hash = new int[10000000];
        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }

// Number of queries
        System.out.print("Enter number of queries : ");
        int q = sc.nextInt();

        while (q-- != 0) {
            int number = sc.nextInt();

            // Fetch frequency
            System.out.println("Answer : " + hash[number]);
        }
        // int a[] = {1, 2, 4, 3, 1, 2, 5};
        // Solution s = new Solution();
        // System.out.println(s.BFFC(a, 1));
    }

}
