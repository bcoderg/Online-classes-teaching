#include<bits/stdc++.h>
using namespace std;
#define fast ios_base::sync_with_stdio(0);cin.tie(0);cout.tie(0);


class StringHashing
{
public:
	string s;
	long long int p = 29;
	long long int m = (int)1e9 + 7;

	vector<long long int>prefixhash , ppower;

	StringHashing(string s , long p = 139 , long m = 1000000007)
	{
		this->s = s;
		this->p = p;
		this->m = m;

		int n = s.size();
		prefixhash.assign(n, 0);
		ppower.assign(n, 1);

		//calculating , storing ppowers
		for (int i = 1; i < n; i++) {
			ppower[i] = ( (ppower[i - 1] % m) * (p % m) ) % m;
		}

		//calculating prefix hashes
		long long int cur_hash = 0;
		for (int i = 0; i < n; i++)
		{
			cur_hash = ( (((cur_hash % m) * (p % m)) % m)  + (s[i] % m) ) % m;
			prefixhash[i] = cur_hash;
		}
	}

	long long int gethash(int l , int r)
	{
		if (l == 0)return prefixhash[r];
		long long int hash_value = ( (prefixhash[r] % m) - ( (( (prefixhash[l - 1] % m) * (ppower[r - l + 1] % m)) % m) % m) + m) % m;

		return hash_value;
	}
};

void badhri() {
	string s; cin >> s;

	StringHashing sh(s);

	int q; cin >> q;


	//to debug
	// for (int i = 0; i < s.size(); i++)
	// {
	// 	cout << sh.ppower[i] << " ";
	// }
	// cout << "\n";
	// for (int i = 0; i < s.size(); i++)
	// {
	// 	cout << sh.prefixhash[i] << " ";
	// }
	// cout << "\n";



	while (q--)
	{
		int l1, r1, l2, r2; cin >> l1 >> r1 >> l2 >> r2;


		long long int val1 = sh.gethash(l1, r1);
		long long int val2 = sh.gethash(l2, r2);

		//cout << val1 << " " << val2 << "\n";

		(val1 == val2) ? (cout << "YES\n") : (cout << "NO\n");
	}

// query: doing some error in calculating modulo , sometimes leading to negative values , incorrect values.
// 	I faced this many times , please tell how to not commit such mistakes sir.
// 	1.Should I use modsum , modprod functions


	//input
	//bcdebcd
	//0123456


	//expected output
	// 0 1 4 5 YES
	// 0 2 3 4 NO
	// 0 2 4 6 YES
	// 1 2 5 6 NO




}

signed main() {

	fast
	int t = 1;

	// cin>>t;

	while (t--) {
		badhri();
	}
}

