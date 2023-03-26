/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Equailty {
    public static void main(String[] args) throws java.lang.Exception {
        try (// your code goes here
                Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();

                long a[] = new long[n];

                for (int i = 0; i < n; i++)
                    a[i] = sc.nextLong();

                if (n == 2) {

                    System.out.println(a[1] + " " + a[0]);

                } else {

                    long sum = 0;

                    for (int i = 1; i < n - 1; i++) {
                        sum += (a[0] - a[i]);
                    }

                    sum = a[n - 1] - sum;
                    sum /= (n - 1);

                    System.out.print(sum + " ");

                    for (int i = 1; i < n; i++) {

                        System.out.print((a[0] - a[i] + sum) + " ");

                    }
                    System.out.println();
                }

            }
        }
    }
}