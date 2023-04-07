/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Final_Sum {
    public static void main(String[] args) throws java.lang.Exception {
        try (// your code goes
                Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int q = sc.nextInt();
                int a[] = new int[n];
                int tar = 0;
                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextInt();
                    tar += a[i];
                }
                int f[] = new int[q];
                int g[] = new int[q];
                for (int j = 0; j < q; j++) {
                    f[j] = sc.nextInt();
                    g[j] = sc.nextInt();
                }
                for (int k = 0; k < q; k++) {
                    int start = f[k];
                    int end = g[k];
                    int diff = end - start;
                    diff = diff + 1;
                    if (diff % 2 != 0) {
                        tar += 1;
                    }
                }
                System.out.println(tar);
            }
        }
    }
}