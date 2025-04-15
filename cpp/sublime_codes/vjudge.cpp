#include<bits/stdc++.h>
using namespace std;
#define int long long int
#define se set<int>s
#define ve vector<int>v;
#define vi vector<ll>
#define fast ios_base::sync_with_stdio(0);cin.tie(0);cout.tie(0);
#define ll long long int
#define ff first
#define ss second
#define pb push_back
#define mii map<int,int>
#define msi map<string,int>
#define mod 1000000007
#define all(p) (p).begin(),(p).end()
#define allr(p) (p).rbegin(),(p).rend()
#define print(v) for(auto &x:v){cout<<x<<" ";}cout<<"\n";
#define nl "\n";

//int lg = 20;

void dfs(int c , int p , vector<vector<int>>&v , vector<vector<int>>&up, int lg , vector<int>&depth)
{
    up[c][0] = p;
    for (int j = 1; j < lg; j++)
    {
        up[c][j] = up[up[c][j - 1]][j - 1];
    }


    for (auto x : v[c])
    {
        if (x != p)
        {
            depth[x] = depth[c] + 1;
            dfs(x, c, v, up, lg , depth);
        }
    }
}


void badhri() {
    int n, q; cin >> n >> q;

    int lg = 20;
    //lg++;


    vector<vector<int>>v(n + 1) , up(n + 1 , vector<int>(lg , 0));

    vector<int>depth(n + 1, 0);


    for (int i = 2; i <= n ; i++) {
        int a; cin >> a;
        v[a].push_back(i);
        v[i].push_back(a);
    }
    // up[1][0] = -1;

    dfs(1, 0, v, up, lg, depth);


    //FOR GETTING Bth Ancestor of node A
    // while (q--) {
    //     int a, b; cin >> a >> b;

    //     //int ans=-1;

    //     if (depth[a] < b)
    //         cout << "-1\n";

    //     else
    //     {
    //         for (int i = lg; i >= 0; i--)
    //         {
    //             if (b & (1 << i))
    //             {
    //                 if (a == 1)
    //                 {
    //                     a = -1;
    //                     break;
    //                 }
    //                 a = up[a][i];
    //             }
    //         }

    //         if (a == 0)a = -1;

    //         cout << a << nl;
    //     }
    // }


    //LCA of nodes A,B
    while (q--)
    {
        int a, b , ans = -1; cin >> a >> b;

        //get A,B to same level

        if (depth[a] > depth[b])swap(a, b);

        int diff = depth[b] - depth[a];

        //get a to the lev of b
        for (int i = lg; i >= 0; i--)
        {
            if ( (diff & (1 << i) ) == (1 << i))
            {
                b = up[b][i];
            }
        }

        if (a == b)
        {
            ans = a;
            cout << ans << "\n";
        }

        else
        {
            for (int i = lg; i >= 0; i--)
            {
                if (up[a][i] != up[b][i])
                {
                    a = up[a][i];
                    b = up[b][i];
                }
            }
            ans = up[a][0];

            cout << ans << "\n";
        }

    }

}




//cout << nl;


signed main() {

    fast
    // int t; cin >> t;

    // while (t--) {
    badhri();
    //}



}
