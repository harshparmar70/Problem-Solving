
public class CopyArray {

    public static void main(String[] args) {
        int arr[] = {20, 30, 11, 40, 50, 60};
        int copyArray[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            copyArray[i] = arr[i];
        }
        System.out.print("Copied Array : ");
        for (int i : copyArray) {
            System.out.print(i + " ");
        }
    }
}
