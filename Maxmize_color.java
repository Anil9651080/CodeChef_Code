/* package codechef; // don't place package name! */

import java.util.*;
// import java.lang.*;
// import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Maxmize_color {
    public static void main(String[] args) throws java.lang.Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int arr[] = new int[3];
                int count = 0;
                for (int i = 0; i < 3; i++) {
                    arr[i] = sc.nextInt();
                    if (arr[i] > 0) {
                        arr[i]--;
                        count++;
                    }
                }
                Arrays.sort(arr);
                if (arr[0] >= 2)
                    System.out.println((count + 3));
                else if (arr[0] == 1 && arr[1] == 1 && arr[2] == 1)
                    System.out.println((count + 1));
                else if (arr[0] == 0 && arr[1] >= 1 && arr[2] >= 1)
                    System.out.println((count + 1));
                else if (arr[0] == 0 && arr[1] == 0)
                    System.out.println(count);
                else
                    System.out.println((count + 2));
            }
        }
    }
}
