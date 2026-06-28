
public class LargestElement {

    int largestelement(int arr[], int n) {
        int LargestElement = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > LargestElement) {
                LargestElement = arr[i];
            }
        }
        return LargestElement;  
    }

    public static void main(String[] args) {
        int arr[] = {5, 11, 2, 50, 70, 60, 2, 4};
        LargestElement l = new LargestElement();

        System.err.println(l.largestelement(arr, arr.length));
    }
}
