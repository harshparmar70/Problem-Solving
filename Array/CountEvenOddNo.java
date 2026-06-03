
public class CountEvenOddNo {

    public static void main(String[] args) {
        int arr[] = {22, 254, 13, 415, 352, 585, 23};
        int evenCount = 0, oddCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Even Numbers Count: " + evenCount);
        System.out.println("Odd Numbers Count: " + oddCount);
    }
}
