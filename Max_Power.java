/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Max_Power {
    public static void main(String[] args) throws java.lang.Exception {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            String str = s.next();
            int count = 0;
            for (int i = n - 1; i > 0; i--) {
                if (str.charAt(i) == '0') {
                    count++;
                } else {
                    break;
                }
            }
            System.out.println(count);
        }
    }
}
