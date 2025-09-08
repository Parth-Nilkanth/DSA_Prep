// import java.util.*;
// import java.lang.*;
// import java.io.*;

// class Codechef
// {
// 	public static void main (String[] args) throws java.lang.Exception
// 	{
// 		// your code goes here
// 		Scanner sc = new Scanner(System.in);
// 		int tc = sc.nextInt();
		
// 		while(tc -- > 0)
// 		{
// 		   int n = sc.nextInt();
// 		   int doll[] = new int[n];
// 		   for(int i = 0 ; i < n ; i++)
//                 doll[i] = sc.nextInt();
//             int xor  = 0; 
// 		   for(int x : doll)
// 		        xor ^= x;
// 		   System.out.println(xor);
// 		}
		
// 		sc.close();

// 	}
// }

// import java.util.*;
// import java.lang.*;
// import java.io.*;

// class Codechef
// {
// 	public static void main (String[] args) throws java.lang.Exception
// 	{
// 		// your code goes here
//         Scanner sc = new Scanner(System.in);
//         int tc = sc.nextInt();
        
//         while(tc-- > 0)
//         {
//             int n = sc.nextInt();
//             int arr[][] = new int[n][n];
//             for(int i = 0; i < n ; i++)
//             {
//                 for(int j = 0; j < n ; j++)
//                 {
//                     arr[i][j] = sc.nextInt();                    
//                 }
//             }
//             int maxsum = 0;
//             for(int i = 0 ; i < n ; i++ )
//                 maxsum+=arr[i][i];
//             int rowstart = 0 , rowend = 1 , colstart = 0 , colend = 1;
//             while(rowend < n)
// 			{
// 				int sum = 0;
// 				while(rowstart <=rowend)
// 				{
// 					while(colstart<=colend)
// 					{
// 						sum+=arr[rowstart][colstart];
// 						colstart++;			
// 					}
// 					colend++;
// 					rowstart++;
// 				}
// 				rowend++;
// 			}

// 			System.out.println(maxsum);
// 	}

// }
// }

// import java.util.*;
// import java.lang.*;
// import java.io.*;

// class Codechef
// {
// 	public static void main (String[] args) throws java.lang.Exception
// 	{
// 		// your code goes here
//         Scanner sc =new Scanner(System.in);
//         int tc = sc.nextInt();
//         while( tc -- > 0)
//         {
//             int n = sc.nextInt();
//             int start = (int)Math.pow(10 , n-1);
//             int end = (int)Math.pow(10 , n) -1;
// 			System.out.println(start);
// 			System.out.println(end);
//             while(start<=end)
//             {
// 				if(start%2==1){
//                 if(start % 3 == 0 && start % 9 !=0){
//                     System.out.println(start);
//                     break;   
//                 }
// 			}
//                 start++;
//             }
            
//         }
// 	}
// }


// import java.util.*;
// import java.lang.*;
// import java.io.*;

// class Codechef
// {
// 	public static void main (String[] args) throws java.lang.Exception
// 	{
// 		// your code goes here
// 		Scanner sc = new Scanner(System.in);
// 		int tc = sc.nextInt();
// 		while(tc -- > 0)
// 		{
// 		    int n = sc.nextInt();
// 		    String s = sc.next();
// 		    int consec = 0;
// 	Set<Character> set = Set.of('A', 'E' , 'I' , 'O' , 'U' , 'a', 'e' ,'i','o','u');
// 		    for(char c : s.toCharArray())
// 		    {
// 		        if(consec == 4){
// 		            break;
// 		        }
		        
// 	                if(!set.contains(c))	        
// 	                {
// 	                    consec++;
// 	                }
// 	                else 
// 	                    consec = 0;
// 		    }
// 		    if(consec == 4)
// 		        System.out.println("NO");
// 		     else 
// 		        System.out.println("YES");
// 		}

// 	}
// }

// import java.util.Scanner;
// class Codechef
// {
// 	public static void main (String[] args) throws java.lang.Exception
// 	{
// 		// your code goes here
// 		Scanner sc = new Scanner(System.in);
// 		int tc = sc.nextInt();
// 		while(tc -- > 0)
// 		{
// 		    int n = sc.nextInt();
//             int arr[] = new int[n];
//             for(int i = 0 ; i < n ; i++)
//                 arr[i] = sc.nextInt();
//             int maxi = 0;
//             for(int x : arr)
//                 maxi = Math.max( x , maxi);
//             System.out.println(maxi);
// 		}

//         sc.close();
// 	}
// }

// import java.util.*;
// import java.lang.*;
// import java.io.*;

// class Codechef
// {
// 	public static void main (String[] args) throws java.lang.Exception
// 	{
// 		// your code goes here
//         Scanner sc = new Scanner(System.in);
//         int tc = sc.nextInt();
//         while(tc -- > 0)
//         {
//             int N = sc.nextInt();
//             int K = sc.nextInt();
//             int arr[] = new int[N];
// 			for(int i= 0 ; i < N ; i++)
// 				arr[i] = sc.nextInt();

//             for(int x : arr)
//             {

//                 if(K >=x ){
//                     System.out.print("1");
//                     K-=x;
//                 }
//                 else 
//                     System.out.print("0");
//             }
//             System.out.println();
// 	  }
// }
// }

// import java.util.*;
// import java.lang.*;
// import java.io.*;

// class Codechef
// {
// 	public static void main (String[] args) throws java.lang.Exception
// 	{
// 		// your code goes here 
// 		Scanner sc = new Scanner(System.in);
// 		int tc = sc.nextInt();
// 		while(tc -- > 0)
// 		{
// 		    int n = sc.nextInt();
// 		    sc.nextLine();
// 		    String directions[] =  new String[n];
// 		    for(int i = 0 ; i < n ; i++)
// 		        directions[i] = sc.nextLine();
// 		    String temp = directions[n-1].substring( 0 , directions[n-1].indexOf("o")-1);
// 		    directions[n-1] = directions[n-1].replace(temp , "Begin");//destination becomes beginning
// 		    for(int i = n-2 ; i >= 0 ; i--)
// 		    {
// 		        if(i==0)
// 		            directions[0] = directions[0].replace("Begin" , temp);
// 		        String temp2 = directions[i].substring( 0 , directions[i].indexOf("o")-1);
// 		        directions[i] = directions[i].replace(temp2 , temp.equals("Right")?"Left":"Right");
// 		        temp = temp2;
		        
// 		    }
		    
// 		    for(int i = n-1 ; i >=0 ; i--)
// 		        System.out.println(directions[i]);
		    
// 		}

// 	}
// }


// import java.util.*;
// import java.lang.*;
// import java.io.*;

// class codechef 
// {
// 	public static void main (String[] args) throws java.lang.Exception
// 	{
// 		// your code goes here
//         Scanner sc = new Scanner(System.in);
//         int tc = sc.nextInt();
//         while( tc -- > 0)
//         {
//             int N = sc.nextInt();
//             int H = sc.nextInt();
//             int Y1 = sc.nextInt();
//             int Y2 = sc.nextInt();
//             int L = sc.nextInt();
//             int barriers[][] = new int[N][N];
//             for(int i = 0 ; i < N ; i++)
//             {
//                 int t = sc.nextInt();
//                 int x = sc.nextInt();
//                 barriers[i] = new int[]{t,x};
//             }
//             int ans = 0;
//             for(int j = 0 ; j < N ; j++)
//             {
//                 int t = barriers[j][0];
//                 int x = barriers[j][1];
//                 if( t == 1)
//                 {
//                     if(H - Y1 > x)
//                         L--;
//                 }
//                 else {
//                     if (Y2 < x)
//                         L--;
//                 }
//                 if(L==0)
//                     break;
//                 ans++;
//             }
//             System.out.println(ans);
//         }
// 		sc.close();
// 	}
// }


// import java.util.*;
// class codechef
// {
// 	public static void main (String[] args) throws java.lang.Exception
// 	{
// 		// your code goes here
// 		Scanner sc = new Scanner(System.in);
//         int tc = sc.nextInt();
        
//         while( tc -- > 0)
//         {
//             int n = sc.nextInt();
//             int h = sc.nextInt();
//             int y1 = sc.nextInt();
//             int y2 = sc.nextInt();
//             int l = sc.nextInt();
//             int barriers[][] = new int[n][n];
//             for(int i = 0 ; i < n ; i++)
//             {
//                 int t = sc.nextInt();
//                 int x = sc.nextInt();
//                 barriers[i] = new int[]{t,x};
                
//             }
//             int count = 0;
//             for(int i =0 ; i < n ; i++)
//             {
//                 int t = barriers[i][0];
//                 int x = barriers[i][1];
//                 if(t==1)
//                 {
//                     if( h - y1 > x)
//                         l--;
                        
//                 }
//                 else 
//                 {
//                     if(y2 < x)
//                         l--;
//                 }
//                 if(l == 0)
//                     break;
//                 count++;
//             }
//             System.out.println(count);
//         }
        
// 	}
	
// }

// import java.util.Scanner;
// import java.util.Vector;
// import java.util.Collections;
// class codechef 
// {
//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         int tc = sc.nextInt();
//         while(tc -- > 0)
//         {
//             int n = sc.nextInt();
            
//             if(n%4 == 0)
//             {
//                 System.out.println("NO");
//                 continue;
//             }
//             Vector<Integer> arr1 = new Vector<>();
//             Vector<Integer> arr2 = new Vector<>();
//             Collections.reverse(arr2);
//             System.out.println("YES");
//             boolean flag = false;
//             for(int x = 1; x <= n ; x++)
//             {
//                 if(flag){
//                     arr1.add(x) ; 
//                     arr2.add(x+1);
//                 }
//                 else 
//                 {
//                     arr1.add(x+1);
//                     arr2.add(x);
//                 }
//                 flag = !flag;
//             }
//             Collections.reverse(arr2);
//             for(int x : arr1)
//                 System.out.print(x+" ");
//             System.out.println();
//             for(int x : arr2)
//                 System.out.print(x+" ");
            
//         }

//         sc.close();
//     }
// }

// import java.util.Scanner;
// class codechef 
// {
//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         int tc = sc.nextInt();
//         while( tc -- > 0)
//         {
//             int n = sc.nextInt();
//             int busSmoke = sc.nextInt();//units of smoke emitted by the bus 
//             int carSmoke = sc.nextInt(); //units of smoke emitted by the car 
//             int smokeEmitted = 0;
//             while( n > 0)
//             {
//                 System.out.println(Math.ceil(n/4));
//                 if( busSmoke <= carSmoke || Math.ceil(n/4) * carSmoke > busSmoke)
//                 {
                    
//                     smokeEmitted += busSmoke;
//                     n-=100;
//                 }
//                 else {
//                     smokeEmitted += carSmoke;
//                     n-=4;
//                 }
                
//             }
//             System.out.println(smokeEmitted);
//         }
//         sc.close();
//     }
// }

// import java.util.*;
// public class codechef 
// {
//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         int tc = sc.nextInt();
//         while(tc -- > 0)
//         {
//             int n = sc.nextInt();
//             int xor = 0;
//             for(int i = 1 ; i <= n ; i++)
//                 xor^=i;
//             System.out.println(xor);
//         }   

//     }
// }


// import java.util.*;
// import java.lang.*;
// import java.io.*;

// class codechef 
// {
// 	public static void main (String[] args) throws java.lang.Exception
// 	{
// 		// your code goes here
// 		Scanner sc = new Scanner(System.in);
// 		int tc = sc.nextInt();
		
// 		while( tc -- > 0 )
// 		{
// 		    String s = sc.next();
// 		    int n = s.length();
//             boolean flag = false;
// 		    if(s.charAt(0) == '<' && s.charAt(1) == '/' && s.charAt(n-1)=='>')
// 		        {
// 		            for(int i = 2 ; i < n-1 ; i++)
// 		            {
// 		                if( (s.charAt(i) >= 65 && s.charAt(i) <= 90) || s.charAt(i) >= 97 && s.charAt(i) <= 122)
// 		                    continue;
// 		                else 
// 		                {
//                                 flag = true;
//                                 break;
// 		                }
// 		            }
// 		        } 
//                 if(flag)
//                     System.out.println("Error");
//                 else 
//                     System.out.println("Success");
// 		}
        

// 	}
// }

import java.util.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while( tc -- > 0 )
        {
          
          int n = sc.nextInt();
          Map<String,Integer> map = new HashMap<>();
          for(int i = 0 ;  i < n * 3 ; i ++)
          {
              String s = sc.next();
              int c = sc.nextInt();
              map.put( s ,map.getOrDefault(s , 0 )+c);  
          }
          List<Integer> submissions = new ArrayList<>();
          for(int i : map.values())
             submissions.add(i);
         Collections.sort(submissions);
         for(int i : submissions)
            System.out.print(i+" ");
        
        System.out.println();
        
        }
	}
}
