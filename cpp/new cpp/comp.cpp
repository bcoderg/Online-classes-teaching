#include<bits/stdc++.h>
using namespace std;
#define inti long int inti
#define se set<int>s
#define ve vector<int>v;
#define fast ios_base::sync_with_stdio(0);cin.tie(0);cout.tie(0);
#define ll long long int
#define f float
#define d double
#define pb push_back
#define mii map<int,int>
#define msi map<string,int>
#define mci map<char,int>
#define all(p) (p).begin(),(p).end()
#define print(v) for(auto &x:v){cout<<x<<" ";}cout<<"\n";
#define nl "\n";
const ll N = 1e9 + 1;
vector<int>v(N, 1);
vector<int>primes;
void fun()
{
    v[0] = -1;
    v[1] = -1;
    for (int i = 2; i * i <= N; i++)
    {
        if (v[i] == 1)
        {
            for (int j = i * i; j <= N; j += i)
            {
                v[j] = -1;
            }
        }
    }
    int c = 0, size = 1;
    for (int i = 2; i <= 86028121; i++)
    {
        if (v[i] == 1)
        {
            primes.push_back(i);

        }
    }

    cout << "size = " << size << nl;

}

void badhri() {
    int n; cin >> n;
    int x = primes[n - 1];


    cout << x << nl;

    //  cout<<n<<nl;

}

int main() {

    fast
    fun();
    int t; cin >> t;

    while (t--) {
        badhri();
    }
}




// 4
// 1
// 5
// 6
// 7