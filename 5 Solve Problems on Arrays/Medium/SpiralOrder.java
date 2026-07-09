
import java.util.ArrayList;
import java.util.List;

public class SpiralOrder {

    public static List<Integer> spiralOrder(int[][] arr) {

        int top = 0;
        int bottom = arr.length - 1;
        int left = 0;
        int right = arr[0].length - 1;

        List<Integer> result = new ArrayList<>();

        while (top <= bottom && left <= right) {

            // Left -> Right
            for (int j = left; j <= right; j++) {
                result.add(arr[top][j]);
            }
            top++;

            // Top -> Bottom
            for (int i = top; i <= bottom; i++) {
                result.add(arr[i][right]);
            }
            right--;

            // Right -> Left
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    result.add(arr[bottom][j]);
                }
                bottom--;
            }

            // Bottom -> Top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(arr[i][left]);
                }
                left++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[][] arr = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        System.out.println(spiralOrder(arr));
    }
}
