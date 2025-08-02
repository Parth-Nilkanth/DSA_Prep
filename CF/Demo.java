import java.util.*;

public class Demo {

    static final int MAX = 10000010;
    static int[] spf = new int[MAX]; // smallest prime factor

    static void sieve() {
        for (int i = 2; i < MAX; i++) {
            if (spf[i] == 0) {
                for (int j = i; j < MAX; j += i) {
                    if (spf[j] == 0) spf[j] = i;
                }
            }
        }
    }
    static Map<Integer, Integer> factorize(int x) {
        Map<Integer, Integer> map = new HashMap<>();
        while (x > 1) {
            int p = spf[x];
            map.put(p, map.getOrDefault(p, 0) + 1);
            x /= p;
        }
        return map;
    }

    static void reduce(List<Integer> arr, Map<Integer, Integer> cnt, boolean isNumerator) {
        for (int i = 0; i < arr.size(); i++) {
            int x = arr.get(i);
            Map<Integer, Integer> f = factorize(x);
            for (Map.Entry<Integer, Integer> entry : f.entrySet()) {
                int p = entry.getKey(), c = entry.getValue();
                int rem = cnt.getOrDefault(p, 0);
                int t = 0;

                if (isNumerator && rem > 0) {
                    t = Math.min(c, rem);
                    rem -= t;
                } else if (!isNumerator && rem < 0) {
                    t = Math.min(c, -rem);
                    rem += t;
                }

                cnt.put(p, rem);
                for (int j = 0; j < t; j++) x /= p;
            }
            arr.set(i, x);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sieve();

        int n = sc.nextInt(), m = sc.nextInt();
        List<Integer> A = new ArrayList<>(), B = new ArrayList<>();
        for (int i = 0; i < n; i++) A.add(sc.nextInt());
        for (int i = 0; i < m; i++) B.add(sc.nextInt());

        Map<Integer, Integer> cnt = new HashMap<>();

        // count primes in numerator
        for (int x : A) {
            Map<Integer, Integer> f = factorize(x);
            for (Map.Entry<Integer, Integer> e : f.entrySet())
                cnt.put(e.getKey(), cnt.getOrDefault(e.getKey(), 0) + e.getValue());
        }

        // subtract primes in denominator
        for (int x : B) {
            Map<Integer, Integer> f = factorize(x);
            for (Map.Entry<Integer, Integer> e : f.entrySet())
                cnt.put(e.getKey(), cnt.getOrDefault(e.getKey(), 0) - e.getValue());
        }

        reduce(A, cnt, true);
        reduce(B, cnt, false);

        System.out.println(A.size());
        for (int x : A) System.out.print(x + " ");
        System.out.println();

        System.out.println(B.size());
        for (int x : B) System.out.print(x + " ");
        System.out.println();
    }
}
