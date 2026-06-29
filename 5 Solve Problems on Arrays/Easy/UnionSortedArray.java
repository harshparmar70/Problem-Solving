
public class UnionSortedArray {

    static int union(int arr1[], int arr2[], int n, int m) {

        int union[] = new int[n + m];

        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {

            if (arr1[i] <= arr2[j]) {

                if (k == 0 || union[k - 1] != arr1[i]) {
                    union[k++] = arr1[i];
                }
                i++;

            } else {

                if (k == 0 || union[k - 1] != arr2[j]) {
                    union[k++] = arr2[j];
                }
                j++;
            }
        }

        while (i < n) {
            if (k == 0 || union[k - 1] != arr1[i]) {
                union[k++] = arr1[i];
            }
            i++;
        }

        while (j < m) {
            if (k == 0 || union[k - 1] != arr2[j]) {
                union[k++] = arr2[j];
            }
            j++;
        }

        // Print Union
        for (int x = 0; x < k; x++) {
            System.out.print(union[x] + " ");
        }

        return k; // Number of unique elements
    }

    public static void main(String[] args) {

        int arr1[] = {1, 2, 2, 3, 4, 5};
        int arr2[] = {2, 3, 4, 4, 5, 6};

        union(arr1, arr2, arr1.length, arr2.length);
    }
}
