
public class QuickSort {

    void qs(int arr[], int low, int high) {
        if (low < high) {
            int partitionIndex = p(arr, low, high);
            qs(arr, low, partitionIndex - 1);
            qs(arr, partitionIndex + 1, high);
        }
    }

    int p(int arr[], int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j) {
            while (i <= high - 1 && arr[i] <= pivot) {
                i++;
            }
            while (j >= low + 1 && arr[j] > pivot) {
                j--;
            }
            if (i < j) {
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
        int tmp = arr[low];
        arr[low] = arr[j];
        arr[j] = tmp;
        return j;
    }

    public static void main(String[] args) {
        int arr[] = {50, 58, 51, 2, 12, 3, 57, 8, 9, 14, 20};
        QuickSort q = new QuickSort();
        q.qs(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
