import java.util.*;
class Solution 
{
	public static void main(String args[])
	{
		int mod = 1000000007;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int dp[] = new int[n+1];
		dp[0] = 1;
		for(int i = 1 ; i<= n ; i++)
		{
			for(int dice = 1 ; dice<= 6 ; dice++)
			{
				if(i - dice >= 0)
						dp[i] = (dp[i] + dp[i - dice]) % mod;
			}
		}
		System.out.println(dp[n]);
	}
}