
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



// infix to prefix
import java.util.Stack;
class Solution {
    
    public static int priority(char c)
    {
        if(c=='^')
            return 3;
            
        else if(c=='*' || c=='/')
            return 2;
        
        else if(c=='+' || c== '-')
            return 1;
    
        else 
            return -1;
    }

    public static String reverse(String str)
    {

        Stack<Character> stack = new Stack<>();
        StringBuilder res = new StringBuilder();
        for(int i = 0 ; i < str.length() ; i++)
            stack.push(str.charAt(i));
        while(!stack.isEmpty())
        {
            if( stack.peek() == '(')
                res.append(')');
            else if(stack.peek() == ')')
                res.append('(');
            else
                res.append(stack.peek());
            stack.pop();
        }
        
        return res.toString();

    }
    // Function to convert an infix expression to a postfix expression.
    public static String infixToPrefix(String s) {
        // Your code here
        s = reverse(s);
        Stack<Character> stack = new Stack<>();
        StringBuilder res = new StringBuilder();
        for(int i = 0 ; i < s.length() ; i++)
        {
         
            //  case 1 : if the character is operand
            if( s.charAt(i) >= 'a' && s.charAt(i) <= 'z' ||
                s.charAt(i) >='A' && s.charAt(i) <= 'Z' ||
                s.charAt(i) >='0' && s.charAt(i) <= '9' )
                {
                    res.append(s.charAt(i));
                }
            
            //case 2 : if the character is opening bracket
            
            else if( s.charAt(i)=='(' ){
                stack.push(s.charAt(i));
            }
            
            
            //case 3 : if the charater is closing bracket
            
            else if( s.charAt(i) == ')' ){
                
                while(!stack.isEmpty() && stack.peek()!='(') 
                {
                    //pop elements and append it to string until we found op ening bracket
                        res.append(stack.pop());
                }
                //now at last pop opening braket
                stack.pop();
            }

         //case 4 : if the character is operator

         else
         {
            if(s.charAt(i) == '^'){
            
            while(!stack.isEmpty() && priority(s.charAt(i)) <= priority(stack.peek()) )
                res.append(stack.pop());


            }
            
            else
            {
                 
                 while(!stack.isEmpty() && priority(s.charAt(i)) < priority(stack.peek()) ){
                    res.append(stack.pop());

                 }


            }
            stack.push(s.charAt(i));
         }

        }

        while(!stack.isEmpty())
            res.append(stack.pop());
        res.reverse();
        return res.toString();
    }

    public static void main(String a[])
    {
        System.out.print(infixToPrefix("(a+b)-(c*d)"));

    }
}