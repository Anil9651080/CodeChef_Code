/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Chef_and_Card_Game {
    public static void main(String[] args) throws java.lang.Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {

                int n = sc.nextInt();
                int[] a = new int[n];
                int[] b = new int[n];
                for (int j = 0; j < n; j++) {
                    a[j] = sc.nextInt();
                    b[j] = sc.nextInt();
                }
                int A = 0;
                int B = 0;
                for (int j = 0; j < n; j++) {
                    int sum_A = 0;
                    int sum_B = 0;
                    while (a[j] > 0) {
                        sum_A = sum_A + a[j] % 10;
                        a[j] = a[j] / 10;
                    }
                    while (b[j] > 0) {
                        sum_B = sum_B + b[j] % 10;
                        b[j] = b[j] / 10;
                    }
                    if (sum_B > sum_A) {
                        B++;
                    } else if (sum_A > sum_B) {
                        A++;
                    } else {
                        A++;
                        B++;
                    }
                }
                if (A > B) {
                    System.out.println(0 + " " + A);

                } else if (B > A) {
                    System.out.println(1 + " " + B);
                } else {
                    System.out.println(2 + " " + A);
                }
            }
        }
    }
}