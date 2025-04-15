#include<bits/stdc++.h>
using namespace std;
#define int long long
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
#define allr(p) (p).rbegin(),(p).rend()
#define vvi vector<vector<int>>
#define print(v) for(auto &x:v){cout<<x<<" ";}cout<<"\n";
#define nl "\n";
const int N = 0;
void badhri() {
    int n; cin >> n;
    string s; cin >> s;

    if (n == 1) {
        cout << "8";
    }
    else if (n == 2) {
        if (s[0] == '1')cout << "16";
        else if (s[0] == '2')cout << "24";
        else if (s[0] == '3')cout << "32";
        else if (s[0] == '4')cout << "40";
        else if (s[0] == '5')cout << "56";
        else if (s[0] == '6')cout << "64";
        else if (s[0] == '7')cout << "72";
        else if (s[0] == '8')cout << "80";
        else if (s[0] == '9')cout << "96";
    }
    else
    {
        int val = ( (s[n - 3] - '0') * 100 + ((s[n - 2] - '0')) * 10 + ((s[n - 1] - '0')) * 1 );

        if (val % 8 == 0) {
            cout << s;
        }
        else
        {
            int rem = (val % 8);

            int left = (val - rem)   , right = (val + (8 - rem) );

            s.pop_back(); s.pop_back(); s.pop_back();

            if ( (right - val) <= (val - left) )
            {
                int tt = (right / 10);

                // char x= char(right/100);
                // char y= char( tt % 10 );
                // char z= char(right%10);

                s += to_string(right / 100);
                s += to_string(tt % 10);
                s += to_string(right % 10);

                // s[n-3]= (right/100) - '0';
                // s[n-2]=( (right/10) % 10 )-'0';
                // s[n-1]=(right%10)-'0';

                // s[n-3]= x;
                // s[n-2]=y;
                // s[n-1]=z;
            }
            else
            {

                int tt = (left / 10);

                // char x= char(left/100);
                // char y= char( tt % 10 );
                // char z= char(left%10);


                // s[n-3]= x;
                // s[n-2]=y;
                // s[n-1]=z;

                s += to_string(left / 100);
                s += to_string(tt % 10);
                s += to_string(left % 10);


            }

            cout << s;
        }

    }



    cout << nl;
}

signed main() {

    fast
    int t; cin >> t;

    while (t--) {
        badhri();
    }
}

