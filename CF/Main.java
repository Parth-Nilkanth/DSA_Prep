// import java.util.*;
// import java.io.*;

// public class Main {
//     static int[] tree;
//     static int[] a;
//     static int n;

//     static void build(int node, int start, int end) {
//         if (start == end) {
//             tree[node] = a[start];
//             return;
//         }
//         int mid = (start + end) / 2;
//         build(2 * node, start, mid);
//         build(2 * node + 1, mid + 1, end);
//         tree[node] = Math.min(tree[2 * node], tree[2 * node + 1]);
//     }

//     static void update(int node, int start, int end, int idx, int val) {
//         if (start == end) {
//             a[idx] = val;
//             tree[node] = val;
//             return;
//         }
//         int mid = (start + end) / 2;
//         if (idx <= mid) update(2 * node, start, mid, idx, val);
//         else update(2 * node + 1, mid + 1, end, idx, val);
//         tree[node] = Math.min(tree[2 * node], tree[2 * node + 1]);
//     }

//     static int queryMin(int node, int start, int end, int l, int r) {
//         if (r < start || end < l) return Integer.MAX_VALUE;
//         if (l <= start && end <= r) return tree[node];
//         int mid = (start + end) / 2;
//         return Math.min(queryMin(2 * node, start, mid, l, r), 
//                         queryMin(2 * node + 1, mid + 1, end, l, r));
//     }

//     public static void main(String[] args) throws IOException{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         int t = Integer.parseInt(br.readLine());
//         while (t-- > 0) {
//             String[] nq = br.readLine().split(" ");
//             n = Integer.parseInt(nq[0]);
//             int q = Integer.parseInt(nq[1]);
//             a = new int[n + 1];
//             String[] arr = br.readLine().split(" ");
//             for (int i = 1; i <= n; i++) a[i] = Integer.parseInt(arr[i - 1]);

//             tree = new int[4 * n + 1];
//             build(1, 1, n);

//             StringBuilder out = new StringBuilder();
//             while (q-- > 0) {
//                 String[] op = br.readLine().split(" ");
//                 if (op[0].equals("1")) {
//                     update(1, 1, n, Integer.parseInt(op[1]), Integer.parseInt(op[2]));
//                 } else {
//                     int l = Integer.parseInt(op[1]);
//                     int r = Integer.parseInt(op[2]);
                    
//                     int low = 0, high = r - l, found = 0;
//                     while (low <= high) {
//                         int mid = low + (high - low) / 2;
//                         int minVal = queryMin(1, 1, n, l, l + mid);
//                         if (minVal == mid) {
//                             found = 1;
//                             break;
//                         } else if (minVal < mid) {
//                             high = mid - 1;
//                         } else {
//                             low = mid + 1;
//                         }
//                     }
//                     out.append(found).append("\n");
//                 }
//             }
//             System.out.print(out);
//         }
//     }
// }