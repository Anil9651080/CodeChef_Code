/* package codechef; // don't place package name! */

import java.util.*;
// import java.lang.*;
// import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Equal_Element {
    public static void main(String[] args) throws java.lang.Exception {
        try (Scanner s = new Scanner(System.in)) {
            int t = s.nextInt();
            while (t > 0) {
                int n = s.nextInt();
                int[] arr = new int[n];
                HashMap<Integer, Integer> hm = new HashMap<>();
                for (int j = 0; j < n; j++) {
                    arr[j] = s.nextInt();
                    if (!hm.containsKey(arr[j])) {
                        hm.put(arr[j], 1);
                    } else {
                        hm.put(arr[j], hm.get(arr[j]) + 1);
                    }
                }
                int max = Integer.MIN_VALUE;
                for (int key : hm.keySet()) {
                    if (hm.get(key) > max) {
                        max = hm.get(key);
                    }
                }
                System.out.println(n - max);
                t--;
            }
        }
    }
}
