
class Solution {

    public void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }

    public void pattern4(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public void pattern5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void pattern6(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }

    public void pattern7(int n) {
        for (int i = 0; i < n; i++) { //1 to 4
            for (int j = 1; j <= n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 + 1; j++) {
                System.out.print("*");
            }

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }

    public void pattern8(int n) {
        for (int i = 0; i < n; i++) { //1 to 4

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }

    public void pattern9(int n) {
        pattern7(n);
        pattern8(n);

    }

    public void pattern10(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = i;
            if (i > n) {
                stars = 2 * n - i;
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public void pattern11(int n) {

        for (int i = 1; i <= n; i++) {
            int start = i % 2 == 0 ? 0 : 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println("");
        }
    }

    public void pattern12(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = 1; j <= 2 * n - 2 * i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }

    public void pattern13(int n) {

        int num = 1;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                num++;
            }
            System.out.println("");
        }
    }

    public void pattern14(int n) {
        for (int i = 0; i < n; i++) {
            for (char j = 'A'; j <= 'A' + i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }

    public void pattern15(int n) {
        for (int i = 0; i < n; i++) {
            for (char j = 'A'; j <= 'A' + n - i - 1; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }

    public void pattern16(int n) {
        for (int i = 0; i < n; i++) {
            char ch = (char) ('A' + i);
            for (char j = 'A'; j <= 'A' + i; j++) {

                System.out.print(ch);
            }
            System.out.println("");
        }
    }

    public void pattern17(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            char ch = 'A';
            int brackpoint = (2 * i + 1) / 2;
            for (int j = 1; j <= 2 * i + 1; j++) {
                System.err.print(ch);
                if (j <= brackpoint) {
                    ch++;
                } else {
                    ch--;
                }
            }
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("");
        }
    }

    public void pattern18(int n) {
        for (int i = 0; i < n; i++) {
            for (char ch = (char) ('E' - i); ch <= 'E'; ch++) {
                System.out.print(ch);
            }
            System.out.print("\n");
        }

    }

    public void pattern19(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }

            System.out.println("");
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public void pattern20(int n) {

        int spaces = 2 * n - 2;

        for (int i = 1; i <= 2 * n - 1; i++) {

            int stars = (i <= n) ? i : (2 * n - i);

            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            System.out.println();

            if (i < n) {
                spaces -= 2;
            } else {
                spaces += 2;
            }
        }

        /*for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            for(int j = 1; j<=2*i;j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }*/
    }

    public void pattern21(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 | i == n | j == 1 | j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.err.println();
        }
    }

    public void pattern22(int n) {
        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                int top = i;
                int left = j;
                int right = 2 * n - 2 - j;
                int bottem = 2 * n - 2 - i;
                System.out.print(n-(Math.min(Math.min(top,left),Math.min(bottem,right))));

            }
            System.out.println(" ");
        }
    }
}

public class Pattern {

    public static void main(String[] args) {

        Solution solution = new Solution();
        solution.pattern22(4);

    }
}
