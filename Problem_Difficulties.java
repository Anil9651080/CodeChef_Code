/* package codechef; // don't place package name! */

import java.util.*;
// import java.lang.*;
// import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Problem_Difficulties {
    public static void main(String[] args) throws java.lang.Exception {
        try (Scanner s = new Scanner(System.in)) {
            int t = s.nextInt();
            while (t > 0) {
                int[] arr = new int[4];
                for (int i = 0; i < 4; i++) {
                    arr[i] = s.nextInt();
                }
                Arrays.sort(arr);
                if (arr[1] != arr[2] || (arr[1] == arr[2] && arr[2] != arr[3] && arr[0] != arr[1])) {
                    System.out.println(2);
                } else if (arr[0] == arr[3]) {
                    System.out.println(0);
                } else {
                    System.out.println(1);
                }
                t--;
            }
        }
    }
}
