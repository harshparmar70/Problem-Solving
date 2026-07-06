
class NextPermutation {

    static void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void nextPermutation(int arr[]) {
        int n = arr.length;

        // Step 1: Find the pivot
        int ind = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                ind = i;
                break;
            }
        }

        // Step 2: If no pivot, reverse the whole array
        if (ind == -1) {
            reverse(arr, 0, n - 1);
            return;
        }

        // Step 3: Find the next greater element and swap
        for (int i = n - 1; i > ind; i--) {
            if (arr[i] > arr[ind]) {
                int temp = arr[i];
                arr[i] = arr[ind];
                arr[ind] = temp;
                break; // Important
            }
        }

        // Step 4: Reverse the suffix
        reverse(arr, ind + 1, n - 1);
    }

    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 4, 3, 0, 0};

        nextPermutation(arr);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
