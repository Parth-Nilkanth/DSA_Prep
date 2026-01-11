import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            boolean allOnes = true;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (a[i] == 0) allOnes = false;
            }
            if (allOnes) {
                System.out.println("Alice");
            } else {
                if (n % 2 == 0) {
                    System.out.println("Alice");
                } else {
                    System.out.println("Bob");
                }
            }
        }
    }
}