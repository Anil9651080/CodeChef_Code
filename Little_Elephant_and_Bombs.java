/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Little_Elephant_and_Bombs {
    public static void main(String[] args) throws java.lang.Exception {
        try (Scanner s = new Scanner(System.in)) {
            int t = s.nextInt();
            while (t > 0) {
                int n = s.nextInt();
                String str = s.next();
                int count = 0;
                if (n == 1) {
                    if (str.charAt(0) == '0') {
                        count = 1;
                    }
                } else {
                    for (int i = 1; i < n - 1; i++) {
                        if (str.charAt(i) == '0' && str.charAt(i - 1) == '0' && str.charAt(i + 1) == '0') {
                            count++;
                        }
                    }
                    if (str.charAt(0) == '0' && str.charAt(1) == '0') {
                        count++;
                    }
                    if (str.charAt(n - 1) == '0' && str.charAt(n - 2) == '0') {
                        count++;
                    }
                }
                System.out.println(count);
                t--;
            }
        }
    }
}
