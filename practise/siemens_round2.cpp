#include<bits/stdc++.h>
using namespace std;
#define int long long
#define se set<int>s
#define ve vector<int>v;
#define fast ios_base::sync_with_stdio(0);cin.tie(0);cout.tie(0);

#define nl "\n";
const int N = 0;

z
void badhri() {
    int n; cin >> n;






    cout << nl;

}

signed main() {

    fast
    int t = 1;

    cin >> t;

    while (t--) {
        badhri();
    }
}



void printTopView(Node root)
{
    queue<Node>q;
    q.push(root);

    vector<int>left , right;

    while (!q.empty())
    {
        int sz = q.size();
        for (int i = 0; i < sz; i++)
        {
            Node cur = q.front(); q.pop();

            if (i == 0)
            {
                left.push_back(cur.val);

                if (cur.left != null)
                {
                    q.push(cur.left);
                }
            }

            else if (i == sz - 1)
            {
                right.push_back(cur.val);

                if (cur.right != null)
                {
                    q.push(cur.left);
                }
            }

            else
            {
                if (cur.left != null)
                {
                    q.push(cur.left);
                }


                if (cur.right != null)
                {
                    q.push(cur.left);
                }
            }

        }
    }

    reverse(left.begin(), left.end());

    for (auto x : left)cout << x << " ";

    for (auto x : right)cout << x << " ";


}







