
public class ShortedOrNot {

    boolean isShorted(int arr[], int n) {
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ShortedOrNot s = new ShortedOrNot();
        int arr[] = {1, 2, 3, 1, 5, 6, 6};
        boolean ans = s.isShorted(arr, arr.length);
        if (ans == true) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
