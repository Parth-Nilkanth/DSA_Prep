#include <iostream>
using namespace std;

// 🛠 Step 1: Declare the general template
template <bool... Bits>
int reversed_binary_value();

// 🧱 Step 2: Specialize the base case: no bits
template <>
int reversed_binary_value<>() {
    return 0;
}

// 🔁 Step 3: Recursive case
template <bool First, bool... Rest>
int reversed_binary_value<First, Rest...>() {
    return (First ? 1 : 0) + 2 * reversed_binary_value<Rest...>();
}

// 🧠 Generates all combinations of 6 bits and checks z + 64*y == x
template <int n, bool... digits>
struct CheckValues {
    static void check(int x, int y) {
        CheckValues<n - 1, 0, digits...>::check(x, y);
        CheckValues<n - 1, 1, digits...>::check(x, y);
    }
};

// ✅ Final check when 6 digits collected
template <bool... digits>
struct CheckValues<0, digits...> {
    static void check(int x, int y) {
        int z = reversed_binary_value<digits...>();
        cout << (z + 64 * y == x);
    }
};

int main() {
    int t;
    cin >> t;
    while (t--) {
        int x, y;
        cin >> x >> y;
        CheckValues<6>::check(x, y);
        cout << '\n';
    }
    return 0;
}
