/* package codechef; // don't place package name! */

import java.util.*;
// import java.lang.*;
// import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Chef_And_Salary_Pay {
    public static void main(String[] args) throws java.lang.Exception {
        try (Scanner s = new Scanner(System.in)) {
            int t = s.nextInt();
            while (t > 0) {
                int x = s.nextInt();
                int y = s.nextInt();
                String str = s.next();
                int count = 0;
                int pay = 0;
                int bonus = 0;
                for (int i = 0; i < 30; i++) {
                    if (str.charAt(i) == '1') {
                        pay++;
                        count++;
                        bonus = Math.max(count, bonus);
                    } else {
                        count = 0;
                    }
                }
                System.out.println(pay * x + bonus * y);
                t--;
            }
        }
    }
}
