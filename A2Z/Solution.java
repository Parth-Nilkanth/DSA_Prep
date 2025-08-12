
import java.io.BufferedReader;
import java.io.InputStreamReader;

// import java.util.HashMap;
// class LRUCache {    
//     HashMap<Integer,Integer> cache;
//     public LRUCache(int capacity) {
//         cache = new HashMap<>(capacity);
//     }
    
//     public int get(int key) {
//         if(!cache.containsKey(key))
//             return -1;
//         else 
//             return cache.get(key);

//     }
    
//     public void put(int key, int value) {
        
//     }
// }

// class Solution
// {
//     public static void main(String args[])
//     {
//             LRUCache cache = new LRUCache(2);
//     }
// }


// ----------------------------------------- Sliding window---------------------------------------------------//

// Q fruits into basket
// // brute force solution , Time Complexity :O N^2
// import java.util.Set;
// import java.util.HashSet;
// class Solution
// {
//     public int maxFruits(int fruits[])
//     {
//         int n = fruits.length;
//         int maxlen = 0;

//         for(int i = 0 ; i < n ; i++)
//         {
//             Set<Integer> set = new HashSet<>();
//             for(int j = i ; j < n ; j++)
//             {
//                 set.add(fruits[j]);
//                 if(set.size() <= 2)
//                 {
//                      maxlen = Math.max(maxlen , j - i + 1);
//                 }
//                 else
//                     break;
//             }
//         }
//         return maxlen;
//     }
    
//     public static void main(String[] args) {
//         int fruits[] = {3 , 3, 3 , 1 , 2 , 1 ,1  , 2 , 3 , 3, 4};
//         System.out.println(new Solution().maxFruits(fruits));
//     }
// }

// better solution time complrxity O (2N)
// import java.util.HashMap;
// class Solution{
//         public int maxFruits(int fruits[])
//     {
//         int n = fruits.length;
//         int maxlen = 0;
//         HashMap<Integer , Integer> map = new HashMap<>();
//         int right = 0 , left = 0;
//         while(right < n)
//         {
//             map.put(fruits[right] , map.getOrDefault(fruits[right], 0)+1);

//             while(map.size() > 2 )
//             {
//                     map.put(fruits[left] , map.get(fruits[left]) - 1);
//                     if(map.get(fruits[left]) == 0)
//                         map.remove(fruits[left]);;
//                     left++;
//             }
            
//             if(map.size() <=2)
//             {
//                 maxlen = Math.max(maxlen , right - left + 1);
//             }

//             right ++;
//         }
//         return maxlen;
//     }
//     public static void main(String args[])
//     {
//             Solution s = new Solution();
//             int fruits[] = { 3 , 3 , 3 , 1 , 2 , 1 , 1 , 2 , 3 , 3 , 4};
//             System.out.println(s.maxFruits(fruits));
//     }
// }

// optimal Solution O (n )
// import java.util.HashMap;
// class Solution 
// {
//        public int maxFruits(int fruits[])
//     {
//         int n = fruits.length;
//         int maxlen = 0;
//         HashMap<Integer , Integer> map = new HashMap<>();
//         int right = 0 , left = 0;
//         while(right < n)
//         {
//             map.put(fruits[right] , map.getOrDefault(fruits[right], 0)+1);

//             if(map.size() > 2 )
//             {
//                     map.put(fruits[left] , map.get(fruits[left]) - 1);
//                     if(map.get(fruits[left]) == 0)
//                         map.remove(fruits[left]);;
//                     left++;
//             }
            
//             if(map.size() <=2)
//             {
//                 maxlen = Math.max(maxlen , right - left + 1);
//             }

//             right ++;
//         }
//         return maxlen;
//     }
//     public static void main(String args[])
//     {
//             int fruits[] =  { 3 , 3 , 3 , 1 , 2 , 1 , 1 , 2 , 3 , 3 , 4};
//             System.out.println(new Solution().maxFruits(null));
//     }
// }


// longest substring with at most k characters
// // brute force 
// import java.util.HashMap;

// class Solution 
// {

//     public int longString(String s , int k)
//     {
//         int maxlen = 0;
//         HashMap<Character , Integer > map = new HashMap<>();
//         int n = s.length();
//         for(int i = 0 ; i < n ; i++)
//         {
//             map.clear();
//             for(int j = i ; j < n ; j++)
//             {
//                 map.put(s.charAt(j) , map.getOrDefault(s.charAt(j), 0) +1);
//                 if(map.size()<=k)
//                      maxlen = Math.max(j-i+1 , maxlen);
//                 else 
//                     break;

//             }
//         }
//         return maxlen;
//     }
//     public static void main(String[] args) {
//         String s = "hello";
//         System.out.println(new Solution().longSubstring(s,3));
//     }
// }

// optimal code

// import java.util.HashMap;

// class Solution 
// {

//     public int longSubstring(String s , int k)
//     {
//         int maxlen = 0;
//         HashMap<Character , Integer > map = new HashMap<>();
//         int n = s.length();
//         int r = 0 , l =0;
//         while(r  < n )
//         { 
//             map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0)+1);

//             if(map.size() > k)
//             {
//                 map.put(s.charAt(l) , map.get(s.charAt(l)) -1);
//                 if(map.get(s.charAt(l)) == 0)
//                     map.remove(s.charAt(l));
//                 l++;
//             }
//             if(map.size()<=k)
//                 maxlen = Math.max(r-l+1 , maxlen);
//                 r++;
//         }
//         return maxlen;
//     }
//     public static void main(String[] args) {
//         String s = "hello";
//         System.out.println(new Solution().longSubstring(s,3));
//     }
// }

// import java.util.*;
// class Solution {
//     LinkedList<Integer>list;
//     public void initializeHeap() {
//         list = new LinkedList<>();
//     }

//     public void insert(int key) {
//         if(list.peekFirst()!=null && list.peekFirst()>key)
//             list.add(0,key);
//     }

//     public void changeKey(int index, int newVal) {
//         list.remove(index);
//         list.add(index,newVal);
//     }

//     public void extractMin() {
//         list.poll();
//     }

//     public boolean isEmpty() {
//         return list.isEmpty();
//     }

//     public int getMin() {
//        return list.peekFirst();
//     }

//     public int heapSize() {
//         return list.size();
//     }
//     public static void main(String[] args) {
//         Solution obj = new Solution();
//         obj.initializeHeap();
//         obj.insert(1);
        
//     }
// }

// heap data structure
// there are twio types of heaps: 1) min heap 2) max heap
class Solution {
    public static void main(String args[]) throws Exception
    {
            // Implementing heap using arrays
            int arr[] = new int[6];
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            for(int i = 0 ; i < arr.length ; i ++)
                arr[i] = Integer.parseInt(br.readLine());
       



    }
}