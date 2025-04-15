class Solution {
public:
    bool exist(vector<vector<char>>& board, string word) {

        int dx[4] = { -1, 0, 1, 0};
        int dy[4] = {0, 1, 0, -1 };

        function<bool(int, int, int)> dfs = [&](int i , int j , int idx)-> {
            if (idx >= word.size())return true;
            char cur = word[idx];
            if (cur != v[i][j])return false;

            if (idx + 1 == word.size())return true;

            vis[i][j] = 1;

            for (int d = 0; d < 4; d++)
            {
                int nx = i + dx[d] , ny = j + dy[d];

                if (nx >= 0 && nx < v.size() && ny >= 0 && ny < v[0].size() && vis[nx][ny] == 0)
                {
                    if (dfs(nx, ny, idx + 1) )
                    {
                        return true;
                    }
                }
            }
            vis[i][j] = 0;
            return false;
        };


        auto check = [&](int i , int j)->bool {

            if ( dfs(i, j, v, word, 0 , vis) )
            {
                return true;
            }
            return false;
        };

        int n = v.size() , m = v[0].size();
        vector<vector<int>>vis(n , vector<int>(m , 0 ) );


        for (int i = 0; i < board.size(); i++)
        {
            for (int j = 0; j < board[0].size(); j++)
            {
                if (board[i][j] == word[0])
                {
                    bool x = check(i, j);
                    if (x == true)return true;
                }
            }
        }
        return false;
    }
};














































