// import java.util.*;
// public  class Main
// {
//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int k = sc.nextInt();
//         int arr[] = new int[n];
//         for(int i = 0 ; i < n ; i++)
//             arr[i] = sc.nextInt();
//         int count = 0;
//         for(int x : arr)
//             {
//                 if( x >= arr[k-1] && x > 0 )
//                     count++;
//             }
//         System.out.println(count);
//     }
// }

// import java.util.*;
// public class Main
// {
//     public static void main(String arg[])
//     {
//         Scanner sc = new Scanner(System.in);
//         int nn = sc.nextInt();
//         int nd = sc.nextInt();
//         int numerator = 1;
//         int denominator = 1;
//         for(int i = 1 ; i <= nn ; i++)
//         {
//             int x = sc.nextInt();
//             numerator*=x;;
//         }
//         for(int i = 1 ; i <= nd ; i++)
//             {
//                 int x = sc.nextInt();
//                 denominator*=x;
//             }
//     }
// }


import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num_size = sc.nextInt();
        int den_size = sc.nextInt();
        int num=1;
        int den=1;

        while(num_size-- > 0){
            num*=sc.nextInt();
        }
        while(den_size-- > 0){
            den*=sc.nextInt();
        }

        int a=num;
        int b=den;

         while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
         System.out.println(a+" "+b);

         num/=a;
         den/=a;

        System.out.println(num+ "/ " +den);
}
}