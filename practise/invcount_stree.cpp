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


vector<int>st;

    void build(int idx, int l, int r , vector<int>&v)
    {
        if (l > r)return;
        if (l == r)
        {
            st[idx] = v[l];
            return;
        }
        int mid = (l + r) / 2;
        build( (2 * idx) + 1 , l, mid, v);
        build( (2 * idx) + 2 , mid + 1, r, v);

        st[idx] = (st[(2 * idx) + 1] + st[(2 * idx) + 2]);
    }

    void update(int l , int r, int idx , int pos, int val)
    {
        //  if (l > pos || r < pos)return st[idx]; // not in ranges
        if (l == r)
        {
            //v[pos] = val; // update in original array
            st[idx] += val;
            return;
        }
        int mid = (l + r) / 2;

        //within in left range
        if (pos <= mid)update( l, mid, (2 * idx) + 1 , pos , val);

        // in right range
        else update( mid + 1, r, (2 * idx) + 2 , pos , val);

        st[idx] = ( st[(2 * idx) + 1] + st[(2 * idx) + 2] );
    }



//range sum fine

    int rangesum(int l , int r, int idx , int a , int b ,  vector<int>&v )
    {
        // l r a b   || a b l r  ===> no overlap
        if (a > r || b < l)return 0;

        if (a <= l && r <= b)return st[idx];

        int mid = (l + r) / 2;

        int left = rangesum(l, mid, (2 * idx) + 1 , a, b , v );
        int right = rangesum(mid + 1, r, (2 * idx) + 2 , a, b , v);

        return (left + right);
        //return st[idx];
    }

// FIX THIS INV_COUNT 

// SPOJ & FAMOUS ST Problem 

// ADD negative numbers variation also

void badhri(){


int n;cin>>n;
vector<int>vec(n);
int mx=-1;
for(int i=0;i<n;i++){
   cin>>vec[i];
    mx=max(mx,vec[i]);
}
mx+=1;
vector<int>freq(mx,0);

for(int i=0;i<n;i++)
{
	freq[vec[i]]++;
}

// SGTree sg(mx);
// sg.build(0,0,mx-1 , freq);

st.resize(4*mx + 1);
build(0,0,mx-1,freq);

//cout<<"top = "<<sg.st[0]<<" \n\n";
int ans=0;

for(int i=0;i<n;i++)
{
	freq[vec[i]]--;
	update(0,0,mx-1,vec[i] , -1 );


	ans+=rangesum(0,mx-1,0,1,vec[i]-1,freq);

}



cout<<ans<<nl;

}

signed main(){

    fast
    int t;cin>>t;
    
    while(t--){
        badhri();
    }
}

