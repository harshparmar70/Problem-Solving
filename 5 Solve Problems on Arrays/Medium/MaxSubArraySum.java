
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

    public static void main(String[] args) {
        int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(arr));

    }
}
git add .
git commit -m"Array"
git push origin main
