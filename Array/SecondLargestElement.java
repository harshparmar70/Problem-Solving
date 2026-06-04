
public class SecondLargestElement {

    public static void main(String[] args) {
        int[] arr = {20, 25, 21, 22, 35, 15, 30};
        int largestEle = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (largestEle <= arr[i]) {
                largestEle = arr[i];
            }
        }
        int SecondLargEle = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != largestEle && arr[i] > SecondLargEle) {
                SecondLargEle = arr[i];
            }
        }
        System.out.println("Largest Element : " + largestEle);
        System.out.println("Largest Element : " + SecondLargEle);

    }
}
