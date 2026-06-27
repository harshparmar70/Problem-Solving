
import java.util.Scanner;

class Solution {

    int CharacterFC(String s, char ch) {
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                cnt++;
            }
        }
        return cnt;
    }

}

public class CharacterHashing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        //pre compute
        int hash[] = new int[26]; //256
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'a']++;
        }

        int q = sc.nextInt();
        while (q-- > 0) {
            char c = sc.next().charAt(0);
            //fetch
            System.out.println("ans : " + hash[c - 'a']);
        }
        // Solution s = new Solution();
        // System.out.println(s.CharacterFC("abcdbefc", 'b'));
    }
}
