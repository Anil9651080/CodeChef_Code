/* package codechef; // don't place package name! */

import java.util.*;
// import java.lang.*;
// import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Arranging_Cup_cakes {
    public static void main(String[] args) throws java.lang.Exception {
        try (Scanner s = new Scanner(System.in)) {
            int t = s.nextInt();
            while (t > 0) {
                int n = s.nextInt();
                for (int i = (int) Math.sqrt(n); i > 0; i--) {
                    if (n % i == 0) {
                        System.out.println(n / i - i);
                        break;
                    }
                }
                t--;
            }
        }
    }
}
