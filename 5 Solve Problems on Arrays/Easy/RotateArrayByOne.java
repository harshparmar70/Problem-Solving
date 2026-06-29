
public class RotateArrayByOne {

    void rotateLeftArrayByOne(int arr[]) {

        int tmp = arr[0];

        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = tmp;
    }

    void rotateRightArrayByOne(int arr[]) {
        // 1 2 3 4 5 6
        // 6 1 2 3 4 5 
        int tmp = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = tmp;

    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.err.println("");
        RotateArrayByOne r = new RotateArrayByOne();
        // r.rotateLeftArrayByOne(arr);
        r.rotateRightArrayByOne(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
