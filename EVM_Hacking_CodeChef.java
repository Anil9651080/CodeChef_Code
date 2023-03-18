
/* package codechef; // don't place package name! */

import java.util.*;


/* Name of the class has to be "Main" only if the class is public. */
class EVM_Hacking_CodeChef {
    public static void main(String[] args) throws java.lang.Exception {
        try (Scanner s = new Scanner(System.in)) {
            int t = s.nextInt();
            while (t > 0) {
                int A = s.nextInt();
                int B = s.nextInt();
                int C = s.nextInt();
                int P = s.nextInt();
                int Q = s.nextInt();
                int R = s.nextInt();

                int X = (P + Q + R) / 2;
                if (P + B + C > X || Q + A + C > X || R + A + B > X || A + B + C > X) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
                t--;
            }
        }
    }
}
