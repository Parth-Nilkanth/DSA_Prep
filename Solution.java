
import java.util.*;
class MinStack {
    Stack<Pair<Integer,Integer>> st;
    public MinStack() {

        st = new Stack<>();        
    }
    
    public void push(int val) {
        if(st.isEmpty())
            st.push(new Pair(val,val));
        else
            st.push(new Pair(val,Math.min(val,st.top.getValue())));

    }
    
    public void pop() {
        st.pop();

    }
    
    public int top() {
        
        st.top.getKey();
    }
    
    public int getMin() {
        st.top.getValue();
    }
}

public class Solution
{
    public static void main(String[] args)
    {
        MinStack minStack = new MinStack();
        minStack.push(-2);
    minStack.push(0);
    minStack.push(-3);
    System.out.println(minStack.getMin()); // return -3
    minStack.pop();
    System.out.println(minStack.top());    // return 0
    System.out.println(minStack.getMin());
    System.out.print(minStack.ls);
    
    }
}