/* package codechef; // don't place package name! */

import java.util.*;
// import java.lang.*;
// import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Divide_The_Cake {
    public static void main(String[] args) throws java.lang.Exception {
        try (// your code goes hereScann
                Scanner s = new Scanner(System.in)) {
            int t = s.nextInt();
            while (t > 0) {
                int a = s.nextInt();
                if (360 % a == 0) {
                    System.out.print("y" + " ");
                } else {
                    System.out.print("n" + " ");
                }
                if (a <= 360 && a != 0) {
                    System.out.print("y" + " ");
                } else {
                    System.out.print("n" + " ");
                }
                if (a <= 26) {
                    System.out.println("y" + " ");
                } else {
                    System.out.println("n");
                }
                t--;
            }
        }
    }
}