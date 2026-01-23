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

// import java.util.*; 
// class Solution {
//     public String sortVowels(String s) {
//         Set<Character> vowels = new HashSet<>();
// 		vowels.add('a');
// 		vowels.add('e');
// 		vowels.add('i');
// 		vowels.add('o');
// 		vowels.add('u');
// 		vowels.add('A');
// 		vowels.add('E');
// 		vowels.add('I');
// 		vowels.add('O');
// 		vowels.add('U');

//         StringBuilder result = new StringBuilder();
//         int i = 0;
//         List<Character> ls = new ArrayList<>();
//         for(char c : s.toCharArray() ){
//             if(vowels.contains(c))
//             {
//                 ls.add(c);
//             }
//         }
// 		System.out.println(ls);
//         Collections.sort(ls);
// 		System.out.println(ls);
//         for(char c : s.toCharArray())
//         {
//             if(vowels.contains(c))
//             {
//                 result.append(ls.get(i++));
//             }
//             else
//                 result.append(c);
//         }
//         return result.toString();
//     }
// 	public static void main(String[] args) {
// 		System.out.println(new Solution().sortVowels("lEetcOde"));
// 	}
// }

// import java.util.*;
// class Solution
// {
// 	 HashMap<String, String> exactMap;      // exact match: query -> word
//     HashMap<String, String> caseMap;       // case insensitive: lowercase -> first word
//     HashMap<String, String> vowelMap;      // vowel error: pattern -> first word
    
//     public boolean isVowel(char c) {
//         return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || 
//                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
//     }
    
//     // Convert word to vowel pattern (replace vowels with '*')
//     private String getVowelPattern(String word) {
//         StringBuilder sb = new StringBuilder();
//         for (char c : word.toCharArray()) {
//             if (isVowel(c)) {
//                 sb.append('*');
//             } else {
//                 sb.append(Character.toLowerCase(c));
//             }
//         }
//         return sb.toString();
//     }
    
//     public String[] spellchecker(String[] wordlist, String[] queries) {
//         exactMap = new HashMap<>();
//         caseMap = new HashMap<>();
//         vowelMap = new HashMap<>();
        
//         // Build the maps
//         for (String word : wordlist) {
//             // Exact match
//             exactMap.put(word, word);
            
//             // Case insensitive match (only store first occurrence)
//             String lowerWord = word.toLowerCase();
//             if (!caseMap.containsKey(lowerWord)) {
//                 caseMap.put(lowerWord, word);
//             }
            
//             // Vowel error match (only store first occurrence)
//             String vowelPattern = getVowelPattern(word);
//             if (!vowelMap.containsKey(vowelPattern)) {
//                 vowelMap.put(vowelPattern, word);
//             }
//         }
        
//         String[] result = new String[queries.length];
        
//         for (int i = 0; i < queries.length; i++) {
//             String query = queries[i];
            
//             // Priority 1: Exact match
//             if (exactMap.containsKey(query)) {
//                 result[i] = query;
//             }
//             // Priority 2: Case insensitive match
//             else if (caseMap.containsKey(query.toLowerCase())) {
//                 result[i] = caseMap.get(query.toLowerCase());
//             }
//             // Priority 3: Vowel error match
//             else if (vowelMap.containsKey(getVowelPattern(query))) {
//                 result[i] = vowelMap.get(getVowelPattern(query));
//             }
//             // No match found
//             else {
//                 result[i] = "";
//             }
//         }
        
//         return result;
//     }	

// 	public static void main(String a[]){
// 		String wordList[] = {"KiTe","kite","hare","Hare"};
//         String queries[] = {"Hear"};
// 		// String queries[] ={"kite","Kite","KiTe","Hare","HARE","Hear","hear","keti","keet","keto"};
//         //exp output:      ["kite","KiTe","KiTe","Hare","hare","","","KiTe","","KiTe"]
//         // actual output:    kite    KiTe    KiTe    Hare    hare    Hare    hare    kite    kite    kite
// 		String[] res = new Solution().spellchecker(wordList , queries);
// 		for(String s  : res)
// 		{
// 			if(s.isEmpty()){
// 				System.out.print("empty");
// 				continue;	
// 			}
// 				System.out.print(s+"\t");
// 		}
// 	}
// }

// import java.util.*;
//     class Solution {
//     public int canBeTypedWords(String text, String brokenLetters) {
//        HashSet<Character> s = new HashSet<>();
//        for(char c : brokenLetters.toCharArray()) 
//             s.add(c);
//         int canTyped = 0;
//         int i = 0, j =0;
//         int n = text.length();
//         while( i < n)
//         {
            
//             boolean flag = true;
//             j = i;
//             while(j < n && text.charAt(j)!=' ')
//             {
//                 if(s.contains(text.charAt(j)))
//                 {
//                     flag = false;
//                 }
//                 j++;  
//             }
//             if(flag)
//                 canTyped++;
//             i = j  + 1;//skip space and jump to next character
         
//         }
//         return canTyped;
//         }
        
//         public static void main(String[] args) {
//             String text  ="leet code";
//             String brokenLetters = "e";
//             int ans = new Solution().canBeTypedWords(text,brokenLetters);
//             System.out.println(ans);
//         }
//     }


// class Spreadsheet {
//     int rows;
//     int cols;
//     int sheet[][];
//     public Spreadsheet(int rows) {
//         this.rows = rows;
//         cols = 26;
//         sheet = new int[rows+1][cols+1];
//     }
    
//     public void setCell(String cell, int value) {
//         int c = cell.charAt(0)-'A';
//         int r = Integer.parseInt(cell.substring(1)) - 1;
//         // System.out.print(cell+" ");
//         // System.out.println(r  +" " + c);
//         sheet[r][c] = value;
//     }
    
//     public void resetCell(String cell) {
//         int c = cell.charAt(0) - 'A';
//         int r = Integer.parseInt(cell.substring(1)) -1;
//         sheet[r][c] = 0;
//     }
//     public int getIndexVal(String s )
//     {
//         int c = s.charAt(0) - 'A';
//         int r = Integer.parseInt(s.substring(1)) -1;
//         return sheet[r][c];
//     }
//     public int getValue(String formula) {
//         formula = formula.substring(1);
//         int x , y , i = 0;

//         if(Character.isDigit(formula.charAt(i)))
//         {
//             while(formula.charAt(i)!='+')
//                 i++;
//             x = Integer.parseInt(formula.substring(0,i));
//         }
//         else {
//             while(formula.charAt(i)!='+')
//                 i++;
//             x = getIndexVal(formula.substring(0 , i));
//         }
//     i++;//escape + operator
//     int temp = i;
//     if(Character.isDigit(formula.charAt(i)))
//         {
//             while(i < formula.length())
//                 i++;
//             y = Integer.parseInt(formula.substring(temp,i));
//         }
//         else {
//             while(i < formula.length())
//                 i++;
//             y = getIndexVal(formula.substring(temp , i));
//         }
//         return x + y;
//     }
// }


// class Solution  
// {
//     public static void main(String args[])
//     {
//         System.out.println('B'-'A');
//         Spreadsheet spreadsheet = new Spreadsheet(3); // Initializes a spreadsheet with 3 rows and 26 columns
//     System.out.println(spreadsheet.getValue("=5+7")); // returns 12 (5+7)
//     spreadsheet.setCell("A1", 10); // sets A1 to 10
//     System.out.println(spreadsheet.getValue("=A1+6")); // returns 16 (10+6)
//     spreadsheet.setCell("B2", 15); // sets B2 to 15
//     System.out.println(spreadsheet.getValue("=A1+B2")); // returns 25 (10+15)
//     spreadsheet.resetCell("A1"); // resets A1 to 0
//     System.out.println(spreadsheet.getValue("=A1+B2")); // returns 15 (0+15)
//     }
// }


// import java.util.*;
// class Router {
//     int source;
//     int destination;
//     int timestamp;
//     int memoryLimit;
//     LinkedHashSet<Router> set = new LinkedHashSet<>();
//     public Router(int memoryLimit) {
//         this.memoryLimit = memoryLimit;
//     }
//     public Router(int source , int destination , int timestamp)
//     {
//         this.source = source;
//         this.destination = destination;
//         this.timestamp = timestamp;
//     }
//     public boolean addPacket(int source, int destination, int timestamp) {
//         Router r = new Router(source, destination, timestamp);
//         if(!set.contains(r)  ){
//             if(set.size() > memoryLimit)
//                 set.removeFirst();
//             set.add(r);
//             return true;
//         }
//         return false;
//     }
    
//     public int[] forwardPacket() {
//         if(set.isEmpty())
//             return new int[]{};
//         Router r = set.getFirst();
//         set.removeFirst();
//         int res[] = new int[3];
//         res[0] = r.source;
//         res[1] = r.destination;
//         res[2] = r.timestamp;
//         return res;
//     }
    
//     public int getCount(int destination, int startTime, int endTime) {
//         int count = 0;
//         for(Router x : set)
//         {
//             if(x.destination == destination )
//             {
//                 if(x.timestamp>=startTime && x.timestamp <= endTime)
//                     count++;
//             }
//         }
//         return count;
//     }
//     public String toString()
//     {
//         return source+" "+destination+" "+timestamp;
//     }
// }

// /**
//  * Your Router object will be instantiated and called as such:
//  * Router obj = new Router(memoryLimit);
//  * boolean param_1 = obj.addPacket(source,destination,timestamp);
//  * int[] param_2 = obj.forwardPacket();
//  * int param_3 = obj.getCount(destination,startTime,endTime);
//  */

// class Solution 
// {
//     public static void main(String args[])
//     {
//     Router router = new Router(3); // Initialize Router with memoryLimit of 3.
//     router.addPacket(1, 4, 90); // Packet is added. Return True.
//     System.out.println(router.set);
//     router.addPacket(2, 5, 90); // Packet is added. Return True.
//     System.out.println(router.set);
//     router.addPacket(1, 4, 90); // This is a duplicate packet. Return False.
//     System.out.println(router.set);
//     router.addPacket(3, 5, 95); // Packet is added. Return True
//     System.out.println(router.set);
//     router.addPacket(4, 5, 105); // Packet is added, [1, 4, 90] is removed
//     System.out.println(router.set);
//     }
// }

// import java.util.*;
// class Solution 
// {
//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         for(int i = 0 ; i  < n ; i++)
//             arr[i] = sc.nextInt();
//         int x = sc.nextInt();
//         Arrays.sort(arr);
//         int count = 0;
//         int sum = 0;
//         for(int i : arr)
//         {   
//             sum+=i;
//             if(sum <= x)
//                 count++;
//             if(sum > x)
//                 break;
            
//         }
//         System.out.println(count);
//         sc.close();
//     }
// }

// class Solution {
//     public int compareVersion(String version1, String version2) {
//         int n1 = version1.length(), n2 = version2.length();
//         int i = 0, j = 0;
        
//         while (i < n1 || j < n2) {
//             int num1 = 0;
//             while (i < n1 && version1.charAt(i) != '.') {
//                 num1 = num1 * 10 + (version1.charAt(i) - '0');
//                 i++;
//             }
//             int num2 = 0;
//             while (j < n2 && version2.charAt(j) != '.') {
//                 num2 = num2 * 10 + (version2.charAt(j) - '0');
//                 j++;
//             }
//             if (num1 > num2) return 1;
//             if (num1 < num2) return -1;
//             i++; // Skip the dot
//             j++;
//         }
//         return 0;
//     }
// }


// class Solution 
// {

//        public String fractionToDecimal(int numerator, int denominator) {
//         double result = (double)numerator/denominator;
//         StringBuilder res = new StringBuilder(Double.toString(result));
//         int i = 0;
//         while(res.charAt(i)!='.')
//             i++;
        

//         return res.toString();
//     }

//     public static void main(String args[])
//     {
        
//     //  System.out.println(new Solution().fractionToDecimal(4,333));   
//     }
// }


// class Solution 
// {
//     int totalBottles(int bottle , int numExchange)
//     {
//             return 0;
//     }
//     public static void main(String args[])
//     {
//         in 
//     }
// }


// class Solution 
// {
//         public int numWaterBottles(int numBottles, int numExchange) {
//         int total = numBottles;
//         int temp = numBottles/numExchange;
//         while(temp >= numExchange)
//         {
//             total+=temp;
//             int empty=numBottles%numExchange;
//             temp = empty +(temp)/numExchange;
//         }
//         }

//     public static void main(String args[])
//     {
//         int bottles = 9;
//         int exchange = 3 ;
//         System.out.println(new Solution().numWaterBottles(bottles , exchange));
//         // expected output 13
//     }
// }

// class Solution {
//     public boolean isAnagram(String s, String t) {
//       if(s.length()!=t.length())
//         return false;
//       int hash1[] = new int[26];
//       int hash2[] = new int[26];
//       int n = s.length();
//       for(int i = 0 ; i < n ; i++ )
//       {
//         hash1[s.charAt(i)-'a']++;
//         hash2[t.charAt(i)-'a']++;
//       }
//       for(int i = 0 ; i < 26 ; i++)
//       {
//         if(hash1[i]!=hash2[i])
//             return false;
//       }
//       return true;
//     }
//     public static void main(String[] args) {
//         String s = "ggii";
//         String t  = "eekk";
//             System.out.println(new Solution().isAnagram(s , t));
//     }
// // }


// class Solution {
//     public long countNoZeroPairs(long n) {
//      long count = 0 ;
//      long start = 1;
//      long end = n -1;
//      while(end>=1)
//          {
          
//              if( (!containsZero(start)) && (!containsZero(end)))
//              {
//                  count+=1;
//              }
//              start++;
//              end--;
//          }
//          return count;
//     }
//     boolean containsZero(long num)
//     {
//       if(num==0)
//         return true;
//           while(num > 0)
//             {
//                 long d = num%10;
//                 if(d==0)
//                     return true;
//                 num/=10;
//             }
//         return false;
//     }
//     public static void main(String[] args) {
//       System.out.println(new Solution().countNoZeroPairs(11));
//       // System.out.println(new Solution().containsZero(10));
//       // System.out.println(new Solution().containsZero(0));
//       // System.out.println(new Solution().containsZero(20));

//     }
//     }


// class Solution {
//     public int longestSubsequence(int[] nums) {
//         int n = nums.length;
//         int maxlen = 0;
//         for(int i = 1 ; i < n ; i++)
//             {
//                 for(int j = 0 ; j < n ; j++)
//                     {
//                         int xor = 0;
//                         for(int k = j ; k <=i ; k++)
//                                 xor^=nums[k];
//                         if(xor!=0)
//                                 maxlen = Math.max(i - j +1 , maxlen);
//                     }
//             }
//         return maxlen;
//     }
//     public static void main(String[] args) {
//       int nums[] = {2,3,4};
//       System.out.println(new Solution().longestSubsequence(nums));
//     }
// }

// class Solution 
// {
//     public static void main(String args[])
//     {
//         System.out.println("Hello World");
//         String a[] = {"Parth","Nilkanth"};
//         void b;
//         main(a , b);
//     }
//     public static void main(String a[] , void x)
//     {
//         System.out.println(a[0]);
//         System.out.println(a[1]);
//     }
    
// }
// class Solution2 extends Solution 
// {
//     public static void main(String args[])
//     {
//         System.out.println("Solution2");
//     }
// }

// class Solution 
// {

//         public int maximumEnergy(int[] energy, int k) {
//         int n = energy.length;
//         int prefixsum[] = new int[n];
//         int dp[] = new int[n+1];
//         for(int i = 0 ; i < n ; i++)
//         {
//             dp[i] = dp[i+k]+energy[i];
//         }
//         return dp[n];
//     }


//     public static void main(String args[])
//     {
//         int energy[] = {5,2,-10,-5,1};
//         int k  =3;
//         System.out.println(new Solution().maximumEnergy(energy,k));
//     }
// }

// class Solution {

// static class DSU {
//         int[] parent;
//         int[] size;
//         DSU(int n) {
//             parent = new int[n];
//             size = new int[n];
//             for (int i = 0; i < n; ++i) {
//                 parent[i] = i;
//                 size[i] = 1;
//             }
//         }
//         int find(int x) {
//             if (parent[x] != x) parent[x] = find(parent[x]);
//             return parent[x];
//         }
//         void union(int a, int b) {
//             a = find(a);
//             b = find(b);
//             if (a == b) return;
//             if (size[a] < size[b]) { int t = a; a = b; b = t; }
//             parent[b] = a;
//             size[a] += size[b];
//         }
//     }
//     public int[] processQueries(int c, int[][] connections, int[][] queries) {
//         DSU dsu = new DSU(c + 1);
//         for (int[] edge : connections) {
//             int u = edge[0];
//             int v = edge[1];
//             dsu.union(u, v);
//         }
//         Map<Integer, TreeSet<Integer>> compToOnline = new HashMap<>();
//         for (int i = 1; i <= c; ++i) {
//             int root = dsu.find(i);
//             compToOnline.computeIfAbsent(root, k -> new TreeSet<>()).add(i);
//         }
//         boolean[] online = new boolean[c + 1];
//         Arrays.fill(online, true);
//         List<Integer> answers = new ArrayList<>();
//         for (int[] q : queries) {
//             int type = q[0];
//             int x = q[1];
//             if (type == 1) { 
//                 if (online[x]) {
//                     answers.add(x);
//                 } else {
//                     int root = dsu.find(x);
//                     TreeSet<Integer> set = compToOnline.get(root);
//                     if (set == null || set.isEmpty()) {
//                         answers.add(-1);
//                     } else {
//                         answers.add(set.first()); 
//                     }
//                 }
//             }else if (type == 2) { 
//                 if (online[x]) {
//                     online[x] = false;
//                     int root = dsu.find(x);
//                     TreeSet<Integer> set = compToOnline.get(root);
//                     if (set != null) set.remove(x);
//                 }
//             }
//         }
//         int[] res = new int[answers.size()];
//         for (int i = 0; i < answers.size(); ++i) res[i] = answers.get(i);
//         return res;
//     }

// 	public static void main(String args[])
// 	{
// 		Solution s = new Solution();
// 		int c = 5;
// 		int connections[][]= { 
// 			{1 ,2 },
// 			{2,3},
// 			{3,4},
// 			{4,5}
// 		};
// 		int queries[][] = {{1,3},{2,1},{1,1},{2,2},{1,2}};
// 		int res[] = s.processQueries(c,connections, queries);


// 	}
// }

// class Solution 
// {
// 	    public int[][] rangeAddQueries(int n, int[][] queries) {
//         int[][] diff = new int[n + 1][n + 1];

//         // Apply difference array technique
//         for (int[] q : queries) {
//             int r1 = q[0], c1 = q[1];
//             int r2 = q[2], c2 = q[3];

//             diff[r1][c1] += 1;
//             diff[r1][c2 + 1] -= 1;
//             diff[r2 + 1][c1] -= 1;
//             diff[r2 + 1][c2 + 1] += 1;
//         }
//         for(int i = 0 ; i <= n ; i ++)
//         {
//         	for(int j = 0 ; j <= n ; j++)
//         	{
//         		System.out.print(diff[i][j]+" ");
//         	}
//         	System.out.println();
//         }

//         // Build prefix sums row-wise
//         for (int i = 0; i < n; i++) {
//             for (int j = 1; j < n; j++) {
//                 diff[i][j] += diff[i][j - 1];
//             }
//         }

//         // Build prefix sums column-wise
//         for (int j = 0; j < n; j++) {
//             for (int i = 1; i < n; i++) {
//                 diff[i][j] += diff[i - 1][j];
//             }
//         }

//         int[][] ans = new int[n][n];
//         for (int i = 0; i < n; i++)
//             for (int j = 0; j < n; j++)
//                 ans[i][j] = diff[i][j];

//         return ans;
//     }

// 	public static void main(String argsd[])
// 	{
// 		int n = 3;
// 		int queries[][] = {
// 			{1,1,2,2},
// 			{0,0,1,1},
// 		};
// 		new Solution().rangeAddQueries( n, queries);
// 	}
// }

// class Solution {
//     public int modulo = 1000000007;
//     public int numSub(String s) {
//          int l = 0 , r = 0 ;
//          int n = s.length();
//          int count = 0;
//          while( r < n )
//          {
//                 if(s.charAt(r) =='1')
//                 {
//                     l = r;
//                     while(r  < n && s.charAt(r) == '1')
//                         r++;
//                     System.out.println(s.substring(l,r));
//                 }
//             int len = r - l + 1;
//             count /= modulo;
//             r++;
//          }
//          return 0;
//     }
//     public static void main(String args[])
//     {
//     	// Solution s = new Solution();
//     	// s.numSub("11111100011101101");
//     	var ans = 1e+9;
//     	System.out.println(ans);
//     }
// }


// lc 3531
// brute force
// import java.util.*;

// class Solution {

//     public int countCoveredBuildings(int n, int[][] buildings) {

//         boolean[][] grid = new boolean[n+1][n+1];

//         for (int[] b : buildings)
//             grid[b[0]][b[1]] = true;

//         int count = 0;

//         for (int[] b : buildings) {
//             int r = b[0], c = b[1];

//             boolean up = false, down = false, left = false, right = false;

//             // UP
//             for (int i = r - 1; i >= 0; i--) {
//                 if (grid[i][c]) { up = true; break; }
//             }

//             // DOWN
//             for (int i = r + 1; i <= n; i++) {
//                 if (grid[i][c]) { down = true; break; }
//             }

//             // LEFT
//             for (int j = c - 1; j >= 0; j--) {
//                 if (grid[r][j]) { left = true; break; }
//             }

//             // RIGHT
//             for (int j = c + 1; j <= n; j++) {
//                 if (grid[r][j]) { right = true; break; }
//             }

//             if (up && down && left && right)
//                 count++;
//         }

//         return count;
//     }

//     public static void main(String[] args) {

//         int[][] buildings = {
//             {1,2}, {2,2}, {3,2}, {2,1}, {2,3}
//         };

//         System.out.println(new Solution().countCoveredBuildings(3, buildings));
//     }
// }


// more optimal
// import java.util.*;

// class Solution {

//     public int countCoveredBuildings(int n, int[][] buildings) {

//         int count = 0;

//         for (int[] b : buildings) {
//             int r = b[0], c = b[1];

//             boolean up = false, down = false, left = false, right = false;

//             // scan through buildings array → no extra memory
//             for (int[] other : buildings) {
//                 int x = other[0], y = other[1];

//                 if (y == c) {            // same column
//                     if (x < r) up = true;
//                     if (x > r) down = true;
//                 }

//                 if (x == r) {            // same row
//                     if (y < c) left = true;
//                     if (y > c) right = true;
//                 }

//                 // short-circuit if all found
//                 if (up && down && left && right)
//                     break;
//             }

//             if (up && down && left && right)
//                 count++;
//         }

//         return count;
//     }

//     public static void main(String[] args) {
//         int[][] buildings = {
//             {1,2},{2,2},{3,2},{2,1},{2,3}
//         };
//         System.out.println(new Solution().countCoveredBuildings(3, buildings));
//     }
// }


// class Solution {
//     public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
//         List<String> result = new ArrayList<>();
//         List<String> result1 = new ArrayList<>();
//         List<String> result2 = new ArrayList<>();
//         List<String> result3 = new ArrayList<>();
//         int n = code.length;
//         Set<String> set = Set.of("electronics", "grocery", "pharmacy", "restaurant");
//         for(int i = 0 ; i < n ; i++)
//         {
//             String cod = code[i];
//             String business = businessLine[i];
//             boolean isact =isActive[i];
//             if(cod.matches("^[A-Za-z0-9_]+$"))
//             {
//                 if(set.contains(business))
//                 {
//                     if(isact)
//                     {
//                         if(business.equals("electronics"))
//                         {
//                                 result.add(cod);
//                         }
//                         if(business.equals("grocery"))
//                         {
//                                 result1.add(cod);
//                         }
//                         if(business.equals("pharmacy"))
//                         {
//                                 result2.add(cod);
//                         }
//                         if(business.equals("electronic"))
//                         {
//                                 result3.add(cod);
//                         }
//                     }
//                 }
//             }
//         }
//         result.addAll(result1);result.addAll(result2);result.addAll(result3);
//         return result;
//     }
// }

// import java.util.*;
// class Solution {
//     public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
//         HashMap<String,Integer> map = new HashMap<>();
//         map.put("electronics",1);
//         map.put("grocery",2);
//         map.put("pharmacy",3);
//         map.put("restaurant",4);
//         int n = code.length;
//         List<Pair> valids = new ArrayList<>();
//         for(int i = 0; i < n ; i++)
//         {
//             if(isActive[i] && code[i].matches("^[a-zA-Z0-9_]+$") && map.containsKey(businessLine[i]) )
//             {
//                 valids.add(new Pair(businessLine[i],code[i]));
//             }
//         }
//         Collections.sort(valids , (a,b) ->
//         {
//             if(!a.priority.equals(b.priority))
//             {
//                 return a.priority.compareTo(b.priority);
//             }
//             return a.code.compareTo(b.code);
//         });
//         List<String> result = new ArrayList<>();
//         for(Pair p : valids)
//             result.add(p.code);
//         return result;
//     }
//     	public static void main(String argsd[])
// 	{
// 		String code[] = {"GROCERY15","ELECTRONICS_50","DISCOUNT10"};
// 		String businessLine[] = {"grocery","electronics","invalid"};
// 		boolean isActive[] = {false,true,true};
// 		System.out.println(new Solution().validateCoupons( code , businessLine , isActive));
// 	}
// }

// class Pair
// {
//     String priority;
//     String code;

//     Pair(String priority , String code)
//     {
//         this.priority = priority;
//         this.code = code;
//     }
// }

// class Solution 
// {
// 	public int countGrids(String strs[])
// 	{
// 		int count = 0 ;
// 		for(int i = 0 ; i < strs[0].length() ; i ++)
// 		{
// 			for(int j = 0 ; j < strs.length - 1; j ++)
// 			{
// 				if(strs[j].charAt(i) > strs[j+1].charAt(i)){
// 					count++;
// 					break;
// 				}

// 			}
// 		}
// 		return count;
// 	}
// 	public static void main(String args[])
// 	{
// 		String input[] = {"zyx","wvu","tsr"};
// 		System.out.println(new Solution().countGrids(input));
// 	}
// }



// LC : 955 Delete columns  to sorted II
// class Solution {
//     public int minDeletionSize(String[] strs) {
       
//        int n = strs.length;
//        int m = strs[0].length();
//        boolean resolved[] = new boolean[n];
//        int deletions = 0;
//        for(int col = 0 ; col < m ; col++)
//        {
//        		boolean flag = false;
//        		for(int i = 0 ; i < n - 1;i ++)
//        		{
//        			if(!resolved[i] && strs[i].charAt(col) > strs[i+1].charAt(col) )
//        			{
//        				flag = true;
//        				deletions++;
//        				break;
//        			}
//        		}
//        		if(!flag)
//        		{
//        			for(int i = 0 ;i < n - 1; i ++)
//        			{
//        				if(!resolved[i] && str[i].charAt(col) < strs[i+1].charAt(col))
//        					resolved[i] = true;
//        			}
//        		}
//        }
//        return deletions;
//     }
//     public static void main(String args[])
//     {
//     	String strs[] = { };
//     	System.out.println(new Solution().minDeletionSize(strs));
//     }
// }


// leetcode Streak
// class Solution
// {
// 	public int countMinPenalty(String s)
// 	{
// 		int ans = 0 , best = 0 ;
// 		int penalty = 0;
// 		for(int i =0 ; i < s.length() ;i ++)
// 		{
// 			if(s.charAt(i)=='Y')
// 				penalty--;
// 			else
// 				penalty++;
// 			if(penalty < best)
// 			{
// 				best = penalty;
// 				ans = i+1;
// 			}

// 		}
// 		return ans;
// 	}

// 	public static void main(String argsp[])
// 	{
// 		String s = "";
// 		System.out.println(new Solution().countMinPenalty(s));
// 	}
// }

// import java.util.*;
// class Solution
// {
// 	boolean transitionPyramid(String bottom , List<String> possible)
// 	{
// 		HashMap<String , HashSet<String>> map = new HashMap<>();
		
// 	}
// 	public static void main(String args[])
// 	{
// 		String bottom = "BCD";
// 		List<String> possible = Arrays.asList({"BCE","ACE","ABC"});
// 		System.out.println(new Solution().transitionPyramid(bottom,
// 			possible));
// 	}
// }

// // Leetcode : 1970
// class Solution {
// 	int row , col;
// 	int directions[][]	 = { {1,0},{-1,0},{0,1},{0,-1} };

// 	boolean DFS(int grid[][] , int i  , int j)
// 	{
// 		if(i < 0 || i>= row || j >= col || j < 0 || grid[i][j] ==1)
// 				return false;
// 		if(i==row-1)
// 				return true;
// 		grid[i][j] = 1;
// 		for(int dir[] : directions)
// 		{
// 			int new_i = i + dir[0];
// 			int new_j = j + dir[1];
// 			if(DFS(grid , new_i , new_j))
// 					return true;
// 		}
// 		return false;
// 	}
// 	boolean canCross(int cells[][] , int mid)
// 	{
// 		int grid[][] = new int[row][col];
// 		for(int i = 0 ; i <= mid ; i++)
// 		{
// 			int x = cells[i][0] - 1;
// 			int y = cells[i][1] - 1;
// 			grid[x][y] = 1;
// 		}
// 		for(int j = 0 ; j < col ; j++)
// 		{
// 			if(grid[0][j] == 0 && DFS(grid,0,j))
// 				return true;
// 		}
// 		return false;
// 	}
//     public int latestDayToCross(int row, int col, int[][] cells) {
//         this.row = row;
//         this.col = col;
//         int l = 0;
//         int r = cells.length-1;
//         int lastDay = 0;
//         while(l <= r)
//         {
//         	int mid = l + (r - l)/2;
//         	if(canCross(cells,mid)){
//         		lastDay = mid + 1;
//         		l = mid + 1;
//         	}
//         	else
//     			r = mid - 1;
//         }
//         return lastDay;
//     }
//     public static void main(String args[])
//     {
//     	int col = 2, row = 2;
//     	int cells[][] = {
//     		{1,1},
//     		{1,2},
//     		{2,1},
//     		{2,2}
//     	};
//     	System.out.println(new Solution().latestDayToCross(col , row , cells));
//     }
// }

// minimum ascii delete for two strings 
// dp problem
// class Solution
// {
// 		int m , n;// variables to store length of strings
// 	    public int minimumDeleteSum(String s1, String s2) {
// 	    	m = s1.length;
// 	    	n = s2.length;
// 	    	// helper function to find minimum delete sum
// 	    	return solve(0,0,s1,s2);
// 	    }
// 	    int solve(int i , int j , String s1 , String s2)
// 	    {
//             // base case if both indices croos the index
// 	    	if(i >= m && j >= n)
// 	    			return 0;
// 	    	else if(i >= m)
// 	    	{
// 	    		return s2.charAt(j) + solve(i , j + 1 , s1 , s2);
// 	    	}
// 	    	else if(j >= n)
// 	    	{
// 	    		return s1.charAt(i) + solve(i+1 , j , s1 ,s2);
// 	    	}
// 	    	// if both the characters are equal then skip both characters
// 	    	if(s1.charAt(i) == s2.charAt(j))
// 	    			solve(i+1,j+1 , s1,s2);
// 	    	int delete_i = s2.charAt(j) + solve(i+1 , j , s1 , s2);
// 	    	int delete_j = s1.charAt(i) + solve(i , j +1 , s1 , s2);
// 	    	return Math.min(delete_i , delete_j);
// 	    }
// 	    public static void main(String args[])
// 	    {
// 	    	String s1 = "";
// 	    	String s2 = "";
// 	    	System.out.println(new Solution().)
// 	    }
// }


// leetcode problem statement separateSquares
// class Solution
// {
// 	double separateSquares(int squares[][])
// 	{
// 		double totalArea = getTotalArea(squares);
// 		double target = totalArea / 2.0;

// 		double low = getMinY(squares);
// 		double high = getMaxY(squares);

// 		for(int i = 0 ; i < 60 ; i++)
// 		{
// 			double mid = low + (high-low)/2.0;
// 			if(areaBelow(mid,squares)<target)
// 					low = mid;
// 				else
// 					high = mid;
// 		}
// 		return high;
// 	}
	
// 	double getTotalArea(int squares[][])
// 	{
// 		double area = 0;
// 		for(int square[] : squares)
// 		{
// 			double length = square[2];
// 			area += length*length;
// 		}
// 		return area;
// 	}
// 	 private double getMinY(int[][] squares) {
//         double minY = Double.MAX_VALUE;
//         for (int[] sq : squares) {
//             minY = Math.min(minY, sq[1]);
//         }
//         return minY;
//     }

//     // Maximum possible y-value
//     private double getMaxY(int[][] squares) {
//         double maxY = Double.MIN_VALUE;
//         for (int[] sq : squares) {
//             maxY = Math.max(maxY, sq[1] + sq[2]);
//         }
//         return maxY;
//     }
//         private double areaBelow(double H, int[][] squares) {
//         double area = 0;

//         for (int[] sq : squares) {
//             double y = sq[1];
//             double l = sq[2];

//             if (H <= y) {
//                 // line is below square
//                 continue;
//             } else if (H >= y + l) {
//                 // square fully below
//                 area += l * l;
//             } else {
//                 // line cuts the square
//                 area += l * (H - y);
//             }
//         }

//         return area;
//     }
//     public static void main(String args[])
//     {
//     	int squares[][] = {
//     		{0,0,1},{2,2,1}
//     	};
//     	System.out.println(new Solution().separateSquares(squares));
//     }
// }

// minimum pair removal to make sorted array
import java.util.*;
class Solution {

    static class Pair {
        long sum;
        int idx;

        Pair(long sum, int idx) {
            this.sum = sum;
            this.idx = idx;
        }

        public boolean equals(Pair p) {
            return sum == p.sum && idx == p.idx;
        }
    }

    public int minimumPairRemoval(int[] nums) {
        int n = nums.length;

        // {a, b, c, d} -> {a, b+c, d}
        long[] temp = new long[n];
        for (int i = 0; i < n; i++) {
            temp[i] = nums[i];
        }

        TreeSet<Pair> minPairSet = new TreeSet<>(
            (a, b) -> {
                if (a.sum != b.sum) return Long.compare(a.sum, b.sum);
                return Integer.compare(a.idx, b.idx);
            }
        );

        int[] nextIndex = new int[n];
        int[] prevIndex = new int[n];

        for (int i = 0; i < n; i++) {
            nextIndex[i] = i + 1;
            prevIndex[i] = i - 1;
        }

        int badPairs = 0;
        for (int i = 0; i < n - 1; i++) {
            if (temp[i] > temp[i + 1]) {
                badPairs++;
            }
            minPairSet.add(new Pair(temp[i] + temp[i + 1], i));
        }

        int operations = 0;

        while (badPairs > 0) {

            Pair cur = minPairSet.first();
            minPairSet.remove(cur);

            int first = cur.idx;
            int second = nextIndex[first];

            int first_left = prevIndex[first];
            int second_right = nextIndex[second];

            if (temp[first] > temp[second]) {
                badPairs--;
            }

            // {d, (a, b)}
            if (first_left >= 0) {
                if (temp[first_left] > temp[first] &&
                    temp[first_left] <= temp[first] + temp[second]) {
                    badPairs--;
                }
                else if (temp[first_left] <= temp[first] &&
                         temp[first_left] > temp[first] + temp[second]) {
                    badPairs++;
                }
            }

            // {(a, b), d}
            if (second_right < n) {
                if (temp[second_right] >= temp[second] &&
                    temp[second_right] < temp[first] + temp[second]) {
                    badPairs++;
                }
                else if (temp[second_right] < temp[second] &&
                         temp[second_right] >= temp[first] + temp[second]) {
                    badPairs--;
                }
            }

            if (first_left >= 0) {
                minPairSet.remove(
                    new Pair(temp[first_left] + temp[first], first_left)
                );
                minPairSet.add(
                    new Pair(temp[first_left] + temp[first] + temp[second], first_left)
                );
            }

            if (second_right < n) {
                minPairSet.remove(
                    new Pair(temp[second] + temp[second_right], second)
                );
                minPairSet.add(
                    new Pair(temp[first] + temp[second] + temp[second_right], first)
                );
                prevIndex[second_right] = first;
            }

            nextIndex[first] = second_right;
            temp[first] += temp[second];

            operations++;
        }

        return operations;
    }
    public static void main(String args[])
    {
    	int nums[] = {5,2,3,1};
    	System.out.println(new Solution().minimumPairRemoval(nums));
    }
}