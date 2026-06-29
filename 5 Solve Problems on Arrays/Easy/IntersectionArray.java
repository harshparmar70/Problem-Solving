
import java.util.ArrayList;

public class IntersectionArray {

    ArrayList<Integer> intersectionSortedArray(int arr1[], int arr2[], int n1, int n2) {

        ArrayList<Integer> intersection = new ArrayList<>();

        int i = 0, j = 0;

        while (i < n1 && j < n2) {

            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {

                // if (intersection.size() == 0 ||
                //     intersection.get(intersection.size() - 1) != arr1[i]) {
                intersection.add(arr1[i]);
                // }

                i++;
                j++;
            }
        }

        return intersection;
    }

    public static void main(String[] args) {

        IntersectionArray obj = new IntersectionArray();

        int[] arr1 = {1, 2, 2, 3, 4, 5, 6};
        int[] arr2 = {2, 2, 3, 5, 7};

        ArrayList<Integer> ans
                = obj.intersectionSortedArray(arr1, arr2, arr1.length, arr2.length);

        System.out.println(ans);
    }
}
