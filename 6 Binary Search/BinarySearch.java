
class BinarySearch {

    static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid + 1;
            } else if (target < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        return -1;

    }

    static int binarySearch1(int[] arr, int low, int high, int target) {

        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (arr[mid] == target) {
            return mid + 1;
        } else if (target > arr[mid]) {
            return binarySearch1(arr, mid + 1, high, target);
        }
        return binarySearch1(arr, low, mid - 1, target);
    }

    public static void main(String[] args) {

        int arr[] = {3, 4, 6, 7, 9, 12, 16, 17};

        System.out.println(binarySearch(arr, 6));
        System.out.println(binarySearch1(arr, 0, arr.length, 13));
    }
}
