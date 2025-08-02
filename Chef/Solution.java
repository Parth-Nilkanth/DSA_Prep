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

class Solution 
{
	public static void main(String args[])
	{
		System.out.println(Math.log(4));
	}
}