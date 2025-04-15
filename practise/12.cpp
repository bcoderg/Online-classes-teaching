


// BINARY SEARCH:

// binary - 0,1
// ternary - 0,1,2
// decimal - 0,1,2,9



// 10^6 , 10^8


// 16 hrs




// 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16


// initil comparision:
// 17hrs



// 13hr - lost

// binary search:

//                                     lost
// 0 1 2 3 4 5 6 7 8 9 10 11 12|    13   14  | 15 16

// checked at  -  ignored

// 8               0-7
// 12              9-12
// 14              lost

// lost it at position - 13

// checks = 4

// array of sorted numbers numbers

// find target k , in minimum steps

// print minimum steps



#include<bits/stdc++.h>
using namespace std;
signed main() {
    int n; cin >> n;
    vector<int>v(n + 1);
    for (int i = 0; i <= n; i++)
    {
        v[i] = i;
    }
    int target; cin >> target;
    //binary search , to find in minimum steps
    int ls = 0;
    for (int i = 0; i <= n; i++)
    {
        if (v[i] == target)
        {
            break;
        }
        ls++;
    }
    cout << "linear search steps = " << ls;
    //binary search
    int left = 0 , right = n;
    int bs = 0;
    while (left <= right)
    {
        bs++;
        // int mid = (left + right) / 2;
        // left/2 + right/2
        // 10^8   + 10^9
        // left     right
        // left - value ===> left/2
        // right value ===> right/2

        int mid = left + (right - left) / 2;
        // +left/2
        // +right /2

        if (v[mid] == target)
        {
            break;
        }
        else if (v[mid] > target) {
            right = mid - 1;
        }
        else {
            left = mid + 1;
        }
    }
    cout << "binary steps = " << bs << endl;

// elif arr[m] < t: l = m + 1 # Move to the right half else: r = m - 1

}





10 ^ 8   + 10 ^ 9


10 ^ 17




0 to 10 ^ 9

5 * 100000000


l         r      mid

0         10 ^ 9   5 * (10 ^ 8)
5 * (10 ^ 8)  10 ^ 9

10 * 8  , 10 ^ 9

2 * 10 ^ 9


10 ^ 9

sometime value may cross 10 ^ 9
yes or no




Graphs from 0 to hero
grid based
1d
2d
bfs
dfs
graphs
grah types
cyclic , acyclic
shortest dist alg
Prims , Kruskals
UFDS
10 to 15 classes











l   m l r l
0 0 0 0 0 1 1 1 1 1 1  1   1
0 1 2 3 4 5 6 7 8 9 10 11 12


int first_one_index = -1;  -1 , 6 , 5


int col_size = arr[0].length;

if (arr[i][mid] == 0)
{
    left = mid + 1;
}
else {
    first_one_index = mid;
    right = mid - 1;
}


int total_ones = col_size - first_one_index;






class Solution {
    public int rowWithMax1s(int arr[][]) {
        // code here
        int n = arr.length;
        int m = arr[0].length;
        int max = -1 , idx = -1;

        for (int i = 0; i < n; i++)
        {
            int ones = 0;
            //O(N)
            // for(int j=0;j<m;j++)
            // {
            //     if(arr[i][j]==1)ones++;
            // }

            //O(log N)
            //binary search to find no.of ones
            int left = 0 , right = m - 1;


            int first_one_index = -1;


            int col_size = arr[0].length;

            while (left <= right)
            {
                int mid = left + (right - left) / 2;

                if (arr[i][mid] == 0)
                {
                    left = mid + 1;
                }
                else {
                    first_one_index = mid;
                    right = mid - 1;
                }
            }
            int total_ones = col_size - first_one_index;
            ones = total_ones;

            //checking edge case
            if (first_one_index == -1) {
                ones = 0;
            }
            if (ones > max)
            {
                max = ones;
                idx = i;
            }
        }
        return idx;
    }
}



Binary Search on 1d array - done
Binary Search on 2d array - done

*** Binary Search on answer == == == > most useful , most asked in interviews




pass mark:
35
20
15
23
28




there is a lazy student , help him find the minimum no.of marks
needed to pass all the subjects

he can get 100

hhe want


// target=35

35 20 15 23 28

pass_marks = 50 , 39 , 36 , 35

             l   r  mid
             0  100 50
             0  49  24
             29 49  39
             29 38  33
             34 38  36
             34 35  34
             35 35  35
             35 34



             //code
             l  r  m
             0  100  50
             0  49  24
             25  49  37
             25  36  30
             31  36  33

             34  34  34
             Minimum marks to pass all subjects = 35






//O(n) linear search on answer

                     bool all_subjects_pass(int marks)
{
    m[];
    if (m[0] pass , m[1] pass)
    }


for (int marks = 0 ; marks <= 100 ; marks++)
{
    if (all_subjects_pass(marks)) {
        cout << marks;
        break;
    }
}


//O(logn) - Binary Search
int left = 0 , right = 100;
int passmarks = 100;
while (left <= right)
{
    int mid = (left + right) / 2;

    if (all_subjects_pass(mid))
    {
        passmarks = mid;
        right = mid - 1;
    }
    else {
        left = mid + 1;
    }
}




