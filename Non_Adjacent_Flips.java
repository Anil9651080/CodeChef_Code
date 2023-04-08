/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Non_Adjacent_Flips {
    public static int noOfFlips(int n, String str) {

        int count = 0;
        if (str.charAt(0) == '1') {
            count++;
        }
        for (int i = 1; i < n; i++) {
            if (str.charAt(i) == '1' && str.charAt(i - 1) == '1') {
                return 2;
            }
            if (str.charAt(i) == '1') {
                count++;
            }
        }
        if (count == 0) {
            return 0;
        }
        return 1;
    }

    public static void main(String[] args) throws java.lang.Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int T = sc.nextInt();

            while (T > 0) {

                int N = sc.nextInt();
                String str = sc.next();

                System.out.println(noOfFlips(N, str));
                T--;
            }
        }
    }
}