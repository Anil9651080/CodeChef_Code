/* package codechef; // don't place package name! */

import java.util.*;
// import java.lang.*;
// import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Copy_Paste {
    public static void main(String[] args) throws java.lang.Exception {
        try (Scanner s = new Scanner(System.in)) {
            int t = s.nextInt();
            while (t > 0) {
                int n = s.nextInt();
                int arr[] = new int[n];
                HashSet<Integer> set = new HashSet<>();
                for (int i = 0; i < n; i++) {
                    arr[i] = s.nextInt();
                    set.add(arr[i]);
                }
                System.out.println(set.size());
                t--;
            }
        }
    }
}
