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
int n;cin>>n;


//vector<vector<int>>ans;

if(n==1)
{
    cout<<"1\n";
    return;
}
else if(n==2)
{
    cout<<"-1\n";
    return;
}

else
{

    vector<vector<int>>ans(n , vector<int>(n) ); 


int c=1;
for(int i=0;i<n;i++)
{
    //vector<int>tp;
for(int j=0;j<n;j++)
{
    // tp.pb(c);
    ans[i][j]=c;
    c++;
}
//ans.pb(tp);
//cout<<"\n";
}



if(n%2==0){
    swap(ans[1][1] , ans[1][2]);
    swap(ans[2][1] , ans[2][0]);
}
else
{

//     for(int i=0;i<n;i++)
// {
// for(int j=0;j<n;j++)
// {
//     //ans[i][j]=c++;

//     if(i==j)
//     {
//         if(i%2!=0){
//             swap(ans[i][j] , ans[i][j+1]);
//         }
//     }
// }
// //cout<<"\n";
// }


for(int i=1;i<n;i+=2)
{
    swap(ans[i][i] , ans[i][i+1]);
}

} 


for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
    cout<<ans[i][j]<<" ";
}
cout<<"\n";
}

//cout<<nl;

}


 //cout<<nl;

}

signed main(){

    fast
    int t;cin>>t;
    
    while(t--){
        badhri();
    }
}



// 1 2 3 4
// 5 6 7 8
// 9 10 11 12
// 13 14 15 16 

// 1,1     1,2  





