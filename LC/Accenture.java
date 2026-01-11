// import java.util.*;

//  class Main {
//     public static int matchingCount(List<List<String>> items, String ruleKey, String ruleValue) {
//         int index = 0;
//         if(ruleKey.equals("color"))
//             index = 1;
//         else if(ruleKey.equals("name"))
//             index = 2;
//         System.out.println("Index = "+index);
//         int count = 0;
//         for(List<String> item : items)
//         {
//                 if(item.get(index).equals(ruleValue))
//                     count++;

//         }
//         return count;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         sc.nextLine();
//         List<List<String>> items = new ArrayList<>();
//         for (int i = 0; i < n; i++) {
//             items.add(Arrays.asList(sc.nextLine().split(" ")));
//         }
//         String ruleKey = sc.nextLine();
//         String ruleValue = sc.nextLine();
//         int result = matchingCount(items, ruleKey, ruleValue);
//         System.out.println(result);
//     }
// }


import java.util.*;
 class Main {
   public static void primeMatrix(int n, int[][] matrix) {
    List<int[]> primes = new ArrayList<>();
    
    for(int i = 0; i < n; i++) {
        for(int j = 0; j < n; j++) {
            if(isPrime(matrix[i][j])) {
                primes.add(new int[]{i, j});
            }
        }
    }
    
    for(int[] pos : primes) {
        modify(matrix, pos[0], pos[1]);
    }
}

    static void modify(int matrix[][] , int r , int c)
    {
        int n = matrix.length;
        for(int i = 0 ; i < n ; i ++)
            matrix[i][c] = -1;
        for(int i = 0 ; i < n ; i ++)
            matrix[r][i] = -1;
        
    }
    static boolean isPrime(int n)
    {
        if(n==1)    
            return false;
        if(n<=3)
            return true;
        for(int i = 2 ; i <= n/2 ; i ++ )
        {
            if(n%i==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        
        primeMatrix(n, matrix);
        
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}