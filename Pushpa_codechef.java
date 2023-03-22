/* package codechef; // don't place package name! */

import java.util.*;
// import java.lang.*;
// import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Pushpa_codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            if (n == 1) {
                System.out.println(arr[0]);
            } else {
                long count = 0;
                long sum = 0;
                for (int i = n - 1; i >= 1; i--) {
                    if (arr[i] == arr[i - 1]) {
                        count++;
                    } else {
                        if (sum < arr[i] + count) {
                            sum = arr[i] + count;
                        }
                        count = 0;
                    }
                }
                System.out.println(sum);
            }
        }
        sc.close();
    }
}
