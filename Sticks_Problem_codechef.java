import java.util.Arrays;
import java.util.Scanner;

/* package codechef; // don't place package name! */

// import java.util.*;
// import java.lang.*;
// import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Sticks_Problem_codechef {
    public static void main(String[] args) throws java.lang.Exception {
        try (Scanner s = new Scanner(System.in)) {
            int t = s.nextInt();
            while (t > 0) {
                int n = s.nextInt();
                int[] arr = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = s.nextInt();
                }
                Arrays.sort(arr);
                int c = 0, res = 1;
                for (int i = n - 1; i >= 1; i--) {
                    if (arr[i] == arr[i - 1]) {
                        c++;
                        i--;
                        res = res * arr[i];
                    }
                    if (c == 2) {
                        break;
                    }
                }
                if (c == 2) {
                    System.out.println(res);
                } else {
                    System.out.println("-1");
                }
                t--;
            }
        }

    }
}
