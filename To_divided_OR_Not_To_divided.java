/* package codechef; // don't place package name! */

import java.util.*;
// import java.lang.*;
// import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class To_divided_OR_Not_To_divided {
    public static void main(String[] args) throws java.lang.Exception {
        try (Scanner s = new Scanner(System.in)) {
            int t = s.nextInt();
            while (t > 0) {
                int a = s.nextInt();
                int b = s.nextInt();
                int n = s.nextInt();
                int ans = n - n % a;
                if (a % b == 0) {
                    System.out.println("-1");
                } else {
                    if (n % a != 0) {
                        ans += a;
                    }
                    if (ans % b == 0) {
                        ans += a;
                    }
                    System.out.println(ans);
                }
                t--;
            }
        }
    }
}
