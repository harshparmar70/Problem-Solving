
public class FloorCeilFinder {

    static int findCeil(int arr[], int x) {  //>=x

        int n = arr.length;
        int low = 0, high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= x) {
                ans = arr[mid];
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    static int findFloor(int arr[], int x) {  //>=x

        int n = arr.length;
        int low = 0, high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] <= x) {
                ans = arr[mid];
                low = mid + 1;

            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 4, 7, 8, 10};
        int x = 5;
        System.out.println(findCeil(arr, x));
        System.out.println(findFloor(arr, x));
    }
}
