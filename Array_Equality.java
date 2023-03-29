/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Array_Equality {
    public static void main(String[] args) throws java.lang.Exception {
        try (// your code goes here
                Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int len = sc.nextInt();
                HashMap<Integer, Integer> map = new HashMap<>();

                for (int i = 0; i < len; i++) {
                    int key = sc.nextInt();
                    if (map.containsKey(key))
                        map.put(key, map.get(key) + 1);
                    else
                        map.put(key, 1);
                }
                int max = 1;
                for (int i : map.values()) {
                    if (max < i)
                        max = i;
                }

                if (max <= (len - max) + 1) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }

    }
}