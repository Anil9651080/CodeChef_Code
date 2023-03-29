/* package codechef; // don't place package name! */

import java.util.*;
// import java.lang.*;
// import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Nahaane_Jaa {
    public static void main(String[] args) throws java.lang.Exception {
        try (Scanner s = new Scanner(System.in)) {
            int t = s.nextInt();
            while (t > 0) {
                int n = s.nextInt();
                long k = s.nextLong();
                long[] arr = new long[n];
                long count = 0;
                for (int i = 0; i < n; i++) {
                    arr[i] = s.nextLong();
                    if (arr[i] == k) {
                        count++;
                    }
                }
                if (count == 0 || (count == 1 && arr[n - 1] == k && n > 1)) {
                    System.out.println("No");
                } else {
                    System.out.println("Yes");
                }
                t--;
            }
        }
    }
}
