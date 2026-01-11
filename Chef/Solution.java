// import java.util.*;
// import java.lang.*;
// import java.io.*;

// class Solution
// {
// 	public static void main (String[] args) throws java.lang.Exception
// 	{
// 	    Scanner sc = new Scanner(System.in);
	    
// 	    int T = sc.nextInt();
	    
// 	    while(T-- != 0){
// 	        int N = sc.nextInt();
// 	        int arr[][] = new int[N][N];
// 	        for (int i=0;i<N;i++){
// 	            for(int j=0;j<N;j++){
// 	                arr[i][j]=sc.nextInt();
// 	            }
// 	        }
	        
// 	        int maxSum=0;
// 	        for(int i=0;i<N;i++){
// 	            maxSum += arr[i][i];
// 	        }
	        
// 	        int sum=0;
// 	        for(int i=0;i<N-1;i++){
// 	            for (int j=0;j<N-1;j++){
// 	                sum = arr[i][j];
// 	                for(int k=0;k<N-2;k++){
// 	                  sum += arr[i+1][j+1];  
// 	                  System.out.println(sum);
// 	                } 
// 	                if(maxSum <= sum){
// 	                    maxSum = sum;
// 	                }
// 	            } 
// 	        }
//             System.out.println(maxSum);
// 	    }
	    
	    

// 	}
// }

import java.util.*;
public class Solution 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while( tc -- > 0)
        {
            int n = sc.nextInt();
            TreeMap<String,Integer> map = new TreeMap<>();
            for(int i = 0 ;i < 3 * n ; i ++)
            {
                String s = sc.next();
                int freq = sc.nextInt();
                map.put( s , map.getOrDefault(s ,0)+freq);
            }
            List<Integer> ls = new ArrayList<>(map.values());
            Collections.sort(ls);
            for(int x : ls)
            	System.out.print(x+" ");
           	System.out.println();
        }       
        sc.close();
    }
}