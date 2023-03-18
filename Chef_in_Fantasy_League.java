/* package codechef; // don't place package name! */

import java.util.*;
// import java.lang.*;
// import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Chef_in_Fantasy_League {
    public static void main(String[] args) throws java.lang.Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int s = sc.nextInt();
                int[] p = new int[n];
                int[] x = new int[n];
                for (int i = 0; i < n; i++)
                    p[i] = sc.nextInt();
                for (int i = 0; i < n; i++)
                    x[i] = sc.nextInt();
                int mind = 101, minf = 101;
                for (int i = 0; i < n; i++) {
                    if (x[i] == 0) {
                        if (p[i] < mind)
                            mind = p[i];
                    } else if (x[i] == 1) {
                        if (p[i] < minf)
                            minf = p[i];
                    }
                }
                if (s + minf + mind <= 100) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
            }
        }
    }
}
