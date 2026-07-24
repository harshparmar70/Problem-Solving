
public class MissingK {

    static int missingK(int arr[], int k) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= k) {
                k++;
            } else {
                break;
            }
        }
        return k;
    }

    static int missingKOp(int arr[], int k) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int missing = arr[mid] - (mid + 1);
            if (missing < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high + k + 1;
    }

    public static void main(String[] args) {
        int[] vec = {4, 7, 9, 10};  // Sorted array
        int k = 4;

        System.out.println(missingK(vec, k));
        System.out.println(missingKOp(vec, k));
    }
}
