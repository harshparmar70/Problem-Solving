
public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9}; // length : 6

        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
                int tmp = arr[i];
                arr[i] = arr[min];
                arr[min] = tmp;
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
