//fix the code and submit

#include<bits/stdc++.h>
using namespace std;
#define inti long int inti
#define se set<int>s
#define ve vector<int>v;
#define fast ios_base::sync_with_stdio(0);cin.tie(0);cout.tie(0);
#define ll long long int
#define pb push_back
#define all(p) (p).begin(),(p).end()
#define nl "\n";
const int N = 0;
vector<string>ans;
bool valid(int ci , int cj , int n , vector<vector<char>>&v )
{

    if (ci >= 0 && cj >= 0 && ci < n && cj < n)return true;

    return false;
}
bool search(int ci , int cj , int idx , int n , string s , vector<vector<char>>&v)
{
    if (idx == s.size())
    {
        // ans.push_back(s);
        cout << s << " ";
        return true;
    }
    if (valid(ci , cj , n , v) && (v[ci][cj] == s[idx]) )
    {
        int x[4] = { -1  , +0 , +1 , +0 };
        int y[4] = {  0  , +1 , +0 , -1 };

        for (int d = 0; d < 4; d++)
        {
            if (search(ci + x[d] , cj + y[d] , idx + 1 , n , s , v) )return true;
        }

        return false;
    }

    else if (valid(ci , cj , n , v) && (v[ci][cj] != s[idx]))
    {


    }
    // else if(valid(ci , cj , n , v) && (v[ci][cj]!=s[idx]))
    // {
    //         // search(ci+1,cj,idx,n,s,v);
    //         // search(ci-1,cj,idx,n,s,v);
    //         // search(ci,cj+1,idx,n,s,v);
    //         // search(ci,cj-1,idx,n,s,v);
    //         int x[4] = { -1  ,+0 , +1 , +0 };
    //         int y[4] = {  0  ,+1 , +0 , -1 };
    //     for (int d = 0; d < 4; d++)
    //     {
    //         if(search(ci + x[d] , cj+y[d] , idx , n , s , v) )return true;
    //     }
    //      return false;
    // }

    // 00 01 02 03
    // 10 11 12 13
    // 20 21 22 23
    // 30 31 32 33




    return false;

}
void badhri() {
    int n; cin >> n;

    vector<vector<char>>v(n , vector<char>(n));

    for (int i = 0; i < n; ++i)
    {
        for (int j = 0; j < n; j++)
        {
            cin >> v[i][j];
        }
    }


// for (int i = 0; i < n; ++i)
// {
//     for(int j=0;j<n;j++)
//     {
//         cout<<v[i][j];
//     }
//     cout<<"\n";
// }

    int w; cin >> w;

    vector<string>words(w);

    for (int i = 0; i < w; i++)cin >> words[i];

    for (auto x : words)
    {
        search(0, 0, 0, n, x, v);
    }

// sort(ans.begin(),ans.end());

// for(auto x:ans)cout<<x<<" ";


//ans.clear();
    cout << nl;

}

int main() {

    fast
    int t; cin >> t;

    while (t--) {
        badhri();
    }
}

