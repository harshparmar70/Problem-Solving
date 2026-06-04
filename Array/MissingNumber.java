
public class MissingNumber {

    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 5, 6};

        int n = arr.length + 1;
        int expectedsum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int i : arr) {
            actualSum += i;
        }
        int missingNumber = expectedsum - actualSum;
        System.out.println("Missing Number: " + missingNumber);
    }
}
