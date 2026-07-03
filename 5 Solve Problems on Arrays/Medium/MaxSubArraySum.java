
class MaxSubArraySum {

    static int maxSubArray(int arr[]) {
        int maxiSum = Integer.MIN_VALUE;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                maxiSum = Math.max(maxiSum, sum);
            }

        }
        return maxiSum;
    }

    static int maxSubArrayKadanes(int arr[]) {
        int maxi = Integer.MIN_VALUE;
        int sum = 0;
        int ansStr = -1, ansEnd = -1;
        int start = 0;
        for (int i = 0; i < arr.length; i++) {
            if (sum == 0) {
                start = i;
            }
            sum += arr[i];
            if (sum > maxi) {
                maxi = sum;
                ansStr = start;
                ansEnd = i;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        for (int i = ansStr; i <= ansEnd; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        return maxi;
    }

    public static void main(String[] args) {
        int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(arr));
        System.out.println(maxSubArrayKadanes(arr));

    }
}
