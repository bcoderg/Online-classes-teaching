#include<bits/stdc++.h>
using namespace std;
#define inti long int inti
#define se set<int>s
#define ve vector<int>v;
#define vi vector<ll>
#define fast ios_base::sync_with_stdio(0);cin.tie(0);cout.tie(0);
#define ll long long int
#define mod 1000000007
#define all(p) (p).begin(),(p).end()
#define allr(p) (p).rbegin(),(p).rend()
#define print(v) for(auto &x:v){cout<<x<<" ";}cout<<"\n";
#define nl "\n";

const int N = 0;

void badhri() {
    ll a, b, c, d; cin >> a >> b >> c >> d;

    ll ans;

    if ( (a + 1) % b == (c + 1) % d )
    {
        cout << "1\n";
    }

    else {
        ans = (lcm(b, d));

        ans += (a % b);


        cout << ans << nl;
    }

}

int main() {

    fast
    int t; cin >> t;

    while (t--) {
        badhri();
    }



}








