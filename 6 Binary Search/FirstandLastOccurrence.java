
public class FirstandLastOccurrence {

    static int[] firstandLastOccurrence(int arr[], int x) {
        int first = -1, last = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                if (first == -1) {
                    first = i;
                }
                last = i;
            }
        }
        return new int[]{first, last};
    }

    static int[] firstandLastOccurrenceopt(int arr[], int n, int x) {

        int lb = lb(arr, n, x);
        if (lb == n || arr[lb] != x) {
            return new int[]{-1, -1};
        }
        return new int[]{lb, ub(arr, n, x) - 1};

    }

    static int lb(int arr[], int n, int x) {
        int low = 0, high = n - 1;
        int ans = n;

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

    static int ub(int arr[], int n, int x) {
        int low = 0, high = n - 1;
        int ans = n;

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

    static int firstOccurrenceopt(int arr[], int n, int x) {
        int low = 0, high = n - 1;
        int first = n;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                first = mid;
                high = mid - 1;
            } else if (arr[mid] < n) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return first;

    }

    static int lastOccurrenceopt(int arr[], int n, int x) {

        int low = 0, high = n - 1;
        int last = n;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                last = mid;
                low = mid + 1;
            } else if (arr[mid] < n) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return last;
    }

    static int[] firstandLastOccurrenceopt2(int arr[], int n, int x) {

        int first = firstOccurrenceopt(arr, n, x);
        if (first == -1) {
            return new int[]{-1, -1};
        }
        int last = lastOccurrenceopt(arr, n, x);
        return new int[]{first, last};
    }

    public static void main(String[] args) {
        int arr[] = {3, 4, 13, 13, 13, 20, 40};
        int x = 13;
        // int bf[] = firstandLastOccurrence(arr, x);
        int bf[] = firstandLastOccurrenceopt2(arr, arr.length, x);
        for (int elem : bf) {
            System.out.print(elem + " ");
        }
        System.out.println("");
        System.out.println(firstOccurrenceopt(arr, arr.length, x));
        System.out.println(lastOccurrenceopt(arr, arr.length, x));

    }
}
