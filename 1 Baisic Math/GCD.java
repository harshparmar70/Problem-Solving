
public class GCD {

    public static void main(String[] args) {
        int n1 = 18, n2 = 12;
        int GCD = 1;
        for (int i = 1; i <= Math.min(n1, n2); i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                GCD = i;
            }
        }
        System.out.println("GCD is : " + GCD);
    }
}
