
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
// java heap implementation
/*
import java.util.ArrayList;
class MinHeap {
    private ArrayList<Integer> heap;

    public MinHeap() {
        heap = new ArrayList<>();
    }

    public int parent(int i)
    {
        return (i-1)/2; //return index of parent
    }

    public int leftChild(int i )
    {
        return 2*i+1; //return index of left child
    }

    public int rightChild(int i )
    {
        return (2*i+2);//return index of right child
    }
    
    // function to swap elements at given indices
    public void swap(int i , int j)
    {
        int temp = heap.get(i);
        heap.set(i , heap.get(j));
        heap.set(j , temp);
    }

    public void insert(int value){
        // add element at the end
        heap.add(value);
        // return index of last element i.e currently added element
        int currentIndex = heap.size()-1;
        // buble up to maintain the heap property
        while(currentIndex > 0 && heap.get(currentIndex) < heap.get(parent(currentIndex))){
                // swap parent and current node
            swap(currentIndex , parent(currentIndex));
            // move up to the parent
            currentIndex = parent(currentIndex);
        }
    }

    // extract min
    public int extractMin()
    {
        // minimum value is always the root
        if(heap.isEmpty())
        {
            throw new RuntimeException("Heap is Empty");
        }
        int min = heap.get(0);
        // retrieve and remove last element of the heap
        int last = heap.remove(heap.size()-1);
        if(!heap.isEmpty())
        {
            heap.set(0,last);
            int currentIndex = 0;
            while(true)
            {
                int left = leftChild(currentIndex);
                int right = rightChild(currentIndex);
                int smallest = currentIndex;
                //   find smallest value among left , right and current node
                if(left < heap.size() && heap.get(left) < heap.get(smallest))
                    smallest = left;
                if(right < heap.size() && heap.get(right) < heap.get(smallest))
                    smallest = right;
                if(smallest == currentIndex)
                    break;

                swap(currentIndex , smallest);
                currentIndex = smallest;
            }
        }
        return min;
    }

}

class MaxHeap 
{
    
}

class Solution {
    public static void main(String args[]) throws Exception
    {
        MinHeap heap = new MinHeap();
        heap.insert(10);
        heap.insert(5);
        heap.insert(15);
        heap.insert(20);
        heap.insert(25);
        System.out.println("Extracted min :"+heap.extractMin());
        System.out.println("Extracted min :"+heap.extractMin());
        System.out.println("Extracted min :"+heap.extractMin());
        System.out.println("Extracted min :"+heap.extractMin());
        System.out.println("Extracted min :"+heap.extractMin());
    }
}
*/
// import java.util.ArrayList;
// class MaxHeap{

// 	ArrayList<Integer> heap;

// 	MaxHeap(){
// 		heap = new ArrayList<>();
// 	}
	
// 	public int getParent(int i ){
// 		return ( i - 1 ) / 2;
// 	}

// 	public int getRightChild(int i ){
// 		return 2 * i + 2;
// 	}

// 	public int getLeftChild(int i ) {
// 		return 2 * i + 1;
// 	}

// 	public void swap(int i , int j){ //function to swap two values of given indices
// 		int temp = heap.get(i);
// 		heap.set( i , heap.get(j));
// 		heap.set( j , temp );
// 	}

// 	public void insert(int value ){
// 		heap.add(value);
// 		int currentIndex = heap.size() - 1;

		
// 			while(currentIndex > 0 && heap.get(currentIndex) > heap.get(getParent(currentIndex) ) )
// 			{
// 				swap( currentIndex , getParent(currentIndex) ) ;
// 				currentIndex = getParent(currentIndex);
// 			}
// 		System.out.println("Element is inserted ");
// 	}


// 	public int extractMax()
// 	{
// 		if(heap.isEmpty()) {
// 			System.out.println("Heap is empty");
// 				return -1;
// 		}
// 		int max = heap.get(0);//root is always the maximum
// 	 	int last = heap.remove(heap.size() - 1);
// 		if(!heap.isEmpty() ) 
// 		{
// 			heap.set(0 , last);
// 			int currentIndex = 0;
// 			while(true) 
// 			{
// 				int left = getLeftChild(currentIndex);
// 				int right = getRightChild(currentIndex);
// 				int largest = currentIndex; //as a heap property root should be largest , initially consider this as largest and then check for children whether it is greater

// 				if(left < heap.size() && heap.get(left) > heap.get(largest)) 
// 					largest = left;
// 				if(right  < heap.size() && heap.get(right) > heap.get(largest) ) 
// 						largest = right;

// 				if(largest == currentIndex)
// 						break;

// 				swap(currentIndex , largest );

// 				currentIndex = largest;
// 			}
// 		}
// 		System.out.println("Extracted max ; ");
// 		return max;
// 	}

// }
// class Solution{
// 	public static void main(String args[] )
// 	{
// 		System.out.println("Creation of heap ");
// 		MaxHeap heap = new MaxHeap();
// 		heap.insert(10);
// 		heap.insert(5);
// 		heap.insert(15);
// 		heap.insert(20);
// 		heap.insert(25);
// 		System.out.println(heap.extractMax());
// 		System.out.println(heap.extractMax());
// 		System.out.println(heap.extractMax());
// 		System.out.println(heap.extractMax());
// 		System.out.println(heap.extractMax());

// 	}
// }


// Heap implementation
// class Heap
// {
//     static int capacity;
    
//     static int size;

//     static int arr[];

//     Heap(int capacity)
//     {
//         Heap.capacity = capacity;
//         size = 0;
//         arr = new int[capacity];
//     }

//     static int parent(int i)
//     {
//         return (i-1)/2;

//     }
    
//     static int left(int i)
//     {
//         return 2*i+1;
//     }

//     static int right(int i)
//     {
//         return 2*i+2;
//     }

//     static void insert(int x)
//     {
//         if(size == capacity)
//         {
//             System.out.println("Heap Overflow\n");
//             return;
//         }
//         arr[size] = x;

//         int k = size;

//         size++;

//         while(k!=0 && arr[parent(k)] > arr[k])
//         {
//             // swap parent and child
//             int temp  = arr[parent(k)];
//             arr[parent(k)] = arr[k];
//             arr[k] = temp;
//             k = parent(k);
//         }
//     }

//     static void Heapify(int ind)
//     {
//         int ri = right(ind);
//         int li = left(ind);

//         int smallest = ind;//assume initially given index is the smallest
//         if(li < size && arr[smallest] < arr[li])
//             smallest = li;
        
//         if(ri < size && arr[smallest] < arr[ri])
//             smallest = ri;

//         if(smallest != ind) 
//         {
//             int temp = arr[ind];
//             arr[ind] =smallest;
//             arr[smallest] = temp;
//             Heapify(smallest);//recursively heapify the tree    
//         }

//     }

//     static int getMin()
//     {
//         return arr[0];
//     }

//     static int extractMin()
//     {
//         if(size<=0)
//         {
//             return Integer.MAX_VALUE;//return the maximum value
//         }
//         if(size==1)
//         {
//             size--;
//             return arr[0];
//         }
        
//         int mini = arr[0];
//         arr[0] = arr[size-1];
//         size--;

//         Heapify(0);//head gets extracted so then heapify the tree
//         return mini;
//     }

//     static void decreaseKey(int i , int val)
//     {
//         // update the value
//         arr[i] = val;
//         while(i!=0 && arr[parent(i)] > arr[i])
//         {
//                 int temp = arr[parent(i)];
//                 arr[parent(i)] = arr[i];
//                 arr[i] = temp;
//                 i = parent(i);
//         }
//     }

//     static void Delete(int i)
//     {
//         decreaseKey(i, Integer.MIN_VALUE);
//         extractMin();
//     }

//     static void print()
//     {
//         for(int i = 0 ; i < size ; i++)
//         {
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         {
//             Heap h = new Heap(10);
//     h.insert(4);
//     h.insert(1);
//     h.insert(2);
//     h.insert(6);
//     h.insert(7);
//     h.insert(3);
//     h.insert(8);
//     h.insert(5);

//     h.print();
//     System.out.println("Min value is " + h.getMin());

//     h.insert(-1);
//     System.out.println("Min value is " + h.getMin());

//     h.decreaseKey(3, -2);
//     System.out.println("Min value is " + h.getMin());
// h.print();
//     h.extractMin();
//     System.out.println("Min value is " + h.getMin());

//     h.Delete(0);
//     System.out.println("Min value is " + h.getMin());
        
//         }
//     }
// }

// import java.util.*;
// class Solution 
// {
    
//     // naive approach
//     public void replaceByRank(int arr[])
//     {
//         int n = arr.length;
//         int temp[] =new int[n];
//         HashMap<Integer,Integer> map = new HashMap<>();
//         System.arraycopy(arr, 0, temp, 0, n);
//         Arrays.sort(temp);
//         int rank = 1;
//         for(int i = 0 ; i < n ; i++){
//             if(!map.containsKey(temp[i]))
//                 map.put(temp[i] , rank++);
//         }
//         for(int i = 0; i < n ; i++)
//             arr[i] = map.get(arr[i]);
//     }
//     public static void main(String[] args)
//     {
//         int arr[]={ 1 ,5,8 ,15, 8 ,25 ,9};
//         for(int i = 0 ; i < arr.length ; i++)
//             System.out.print(arr[i]+" ");
//         new Solution().replaceByRank(arr);
//         System.out.println();
//         for(int i = 0 ; i < arr.length ; i++)
//             System.out.print(arr[i]+" ");
        

//     }
// }


// // ps : Maximum Sum Combination
// import java.util.*;

// // Class that implements the solution
// class Solution {
//     // Function to find k maximum sum combinations
//     public List<Integer> maxCombinations(int[] nums1, int[] nums2, int k) {
//         // Sort both arrays in descending order
//         Arrays.sort(nums1);
//         Arrays.sort(nums2);
//         int n = nums1.length;

//         // Max heap to store sums and their indices
//         PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> b[0] - a[0]);

//         // Set to keep track of visited index pairs
//         Set<String> visited = new HashSet<>();

//         // Push initial max sum combination
//         maxHeap.offer(new int[]{nums1[n - 1] + nums2[n - 1], n - 1, n - 1});
//         visited.add((n - 1) + "," + (n - 1));

//         // Result list
//         List<Integer> result = new ArrayList<>();

//         // Extract top k combinations
//         while (k-- > 0 && !maxHeap.isEmpty()) {
//             int[] current = maxHeap.poll();
//             int sum = current[0], i = current[1], j = current[2];

//             result.add(sum);

//             // Check for new combination (i - 1, j)
//             if (i - 1 >= 0) {
//                 String key1 = (i - 1) + "," + j;
//                 if (!visited.contains(key1)) {
//                     maxHeap.offer(new int[]{nums1[i - 1] + nums2[j], i - 1, j});
//                     visited.add(key1);
//                 }
//             }

//             // Check for new combination (i, j - 1)
//             if (j - 1 >= 0) {
//                 String key2 = i + "," + (j - 1);
//                 if (!visited.contains(key2)) {
//                     maxHeap.offer(new int[]{nums1[i] + nums2[j - 1], i, j - 1});
//                     visited.add(key2);
//                 }
//             }
//         }

//         return result;
//     }
// }

// class Main {
//     public static void main(String[] args) {
//         Solution obj = new Solution();
//         int[] nums1 = {7, 3};
//         int[] nums2 = {1, 6};
//         int k = 2;
//         System.out.println(obj.maxCombinations(nums1, nums2, k)); // Output: [13, 9]
//     }
// }

// class Test {

// static int a;

// static {

// a = 4;

// System.out.println ("inside static block");

// System.out.println ("a = " + a);

// }

// Test() {

// System.out.println ("inside constructor");

// a = 10;

// }

// public static void func() {

// a = a + 1;

// System.out.println ("a = " + a);

// }

// public static void main(String[] args) {

// Test obj = new Test();

// obj.func();

// }

// }
// class Main {

// private int value;

// private static int count = 0;

// public Main() {

// value = 0;

// count++;

// }

// public static void main(String[] args) {

// Main obj1 = new Main();

// Main obj2 = new Main();

// System.out.println(obj1.count + " " + obj2.count);

// obj1.count = 5;

// System.out.println(obj1.count + " " + obj2.count);

// }

// }




//title: Maximum Sum Combination
// Problem Statement:
 // Given two integer arrays nums1 and nums2 
 // and an integer k, return the maximum k valid sum combinations
 //  from all possible sum combinations using the elements
 //   of nums1 and nums2. A valid sum combination is made
 //    by adding one element from nums1 and one element from nums2. 
 //    Return the answer in non-increasing order.

// import java.util.*;
// class Solution 
// {
//     public static void main(String args[])
//     {
//         int arr1[] = {7, 3};
//         int arr2[] = {1,6};
//         int k = 2;
//         PriorityQueue<Integer> heap1 = new PriorityQueue<>(Collections.reverseOrder());
//         PriorityQueue<Integer> heap2 = new PriorityQueue<>(Collections.reverseOrder());
//         for(int x : arr1)
//                 heap1.add(x);
//         for(int x : arr2)
//                 heap2.add(x);
//         while(k-- > 0)
//         {
//             int currsum = heap1.peek() + heap2.peek();
//             System.out.println(currsum);
//             if(heap1.peek() > heap2.peek())
//                     heap2.poll();
//             else
//                 heap1.poll();
//         }
//     }
// // }    

// import java.util.*;
// class Solution
// {
//     public int findDuplicate(int arr[])
//     {
//         HashSet<Integer> set = new HashSet<>();
//         for(int x : arr)
//         {
//             if(set.contains(x))
//                     return x;
//             set.add(x);
//         }
//         return 0;
//     }
//     public static void main(String args[])
//     {
//         int arr[] = {1,2,2,3,4};
//         System.out.println(new Solution().findDuplicate(arr));
//     }
// }


// --------------------------------------HEAPS---------------------------
// Maximum Sum Combination


// Problem Statement: Given two integer arrays nums1 and nums2 and
 // an integer k, return the maximum k valid sum combinations from
  // all possible sum combinations using the elements of nums1 and 
// nums2. A valid sum combination is made by adding one element
 // from nums1 and one element from nums2.
  // Return the answer in non-increasing order.
// import java.util.*;
// class Solution
// {
//     List<Integer> maxKSums(int nums1[] , int nums2[] , int k)
//     {
//         List<Integer> result = new ArrayList<>();
//         PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
//         for(int i = 0 ; i < nums1.length ; i ++ )
//         {
//             for(int j = 0 ; j < nums2.length ; j++)
//             {
//                 heap.add(nums1[i]+nums2[j]);
//             }
//         }
//         while(k-- > 0)
//         {
//             result.add(heap.poll());
//         }
//         return result;
//     }

//     public static void main(String args[])
//     {
//         int nums1[] = {3, 4, 5};
//         int  nums2[] = {2,6,3};
//         int k = 2;
//         System.out.println(new Solution().maxKSums(nums1,nums2,k));
//     }
// }




// -----------------------------Greedy Method-----------------------
// fractional knapsack solution
// class Solution
// {
//     static void swap(int arr[] , int i , int j)
//     {
//         int temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//     }
//     static void swap(double arr[] , int i , int j)
//     {
//         double temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//     }
//     // sort
//     static void sort(int val[] , int wt[] , double ratio[])
//     {
//         for(int i = 0 ; i < wt.length ; i++)
//         {
//             for(int j = i+1  ; j < wt.length ; j++)
//             {
//                 if(ratio[i] < ratio[j])
//                 {
//                     swap(val,i,j);
//                     swap(wt,i,j);
//                     swap(ratio,i,j);
//                 }
//             }
//         }
//         // display wt and val
//         for(int i = 0 ; i < wt.length ; i ++)
//             System.out.println(wt[i]+":"+val[i]);
//     }

//     static double fractionalKnapSack(int val[] , int wt[] , int capacity)
//     {
//         int n = val.length;
//         double ratio[] = new double[n];
//         for(int i = 0 ; i < n ; i++)
//         {
//             ratio[i] = (double)val[i]/wt[i];
//         }
//         // sort weight and values according to ratio
//         sort(val,wt,ratio);
//         int total=0;
//         double result = 0;
//         for(int i = 0 ; i < n ; i++)
//         {
//             if(total + wt[i] <=capacity){
//                 result+=val[i];
//                 total+=wt[i];   
//             }
//             else
//             {
//                 int rem = capacity - total;
//                 result+= (double)rem/wt[i] * (double)val[i];
//                 total+=rem;
//                 break;
//             }
//         }
//         return result;
//     }
//     public static void main(String args[])
//     {
//         int val[] = {60,100};
//         int wt[] = {10,20};
//         int capacity = 50;
//         double result = fractionalKnapSack(val , wt , capacity);
//         System.out.println(result);
//     }
// }


// fractional knapsack : optimal 
// import java.util.Arrays;
// class Item {
//     int value;
//     int weight;
//     double ratio;

//     Item(int value, int weight) {
//         this.value = value;
//         this.weight = weight;
//         this.ratio = (double) value / weight;
//     }
// }

// class Solution {

//     static double fractionalKnapSack(int[] val, int[] wt, int capacity) {

//         int n = val.length;
//         Item[] items = new Item[n];

//         for (int i = 0; i < n; i++) {
//             items[i] = new Item(val[i], wt[i]);
//         }

//         // Sort by ratio descending → O(n log n)
//         Arrays.sort(items, (a, b) -> Double.compare(b.ratio, a.ratio));

//         double result = 0.0;
//         int totalWeight = 0;

//         for (Item item : items) {
//             if (totalWeight + item.weight <= capacity) {
//                 result += item.value;
//                 totalWeight += item.weight;
//             } else {
//                 int remaining = capacity - totalWeight;
//                 result += item.ratio * remaining;
//                 break;
//             }
//         }

//         return result;
//     }

//     public static void main(String[] args) {
//         int[] val = {60, 100};
//         int[] wt = {10, 20};
//         int capacity = 50;

//         System.out.println(fractionalKnapSack(val, wt, capacity));
//     }
// }

// Leetcode potd: 
// // make string balanced

// import java.util.Stack;
// class Solution
// {
//     public static void main(String argsp[])
//     {
//         String s = "abaab";
//         int ans = 0;
//         Stack<Character> stack = new Stack<>();
//         for(char c : s.toCharArray())
//         {   
//             // top is b and current is a
//             if(!stack.isEmpty() && stack.peek()=='b' && c=='a')
//             {
//                 ans++;
//                 stack.pop();
//             }
//             else
//                 stack.push(c);
//         }
//         return ans;
//     }
// }

// class Solution
// {
//     int height(TreeNode root)
//     {
//         if(root==null)
//                 return 0;
//         int lh = height(root.left);
//         int rh = height(root.right);
//         return Math.max(lh,rh)+1;
//     }
//     boolean isBalanced(TreeNode root)
//     {
//         if(root==null)
//                 return true;
//         int lh = height(root.left);
//         int rh = height(root.right);
//         if(Math.abs(lh-rh) > 1)
//             return false;
//         boolean lbal = isBalanced(root.left);
//         boolean rbal = isBalanced(root.right);
//         return lbal && rbal;
//     }
//     public static void main(String args[])
//     {

//     }
// }


// ------------------------------------- greedy 
// N meetings in one room
// Problem Statement: There is one meeting room in a firm.
// You are given two arrays, start and end each of size N.
// For an index ‘i’, start[i] denotes the starting time of the
// ith meeting while end[i] will denote the ending time of the
// ith meeting. Find the maximum number of meetings that can be accommodated 
// if only one meeting can happen in the room at a particular time.
 // Print the order in which these meetings will be performed.
// example :
// Input: N = 6,  start[] = {1,3,0,5,8,5}, end[] =  {2,4,5,7,9,9}
// Output: [1, 2, 4, 5]

// import java.util.*;
// class Meet
// {
//     int start;
//     int end;
//     int position;
//     Meet(int start , int end, int position)
//     {
//         this.start = start;
//         this.end = end;
//         this.position = position;
//     }

//     @Override
//     public String toString()
//     {
//         return start+" "+" "+end+" "+position;
//     }
// }
// class Solution
// {
//     List<Integer> meetingOrder(int N , int start[] , int end[])
// {
//     // create object and sort it according to end time
//     Meet meets[] = new Meet[N];
//     for(int i = 0 ; i < N ; i++)
//             meets[i] = new Meet(start[i],end[i],i);
//     Arrays.sort(meets ,(a,b) ->  Integer.compare(a.end , b.end) );
//     List<Integer> result = new ArrayList<>();
//     result.add(meets[0].position);
//     int freeTime = meets[0].end;
//     for(int i = 1 ; i < N ; i++)
//     {
//         if(freeTime < meets[i].start){
//             result.add(meets[i].position);
//             freeTime = meets[i].end;
//         }
//     }
//     // positions are zero based positions
//     return result;
// }
 
//     public static void main(String args[])
//     {
//         int  N = 6,  start[] = {1,3,0,5,8,5}, end[] =  {2,4,5,7,9,9};
//         List<Integer> result = new Solution().meetingOrder(N , start , end);
//         System.out.println(result);
//     }
// }


// Minimum number of platforms required for a railway
// class Solution
// {
//     public int minPlatform(double arr[] , double dept[])
//     {
//         int n = arr.length;
//         int ans = 1;
//         for(int i = 0 ; i < n ; i++)
//         {
//             int count = 1;
//             for(int j = i + 1; j < n ; j++)
//             {
//                 if((arr[i] >= arr[j] && arr[i] <=dept[j]) ||
//                     (arr[j] >= arr[i] && arr[j] <=dept[i] ) )
//                         count++;
//             }
//             ans = Math.max(ans , count);
//         }
//         return ans;
//     }
//      public static void main(String args[])
//      {
//         double arr[] = {9.00, 9.45, 9.55, 11.00, 15.00, 18.00};
//         double dept[] = {9.20, 12.00, 11.30, 11.50, 19.00, 20.00};
//         System.out.println(new Solution().minPlatform(arr,dept));
//      }
// }
// optimal SOlution
// import java.util.Arrays;
// class Solution
// {
//     public int minPlatform(double arr[] , double dept[])
//     {
//         Arrays.sort(arr);
//         Arrays.sort(dept);
//         int i = 0  , j  =0;
//         int n = arr.length;
//         int count = 0;
//         int maxcount  =0;
//         while( i < n  && j < n)
//         {
//             if(arr[i]<=dept[j])
//             {
//                 count++;
//                 i++;
//             }
//             else
//             {
//                 count--;
//                 j++;
//             }
//             maxcount = Math.max(count , maxcount);
//         }
//         return maxcount;

//     }
//      public static void main(String args[])
//      {
//         double arr[] = {9.00, 9.45, 9.55, 11.00, 15.00, 18.00};
//         double dept[] = {9.20, 12.00, 11.30, 11.50, 19.00, 20.00};
//         System.out.println(new Solution().minPlatform(arr,dept));
//      }
// }


// job sequencing problem
// class Job
// {
//     int i ;
//     int d;
//     int p;
//     Job(int i , int d , int p)
//     {
//         this.i = i;
//         this.d = d;
//         this.p = p;
//     }
// }
// class Solution
// {
//     public static void main(String args[])
//     {
//         System.out.println(new Solution().jobSequencing())
//     }
// }



// // java labelled statement
// class Solution
// {
//     public static void main(String args[])
//     {
//         outer:
//         for(int i = 0 ; i < 5 ; i ++)
//         {
//             for(int j = 0 ; j < 5 ; j++)
//             {
//                 System.out.println(i+" "+j);
//                 if(i==3 &&  j==4)
//                         break outer;
//             }
//         }
//     }
// }

// import java.util.Arrays;
// class Solution
// {
//     int avgWaiting(int p[])
//     {
//         Arrays.sort(p);
//         int tat = 0;
//         int sum = 0;
//         for(int i = 0 ; i < p.length -1 ; i++)
//         {
//             int ct = p[i] + tat;
//             sum+=ct;
//             tat+=p[i];
//         }
//         return sum / p.length;
//     }
//     public static void main(String args[])
//     {
//         int p[] = {3,1,4,2,5};   
//         System.out.println(new Solution().avgWaiting(p));
//     }
// }




// ------------------------------------Tree Series
// // tree traversals
// import java.util.*;
// // Node structure for the binary tree
// class Node {
//     int data;
//     Node left;
//     Node right;

//     // Constructor to initialize
//     // the node with a value
//     Node(int val) {
//         data = val;
//         left = null;
//         right = null;
//     }
// }

// // Solution class containing the traversal function
// class Pair<K,V>
// {
//     K key;
//     V value;
//     Pair(K key, V value)    
//     {
//         this.key = key;
//         this.value = value;
//     }
//     public K getKey()
//     {
//         return key;
//     }
//     public V getValue()
//     {
//         return value;
//     }
//     public void setValue(V value)
//     {
//         this.value = value;
//     }
// }

// class Solution {

//     // Function to get the Preorder,
//     // Inorder and Postorder traversal
//     // Of Binary Tree in One traversal
//     public List<List<Integer>> preInPostTraversal(Node root) {
//         // Lists to store traversals
//         List<Integer> pre = new ArrayList<>();
//         List<Integer> in = new ArrayList<>();
//         List<Integer> post = new ArrayList<>();

//         // If the tree is empty,
//         // return empty traversals
//         if (root == null) {
//             return new ArrayList<>();
//         }

//         // Stack to maintain nodes
//         // and their traversal state
//         Stack<Pair<Node, Integer>> st = new Stack<>();

//         // Start with the root node
//         // and state 1 (preorder)
//         st.push(new Pair<>(root, 1));

//         while (!st.empty()) {
//             Pair<Node, Integer> it = st.pop();

//             // this is part of pre
//             if (it.getValue() == 1) {
//                 // Store the node's data
//                 // in the preorder traversal
//                 pre.add(it.getKey().data);
//                 // Move to state 2
//                 // (inorder) for this node
//                 it.setValue(2);
//                 // Push the updated state
//                 // back onto the stack
//                 st.push(it);

//                 // Push left child onto
//                 // the stack for processing
//                 if (it.getKey().left != null) {
//                     st.push(new Pair<>(it.getKey().left, 1));
//                 }
//             }

//             // this is a part of in
//             else if (it.getValue() == 2) {
//                 // Store the node's data
//                 // in the inorder traversal
//                 in.add(it.getKey().data);
//                 // Move to state 3
//                 // (postorder) for this node
//                 it.setValue(3);
//                 // Push the updated state
//                 // back onto the stack
//                 st.push(it);

//                 // Push right child onto
//                 // the stack for processing
//                 if (it.getKey().right != null) {
//                     st.push(new Pair<>(it.getKey().right, 1));
//                 }
//             }

//             // this is part of post
//             else {
//                 // Store the node's data
//                 // in the postorder traversal
//                 post.add(it.getKey().data);
//             }
//         }

//         // Returning the traversals
//         List<List<Integer>> result = new ArrayList<>();
//         result.add(pre);
//         result.add(in);
//         result.add(post);
//         return result;
//     }

//     // Function to print the elements of a list
//     public void printList(List<Integer> list) {
//         for (int num : list) {
//             System.out.print(num + " ");
//         }
//         System.out.println();
//     }
// }

// // Main class
//  class Main {
//     public static void main(String[] args) {
//         // Creating a sample binary tree
//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.right = new Node(3);
//         root.left.left = new Node(4);
//         root.left.right = new Node(5);

//         // Create object of Solution class
//         Solution sol = new Solution();

//         // Getting the pre-order, in-order,
//         // and post-order traversals
//         List<List<Integer>> traversals = sol.preInPostTraversal(root);

//         // Extracting the traversals
//         List<Integer> pre = traversals.get(0);
//         List<Integer> in = traversals.get(1);
//         List<Integer> post = traversals.get(2);

//         // Printing the traversals
//         System.out.print("Preorder traversal: ");
//         sol.printList(pre);

//         System.out.print("Inorder traversal: ");
//         sol.printList(in);

//         System.out.print("Postorder traversal: ");
//         sol.printList(post);
//     }
// }


// level order traversal

  // Definition for a binary tree node.
import java.util.*;
   class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
 
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
    Queue<TreeNode> queue = new ArrayDeque<>();
    List<List<Integer>> list = new ArrayList<>();
    if(root==null)
            return list;
    queue.offer(root);
    while(!queue.isEmpty())
    {
        int level = queue.size();
        List<Integer> sub = new ArrayList<>();
        for(int i = 0 ; i < level ; i++)
        {
            if(queue.peek().left!=null)
                queue.offer(queue.peek().left);
            if(queue.peek().right!=null)
                queue.offer(queue.peek().right);
            sub.add(queue.poll().val);
        }
        list.add(sub);
    }
    return list;
    }
    public static void main(String argsp[])
    {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(new Solution().levelOrder(root));
    }
}