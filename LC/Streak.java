class Solution 
{
	public int[] getNoZeroIntegers(int n) {
	int res[] = new int[2];
	for(int i = 1 ; i <= n ; i++)
	{
		int a = i;
		int b = n-i;
		if(!(Integer.toString(a).contains("0")) && !(Integer.toString(b).contains("0")) ){
			res[0] = a;
			res[1] = b;
		return res;
		}
	}

	return res;
	}
	public static void main(String argsp[])
	{
		int res[] = new Solution().getNoZeroIntegers(999);
		for(int x : res)
			System.out.println(x+" ");

	}
}
