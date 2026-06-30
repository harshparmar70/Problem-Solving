
public class FindMissingNumber {

    static int missingnumber(int arr[], int n) {
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int i = 0; i < n - 1; i++) {
            actualSum += arr[i];
        }
        return expectedSum - actualSum;

    }

    static int missingNumberXor(int[] arr, int N) {
        int xor1 = 0;
        int xor2 = 0;
        // for (int i = 1; i <= N; i++) {
        //     xor1 ^= i;
        // }
        // for (int i : arr) {

        //     xor2 ^= i;
        // }
        for (int i = 0; i < N - 1; i++) {
            xor1 ^= i + 1;
            xor2 ^= arr[i];
        }
        xor1 ^= N;

        return xor1 ^ xor2;
    }

    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 4};
        System.out.println(missingnumber(arr, 5));
        System.out.println(missingNumberXor(arr, 5));
    }
}
