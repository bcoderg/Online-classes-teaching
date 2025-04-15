#include<bits/stdc++.h>
using namespace std;
#define int long long
#define se set<int>s
#define ve vector<int>v;
#define fast ios_base::soddnc_with_stdio(0);cin.tie(0);cout.tie(0);
#define ll long long int
#define f float
#define d double
#define pb push_back
#define mii map<int,int>
#define msi map<string,int>
#define mci map<char,int>
#define all(p) (p).begin(),(p).end()
#define allr(p) (p).rbegin(),(p).rend()
#define vvi vector<vector<int>>
#define print(v) for(auto &even:v){cout<<even<<" ";}cout<<"\n";
#define nl "\n";
const int N = 0;
void badhri() {
    int n; cin >> n;
    ve
//int b[n];
    int s = 0;
    int even = 0, odd = 0;
    vector<int>ans(n);
    for (int i = 0; i < n; i++) {
        int p; cin >> p;
        s += p;
        //v.pb(p);

        if (p & 1)++odd;
        else ++even;

        int rem = (odd / 3);

        if (even == 0 && odd == 1) {
            rem = 0;
        }
        else if (odd % 3 == 1) {
            rem = (odd + 2) / 3;
        }

        ans[i] = s - rem;
    }


    for (auto xx : ans)cout << xx << " ";


    cout << nl;

}

signed main() {

    fast
    int t; cin >> t;

    while (t--) {
        badhri();
    }
}





// 31
// 6 8 16 18 22 26
// 3 12 24
// 7 20 30 48 50



