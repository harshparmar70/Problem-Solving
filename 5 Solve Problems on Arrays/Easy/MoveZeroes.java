
public class MoveZeroes {

    public int[] moveZeroes(int[] arr) {
        // Create temp array
        int[] temp = new int[arr.length];
        // Pointer for temp
        int index = 0;
        // Traverse input array
        for (int i = 0; i < arr.length; i++) {
            // If non-zero, copy to temp
            if (arr[i] != 0) {
                temp[index] = arr[i];
                index++;
            }
        }
        // Copy temp back to original
        for (int i = 0; i < temp.length; i++) {
            arr[i] = temp[i];
        }
        for (int i = index; i < arr.length; i++) {
            arr[i] = 0;
        }
        // Return updated array
        return arr;
    }

    void moveZeroesOptimal(int arr[], int n) {
        int index = 0; // no zero 

        // Move non-zero elements to the front
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;

            }
        }
        // Fill remaining positions with 0
        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }

    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("");
        MoveZeroes m = new MoveZeroes();
        // m.moveZeroes(arr);
        m.moveZeroesOptimal(arr, arr.length);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
