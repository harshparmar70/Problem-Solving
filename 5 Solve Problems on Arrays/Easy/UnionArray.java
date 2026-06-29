
import java.util.ArrayList;
import java.util.TreeSet;

public class UnionArray {

    // Function to find union of two arrays using TreeSet
    public static ArrayList<Integer> findUnion(int[] arr1, int[] arr2) {

        // TreeSet stores unique elements in sorted order
        TreeSet<Integer> set = new TreeSet<>();

        // Insert elements from first array
        for (int num : arr1) {
            set.add(num);
        }

        // Insert elements from second array
        for (int num : arr2) {
            set.add(num);
        }

        // Convert TreeSet to ArrayList
        return new ArrayList<>(set);
    }

    ArrayList<Integer> UnionSortedArray(int arr1[], int arr2[], int n1, int n2) {

        ArrayList<Integer> union = new ArrayList<>();

        int i = 0, j = 0;

        while (i < n1 && j < n2) {

            if (arr1[i] <= arr2[j]) {

                if (union.size() == 0 || union.get(union.size() - 1) != arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;

            } else {

                if (union.size() == 0 || union.get(union.size() - 1) != arr2[j]) {
                    union.add(arr2[j]);
                }
                j++;
            }
        }

        while (i < n1) {
            if (union.size() == 0 || union.get(union.size() - 1) != arr1[i]) {
                union.add(arr1[i]);
            }
            i++;
        }

        while (j < n2) {
            if (union.size() == 0 || union.get(union.size() - 1) != arr2[j]) {
                union.add(arr2[j]);
            }
            j++;
        }

        return union;
    }

    public static void main(String[] args) {

        UnionArray obj = new UnionArray();

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {2, 3, 4, 4, 5, 11, 12, 60};

        ArrayList<Integer> ans = obj.UnionSortedArray(arr1, arr2, arr1.length, arr2.length);
        ArrayList<Integer> result = findUnion(arr1, arr2);
        System.out.println("Union of arr1 and arr2 is:");
        System.out.println(ans);
        System.out.println(result);
    }
}
