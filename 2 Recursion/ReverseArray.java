
class Solution {

    void TwoPointerRev(int arr[], int l, int r) {
        if (l >= r) {
            return;
        }
        int tmp = arr[l];
        arr[l] = arr[r];
        arr[r] = tmp;
        TwoPointerRev(arr, l + 1, r - 1);
    }

    void ReverseArray(int[] arr, int i) {
        int n = arr.length;
        if (i >= n / 2) {
            return;
        }
        int tmp = arr[i];
        arr[i] = arr[n - i - 1];
        arr[n - i - 1] = tmp;
        ReverseArray(arr, i + 1);
    }
}

public class ReverseArray {

    public static void main(String[] args) {
        Solution S = new Solution();
        int arr[] = {1, 2, 3, 4, 5, 6};
        // S.TwoPointerRev(arr, 0, arr.length - 1);
        S.ReverseArray(arr, 0);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
