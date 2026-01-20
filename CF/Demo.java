// Q1
/*import java.util.Scanner;
public class Main
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0)
        {
            int n = sc.nextInt();
            if(n<=3)
                    System.out.println(n);
            else
            {
                System.out.println(n%2);
            }
        }
    }
}*/



// Q2
i/*mport java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int t = sc.nextInt(); 
            
            while (t-- > 0) {
                long s = sc.nextLong(); 
                long k = sc.nextLong(); 
                long m = sc.nextLong(); 
                
                long result;
                
                
                if (m < k) {
                    result = Math.max(0, s - m);
                } 
                
                else {
                    long remaining = m % k;
                    
                    long sandOnTop = Math.min(s, k);
                    result = Math.max(0, sandOnTop - remaining);
                }
                
                System.out.println(result);
            }
        }
        sc.close();
    }
}*/