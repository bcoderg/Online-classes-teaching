#include<bits/stdc++.h>
using namespace std;
#define inti long long int 
#define bn ios::sync_with_stdio(0);cin.tie(0);cout.tie(0);


int main(){
     int n;
    cout<<"Enter size of vector n:";
    cin>>n;
    cout<<"Enter n elements:\n";
    vector<int>v;
    for(int i=0;i<n;i++){
        int x;cin>>x;
        v.push_back(x);
    }


cout<<"The n elements are :\n";
   for(auto x:v)
     cout<<x<<' ';


cout<<"\n";

}