/* package codechef; // don't place package name! */

import java.io.BufferedReader;
import java.io.InputStreamReader;
// import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Max_Binary {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t > 0) {
            String[] tokens = br.readLine().split(" ");
            int x = Integer.parseInt(tokens[0]);
            int y = Integer.parseInt(tokens[1]);
            String str = br.readLine();
            StringBuilder sb = new StringBuilder(str);
            if (sb.charAt(0) == '0') {
                y--;
                sb.setCharAt(0, '1');
            }
            while (y-- > 0) {
                sb.append('0');
            }
            System.out.println(sb.toString());
            t--;
        }
    }
}