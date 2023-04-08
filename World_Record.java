/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class World_Record {
    public static void main(String[] args) throws java.lang.Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t > 0) {
                float k1 = sc.nextFloat();
                float k2 = sc.nextFloat();
                float k3 = sc.nextFloat();
                float v = sc.nextFloat();
                double speed = k1 * k2 * k3 * v;
                double time = 100 / speed;
                double a = Math.round(time * 100) / 100.0;
                if (a < 9.58) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
                t--;
            }
        }
    }
}