
class Solution {

    void SelectionSort(int arr[]) {
        for (int i = 0; i <= arr.length - 2; i++) {
            int minidx = i;
            // Find the minimum element
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (arr[j] < arr[minidx]) {
                    minidx = j;
                }
            }
            // Swap after finding the minimum
            int tmp = arr[minidx];
            arr[minidx] = arr[i];
            arr[i] = tmp;
        }

        // Print sorted array
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    void BubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false) {
                break;
            }
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    void InsertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            
            arr[j + 1] = key;
        }
    }
}

public class Sorting1 {

    public static void main(String[] args) {
        Solution s = new Solution();
        int arr[] = {25, 24, 36, 41, 45, 42};
        // s.SelectionSort(arr);
        // s.BubbleSort(arr);
        s.InsertionSort(arr);

    }
}
