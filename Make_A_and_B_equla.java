/* package codechef; // don't place package name! */

import java.util.*;
// import java.lang.*;
// import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Make_A_and_B_equla {
    public static void main(String[] args) throws java.lang.Exception {
        try (Scanner s = new Scanner(System.in)) {
            int t = s.nextInt();
            while (t > 0) {
                int n = s.nextInt();
                int[] arr1 = new int[n];
                int[] arr2 = new int[n];
                for (int i = 0; i < n; i++) {
                    arr1[i] = s.nextInt();
                }
                for (int i = 0; i < n; i++) {
                    arr2[i] = s.nextInt();
                }
                long c1 = 0, c2 = 0;
                for (int i = 0; i < n; i++) {
                    if (arr1[i] > arr2[i]) {
                        c1 += arr1[i] - arr2[i];
                    } else {
                        c2 += arr2[i] - arr1[i];
                    }
                }
                if (c1 == c2) {
                    System.out.println(c1);
                } else {
                    System.out.println("-1");
                }
                t--;
            }
        }
    }
}
