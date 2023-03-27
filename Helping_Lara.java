/* package codechef; // don't place package name! */

import java.util.*;
// import java.lang.*;
// import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Helping_Lara {
    public static void main(String[] args) throws java.lang.Exception {
        try (// your code goes here
                Scanner s = new Scanner(System.in)) {
            int t = s.nextInt();
            int i = 0;
            int index1 = 0;
            int index2 = 0;
            int min = Integer.MAX_VALUE;
            int max = 0;
            while (t-- > 0) {
                i++;
                int x1 = s.nextInt();
                int y1 = s.nextInt();
                int x2 = s.nextInt();
                int y2 = s.nextInt();
                int x3 = s.nextInt();
                int y3 = s.nextInt();

                int a = Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2;
                if (min >= a) {
                    min = a;
                    index1 = i;
                }
                if (max <= a) {
                    max = a;
                    index2 = i;
                }

            }
            System.out.println(index1 + " " + index2);
        }

    }
}