class BeingZero{
    public:
        vector<int> solve(vector<int> &v, int n,int k)
        {
            // Do not write main method
            // You are just supposed to implement the logic here!

            vector<int>ans;
            deque<int>dq;
            for(int i=0;i<k;i++)
            {
               while(!(dq.empty()) && v[i]>=v[dq.back()])dq.pop_back();

               dq.push_back(i);
               
            }

            ans.push_back(v[dq.front()]);

            for(int i=k;i<n;i++)
            {
                while( !(dq.empty()) && dq.front()<=i-k )dq.pop_front();

                while(!(dq.empty()) && v[i]>=v[dq.back()])dq.pop_back();

               dq.push_back(i);
               ans.push_back(v[dq.front()]);

            }

            return ans;


        }
};