
public class LinearSearch {

    public static void main(String[] args) {

        int[] arr = {1, 22, 5, 4, 88, 33, 15, 45, 45, 12};
        int key = 45;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }

}
