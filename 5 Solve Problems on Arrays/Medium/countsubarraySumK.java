
public class countsubarraySumK {

    static int subarraySum(int arr[], int k) {

        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;

    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, -3, 1, 1, 1, 4, 2, -3};
        System.out.println(subarraySum(arr, 3));

    }
}
