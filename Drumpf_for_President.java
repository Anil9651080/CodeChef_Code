/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Drumpf_for_President {

    public static void main(String[] args) throws java.lang.Exception {
        try (Scanner s = new Scanner(System.in)) {
            int t = s.nextInt();
            while (t > 0) {
                int n = s.nextInt();
                int arr[] = new int[n + 1];
                int k = s.nextInt();
                int count = 0;
                for (int i = 1; i < n + 1; i++) {
                    int x = s.nextInt();
                    if (x == i)
                        arr[x] = -1;
                    else if (arr[x] == -1)
                        continue;
                    else
                        arr[x]++;
                }
                for (int i = 1; i <= n; i++)
                    if (arr[i] >= k)
                        count++;
                System.out.println(count);
                t--;
            }
        }
    }
}
