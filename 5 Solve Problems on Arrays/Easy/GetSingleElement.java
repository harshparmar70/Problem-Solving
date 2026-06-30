
import java.util.HashMap;

public class GetSingleElement {

    static int getSingleElement(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int cnt = 0;
            int num = arr[i];
            for (int j = 0; j < arr.length; j++) {
                if (num == arr[j]) {
                    cnt++;
                }
            }
            if (cnt == 1) {
                return num;
            }
        }
        return -1;
    }

    static int getSingleElementHash(int arr[]) {

        int maxele = arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxele = Math.max(arr[i], maxele);
        }
        int hash[] = new int[maxele + 1];
        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]]++;
        }
        // for (int i = 0; i < hash.length; i++) {
        //     if (hash[i] == 1) {
        //         return i;
        //     }
        // }
        for (int i = 0; i < arr.length; i++) {
            if (hash[arr[i]] == 1) {
                return arr[i];
            }
        }
        return -1;
    }

    public static int getSingleElementMap(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            hashMap.put(arr[i], hashMap.getOrDefault(arr[i], 0) + 1);
        }
        for (int num : arr) {
            if (hashMap.get(num) == 1) {
                return num;
            }
        }
        return -1; // fallback
    }

    public static int getSingleElementXor(int arr[]) {
        int xor = 0;
        for (int i : arr) {
            xor = xor ^ i;
        }
        return xor;
    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 6, 2, 3, 2, 3};
        System.out.println(getSingleElement(arr));
        System.out.println(getSingleElementHash(arr));
        System.out.println(getSingleElementMap(arr));
        System.out.println(getSingleElementXor(arr));

    }
}
