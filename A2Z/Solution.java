
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
import java.util.*;
class Solution
{
    List<Integer> maxKSums(int nums1[] , int nums2[] , int k)
    {
        List<Integer> result = new ArrayList<>();
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0 ; i < nums1.length ; i ++ )
        {
            for(int j = 0 ; j < nums2.length ; j++)
            {
                heap.add(nums1[i]+nums2[j]);
            }
        }
        while(k-- > 0)
        {
            result.add(heap.poll());
        }
        return result;
    }

    public static void main(String args[])
    {
        int nums1[] = {3, 4, 5};
        int  nums2[] = {2,6,3};
        int k = 2;
        System.out.println(new Solution().maxKSums(nums1,nums2,k));
    }
}