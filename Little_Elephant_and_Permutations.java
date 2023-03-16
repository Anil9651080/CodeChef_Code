import java.util.Scanner;

/* package codechef; // don't place package name! */

// import java.util.*;
// import java.lang.*;
// import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Little_Elephant_and_Permutations {
    public static void main(String[] args) throws java.lang.Exception {
        try (Scanner s = new Scanner(System.in)) {
            int t = s.nextInt();
            while (t > 0) {
                int n = s.nextInt();
                int[] arr = new int[n];
                int cnt = 0, sum = 0;
                for (int i = 0; i < n; i++) {
                    arr[i] = s.nextInt();
                }
                for (int i = 1; i < n; i++) {
                    if (arr[i] < arr[i - 1]) {
                        sum++;
                    }
                }
                for (int i = 0; i < n - 1; i++) {
                    for (int j = i + 1; j < n; j++) {
                        if (arr[i] > arr[j]) {
                            cnt++;
                        }
                    }
                }
                if (cnt == sum) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
                t--;
            }
        }

    }
}
