/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Brackets {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int balance = 0;
            int max_balance = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(')
                    balance = balance + 1;
                if (s.charAt(i) == ')')
                    balance = balance - 1;
                max_balance = Math.max(max_balance, balance);
            }

            for (int i = 0; i < max_balance; i++) {
                System.out.print("(");
            }
            for (int i = 0; i < max_balance; i++) {
                System.out.print(")");
            }
            System.out.println();
        }
    }
}
