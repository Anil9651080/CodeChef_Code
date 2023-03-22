/* package codechef; // don't place package name! */

import java.util.*;
// import java.lang.*;
// import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Remove_Element {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t > 0) {
            int n = s.nextInt();
            long k = s.nextLong();

            long[] arr = new long[(int) n];
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextLong();
            }
            if (n == 1) {
                System.out.println("YES");
            } else {
                Arrays.sort(arr);
                if (arr[0] + arr[n - 1] <= k) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
            t--;
        }
        s.close();
    }
}
