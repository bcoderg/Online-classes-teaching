
#include<bits/stdc++.h>
using namespace std;
signed main() {
    int n; cin >> n;
    vector<int>v(n);
    for (int i = 0; i < n; i++)
    {
        cin>>v[i];
    }
    int min_marks_to_pass=-1;

    int l=0 , r=100;
    cout<<"l  r  m\n";
    while(l<=r)
    {
        int m=l+(r-l)/2;

        cout<<l<<"  "<<r<<"  "<<m<<"\n";

        //check it mid marks are , enough to pass all subjects
        bool flag=true;
        for(int i=0;i<n;i++)
        {
            if(v[i]>m)
            {
                //then we will fail 
                flag=false;
                break;
            }
        }

        if(flag==true){
            //then we can pass all subjects
            min_marks_to_pass=m;
            r=m-1;
        }
        else{
            //we will fail in some subjects
            l=m+1;
        }
    }

    if(min_marks_to_pass==-1)
    {
        cout<<"No enough marks to pass all subjects\n";
        return 0;
    }   

    cout<<"Minimum marks to pass all subjects = "<<min_marks_to_pass<<"\n";


}


left = 0 , right = 1 








//     int target; cin >> target;
//     //binary search , to find in minimum steps
//     int ls = 0;
//     for (int i = 0; i <= n; i++)
//     {
//         if (v[i] == target)
//         {
//             break;
//         }
//         ls++;
//     }
//     cout << "linear search steps = " << ls<<"\n";
//     //binary search
//     int left = 0 , right = n;
//     int bs = 0;
//     while (left <= right)
//     {
//         bs++;
//         int mid = (left + right) / 2;
//         if (v[mid] == target)
//         {
//             break;
//         }
//         else if (v[mid] > target) {
//             right = mid - 1;
//         }
//         else {
//             left = mid + 1;
//         }
//     }
//     cout << "binary steps = " << bs << endl;

// }



// //2d Binary search 

// 1) check with diagonal values 

// then compare in both rows 


// 2) 
// Taking middle column and performing binary search on it.
//  If the mid value is greater we can ignore the rows after that 
//  and if the mid value is less then we ignore the rows above it.



//Bfs , Dfs 

search algorithms 

linear search , binary search


traversal techniques 


0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20


//2d matrix indices of size 5*5 

    cols
     0  1  2  3  4
0    00 01 02 03 04   rows
1    10 11 12 13 14
2    20 21 22 23 24      
3    30 31 32 33 34
4    40 41 42 43 44


//similar matrix with 1 value S , another E rest all with X

    cols
     0  1  2  3  4
0    S  X  X  X  X   rows
1    X  X  X  X  X
2    X  X  X  X  E
3    X  X  X  X  X
4    X  X  X  X  X


//if we travel in the following directions order wise bottom , right , top , left

dfs(new_row,new_col)
{

    if(new_row<0 || new_row>=5 || new_col<0 || new_col>=5)
    {
        return;
    }   

//calling according to directions given 
dfs(row+1,col)
dfs(row,col+1)
dfs(row-1,col)
dfs(row,col-1)



}



start from S and reach E 

//dry run wit indices 

starts at 0,0
bottom = 1,0 
bottom = 2,0 
bottom = 3,0
bottom = 4,0:  
    right = 4,1
    right = 4,2
    right = 4,3
    right = 4,4:
        top = 3,4 
        top = 2,4
        at 2,4 we have target E so we can stop here
    right = 4,5(invalid so it comes back) 

bottom = 5,0(invalid so it comes back)










if element is at [row,col]

top =    [row -1 , col]
right =  [row , col + 1]
bottom = [row + 1 , col]
left = [row , col-1]

5
S X X X X
X X X X E
X X X X X
X X X X X
X X X X X
0 0
X  X  X  X  X
X  X  X  X  E
X  X  X  X  X
X  X  X  X  X
0 0




3rd year students ====> DSA concepts 


which concepts you know in DSA 




what probelms/issues you are facing in DSA right now ?

//Advanced Topics
Trees , Graphs, DP , recursion , 

//basics should be very strong 




//Question: 
Given a array of numbers and a target value 
check if there is a pair of numbers whose sum is equal to target. 

/TWO SUM PROBLEM

arr[9] = {1,2,3,4,5,6,7,9,10};
target = 10; 



for(int i=0;i<n;i++)
{
    for(int j=i+1;j<n;j++)
    {
        if(arr[i]+arr[j]==target)
        {
            cout<<"Pair found at "<<i<<" "<<j<<"\n";
            return 0;
        }
    }
}


Time Complexity of your code ?




for(int i=0;i<arr.length;i++){
for(int j=i+1;j<are.length;j++){
if(arr[i]+arr[j]==target){
return true;
}
}
}







22RH1A1261(IT-A)
6:58 PM




arr=[1,2,3,4,5,6,7,8,9]
x=list(arr)
Target=10
for i in arr:
	for j in arr:
		if(i+j==Target):
			print(i,j)



//same in java
int arr[]={1,2,3,4,5,6,7,8,9};
int target=10;
for(int i=0;i<arr.length;i++)
{
    for(int j=0;j<arr.length;j++)
    {
        if(arr[i]!=arr[j] && arr[i]+arr[j]==target)
        {
            System.out.println(arr[i]+" "+arr[j]);
        }
    }
}


arr[i]==arr[j]==5 
arr[i]+arr[j]==target

arr[i] = 5 
arr[j] = 5 
target = 10  









def sum(arr, target):
    for i in range(len(arr)):
        for j in range(i + 1, len(arr)):
            if arr[i] + arr[j] == target:
                return [i,j]

arr = [1,2,3,4,5,6,7,8,9]
target = 9
print(sum(arr, target))






for i in range(len(n)):
      for j in range(i + 1, len(n)):
        if n[i] + [j] == target:
          return [i, j]





for(int i=0; i < arr.length;i++)
for(int j=i; i < arr.length;i++)
if(arr(i)+ arr(j) == target)
Syso( arr(i), arr(j));







target=10
1,2,3,4,5,6,7,9,10

//Don't think about code 
//Think about logic


everyone think about your logic







