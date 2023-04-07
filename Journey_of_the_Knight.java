/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Journey_of_the_Knight {
    public static void main(String[] args) throws java.lang.Exception {
        try (Scanner s = new Scanner(System.in)) {
            int t = s.nextInt();
            while (t > 0) {
                int x1 = s.nextInt();
                int y1 = s.nextInt();
                int x2 = s.nextInt();
                int y2 = s.nextInt();
                if (((x1 + y1) % 2) == ((x2 + y2) % 2)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
                t--;
            }
        }
    }
}
