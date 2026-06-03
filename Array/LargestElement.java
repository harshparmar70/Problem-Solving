
class LargestElement {

    public static void main(String[] args) {
        int arr[] = {12, 13, 14, 5, 20, 11};
        System.out.print("Array : ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("Largest Element : " + largest);

    }
}
// Find Largest Element in Array
// Find Smallest Element in Array
// Sum of Array Elements
