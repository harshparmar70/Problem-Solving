
public class MergeTwoArrays {

    public static void main(String[] args) {
        int arr1[] = {1, 2, 3};
        int arr2[] = {4, 5, 6};

        int merged[] = new int[arr1.length + arr2.length];

        // int index =0;  this is index of merged array
        for (int i = 0; i < arr1.length; i++) {
            merged[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            // int j = i + arr1.length; // 03 14 25
            merged[i + arr1.length] = arr2[i];
        }

        for (int num : merged) {
            System.out.print(num + " ");
        }
    }
}
