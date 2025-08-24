
// class Solution
// {
// 	public static void main(String args[])
// 	{
		
// 		int arr[] = {4,2,9,8,2,12,7,12,10,5,8,5,5,7,9,2,5,11} ,k = 14;
// 		Arrays.sort(arr);
// 		for(int x : arr)
// 			System.out.prin
// 	}
// }

// class Solution {
//     public String generateTag(String caption) {
// 		caption = caption.trim();
//      String words[] = caption.split(" ") ;
//      StringBuilder result = new StringBuilder("#");
//     if(words.length ==0)
//             return "#";
//         result.append(words[0].toLowerCase());
//             for(int i = 1 ; i < words.length ; i++)
//             {
// 				if(words[i].length()==0)
// 					continue;
//                 String s1 = words[i].substring(0, 1).toUpperCase();
//                 String nameCapitalized = s1 + words[i].substring(1).toLowerCase();
//                 result.append(nameCapitalized);
//             }
//         String res = result.toString();
//         if(res.length()>100)
//             return res.substring(0,100);
//         return res;
            
//         }
// 		public static void main(String[] args) {
// 			System.out.println( new Solution().generateTag(" fPysaRtLQLiMKVvRhMkkDLNedQKffPnCjbITBTOVhoVjiKbfSawvpisDaNzXJctQkn"));
// 		}
// }


// class Solution 
// {
//        public String[] divideString(String s, int k, char fill) {
//         int len = s.length();
//         int size = (int)Math.ceil((double)len/k);
//         String result[] = new String[size];
//         int ind = 0;
//         for(int i = 0 ; i < len ; i+=k)
//         {
//             if(i+k > len)
//             {
//                 String sub = s.substring(i);
//                 result[ind++] = sub;
//                 break;
//             }
//                 String sub = s.substring(i, i+k);
//                 result[ind++] = sub;    

//         }
//         for(String str : result)
//             System.out.println(str);
//         StringBuffer last = new StringBuffer(result[size-1]);
//         while (last.length()!=k) {
//             last.append(fill);
            
//         }
//         result[size-1] = last.toString();
//         return result;
//         }

//     public static void main(String[] args) {
        
//         String result[] = new Solution().divideString("ctoyjrwtngqwt", 8, 'n');
//         for(String str:result)
//             System.out.println(str);
//     }
// }


// LC 3307
// ASCII value of a = 97
// to be solved :(




// // LC 1004 :- Max consecutive ones
// brute force solution
// class Solution {
//     public int longestOnes(int[] nums, int k) {
//      int maxlen = Integer.MIN_VALUE;
//      int n = nums.length;
//      for(int i = 0 ; i < n ; i++)   
//      {
//         int zeroes = 0;
//         for(int j = i ; j < n ; j++)
//         {
//             if(nums[j] == 0)
//             {
//                 zeroes++;
//             }
//             if(zeroes <= k)
//             {
//                 maxlen = Math.max(maxlen, j - i + 1);
//             }
//             else 
//                 break;
//         }
//      }
//      return maxlen;
//     }
// } 




// LC : 59

// class Solution 
// {
//     public int[][] generateMatrix(int n) {
//         int res[][] = new int[n][n];
//         int left = 0 , right = n-1;
//         int top = 0 , bottom = n-1;
//         int value = 1;

//         while(left <= right)
//         {
//             // filling values in top row
//             for(int c = left ; c<= right ; c++)
//                 res[top][c] = value++;
//             top++;
//             // filling every value in right column
//             for(int r = top ; r <=bottom ; r++ )
//                 res[r][right] = value++;
//             right--;
//             // filling every value in bottom column (reverse order)
//             for(int c = right ; c>= left  ; c--)
//                 res[bottom][c] = value++;
//             bottom--;
//             // filling every value in left column (reverse order)
//             for(int r = bottom ; r >= top ; r--)
//                 res[r][left] = value++;
//             left++;
//         }
//         return res;
//     }
//     public static void main(String aegs[])
//     {
//         int res[][] = new Solution().generateMatrix(7);
//         for(int arr[] : res)
//         {
//             for(int x : arr)
//             {
//                 System.out.print(x+"   ");
//             }
//             System.out.println();
//         }
//     }
// }


// import java.util.HashMap;
// class Solution {
//     public int totalFruits(int[] fruits) {
//         //your code goes here
//         HashMap<Integer, Integer> map = new HashMap<>();
//         for(int x : fruits)
//         {
//           map.put(x , map.getOrDefault(x,0)+1);
//         }
//         System.out.println(map);
//         int large = 0, slarge = 0;
//         for(int x : map.keySet())
//         {
//             if(large < map.get(x)){
//                 slarge = large;
//                 large = map.get(x);
//             }
//             else if(slarge < map.get(x) && slarge < large)
//                 slarge = map.get(x);
//         }
//         System.out.println(large+" "+slarge);
//         return large +slarge;
//     }

//     public static void main(String args[])
//     {
//         int fruits[] = {1,2,1};
//             System.out.println(new Solution().totalFruits(fruits));
//     }
// }


// Leetcode     1290

//   Definition for singly-linked list.

// import java.util.List;
// import java.util.Stack;

// class ListNode {
//       int val;
//       ListNode next;
//       ListNode() {}
//       ListNode(int val) { this.val = val; }
//       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//   }
 



// public class Solution {
//     public int getDecimalValue(ListNode head) {
//         int num = 0;
//         ListNode temp = head;//itereator to move through the list
//         Stack<Integer> stack = new Stack<>();
//         while(temp!=null)
//         {   
//             stack.push(temp.val);
//             temp = temp.next;
//         }   
//         int result = 0;
//         int base = 0; 
//         while(!stack.isEmpty())
//         {
//                 if(stack.peek()==1)
//                 {
//                     result = result + (int)Math.pow(2,base);
//                 }
//                 stack.pop();
//                 base++;
//         }
//         return result;
//     }
//     public static void main(String[] args) {
//         ListNode head = new ListNode(1);
//         head.next = new ListNode(1);
//         head.next.next = new ListNode(1);
//         head.next.next.next = new ListNode(1);
//         new Solution().getDecimalValue(head);
//     }
// }

// import java.util.*;
// class Solution{
//     public static void main(String str[])
//     {
//         List<Integer> ls = new ArrayList<>();
//         ls.add(1);
//         ls.add(2);
//         ls.add(3);
//         ls.add(4);
//         System.out.println(ls);
//         System.out.println(ls);

//     }
// }

// import java.util.*;

// class Solution {
//     public boolean isValid(String word) {
//         // char a = 97;
//         // char z = 122;
//         // char A = 65;
//         // char Z = 90;
//         // System.out.println(97 == 'a');
//         // System.out.println(a);
//         // System.out.println(z);
//         // System.out.println(A);
//         // System.out.println(Z);
//         // Character.
//         // return false;
//         if(word.length()<3)
//             return false;
//           HashSet<Character> vowels = new HashSet<>(Arrays.asList('A' , 'E' , 'I' , 'O' , 'U', 'a' , 'e' , 'i' , 'o' , 'u' ));
//           boolean  cC=false , cV=false;
//         for(char c : word.toCharArray())
//         {
//             if(Character.isDigit(c))
//                 continue;
//             else if( (c >='A' && c <='Z' && vowels.contains(c)) || (c >='a' && c <='z' && vowels.contains(c)) )
//                 cV = true;
//             else if( (c >='A' && c <='Z' && !vowels.contains(c)) || (c >='a' && c <='z' && !vowels.contains(c)))
//                 cC = true;
//             else 
//                 return false;

//         }
//         return cV && cC;
//     }
//     public static void main(String args[])
//         {
//             System.out.println(new Solution().isValid("abc"));
//         }
        
// }

// import java.io.*;
// import java.util.* ;

// public class Solution {
//     public static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {
//         // Write your code here.
        
//         // base case 
//         if(arr.length == 1)
//             return 1;
//         Arrays.sort(arr);
//         int maxcount = 0;
//         int previous = 0 , next = 1;
//         int count =1 ;
//         while(next < N)
//         {
//             if(arr[next] - arr[previous] == 1)
//                 count++;
//             else
//                 count = 0;
//             maxcount = Math.max(maxcount , count );
//             previous++;
//             next++;
//         }
//         return maxcount;
//     }
//     public static void main(String args[])
//     {
//         int arr[] = {1,2,3,4,5};
//         int N = 5;
//         System.out.println(Solution.lengthOfLongestConsecutiveSequence(arr, N));
//     }
// }

// import java.util.Scanner;
// class Solution
// {
//     public static void main(String agr[])
//     {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int sp = n-1;
//         int st = 1;
//         for(int i = 0 ; i < n ; i++)
//         {
//             for(int j = 1 ; j <= sp ; j++)
//             {
//                 System.out.print(" ");
//             }
//             sp-=1;
//             for(int j = 1 ; j <= st ; j++)
//                 System.out.print("*");
//             System.out.println();
//             st+=2;
//         }
//         sc.close();
//     }
// }


// import java.util.Scanner;
// class Solution
// {
//     public static void main(String agr[])
//     {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int sp = n-1;
//         int st = 1;
//         for(int i = 0 ; i < n ; i++)
//         {
//             for(int j = 1 ; j <= sp ; j++)
//             {
//                 System.out.print(" ");
//             }
//             sp-=1;
//             for(int j = 1 ; j <= st ; j++)
//                 System.out.print("*");
//             System.out.println();
//             st+=2;
//         }
//         sc.close();
//     }
// }


// Lc 1717
// class Solution 
// {
//       public int maximumGain(String s, int x, int y) {
//         int totalpoints = 0;
        

//         return totalpoints;
//     }
//     public static void main(String args[])
//     {
//         String s ="cdbcbbaaabab";
//             System.out.println(new Solution().maximumGain(s, 4, 5));
//     }
// }

// class Solution {
//     public int numberOfSubstrings(String s) {
//      int right = 0 , left = 0;
//      int n = s.length();
//      HashSet<Character> set = new HashSet<>();
//      int count = 0;
//      while(right < n)
//      {  
//         if(set.contains('a') && set.contains('b') && set.contains('c'))
//         {
//             count = s.length() - right +1;
//             left++;

//         }
//         set.add(s.charAt(right));
//         right++;
//      }  
//         return count;
//     }
// }


// class Solution {
//     public void gameOfLife(int[][] board) {
//        int n = board.length;
//        int m = board[0].length;
//        for(int i = 0 ; i < n ; i++) 
//        {
        
//         for(int j = 0 ; j < m ; j++)
//         {
//             int count = 0;
//                 if(j-1 >= 0 && Math.abs( board[i][j-1]) ==1 )
//                     count++;
//                 if( (i - 1 >= 0  && j - 1 >= 0)&& Math.abs( board[i-1][j - 1]) ==1)
//                     count++;
//                 if(i - 1 >= 0 && Math.abs( board[i-1][j]) ==1)
//                     count++;
//                 if( ((i-1>=0) && j+1  < m ) && Math.abs( board[i-1][j+1]) == 1 )
//                     count++;
//                 if(  (j+1 < m) &&  Math.abs( board[i][j+1]) ==1) 
//                     count++;
//                 if( (i+1 < n && j-1 >=0) && Math.abs( board[i+1][j-1] )== 1)
//                     count++;
//                 if((i+1 <n) && Math.abs( board[i+1][j]) ==  1)
//                     count++;
//                 if((i+1 < n && j+1 < m) && Math.abs( board[i+1][j+1]) == 1)
//                     count++;
                
//                 if(count < 2 || count > 3)
//                     board[i][j] = -1;
//                 else if(count ==3 && board[i][j] ==0)//dead already , become live later
//                     board[i][j] = 2;
                
//         }
//        }
//        for(int i = 0 ;  i < n ; i++)
//         {
//             for(int j = 0 ; j < m ; j++)
//             {
//                 if(board[i][j]<0)
//                     board[i][j]  = 0;
//                 if(board[i][j] > 0)
//                     board[i][j] = 1;
//             }
//         }
//     }

//     public static void main(String args[])
//     {
//         int board[][] = {{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
//         for(int i = 0 ; i < board.length ; i ++)
//         {
//             for(int j = 0 ; j < board[0].length ; j++)
//             {
//                 System.out.print(board[i][j] +" ");
//             }
//             System.out.println();
//         }
//         System.out.println("------------------------------------");
//         new Solution().gameOfLife(board);
//         for(int i = 0 ; i < board.length ; i ++)
//         {
//             for(int j = 0 ; j < board[0].length ; j++)
//             {
//                 System.out.print(board[i][j] +" ");
//             }
//             System.out.println();
//         }
//     }
// }

// class Solution {
//     public int maxBalancedShipments(int[] weight) {
//         int count = 0;
//         int n = weight.length;
//         int l = 0 , r = 1;
//         int max = Integer.MIN_VALUE;
//         while( r < n)
//             {
    
//                 if(weight[r] > weight[l] )
//                 {
//                     count++;
//                     r++;
//                     l = r -1;
//                     continue;
//                 }
//                 r++;
//             }
            
//         return count ;
//     }
//     public static void main(String args[])
//     {
//         int weight[] = {2,5,1,4,3};
//         System.out.println(new Solution().maxBalancedShipments(weight));
//     }
// }

// class Solution {
//     public boolean isTrionic(int[] nums) {
        
//         int n = nums.length;
//         if (n < 3) return false; 

//         int i = 0;
        
//         while (i < n - 1 && nums[i] < nums[i+1]) i++;
//         if (i == 0) return false;

//         int p = i;
        
//         while (p < n - 1 && nums[p] > nums[p+1]) p++;
//         if (p == i) return false; 

//         int q = p;
        
//         while (q < n - 1 && nums[q] < nums[q+1]) q++;
//         if (q == p) return false;

        
//         return q == n - 1;
//     }
//     public static void main(String[] args) {
//         int nums[] = {1,3,5,4,2};
//         System.out.println(new Solution().isTrionic(nums));

//     }
// }

// import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.List;

// class Solution 
// {
//     public static void main(String args[])
//     {

//     }
//      public int[] topKFrequent(int[] nums, int k) {
//         HashMap<Integer , Integer> map = new HashMap<>();
//         List<Integer> list = new ArrayList<>();
//         for(int n : nums)
//         {
//                 map.put(n , map.getOrDefault( n , 0) +1 ); 
//         }
        

//     }
// }

// import java.util.*;
// class Solution 
// {
//        public int[] topKFrequent(int[] nums, int k) {
//             int arr[] = new int[k];
//             HashMap<Integer,Integer> map = new HashMap<>();
//             for(int x : nums)
//             {
//                     map.put( x , map.getOrDefault(x, 0) + 1);
//             }
//             Collections.sort(map);
            
//             return arr;
//     }
//     public static void main(String args[])
//     {
//             int nums[] ={1,1,1,2,2,3};
//             int k = 2;
//             int res[] = new Solution().topKFrequent(nums, k);
//             for(int r : res)
//                 System.out.print(r+ " ");
//     }
// }

// class Solution 
// {
//           public boolean isPowerOfTwo(int n) {
//                 System.out.println();
//                 return true;
//         }
//         public static void main(String args[])
//         {
//                 int n = 1;
//                 System.out.println(new Solution().isPowerOfTwo(1));
//         }
// }

class Solution {
    int gcd(int n1 , int n2)
    {
        int num  = Math.min(n1 , n2);
        int gcd = 1;
        for(int i = 1 ; i <= num ; i++ )
            {
                    if(n1%i==0 && n2%i==0)
                            gcd = i;
            }
        return gcd;
    }
    public int gcdOfOddEvenSums(int n) {
        int count = n*2;
        int sumOdd = 0;
        int sumEven = 0;
        for(int i = 1 ; count>0; i++)
            {
                if(i%2==0)
                        sumEven+=i;
                else
                    sumOdd+=i;
                count--;
            }
        return gcd(sumOdd ,sumEven);
    }
    public static void main(String[] args) {
        System.out.println(new Solution().gcdOfOddEvenSums(5));
    }
}