
public class FindPeakElement {

    static int findPeakElement(int arr[]) {
        int n = arr.length;

        // Traverse the array
        for (int i = 0; i < n; i++) {
            // Check left neighbor if exists
            boolean left = (i == 0) || (arr[i] >= arr[i - 1]);
            // Check right neighbor if exists
            boolean right = (i == n - 1) || (arr[i] >= arr[i + 1]);

            // If both conditions are true
            if (left && right) {
                return i;
            }
        }

        // In case no peak found
        return -1;
    }

    static int findPeakElementopt(int arr[]) {
        int n = arr.length;
        if (n == 1) {
            return 0; // Traverse the array
        }
        if (arr[0] > arr[1]) {
            return 0;
        }
        if (arr[n - 1] > arr[n - 2]) {
            return n - 1;
        }
        int low = 1, high = n - 2;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (arr[mid] > arr[mid - 1]) {
                low = mid + 1;
            } else if (arr[mid] > arr[mid + 1]) {
                high = mid - 1;
            } else { // this is for multiple pick
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 5, 1, 2, 1};
        System.out.println(findPeakElement(nums));
        System.out.println(findPeakElementopt(nums));
    }
}
