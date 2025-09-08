
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
import java.util.ArrayList;
class MaxHeap{

	ArrayList<Integer> heap;

	MaxHeap(){
		heap = new ArrayList<>();
	}
	
	public int getParent(int i ){
		return ( i - 1 ) / 2;
	}

	public int getRightChild(int i ){
		return 2 * i + 2;
	}

	public int getLeftChild(int i ) {
		return 2 * i + 1;
	}

	public void swap(int i , int j){ //function to swap two values of given indices
		int temp = heap.get(i);
		heap.set( i , heap.get(j));
		heap.set( j , temp );
	}

	public void insert(int value ){
		heap.add(value);
		int currentIndex = heap.size() - 1;

		
			while(currentIndex > 0 && heap.get(currentIndex) > heap.get(getParent(currentIndex) ) )
			{
				swap( currentIndex , getParent(currentIndex) ) ;
				currentIndex = getParent(currentIndex);
			}
		System.out.println("Element is inserted ");
	}


	public int extractMax()
	{
		if(heap.isEmpty()) {
			System.out.println("Heap is empty");
				return -1;
		}
		int max = heap.get(0);//root is always the maximum
	 	int last = heap.remove(heap.size() - 1);
		if(!heap.isEmpty() ) 
		{
			heap.set(0 , last);
			int currentIndex = 0;
			while(true) 
			{
				int left = getLeftChild(currentIndex);
				int right = getRightChild(currentIndex);
				int largest = currentIndex; //as a heap property root should be largest , initially consider this as largest and then check for children whether it is greater

				if(left < heap.size() && heap.get(left) > heap.get(largest)) 
					largest = left;
				if(right  < heap.size() && heap.get(right) > heap.get(largest) ) 
						largest = right;

				if(largest == currentIndex)
						break;

				swap(currentIndex , largest );

				currentIndex = largest;
			}
		}
		System.out.println("Extracted max ; ");
		return max;
	}

}
class Solution{
	public static void main(String args[] )
	{
		System.out.println("Creation of heap ");
		MaxHeap heap = new MaxHeap();
		heap.insert(10);
		heap.insert(5);
		heap.insert(15);
		heap.insert(20);
		heap.insert(25);
		System.out.println(heap.extractMax());
		System.out.println(heap.extractMax());
		System.out.println(heap.extractMax());
		System.out.println(heap.extractMax());
		System.out.println(heap.extractMax());

	}
}
