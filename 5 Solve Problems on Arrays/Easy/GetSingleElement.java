
public class GetSingleElement {

    public static void main(String[] args) {
        int arr[] = {1, 1, 6, 2, 3, 4, 5, 2, 3, 4, 6};

        for (int i = 0; i < arr.length; i++) {
            int cnt = 0;
            int num = arr[i];
            for (int j = 0; j < arr.length; j++) {
                if (num == arr[j]) {
                    cnt++;
                }
            }
            if (cnt == 1) {
                System.out.println(num);
            }
        }
    }
}
