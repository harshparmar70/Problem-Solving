
public class LowerBound_UpperBound {

    static int lowerBound(int arr[], int x) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {

            if (arr[i] >= x) {
                return i;
            }
        }
        return n;
    }

    static int lowerBoundBS(int arr[], int x) {
        int n = arr.length;
        int ans = n;
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    static int upperBoundBS(int arr[], int x) {
        int n = arr.length;
        int ans = n;
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 3, 4, 8, 9, 15};
        System.out.println(lowerBound(arr, 2));
        System.out.println(lowerBoundBS(arr, 2));
        System.out.println(upperBoundBS(arr, 2));
    }
}
