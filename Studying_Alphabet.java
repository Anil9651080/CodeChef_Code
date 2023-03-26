
/* package codechef; // don't place package name! */

import java.util.*;
// import java.lang.*;
// import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Studying_Alphabet {
    public static void main(String[] args) throws java.lang.Exception {
        try (Scanner s = new Scanner(System.in)) {
            String str = s.next();
            int t = s.nextInt();
            while (t > 0) {
                String n = s.next();
                boolean f = true;
                for (int i = 0; i < n.length(); i++) {
                    String p = String.valueOf(n.charAt(i));
                    if (!str.contains(p)) {
                        f = false;
                        break;
                    }
                }
                if (f == true) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
                t--;
            }
        }
    }
}
