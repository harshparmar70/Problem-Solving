
import java.util.ArrayList;
import java.util.List;

class MergeSort {

    void mergesort(int arr[], int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = (low + high) / 2;
        mergesort(arr, low, mid);
        mergesort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    void merge(int arr[], int low, int mid, int high) {
        List<Integer> tmp = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                tmp.add(arr[left++]);
            } else {
                tmp.add(arr[right++]);
            }
        }
        while (left <= mid) {
            tmp.add(arr[left++]);
        }
        while (right <= high) {
            tmp.add(arr[right++]);
        }
        for (int i = low; i <= high; i++) {
            arr[i] = tmp.get(i - low);
        }
    }

    public static void main(String[] args) {
        MergeSort m = new MergeSort();
        int arr[] = {50, 2, 36, 22, 0, 24, 57, 95, 4, 21, 3, 50};
        m.mergesort(arr, 0, arr.length - 1);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
