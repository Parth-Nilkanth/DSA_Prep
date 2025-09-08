
// import java.util.*;
// class MinStack {
//     Stack<Pair<Integer,Integer>> st;
//     public MinStack() {

//         st = new Stack<>();        
//     }
    
//     public void push(int val) {
//         if(st.isEmpty())
//             st.push(new Pair(val,val));
//         else
//             st.push(new Pair(val,Math.min(val,st.top.getValue())));

//     }
    
//     public void pop() {
//         st.pop();

//     }
    
//     public int top() {
        
//         st.top.getKey();
//     }
    
//     public int getMin() {
//         st.top.getValue();
//     }
// }

// public class Solution
// {
//     public static void main(String[] args)
//     {
//         MinStack minStack = new MinStack();
//         minStack.push(-2);
//     minStack.push(0);
//     minStack.push(-3);
//     System.out.println(minStack.getMin()); // return -3
//     minStack.pop();
//     System.out.println(minStack.top());    // return 0
//     System.out.println(minStack.getMin());
//     System.out.print(minStack.ls);
    
//     }
// }





// import java.util.*;
// class Solution {
//     public List<List<Integer>> fourSum(int[] nums, int target) {

//         List<List<Integer>> ls = new ArrayList<>();

//         for(int i = 0 ; i < nums.length ; i++)
//         {
//             for(int j = 0 ; j < nums.length ; j++)
//             {
//                 if(j==i)
//                 continue;

//                 for(int k = 0 ; k < nums.length ; k++)
//                 {
//                     for(int l = 0 ; l < nums.length ; l++)
//                     {
//                         if(l==k || k==j)
//                             continue;
//                         else if(nums[i]+nums[j]+nums[k]+nums[l] == target)
//                             {
//                                 List<Integer> temp = new ArrayList<>();
//                                 temp.add(nums[i]);
//                                 temp.add(nums[j]);
//                                 temp.add(nums[k]);
//                                 temp.add(nums[l]);
//                                 ls.add(temp);
//                             }
//                     }
//                 }
//             }
//         }
        
        
//      return ls;
//     }
//     public static void main(String[] args)
//     {
//         Solution s = new Solution();
//         int nums[] ={1,0,-1,0,-2,2};
//         System.out.println(s.fourSum(nums,0));
//     }
// }


    // import java.util.HashMap;
    // class Solution {
    //     public boolean divideArray(int[] nums) {
    //     HashMap<Integer,Integer> map = new HashMap<>();
    //     for(int i = 0 ; i < nums.length ; i++)
    //     {
    //         map.put(nums[i], map.getOrDefault(nums[i],0)+1);
    //     }   

    //     for(int x:map.values())
    //         {
    //             if(x%2!=0)
    //                 return false;
    //         }
    //     return true;
    //     }

    //     public static void main(String args[])
    //     {
    //         Solution s = new Solution();
    //         int nums[] = {1,2,3,4};
    //         System.out.println(s.divideArray(nums));
    //     }
    // }




//     class Solution {
//     public int[] nextGreaterElement(int[] nums1, int[] nums2) {
//         int next_greater = -1;
//         int arr[] = new int[nums1.length];
//         int c = 0;
//         for(int i = 0 ; i < nums1.length ; i++)
//         { 
//             int nextgreat = -1 ;
//             for(int j = 0 ; j < nums2.length ; j++)
//             {
//                     if( nums2[j] > nums1[i] )
//                         {
//                 nextgreat = nums2[j] ;
                    
//             }
//             arr[c++] = nextgreat;  
//         }
//     }
//     return arr;
//     }

//     public static void main(String args[])
//     {

//         int arr1[] = {4,1,2};
//         int arr2[] = {1,3,4,2};
//         int arr3[] = new Solution().nextGreaterElement(arr1,arr2);
//         for(int x: arr3)
//             System.out.print(x+" ");

//     }
// }


// // infix to postfix
// class Solution {
    
//     public static int priority(char c)
//     {
//         if(c=='^')
//             return 3;
            
//         else if(c=='*' || c=='/')
//             return 2;
        
//         else if(c=='+' || c== '-')
//             return 1;
    
//         else 
//             return -1;
//     }
//     // Function to convert an infix expression to a postfix expression.
//     public static String infixToPostfix(String s) {
//         // Your code here
//         int n = s.length();
//         StringBuilder res = new StringBuilder();
//         Stack<Character> stack = new Stack<>();
//         for(int i = 0; i < n ; i++)
//         {
//             // case 1 : if the character is operand
//             if( s.charAt(i) >= 'a' && s.charAt(i) <= 'z' ||
//                 s.charAt(i) >='A' && s.charAt(i) <= 'Z' ||
//                 s.charAt(i) >='0' && s.charAt(i) <= '9' )
//                 {
//                     res.append(s.charAt(i));
//                 }
            
//             //case 2 : if the character is opening bracket
            
//             else if( s.charAt(i)=='(' ){
//                 stack.push(s.charAt(i));
//             }
            
            
//             //case 3 : if the charater is closing bracket
            
//             else if( s.charAt(i) == ')' ){
                
//                 while(!stack.isEmpty() && stack.peek()!='(') 
//                 {
//                     //pop elements and append it to string until we found opening bracket
//                         res.append(stack.pop());
//                 }
//                 //now at last pop opening braket
//                 stack.pop();
//             }
                
//             //case 4: if the character is operator
//             else
//             {
                
//                 while(!stack.isEmpty() && priority(s.charAt(i)) <= priority(stack.peek()) )
//                     {
//                         res.append(stack.pop());
//                     }
//                 stack.push(s.charAt(i));
//             }
            
            
//         }
//         while(!stack.isEmpty())
//             res.append(stack.pop());
//         return res.toString();
//     }
// }



// // infix to prefix
// import java.util.Stack;
// class Solution {
    
//     public static int priority(char c)
//     {
//         if(c=='^')
//             return 3;
            
//         else if(c=='*' || c=='/')
//             return 2;
        
//         else if(c=='+' || c== '-')
//             return 1;
    
//         else 
//             return -1;
//     }

//     public static String reverse(String str)
//     {

//         Stack<Character> stack = new Stack<>();
//         StringBuilder res = new StringBuilder();
//         for(int i = 0 ; i < str.length() ; i++)
//             stack.push(str.charAt(i));
//         while(!stack.isEmpty())
//         {
//             if( stack.peek() == '(')
//                 res.append(')');
//             else if(stack.peek() == ')')
//                 res.append('(');
//             else
//                 res.append(stack.peek());
//             stack.pop();
//         }
        
//         return res.toString();

//     }
//     // Function to convert an infix expression to a postfix expression.
//     public static String infixToPrefix(String s) {
//         // Your code here
//         s = reverse(s);
//         Stack<Character> stack = new Stack<>();
//         StringBuilder res = new StringBuilder();
//         for(int i = 0 ; i < s.length() ; i++)
//         {
         
//             //  case 1 : if the character is operand
//             if( s.charAt(i) >= 'a' && s.charAt(i) <= 'z' ||
//                 s.charAt(i) >='A' && s.charAt(i) <= 'Z' ||
//                 s.charAt(i) >='0' && s.charAt(i) <= '9' )
//                 {
//                     res.append(s.charAt(i));
//                 }
            
//             //case 2 : if the character is opening bracket
            
//             else if( s.charAt(i)=='(' ){
//                 stack.push(s.charAt(i));
//             }
            
            
//             //case 3 : if the charater is closing bracket
            
//             else if( s.charAt(i) == ')' ){
                
//                 while(!stack.isEmpty() && stack.peek()!='(') 
//                 {
//                     //pop elements and append it to string until we found op ening bracket
//                         res.append(stack.pop());
//                 }
//                 //now at last pop opening braket
//                 stack.pop();
//             }

//          //case 4 : if the character is operator

//          else
//          {
//             if(s.charAt(i) == '^'){
            
//             while(!stack.isEmpty() && priority(s.charAt(i)) <= priority(stack.peek()) )
//                 res.append(stack.pop());


//             }
            
//             else
//             {
                 
//                  while(!stack.isEmpty() && priority(s.charAt(i)) < priority(stack.peek()) ){
//                     res.append(stack.pop());

//                  }


//             }
//             stack.push(s.charAt(i));
//          }

//         }

//         while(!stack.isEmpty())
//             res.append(stack.pop());
//         res.reverse();
//         return res.toString();
//     }

//     public static void main(String a[])
//     {
//         System.out.print(infixToPrefix("(a+b)-(c*d)"));

//     }
// }

// import java.util.HashMap;
// class Solution {
//     public int[] nextGreaterElement(int[] nums1, int[] nums2) {
 
//     }
//     public static void main(String args[])
//     {
//         int nums1[] ={4 , 1 , 2};
//         int nums2[] = { 1 , 3 , 4 , 2};
//         int arr[] = new Solution().nextGreaterElement(nums1 , nums2);
//         for(int x : arr)
            // System.out.print(x+" ");
//     }
// }

// import java.util.ArrayList;
// class Solution {
//     int findMax(int nums[], int start, int end)
//     {
//         int max=Integer.MIN_VALUE;
//         for(int i = start ; i <= end ;i++)
//         {
//             max = Math.max(max,nums[i]);
//         }
//         return max;
//     }
//     public int[] maxSlidingWindow(int[] nums, int k) {
//         ArrayList<Integer> ls = new ArrayList<>();
//         for(int i = 0 ; i <= nums.length - k ; i++ )
//         {
//             int max = findMax(nums, i , (i+k)-1);
//             ls.add(max);
//         }
//         int res[] = ls.stream().mapToInt(i -> i).toArray();
//      return res;
//     }

//     public static void main(String[] args)
//     {
//         Solution s = new Solution();
//         int nums[]={1,3,-1,-3,5,3,6,7};
//         int res[] = s.maxSlidingWindow(nums,3);
//         for(int x: res)
//             System.out.print(x+" ");
//     }
// }


// import java.util.*;
// class Solution {
//     public int[] asteroidCollision(int[] asteroids) {
    
//         int ans[];
//         Stack<Integer> stack = new Stack<>();
//         for(int i =0 ; i < asteroids.length ; i++)
//         {

//             if(asteroids[i] > 0 )
//                 stack.push(asteroids[i]);
            
//             while(!stack.isEmpty() && asteroids[i]<0)
//             {
//                 if(Math.abs(asteroids[i]) > stack.peek())
//                         stack.pop();

//             }

//             if(!stack.isEmpty() && stack.peek()== Math.abs(asteroids[i]) )
//                 stack.pop();
            
//             else if(stack.isEmpty() || stack.peek()<0)
//                 stack.push(asteroids[i]); 

//         }
//         System.out.println(stack);
//         return (new int[]{});
//     }
//     public static void main(String[] args) {
//         int a[]={5,10,-5};
//         new Solution().asteroidCollision(a);

//     }
// }


// class Solution
// {
//     public static void main(String[] args) {
//         // long sum = (1000000-1)*1000000;
//         long sum = (long)(1000000-1) *(1000000);
//         System.out.println(sum);
//     }
// }



// import java.util.*;
// class Solution
// {

//     public int findRange(List<Integer> ls)
//     {
//         int min = Integer.MAX_VALUE,max=Integer.MIN_VALUE;
//         for(int x : ls)
//         {
//             min = Math.min(min, x);
//             max = Math.max(max, x);
//         }
//         return max - min;
//     }
//     public static void main(String[] args) {
//         int arr[]= {4,-2,-3,4,1};
//         int n = arr.length;
//         int sum = 0;
//         for(int i = 0 ; i < n ; i++)
//         {
//                 for(int j = i ; j < n ; j++)
//                 {
//                   List<Integer> ls = new ArrayList<>();  
//                     for(int k = i ; k <=j ; k++)
//                     {
//                             ls.add(arr[k]);
//                     }
//                     sum+=new Solution().findRange(ls);
//                 }
//         }
//         System.out.println(sum);
//     }
// }

// // largest rectangle in hisotgram
// import java.util.Stack;
// class Solution
// {
//     void pse(int pse[] , int heights[])
//     {
//         int n = heights.length;
//         Stack<Integer> stack = new Stack<>();
//         for(int i = 0 ; i < n ; i++)
//         {
//             //remove elements of top which are greater than curent
//             while(!stack.isEmpty() && heights[stack.peek()]>= heights[i])
//                 stack.pop();
//             pse[i] = stack.isEmpty()?-1:stack.peek();
//             stack.push(i);
//         }
//     }



//     void nse(int nse[] , int heights[])
//     {
//         int n = heights.length;
//         Stack<Integer> stack = new Stack<>();
//         for(int i = n - 1 ; i >=0 ; i--)
//         {
//             while(!stack.isEmpty() && heights[stack.peek()]>= heights[i])
//                 stack.pop();
//             nse[i] = stack.isEmpty()?n:stack.peek();
//             stack.push(i);
//         }
//     }

//     int maxHeight(int heights[])
//     {
//         // extreme brute force approach
//         int n = heights.length;
//         int pse[] = new int[n];
//         int nse[] = new int[n];
//         pse(pse,heights);
//         nse(nse,heights);
//         int maxi = 0;
//         for(int i = 0 ; i < n ; i++ )
//         {
//             int area = heights[i] * (nse[i]-pse[i] - 1);
//             maxi = Math.max(area,maxi);

//         }
//         return maxi;
//     }
//     public static void main(String args[])
//     {
//         int heights[] = { 2 , 4 };
//         System.out.println(new Solution().maxHeight(heights));
//     }
// }

// import java.util.*;
// class Solution
// {
//     public int[] maxSlidingWindow(int[] nums, int k) {
//     ArrayDeque<Integer> dq = new ArrayDeque<>();
//     // decalre array result of length n-k
//     // traverse through the array
//     int n = nums.length;
//     int result = new int[n-k+1];
//     Deque<Integer> dq = new ArrayDeque<>();
//     for(int i = 0 ; i < n ; i++)
//     {
//         if(!dq.isEmpty() && dq.peek() == i-k)
//             q.poll();
        
//         while(!dq.isEmpty() )

//         dq.offer(i); 
//     }

// }

//     public static void main(String args[])
//     {
//         int nums[] = {1,3,-1,-3,5,3,6,7}, k = 3;
//         int res[] = new Solution().maxSlidingWindow(nums,k);
//         for(int x : res)
//             System.out.println(x+" ");
//     }
// }



// class Solution {

//     boolean isSymmetric(int num)
//     {
//         if(num==1)
//             return true;
//         int n =(int)Math.ceil(1.3) ;//count length
        
//         int leftsum = 0;
//         int rightsum = 0;
//         while(n > 0)
//         {
//                 rightsum = rightsum +(num%10);
//                 num/=10;
//                 n--;
//         }
//         while(num>0)
//         {
//             leftsum  = leftsum +(num%10);
//             num/=10;
//         }
//         return rightsum == leftsum;
//     }
//     public int countSymmetricIntegers(int low, int high) {
//         // int count = 0;
//         // for(int num = 0 ; num <=high ; num++ )
//         // {
//         //     if(isSymmetric(num))
//         //         count++;
//         // }

//         // return count;
//         int n = (int)Math.ceil(2.3);

//     }
// }

// class Solution{
//         public long countGoodIntegers(int n, int k) {
//             int low = 0 , high =0;
//             if(n ==1 )
//                 {
//                     low = 1;
//                     high = 9;
//                 }
//             else
//             {
//                 low =(int) Math.pow(10,n-1);
//                 high = (low *10)-1;
//             }
            
//             for(int i = low ; i <=high ; i++)
//             {
                
//             }
//         }
    

//     public static void main(String[] args) {
        
//         System.out.println(new Solution().countGoodIntegers(7, 5));
//     }

// }



// class Solution {
//     public int findClosest(int x, int y, int z) {
//        if(Math.abs(z-x) < Math.abs(z-y) )
//                return 1;
//         else if(Math.abs(z-y) < Math.abs(z-x))
//                 return 2;
//         else
//             return 0;
               
//     }
//     public static void main(String[] args) {
//     System.out.println( new Solution().findClosest(2, 7, 4));
//     }
// }


// Recursion
// // Generating all subsets from an array
// import java.util.*;
// class Solution {
//     List<List<Integer>> result = new ArrayList<>();
//     Stack<Integer> subset = new Stack<>();
//     public void dfs(int i,int[] nums)
//     {
//         System.out.println(subset+" "+i);
//         if(i==nums.length)
//             {
//                 result.add(new ArrayList<>(subset));
//                 return;
//             }

//         subset.add(nums[i]);
//         dfs(i+1,nums);

//          subset.pop();
//          dfs(i+1,nums);
//     }
//     public List<List<Integer>> subsets(int[] nums) {
//         dfs(0,nums);
//         return result;
//     }
//     public static void main(String[] args) {
//         int arr[] = {1,2,3,4,5};
//         System.out.println("Final answer ="+ new Solution().subsets(arr));
//     }
// }

// import java.util.*;
// class Solution 
// {
//     public long goodTriplets(int[] nums1, int[] nums2) {
//         // firstly generate triplets
//         HashMap<Integer,Integer> map = new HashMap<>();
//         for(int i = 0 ; i < nums2.length ; i++ )
//         {
//                 map.put(nums2[i], i);
//         }
        
//         // System.out.println(triplets);
//         // System.out.println(map);
//         // Iterator<List<Integer>> it = triplets.iterator();//iterator to iterate through the list
//         int count = generateTriplets(nums1, map);
//         return count;   
//     }
//     public static void main(String[] args) {   
//         int nums1[] = {156,128,257,220,157,56,43,142,177,152,55,316,332,268,113,218,306,197,190,121,228,163,109,245,1,188,136,262,144,110,143,229,115,97,87,105,247,240,64,186,71,20,254,325,34,211,47,201,187,149,140,29,235,107,158,304,200,9,103,219,301,279,166,286,324,81,331,129,206,10,224,244,258,67,191,314,62,53,164,189,154,134,330,17,19,41,2,297,259,22,104,78,118,216,199,13,119,23,162,202,12,131,204,283,108,234,317,214,38,32,0,221,26,99,146,302,6,173,39,5,185,168,217,239,181,215,180,182,265,15,51,50,95,226,174,280,209,150,299,196,273,79,148,7,310,139,28,138,25,37,277,27,91,46,80,179,126,74,275,14,320,312,83,147,210,327,153,264,263,161,267,282,151,112,160,130,323,88,60,3,253,48,100,326,233,237,44,270,165,30,288,318,293,125,290,292,18,76,236,120,61,198,4,127,192,274,298,195,114,57,251,8,111,63,295,65,205,266,172,287,231,167,269,33,122,329,135,98,58,322,193,256,252,85,313,117,328,175,203,123,75,213,225,73,106,90,52,66,86,294,35,260,238,311,169,176,40,45,309,155,77,250,305,82,289,96,124,171,207,223,69,170,92,261,194,242,89,42,278,230,94,133,208,227,72,141,303,308,315,285,49,222,101,36,59,212,184,284,116,249,31,281,241,248,11,16,255,84,246,307,321,271,132,300,296,145,24,183,291,159,70,178,272,319,102,93,232,276,21,68,54,137,243};
//         int nums2[] = {90,150,257,100,36,73,231,81,240,84,129,267,296,211,91,12,215,196,254,46,250,93,132,89,57,30,26,225,130,272,308,54,223,194,237,95,121,63,186,151,80,86,165,41,146,51,222,20,1,104,157,282,10,118,181,96,302,242,319,266,92,125,4,47,207,324,107,200,289,310,62,328,255,303,287,74,316,94,307,238,156,202,116,188,122,291,169,226,119,138,208,251,39,147,161,102,234,166,330,197,112,97,232,27,0,227,76,180,6,268,59,331,327,105,170,11,52,224,109,87,235,271,13,142,295,212,317,18,277,98,111,9,174,314,217,312,236,17,285,280,50,221,55,279,309,14,233,322,205,195,58,28,294,35,77,315,326,70,329,220,191,2,29,244,153,241,66,155,261,228,243,85,160,183,163,320,101,37,5,168,64,43,290,152,265,332,106,323,198,88,22,175,293,219,300,178,182,162,187,21,113,260,304,278,149,48,126,68,263,216,204,203,325,253,53,252,306,274,189,301,135,83,44,82,24,141,131,172,65,49,173,78,7,239,229,321,137,143,249,133,56,72,33,117,103,214,67,179,273,276,292,154,23,275,230,171,206,201,110,16,210,256,245,176,184,209,136,148,259,124,318,284,69,128,8,199,286,258,140,38,190,139,61,115,42,127,99,15,313,164,248,283,218,114,19,192,213,299,288,120,311,167,297,270,31,134,32,305,269,262,159,193,75,71,3,247,145,177,60,40,246,34,298,144,79,158,45,264,281,108,25,123,185};
//         System.out.println(new Solution().goodTriplets(nums1,nums2));
//     }
//     static int generateTriplets(int nums[], HashMap<Integer,Integer> map)
//     {
//         int count =0;
//         Set<List<Integer>> triplets = new HashSet<List<Integer>>();
//         int n = nums.length;
//         for(int i = 0  ; i < n-2 ; i++)
//         {
//             for(int j =i+1 ; j < n-1 ; j++)
//             {
//                 if(map.get(nums[i] ) > map.get(nums[j]))
//                         continue;
//                 for(int k =  j+1 ; k < n ; k++)
//                 {
//                     if( map.get(nums[j]) < map.get(nums[k]))
//                         count++;
//                 }
//             }
//             return count;
//         }
//     }
// }

// import java.util.*;
// public class Solution {

//     public static void main(String[] args) {
//         HashSet<Integer> set = new HashSet<>();
//         set.add(1);
//         set.add(4);
//         set.add(3);
//         set.add(5);
//         set.add(0);
//         set.add(2);
//         set.add(100);
//         set.add(90);
//         System.out.println(set);

//     }
// }

// import java.util.*;
// public class Solution{
//     List<List<Integer>> result = new ArrayList<>();
//     List<Integer> subset = new ArrayList<>();
   
//     public int sum(List<Integer> ls)
//     {
//         int sum = 0;
//         for(int x : ls)
//             sum+=x;
//         return sum;
//     }

//     public void findCombinationSum(int nums[], int size , int target)
//     {
//         if(subset.size()==size)
//             {
//                 if(sum(subset) == target)
//                     result.add(subset);
//             }
            
//     }

//     public List<List<Integer>> combinationSum3(int k, int n) {
//         if(k > n)
//             return result;
//         int nums[] = {1,2,3,4,5,6,7,8,9};
//         findCombinationSum(nums,n,k);
//         return result;
//     }
//     public static void main(String[] args) {
        
//     }
// }

// import java.util.ArrayDeque;
// class Solution
// {
//     public int[] maxSlidingWindow(int[] nums, int k) {
//     int n = nums.length;
//     int res[] = new int[n-k];
//     int ind = 0;
//     ArrayDeque<Integer> deque = new ArrayDeque<>();
//     for(int i = 0 ; i < n ; i++)
//     {
//         if(!deque.isEmpty() && deque.peekFirst() <=i-k)
//                 deque.pollFirst();
//             while (!deque.isEmpty() && nums[deque.peekFirst()]<=nums[i]) {
//                 deque.pop();
//             }
//         deque.push(i);
//         if(i>=k-1)
//             res[ind++] = nums[deque.peekFirst()];
//     }
        
//     return res;
//     }

//     public static void main(String args[])
//     {
//         int nums[] = {1,3,-1,-3,5,3,6,7};
//         int k = 3;
//         int res[] =new Solution().maxSlidingWindow(nums,k);
//         for(int x : res)
//             System.out.print(x+" ");
        
//     }
// }


// import java.util.*;
// class StockSpanner {
//     Stack<int[]> stocks;
//     int ind ;
//     public StockSpanner() {
//         stocks = new Stack<>();
//         ind = -1;
//     }
//     public int next(int price) {
//         ind ++;   
//         while(!stocks.isEmpty() && stocks.peek()[0]<=price)
//             stocks.pop();
//            int ans = ind - (stocks.isEmpty()?-1:stocks.peek()[1]);
//         stocks.push(new int[]{price,ind});
//         return ans;
//     }
// }
// class Solution
// {
//     public static void main(String[] args) {
        
//         StockSpanner sp = new StockSpanner();
//         System.out.println(sp.next(100));
//         System.out.println(sp.next(80));
//         System.out.println(sp.next(60));
//         System.out.println(sp.next(70));
//         System.out.println(sp.next(60));
//         System.out.println(sp.next(75));
//     }
// }

// class MyThread extends Thread
// {
//     public void run()
//     {
//         while (true) {
//                 System.out.println("Hello");
//         }   
//     }
// }
// class Solution 
// {
//     public static void main(String args[])
//     {
// MyThread[] mt = new MyThread[100000];
//         for(int i = 0 ; i < 100000 ; i++ )
//         {
//             mt[i] = new MyThread();
//             mt[i].start();
//         }
       
//     }
// }


import java.util.*;
import java.io.*;

public class Solution {
    
    // Check if characters can form a palindrome
    public static boolean canFormPalindrome(String s) {
        Map<Character, Integer> charCount = new HashMap<>();
        
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        
        int oddCount = 0;
        for (int count : charCount.values()) {
            if (count % 2 == 1) {
                oddCount++;
            }
        }
        
        return oddCount <= 1;
    }
    
    // Form the shortest palindrome from given characters
    public static String formShortestPalindrome(String s) {
        if (s.isEmpty()) {
            return "";
        }
        
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        
        // Build palindrome
        StringBuilder leftHalf = new StringBuilder();
        char middle = '\0';
        
        // Sort characters for consistent ordering
        List<Character> sortedChars = new ArrayList<>(charCount.keySet());
        Collections.sort(sortedChars);
        
        for (char c : sortedChars) {
            int count = charCount.get(c);
            // Add half of the characters to left side
            for (int i = 0; i < count / 2; i++) {
                leftHalf.append(c);
            }
            // If odd count, use this character as middle
            if (count % 2 == 1) {
                middle = c;
            }
        }
        
        // Build the palindrome
        StringBuilder palindrome = new StringBuilder();
        palindrome.append(leftHalf);
        if (middle != '\0') {
            palindrome.append(middle);
        }
        palindrome.append(leftHalf.reverse());
        
        return palindrome.toString();
    }
    
    // Solve the palindromic path problem
    public static int solvePalindromicPath(int m, int n, List<Edge> edges) {
        // Build adjacency list
        Map<Integer, List<Edge>> graph = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            graph.put(i, new ArrayList<>());
        }
        
        for (Edge edge : edges) {
            graph.get(edge.from).add(edge);
            // Uncomment for undirected graph:
            // graph.get(edge.to).add(new Edge(edge.to, edge.from, edge.character));
        }
        
        // BFS to find all possible paths from 1 to N
        Queue<State> queue = new LinkedList<>();
        Set<String> visitedStates = new HashSet<>();
        int minPalindromeLength = Integer.MAX_VALUE;
        
        queue.offer(new State(1, ""));
        
        while (!queue.isEmpty()) {
            State current = queue.poll();
            
            // If we reached the destination
            if (current.vertex == n) {
                if (canFormPalindrome(current.pathString)) {
                    String palindrome = formShortestPalindrome(current.pathString);
                    minPalindromeLength = Math.min(minPalindromeLength, palindrome.length());
                }
                continue;
            }
            
            // State to avoid revisiting same vertex with same character set
            char[] chars = current.pathString.toCharArray();
            Arrays.sort(chars);
            String stateKey = current.vertex + ":" + new String(chars);
            
            if (visitedStates.contains(stateKey)) {
                continue;
            }
            visitedStates.add(stateKey);
            
            // Explore neighbors
            for (Edge edge : graph.get(current.vertex)) {
                String newPath = current.pathString + edge.character;
                queue.offer(new State(edge.to, newPath));
            }
        }
        
        return minPalindromeLength == Integer.MAX_VALUE ? -1 : minPalindromeLength;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        List<Edge> edges = new ArrayList<>();
        
        for (int i = 0; i < m; i++) {
            int v1 = scanner.nextInt();
            int v2 = scanner.nextInt();
            char c = scanner.next().charAt(0);
            edges.add(new Edge(v1, v2, c));
        }
        
        // Solve and print result
        int result = solvePalindromicPath(m, n, edges);
        System.out.println(result);
        
        scanner.close();
    }
    
    // Test function with sample input
    public static void testWithSample() {
        System.out.println("Testing with sample input:");
        
        // Sample input:
        // 3 3
        // 1 2 a
        // 2 3 b
        // 1 3 a
        
        int m = 3, n = 3;
        List<Edge> edges = new ArrayList<>();
        edges.add(new Edge(1, 2, 'a'));
        edges.add(new Edge(2, 3, 'b'));
        edges.add(new Edge(1, 3, 'a'));
        
        int result = solvePalindromicPath(m, n, edges);
        System.out.println("Sample result: " + result);
        
        // Show possible paths:
        // Path 1->2->3: "ab" -> can form palindrome by rearranging? No, need equal chars
        // Path 1->3: "a" -> already palindrome, length 1
        
        System.out.println("Expected: 1 (path 1->3 gives 'a' which is palindrome of length 1)");
    }
    
    // Helper classes
    static class Edge {
        int from, to;
        char character;
        
        public Edge(int from, int to, char character) {
            this.from = from;
            this.to = to;
            this.character = character;
        }
    }
    
    static class State {
        int vertex;
        String pathString;
        
        public State(int vertex, String pathString) {
            this.vertex = vertex;
            this.pathString = pathString;
        }
    }
}