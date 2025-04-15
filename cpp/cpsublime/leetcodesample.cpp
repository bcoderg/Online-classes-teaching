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
const int N=0;
void badhri(){
    
vector<int>v(3);
for(int i=0;i<3;i++)cin>>v[i]; 

sort(all(v));

if(v[1]%v[0]!=0 || v[2]%v[0]!=0)
{
    cout<<"NO\n";
        return;
}


// if( (v[0]+v[1]==v[2]) || ( v[0]==v[1] && v[1]==v[2] && v[2]==v[0] ) )
// {
//     cout<<"YES\n";
//     return;
// }


int val=(v[1]+v[2])/v[0] ;

if(val<=5){
    cout<<"YES\n";
    return;
}


cout<<"NO";



cout<<nl;

}

signed main(){

    fast
    int t;cin>>t;
    
    while(t--){
        badhri();
    }
}





// YES
// YES
// NO
// NO
// YES
// YES
// NO
// YES
// NO
// NO
// YES
// YES
// NO
// YES
// NO
