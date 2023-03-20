/* package codechef; // don't place package name! */

import java.util.*;
// import java.lang.*;
// import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Car_Vans_Race {
    public static void main(String[] args) throws java.lang.Exception {
        try (Scanner s = new Scanner(System.in)) {
            int t = s.nextInt();
            while (t > 0) {
                int n = s.nextInt();
                int[] arr = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = s.nextInt();
                }
                int count = 1;
                for (int i = 0; i < n - 1; i++) {
                    if (arr[i + 1] > arr[i]) {
                        arr[i + 1] = arr[i];
                    } else {
                        count++;
                    }
                }
                System.out.println(count);
                t--;
            }
        }
    }
}
