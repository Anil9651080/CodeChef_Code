/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Coins_and_trangle {
    public static void main(String[] args) throws java.lang.Exception {
        try (Scanner s = new Scanner(System.in)) {
            int t = s.nextInt();
            while (t > 0) {
                int n = s.nextInt();
                int i = 1;
                int count = 0;
                while (n >= 0) {
                    n -= i;
                    i++;
                    count++;
                }
                System.out.println(count - 1);
                t--;
            }
        }
    }
}
