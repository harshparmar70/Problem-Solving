
public class RemoveDuplicates {

    int removeDuplicates(int arr[], int n) {
        int i = 0;
        for (int j = 1; j < n; j++) {
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 2, 3, 3, 3, 5, 6, 6};
        RemoveDuplicates r = new RemoveDuplicates();
        System.out.println(r.removeDuplicates(arr, arr.length));
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
