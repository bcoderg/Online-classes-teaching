#include<bits/stdc++.h>
using namespace std;
#define long long int inti
#define se set<int>s 
#define ve vector<int>v;
#define fast ios::sync_with_stdio(0);cin.tie(0);cout.tie(0);
#define l long long int 
#define f float
#define d double
const int N=0;
void badhri(){
int n;cin>>n;
ve
//int b[n];
int s=0;
for(int i=0;i<n;i++){
    int p;cin>>p;
    v.push_back(p);
    s+=p;
}
cout<<"THe elements in vector are \n";

for(auto x:v)cout<<x<<" ";

cout<<"Sum of all elements is "<<s;


cout<<"\n";

}

int main(){

    fast
    int t;cin>>t;
    
    while(t--){
        badhri();
    }

    

}


