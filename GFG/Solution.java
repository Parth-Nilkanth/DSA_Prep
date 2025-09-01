// import java.util.HashMap;

// class Solution {
//     public int sumOfModes(int[] arr, int k) {
//         int n = arr.length;
//         int sum = 0;
        
//         for (int i = 0; i <= n - k; i++) {
//             HashMap<Integer, Integer> map = new HashMap<>();
//             // Count frequencies in window
//             for (int j = i; j < i + k; j++) {
//                 map.put(arr[j], map.getOrDefault(arr[j], 0) + 1);
//             }
            
//             // Find mode
//             int maxfreq = 0;
//             int element = Integer.MAX_VALUE; // to choose smallest in case of tie if needed
            
//             for (var entry : map.entrySet()) {
//                 int val = entry.getKey();
//                 int freq = entry.getValue();
//                 if (freq > maxfreq || (freq == maxfreq && val < element)) {
//                     maxfreq = freq;
//                     element = val;
//                 }
//             }
            
//             sum += element;
//         }
        
//         return sum;
//     }

//     public static void main(String[] args) {
//         int arr[] = {4, 2, 9, 9, 5};
//         int k = 4;
//         System.out.println(new Solution().sumOfModes(arr, k));
//     }
// }

class Solution 
{
    public static void main(String [] args)
    {
        
    }
}