import java.util.*;

public class Pet_Store {
    public static void main(String[] args) {

        try (Scanner s = new Scanner(System.in)) {
            int t = s.nextInt();

            while (t > 0) {
                int n = s.nextInt();
                int[] arr = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = s.nextInt();
                }
                Arrays.sort(arr);
                int[] counts = new int[101];
                for (int i = 0; i < n; i++) {
                    counts[arr[i]]++;
                }
                boolean possible = true;
                for (int i = 0; i <= 100; i++) {
                    if (counts[i] % 2 == 1) {
                        possible = false;
                        break;
                    }
                }
                if (possible) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
                t--;
            }
        }
    }
}