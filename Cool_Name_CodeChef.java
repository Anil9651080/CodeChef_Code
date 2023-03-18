import java.util.Arrays;
import java.util.Scanner;

/* package codechef; // don't place package name! */

// import java.util.*;
// import java.lang.*;
// import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Cool_Name_CodeChef {
    public static void main(String[] args) throws java.lang.Exception {
        try (Scanner s = new Scanner(System.in)) {
            int t = s.nextInt();
            while (t > 0) {

                String str = s.next();
                char[] arr = str.toCharArray();

                Arrays.sort(arr);

                int power = 0;

                for (int i = 0; i < arr.length; i++) {
                    power += ((i + 1) * Math.abs(96 - ((int) arr[i])));
                }

                System.out.println(power);
                t--;
            }
        }
    }
}
