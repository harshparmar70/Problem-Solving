
public class SeparatePositiveNegative {

    public static void main(String[] args) {
        int arr[] = {1, -2, 2, -8, 3, -4, 4, -3, 0, 5, 6, -7};
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            while (arr[left] < 0) {
                left++;
            }
            while (arr[right] >= 0) {
                right--;
            }
            if (left < right) {
                int tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
            }
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
