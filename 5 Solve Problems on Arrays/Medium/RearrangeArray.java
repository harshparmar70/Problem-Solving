
import java.util.ArrayList;

class RearrangeArray {

    static int[] rearrangeArray(int arr[]) {
        int n = arr.length;

        int ans[] = new int[n];
        int pos = 0, neg = 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                ans[pos] = arr[i];
                pos += 2;
            } else {
                ans[neg] = arr[i];
                neg += 2;
            }
        }
        return ans;
    }

    static void varieties2(int arr[]) {
        int n = arr.length;
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                pos.add(arr[i]);
            } else {
                neg.add(arr[i]);
            }
        }

        if (pos.size() > neg.size()) {
            for (int i = 0; i < neg.size(); i++) {
                arr[i * 2] = pos.get(i);
                arr[i * 2 + 1] = neg.get(i);
            }
            int index = neg.size() * 2;
            for (int i = neg.size(); i < pos.size(); i++) {
                arr[index] = pos.get(i);
                index++;
            }
        } else {
            for (int i = 0; i < pos.size(); i++) {
                arr[i * 2] = pos.get(i);
                arr[i * 2 + 1] = neg.get(i);
            }
            int index = pos.size() * 2;
            for (int i = pos.size(); i < neg.size(); i++) {
                arr[index] = neg.get(i);
                index++;
            }
        }

    }

    public static void main(String[] args) {
        int[] A = {1, 2, -4, -5, 5, 9};
        // int result[] = rearrangeArray(A);
        varieties2(A);

        for (int num : A) {
            System.out.print(num + " ");
        }
    }
}
