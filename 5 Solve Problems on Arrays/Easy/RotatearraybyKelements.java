
public class RotatearraybyKelements {

    void rotateLeft(int arr[], int n, int d) {

        d = d % n;

        int tmp[] = new int[d];

        // Store first d elements
        for (int i = 0; i < d; i++) {
            tmp[i] = arr[i];
        }

        // Shift remaining elements to the left
        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }

        // Copy temporary array at the end
        for (int i = 0; i < d; i++) {
            arr[n - d + i] = tmp[i];
        }
    }

    void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    void rotateLeftOptimize(int arr[], int n, int d) {
        d = d % n;
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }

    void rotateRightOptimize(int arr[], int n, int d) {
        d = d % n;
        reverse(arr, 0, n - 1);
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int d = 3;

        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println("");
        RotatearraybyKelements r = new RotatearraybyKelements();
        // r.rotateLeft(arr, arr.length, d);
        // r.rotateLeft(arr, arr.length, d);
        r.rotateRightOptimize(arr, arr.length, d);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
