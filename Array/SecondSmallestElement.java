
public class SecondSmallestElement {

    public static void main(String[] args) {
        int arr[] = {22, 15, 15, 15, 25, 35, 28};

        int secondSmallestElement = Integer.MAX_VALUE;
        int smallestElement = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < smallestElement) {
                secondSmallestElement = smallestElement;
                smallestElement = arr[i];

            } else if (arr[i] < secondSmallestElement
                    && arr[i] != smallestElement) {

                secondSmallestElement = arr[i];
            }
        }

        System.out.println("Second smallest element : "
                + secondSmallestElement);
    }
}
