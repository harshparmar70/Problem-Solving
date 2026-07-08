
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

    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] rotated = rotateClockwise(mat);
        int n = rotated.length;
        // Print the rotated matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(rotated[i][j] + " ");
            }
            System.out.println();
        }
    }
}
