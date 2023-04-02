/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Chef_and_fruits {
	public static void main(String[] args) throws java.lang.Exception {
		try (Scanner s = new Scanner(System.in)) {
			int t = s.nextInt();
			while (t > 0) {
				int result = 0;
				int n = s.nextInt();
				int m = s.nextInt();
				int k = s.nextInt();
				if (n > m) {
					result = n - m;
				} else if (m > n) {
					result = m - n;
				}
				result = result - k;
				if (result >= 0)
					System.out.println(result);
				else
					System.out.println("0");
				t--;
			}
		}
	}
}