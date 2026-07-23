
class SmallestDivisor {

    static int smallestDivisorBF(int arr[], int limit) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            max = Math.max(num, max);
        }
        for (int d = 1; d <= max; d++) {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += (arr[i] + d - 1) / d;   // ceil(arr[i]/d)
            }
            if (sum <= limit) {
                return d;
            }
        }
        return -1;
    }

    static int sumByD(int arr[], int d) {
        int sum = 0;
        for (int num : arr) {
            sum += (int) Math.ceil((double) num / d);
        }
        return sum;
    }

    static int smallestDivisorOP(int arr[], int limit) {

        if (arr.length > limit) {
            return -1;
        }
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            max = Math.max(num, max);
        }
        int low = 1, high = max;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (sumByD(arr, mid) <= limit) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 5, 9};
        int limit = 6;
        System.out.println(smallestDivisorBF(arr, limit));
        System.out.println(smallestDivisorOP(arr, limit));
    }
}
