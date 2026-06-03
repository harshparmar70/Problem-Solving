
public class SmallestElement {

    public static void main(String[] args) {
        int arr[] = {12, 54, 65, 12, 48, 3, 15, 3};

        int smallest = arr[0];
        for (int i : arr) {
            if (i < smallest) {
                smallest = i;
            }
        }
        System.out.println("Smallest Element : " + smallest);

    }
}
