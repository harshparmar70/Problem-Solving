
public class FindCommonElements {

    public static void main(String[] args) {
        int arr1[] = {1, 2, 4, 55, 62, 41, 50};
        int arr2[] = {1, 5, 4, 62, 40, 2, 50, 20};

        System.out.print("Common Elements: ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    break;
                }
            }
        }
    }
}
