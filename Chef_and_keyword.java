/* package codechef; // don't place package name! */

import java.util.*;
// import java.lang.*;
// import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Chef_and_keyword {
    public static void main(String[] args) throws java.lang.Exception {
        try (Scanner s = new Scanner(System.in)) {
            int t = s.nextInt();
            while (t > 0) {
                int n = s.nextInt();
                int m = s.nextInt();
                int c = s.nextInt();

                int count = 0;
                for (int i = 1; i <= n; i++) {
                    if (c % i == 0) {
                        int j = c / i;
                        if (j <= m) {
                            count++;
                        }
                    }
                }

                System.out.println(count);
                t--;
            }
        }

    }
}
