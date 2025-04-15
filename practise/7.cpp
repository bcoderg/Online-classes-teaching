#include <iostream>
#include <vector>

using namespace std;

const int MOD = 1000000007;

// Function to generate a list of prime numbers up to n using Sieve of Eratosthenes
vector<int> generate_primes(int n) {
    vector<bool> is_prime(n + 1, true);
    vector<int> primes;
    is_prime[0] = is_prime[1] = false;  // 0 and 1 are not primes

    for (int i = 2; i <= n; i++) {
        if (is_prime[i]) {
            primes.push_back(i);
            for (int j = i * i; j <= n; j += i) {
                is_prime[j] = false;
            }
        }
    }
    return primes;
}

// Function to find the number of ways to partition n using prime numbers
int count_prime_partitions(int n) {
    vector<int> primes = generate_primes(n);
    vector<int> dp(n + 1, 0);
    dp[0] = 1;  // There's one way to partition 0 (the empty partition)

    for (int prime : primes) {
        for (int i = prime; i <= n; i++) {
            dp[i] = (dp[i] + dp[i - prime]) % MOD;
        }
    }

    return dp[n];
}

int main() {
    int n;
    cout << "Enter a number: ";
    cin >> n;

    cout << "Number of ways to partition " << n << " with prime numbers: " << count_prime_partitions(n) << endl;

    return 0;
}
