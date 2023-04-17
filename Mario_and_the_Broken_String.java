/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Mario_and_the_Broken_String {
    public static void main(String[] args) throws java.lang.Exception {
        try (Scanner s = new Scanner(System.in)) {
            int t = s.nextInt();
            while (t > 0) {
                int n = s.nextInt();
                String str = s.next();
                if (str.substring(0, n / 2).equals(str.substring(n / 2, n))) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
                t--;
            }
        }
    }
}
