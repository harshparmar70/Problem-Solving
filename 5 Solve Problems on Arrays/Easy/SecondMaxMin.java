
public class SecondMaxMin {

    int SecondSmallest(int arr[], int n) {
        int min = Integer.MAX_VALUE;
        int smin = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                smin = min;
                min = arr[i];
            }
            if (arr[i] != min && arr[i] < smin) {
                smin = arr[i];
            }
        }
        return smin;
    }

    int SecondLargest(int arr[], int n) {
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                smax = max;
                max = arr[i];
            }
            if (arr[i] != max && arr[i] > smax) {
                smax = arr[i];
            }
        }
        return smax;
    }

    public static void main(String[] args) {
        SecondMaxMin s = new SecondMaxMin();
        int[] arr = {5, 11, 2, 50, 70, 60, 60, 2, 4};

        System.out.println(s.SecondSmallest(arr, arr.length));
        System.out.println(s.SecondLargest(arr, arr.length));
    }
}
