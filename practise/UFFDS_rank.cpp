#include<bits/stdc++.h>
using namespace std;
#define int long long
#define fast ios_base::sync_with_stdio(0);cin.tie(0);cout.tie(0);
#define nl "\n";
const int N = 0;
void badhri() {

	cout << nl;

}
signed main() {
	fast
	int t; cin >> t;
	while (t--) {
		badhri();
	}
}



class UFDS {
public:
	vector<int>par, rank;
	int components;
	UFDS(int n) {
		par.assign(n + 1 , 0);
		rank.assign(n + 1, 0);
		for (int i = 0; i <= n ; ++i)par[i] = i;

		components = n;
	}

	int find_root(int u)
	{
		if (u == par[u])return u;

		return (par[u] = find_root(par[u]));
	}

	bool connected(int u , int v)
	{
		return (find_root(u) == find_root(v));
	}

	void union_by_rank(int u , int v)
	{
		int r_u = find_root(u);
		int r_v = find_root(v);

		if (ru == rv)return;

		if (r_v != r_u)components--;

		if (rank[ru] < rank[rv])
		{
			par[ru] = rv;
		}
		else if (rank[ru] > rank[rv])
		{
			par[rv] = ru;
		}
		else //both equal
		{
			par[rv] = ru;
			rank[ru]++;
		}

	}

	void union_join(int u , int v)
	{
		int r_u = find_root(u);
		int r_v = find_root(v);

		if (ru == rv)return;

		if (r_v != r_u)components--;

		par[r_v] = r_u;
	}

	int get_components()
	{
		return components;
	}
};


