/* package codechef; // don't place package name! */

import java.util.*;
// import java.lang.*;
// import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Chef_and_Feedback {
    public static void main(String[] args) throws java.lang.Exception {
        try (Scanner s = new Scanner(System.in)) {
            int t = s.nextInt();
            while (t > 0) {
                String str = s.next();
                if ((str.indexOf("010") == -1 && (str.indexOf("101") == -1))) {
                    System.out.println("Bad");
                } else {
                    System.out.println("Good");
                }
                t--;
            }
        }
    }
}
