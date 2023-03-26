/* package codechef; // don't place package name! */

import java.util.*;
// import java.lang.*;
// import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Reversing_Directions {
    public static void main(String[] args) throws java.lang.Exception {
        try (Scanner s1 = new Scanner(System.in)) {
            int t = Integer.parseInt(s1.nextLine());
            while (t != 0) {
                int n = Integer.parseInt(s1.nextLine());
                String s[] = new String[n];
                for (int i = 0; i < n; i++) {
                    s[i] = s1.nextLine();
                }
                int i = n - 1;
                String dir = "";
                while (i >= 0) {
                    String str[] = s[i].split(" ");
                    if (dir.equals("")) {
                        System.out.print("Begin" + " ");
                    } else {
                        if (dir.equals("Left")) {
                            System.out.print("Right" + " ");
                        } else {
                            System.out.print("Left" + " ");
                        }
                    }
                    dir = str[0];
                    for (int j = 1; j < str.length; j++) {
                        System.out.print(str[j] + " ");
                    }
                    System.out.println();
                    i--;
                }
                t--;
            }
        }
    }
}