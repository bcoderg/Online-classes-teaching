#include<bits/stdc++.h>
using namespace std;
#define int long long
#define fast ios_base::sync_with_stdio(0);cin.tie(0);cout.tie(0);
#define pb push_back
#define nl "\n";
const int N = 1e6;

vector<int>v(N, 1);

void sieve()
{
	v[0] = 0;
	v[1] = 0;

	for (int i = 2; i * i <= N; i++)
	{
		if (v[i] == 1)
		{
			for (int j = i * i; j <= N; j += i)
			{
				if (v[j] != 0)v[j] = 0;
			}
		}
	}
}

vector<int>get_primes(int n)
{
	vector<int>primes;
	for (int i = 2; i <= n; i++)
	{
		if (v[i] == 1)primes.pb(i);
	}
	return primes;
}


void badhri() {
	int l, r; cin >> l >> r;

	int max_n = sqrt(r) , size = (r - l + 1);

	vector<int>primes = get_primes(max_n);

	vector<int>small(size, 1);
	for (auto x : primes)
	{
		int start = (l / x) * (x);

		if (start < l)start += x;

		start = max(x * x , start);

		for (int i = start ; i <= r; i += x)
		{
			small[i - l] = 0;
		}
	}

	int count = 0;

	for (int i = l; i <= r; i++)
	{
		if (small[i - l] == 1)
		{
			count++;
			//cout << i  << " ";	to print the primes
		}
	}




	cout << count;


	cout << nl;

}

signed main() {

	fast
	int t; cin >> t;
	sieve();
	while (t--) {
		badhri();
	}
}

