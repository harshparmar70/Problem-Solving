
import java.util.HashMap;

class MajorityElement {

    static int majorityElementbrut(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    cnt++;
                }
            }
            if (cnt > n / 2) {
                return arr[i];
            }
        }
        return -1;
    }

    static int majorityElementbetter(int arr[], int n) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int key : map.keySet()) {
            if (map.get(key) > n / 2) {
                return key;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int arr[] = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElementbrut(arr, arr.length));
        System.out.println(majorityElementbetter(arr, arr.length));
    }
}
z