
public class SingleNonDuplicate {

    public static int singleNonDuplicateOpt(int[] arr) {
        int n = arr.length;
        if (arr[0] != arr[1]) {
            return arr[0];
        }
        if (arr[n - 1] != arr[n - 2]) {
            return arr[n - 1];
        }
        int low = 1, high = n - 2;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1]) {
                return arr[mid];
            }
            if ((mid % 2 == 1 && arr[mid] == arr[mid - 1])
                    || (mid % 2 == 0 && arr[mid] == arr[mid + 1])) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static int singleNonDuplicate(int[] arr) {
        // Get the size of the array
        int n = arr.length;

        // If array has only one element, return it
        if (n == 1) {
            return arr[0];
        }
        // Loop through the array
        for (int i = 0; i < n; i++) {

            // Check if it's the first element and not equal to the next
            if (i == 0) {
                if (arr[i] != arr[i + 1]) {
                    return arr[i];
                }
            } // Check if it's the last element and not equal to the previous
            else if (i == n - 1) {
                if (arr[i] != arr[i - 1]) {
                    return arr[i];
                }
            } // Check if the current element is not equal to both neighbors
            else {
                if (arr[i] != arr[i - 1] && arr[i] != arr[i + 1]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6};
        System.out.println(singleNonDuplicate(arr));
        System.out.println(singleNonDuplicateOpt(arr));
    }
}
