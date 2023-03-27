/* package codechef; // don't place package name! */

import java.util.*;
// import java.lang.*;
// import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Recruit_Villagers {
    public static void main(String[] args) throws java.lang.Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            int m = sc.nextInt();
            int c = sc.nextInt();
            int max1 = 0, max2 = 0;
            while (t > 0) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                int p = sc.nextInt();
                if (y == (m * x + c))
                    continue;
                else if (y > (m * x + c)) {
                    max1 += p;
                } else {
                    max2 += p;
                }
                t--;
            }
            System.out.println(Math.max(max1, max2));
        }
    }
}