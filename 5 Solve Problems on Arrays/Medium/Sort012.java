
public class Sort012 {

    static void ShortArray(int arr[]) {
        int cnt0 = 0, cnt1 = 0, cnt2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                cnt0++;
            } else if (arr[i] == 1) {
                cnt1++;
            } else {
                cnt2++;
            }
        }
        for (int i = 0; i < cnt0; i++) {
            arr[i] = 0;
        }
        for (int i = cnt0; i < cnt0 + cnt1; i++) {
            arr[i] = 1;
        }
        for (int i = cnt0 + cnt1; i < arr.length; i++) {
            arr[i] = 2;
        }

    }

    static void ShortArrayOpt(int arr[]) {
        int low = 0, high = arr.length - 1, mid = 0;

        while (mid <= high) {
            if (arr[mid] == 0) {
                int tmp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = tmp;
                mid++;
                low++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                int tmp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = tmp;
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 0, 2, 0, 1, 1, 2, 0};

        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        // ShortArray(arr);
        ShortArrayOpt(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
