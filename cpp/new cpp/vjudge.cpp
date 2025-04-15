#include<bits/stdc++.h>
using namespace std;
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
int size = 1000001;
vector<int>primes;
vector<int>v(size , 1);


void badhri() {

    v[0] = 0;
    v[1] = 0;
    for (int i = 2; i < size; i++)
    {
        if (v[i] == 1)
        {
            // primes.push_back(i);
            for (int j = i * i; j < size; j += i)
            {
                v[j] = 0;
            }
        }
    }
    for ( int i = 0; i < size; i++)
    {
        if (v[i] == 1)primes.push_back(i);
    }

    int n;
    cin >> n; cout << n << nl;

    for (auto x : primes)cout << x << " ";

//in some cases it may not work right

// 18
// 6 2 2

// 8+4+

// p1 + p2^2 + p3^3


//2 3 5 7 11 13



    cout << nl;

}

int main() {

    fast
    // int t;cin>>t;

    // while(t--){
    badhri();
    // }



}








