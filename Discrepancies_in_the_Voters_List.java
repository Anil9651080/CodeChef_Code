/* package codechef; // don't place package name! */

import java.util.*;
// import java.lang.*;
// import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Discrepancies_in_the_Voters_List {
    public static void main(String[] args) throws java.lang.Exception {
        ArrayList<Integer> h1 = new ArrayList<>();
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int arr1[] = new int[a + b + c];
            for (int i = 0; i < (a + b + c); i++) {
                arr1[i] = sc.nextInt();
            }
            Arrays.sort(arr1);
            int c1 = 1;
            for (int j = 0; j < (a + b + c) - 1; j++) {
                if (arr1[j] == arr1[j + 1]) {
                    c1++;
                } else {
                    if (c1 >= 2) {
                        h1.add(arr1[j]);
                        c1 = 1;
                    }
                }
            }
        }
        System.out.println(h1.size());
        for (int z = 0; z < h1.size(); z++) {
            System.out.println(h1.get(z));
        }

    }
}
