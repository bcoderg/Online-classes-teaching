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
  int c=0;
  
  int n;cin>>n; 
  

  char a[n][n] , b[n][n] ;
  
  for(int i=0;i<n;i++)
    for(int j=0;j<n;j++)
        cin>>a[i][j]; 
    
  for(int i=0;i<n;i++)
  {
      for(int j=0;j<n;j++)
      {
        b[j][i]=a[i][j];
      }
  }
  
  int s=0;
  
  for(int i=0;i<n;i++)
  {
      for(int j=0;j<n;j++)
      {
        int v1=((b[i][j]-'a')) ;
        int v2=((a[i][j]-'a')) ;
        
        //  c+=( abs(v1 - v2) );
        
        if(a[i][j]!=b[i][j])
        {
            //c++;
            
            s+=(abs(v2-v1));
        }
        
      }
  }
  
    cout<<s;
       


cout<<nl;

}

signed main(){

    fast
    int t;cin>>t;
    
    while(t--){
        badhri();
    }
}





// 1
// 2
// 181
// 5
// 9


