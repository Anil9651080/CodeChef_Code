import java.util.Scanner;

/* package codechef; // don't place package name! */

// import java.util.*;
// import java.lang.*;
// import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Odd_Repeat {
    public static void main(String[] args) throws java.lang.Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int T = sc.nextInt();
            while (T > 0) {
                int N = sc.nextInt();
                int K = sc.nextInt();
                int S = sc.nextInt();

                System.out.println((S - (N * N)) / (K - 1));

                T--;
            }
        }
    }
}
