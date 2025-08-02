#include <bits/stdc++.h>
using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    int n, m;
    cin >> n >> m;
    
    vector<int> a(n), b(m);
    for (int i = 0; i < n; i++) {
        cin >> a[i];
    }
    for (int i = 0; i < m; i++) {
        cin >> b[i];
    }
    
    // Find smallest prime factor for each number up to 10^7
    const int MAXN = 10000000;
    vector<int> spf(MAXN + 1);  // smallest prime factor
    for (int i = 1; i <= MAXN; i++) spf[i] = i;
    
    for (int i = 2; i * i <= MAXN; i++) {
        if (spf[i] == i) {  // i is prime
            for (int j = i * i; j <= MAXN; j += i) {
                if (spf[j] == j) {
                    spf[j] = i;
                }
            }
        }
    }
    
    // Count prime factors in numerator and denominator
    map<int, int> num_factors, den_factors;
    
    // Process numerator
    for (int i = 0; i < n; i++) {
        int x = a[i];
        while (x > 1) {
            int p = spf[x];
            num_factors[p]++;
            x /= p;
        }
    }
    
    // Process denominator
    for (int i = 0; i < m; i++) {
        int x = b[i];
        while (x > 1) {
            int p = spf[x];
            den_factors[p]++;
            x /= p;
        }
    }
    
    // Find common factors (GCD factors)
    map<int, int> common_factors;
    for (auto& p : num_factors) {
        int prime = p.first;
        int count = p.second;
        if (den_factors.count(prime)) {
            common_factors[prime] = min(count, den_factors[prime]);
        }
    }
    
    // Remove common factors from arrays
    map<int, int> remaining_common = common_factors;
    
    for (int i = 0; i < n; i++) {
        int x = a[i];
        for (auto& cf : remaining_common) {
            int prime = cf.first;
            int& count = cf.second;
            while (count > 0 && x % prime == 0) {
                x /= prime;
                count--;
            }
        }
        a[i] = x;
    }
    
    // Reset for denominator processing
    remaining_common = common_factors;
    
    for (int i = 0; i < m; i++) {
        int x = b[i];
        for (auto& cf : remaining_common) {
            int prime = cf.first;
            int& count = cf.second;
            while (count > 0 && x % prime == 0) {
                x /= prime;
                count--;
            }
        }
        b[i] = x;
    }
    
    // Output result
    cout << n << " " << m << "\n";
    for (int i = 0; i < n; i++) {
        cout << a[i];
        if (i < n - 1) cout << " ";
    }
    cout << "\n";
    for (int i = 0; i < m; i++) {
        cout << b[i];
        if (i < m - 1) cout << " ";
    }
    cout << "\n";
    
    return 0;
}