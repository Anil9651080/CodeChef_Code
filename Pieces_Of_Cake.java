/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Pieces_Of_Cake {
    public static void main(String[] args) throws java.lang.Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                String str = sc.next();
                HashMap<Character, Integer> hm = new HashMap<>();
                for (int j = 0; j < str.length(); j++) {
                    if (!hm.containsKey(str.charAt(j))) {
                        hm.put(str.charAt(j), 1);
                    } else {
                        hm.put(str.charAt(j), hm.get(str.charAt(j)) + 1);
                    }
                }
                int max = Integer.MIN_VALUE;
                for (char key : hm.keySet()) {
                    if (hm.get(key) > max) {
                        max = hm.get(key);
                    }
                }
                if (str.length() - max == max) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }

            }
        }
    }
}