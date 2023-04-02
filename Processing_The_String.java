/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Processing_The_String {
    public static void main(String[] args) throws java.lang.Exception {
        try (Scanner s = new Scanner(System.in)) {
            int t = s.nextInt();
            while (t > 0) {
                String str = s.next();
                int sum = 0;
                for (int i = 0; i < str.length(); i++) {
                    char ch = str.charAt(i);
                    if (((int) ch >= 48) && ((int) ch <= 57))
                        sum += (ch - '0');
                }
                System.out.println(sum);
                t--;
            }
        }
    }
}
