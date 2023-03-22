/* package codechef; // don't place package name! */

import java.util.*;
// import java.lang.*;
// import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Sort_the_String {
    public static void main(String[] args) throws java.lang.Exception {
        try (Scanner s = new Scanner(System.in)) {
            int t = s.nextInt();
            while (t > 0) {
                int N = s.nextInt();
                String str = s.next();
                int count = 0;
                for (int i = 0; i < N - 1; i++) {
                    if (str.substring(i, i + 2).equals("10")) {
                        count++;
                        i++;
                    }
                }
                System.out.println(count);
                t--;
            }
        }
    }
}