
public class RotateImage90degree {

    static int[][] rotateClockwise(int arr[][]) {
        int n = arr.length;

        int rotate[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotate[j][n - i - 1] = arr[i][j];
            }
        }
        return rotate;

    }

    static void rotateClockwiseOpt(int arr[][]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int tmp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = tmp;
            }
        }

        //Reverse
        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = n - 1;
            while (left < right) {
                int tmp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = tmp;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] rotated = rotateClockwise(mat);
        int n = rotated.length;

        rotateClockwiseOpt(mat);
        // Print the rotated matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
