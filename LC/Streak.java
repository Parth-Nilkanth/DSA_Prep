// class Solution 
// {
// 	public int[] getNoZeroIntegers(int n) {
// 	int res[] = new int[2];
// 	for(int i = 1 ; i <= n ; i++)
// 	{
// 		int a = i;
// 		int b = n-i;
// 		if(!(Integer.toString(a).contains("0")) && !(Integer.toString(b).contains("0")) ){
// 			res[0] = a;
// 			res[1] = b;
// 		return res;
// 		}
// 	}

// 	return res;
// 	}
// 	public static void main(String argsp[])
// 	{
// 		int res[] = new Solution().getNoZeroIntegers(999);
// 		for(int x : res)
// 			System.out.println(x+" ");

// 	}
// }

import java.util.*; 
class Solution {
    public String sortVowels(String s) {
        Set<Character> vowels = new HashSet<>();
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');
		vowels.add('A');
		vowels.add('E');
		vowels.add('I');
		vowels.add('O');
		vowels.add('U');

        StringBuilder result = new StringBuilder();
        int i = 0;
        List<Character> ls = new ArrayList<>();
        for(char c : s.toCharArray() ){
            if(vowels.contains(c))
            {
                ls.add(c);
            }
        }
		System.out.println(ls);
        Collections.sort(ls);
		System.out.println(ls);
        for(char c : s.toCharArray())
        {
            if(vowels.contains(c))
            {
                result.append(ls.get(i++));
            }
            else
                result.append(c);
        }
        return result.toString();
    }
	public static void main(String[] args) {
		System.out.println(new Solution().sortVowels("lEetcOde"));
	}
}