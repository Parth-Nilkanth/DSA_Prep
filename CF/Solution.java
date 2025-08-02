import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // size of array
        int d = sc.nextInt(); // required difference
        int l = sc.nextInt(); // maximum value per element

        int odd = (n + 1) / 2;
        int even = n / 2;

        int minVal = odd * 1 - even * l;
        int maxVal = odd * l - even * 1;

        if (d < minVal || d > maxVal) {
            System.out.println(-1);
            return;
        }

        int[] a = new int[n];
        // Start with minimal configuration: odds = 1, evens = l
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                a[i] = 1;
            else
                a[i] = l;
        }
        int curr = minVal;
        for (int i = 0; i < n && curr < d; i++) {
            if (i % 2 == 0) {
                int canAdd = Math.min(l - a[i], d - curr);
                a[i] += canAdd;
                curr += canAdd;
            } else {
                int canSub = Math.min(a[i] - 1, d - curr);
                a[i] -= canSub;
                curr += canSub;
            }
        }
        // Output array
        StringBuilder sb = new StringBuilder();
        for (int num : a) sb.append(num).append(" ");
        System.out.println(sb.toString().trim());
        sc.close();        
    }
}
