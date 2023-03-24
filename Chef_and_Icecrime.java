/* package codechef; // don't place package name! */

import java.util.*;
// import java.lang.*;
// import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Chef_and_Icecrime {
    public static void main(String[] args) throws java.lang.Exception {
        try (Scanner s = new Scanner(System.in)) {
            int t = s.nextInt();
            while (t > 0) {
                int n = s.nextInt();
                int arr[] = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = s.nextInt();
                }
                int five = 0;
                int ten = 0;
                int flag = 0;
                for (int i = 0; i < n; i++) {
                    if (arr[i] == 5) {
                        five++;
                    } else if (arr[i] == 10) {
                        if (five == 0) {
                            flag = 1;
                            break;
                        } else {
                            ten++;
                            five--;
                        }
                    } else if (arr[i] == 15) {
                        if (five < 2 && ten == 0) {
                            flag = 1;
                            break;
                        } else if (ten == 0) {
                            five -= 2;
                        } else if (ten > 0) {
                            ten -= 1;
                        }
                    }
                }
                if (flag == 0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
                t--;
            }
        }
    }
}
