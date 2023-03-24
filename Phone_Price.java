/* package codechef; // don't place package name! */

import java.util.*;
// import java.lang.*;
// import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Phone_Price {
	public static void main(String[] args) throws java.lang.Exception {
		try (Scanner sc = new Scanner(System.in)) {
			int t = sc.nextInt();
			while (t-- > 0) {
				int n = sc.nextInt();
				int a[] = new int[n];
				for (int i = 0; i < n; i++) {
					a[i] = sc.nextInt();
				}
				int count = 1;
				int min = a[0];
				for (int i = 1; i < 5; i++) {
					if (a[i] < min) {
						count++;
						min = a[i];
					}
				}
				for (int i = 5; i < n; i++) {
					if (a[i] < a[i - 1] && a[i] < a[i - 2] && a[i] < a[i - 3] && a[i] < a[i - 4] && a[i] < a[i - 5]) {
						count++;
					}
				}
				System.out.println(count);
			}
		}
	}
}