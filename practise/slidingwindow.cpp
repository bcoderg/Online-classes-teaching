

// #MOTIVATION PROBLEM

// Q)Given an array of integers , find the maximum sub array sum of size 3

// ip:
// 7
// 1 5 3 7 3 2 9
// k=3
// max sub array sum of size 3

// op:
// 5 3 7



// 8
// 1 5 4 3 6 1 2 7

// k=2
// max sub array sum of size 2

// 5,4
// 3,6
// 2,7


// vector<int>arr;


// j<k
// 1 5 4 3 6 1 2 7 99
// 0 1 2 3 4 5 6 7 8

// n=9
// k=3

// left
// 0<3
// 1<3
// 2<3
// 3<3 , 4<3 , 5<3




//  max
// last valid index ===> 6

// last valid index => in terms of i,j,k,n


// n-k
// n-k+1



// n-k
// n=9 , k=3
// 9-3  = 6

// n-k+1
// 9-3+1
// 6+1
// 7




// 7,8    7 + 99
// 8      99

// 0<3 , 1<3 , 2<3  , checked

// 1<3 , 2<3 ,  ----> 3<3 ? no right fails

// 2<3 , ----->  3<3 , 4< 3


// j<i+k

// i=0 , i+3 = 3
// 0<3 , 1<3 , 2<3

// i=1 , i+3 = 4
// 1<4 , 2<4 , 3<4




// int maxSum=-1;

// for(int i=0;i<n-k+1;i++)
// {
// 	int tempSum=0;
// 	for(int j=i;j<i+k;j++)
// 	{
// 		tempSum+=arr[j];
// 	}
// 	maxSum=max(maxSum,tempSum);
// }

// cout<<maxSum;



// bugs:

// hint: array of integers
// array contains all negative numbers

// float(-inf)
// INT_MIN
// Integer.MinValue


// maximum of 0 , negative will be 0



// //code

// int windowSum=0;
// for(int i=0;i<k;i++)
// {
// 	windowSum+=arr[i];
// }

// int left=0,right=k;

// //remove left
// //add  right
// //move left , move right by 1 step

// what is the condition ???

// right<n  - valid
// left<k

// left ,right , n , k


// while(left<n-k+1)
// {
// windowSum-=arr[left];

// windowSum+=arr[right];


// left++;
// right++;
// }




// j<k
// 1 5 4 3 6 1 2 7 99
// 0 1 2 3 4 5 6 7 8

// n=9
// k=3

// left
// 0<3
// 1<3
// 2<3
// 3<3 , 4<3 , 5<3













#include<bits/stdc++.h>
using namespace std;

int main() {

	int n, k; cin >> n >> k;
	vector<int>arr(n);
	for (int i = 0; i < n; i++)cin >> arr[i];


	int windowSum = 0 , maxSum = 0;
	for (int i = 0; i < k; i++)
	{
		windowSum += arr[i];
	}

	int left = 0, right = k;

//remove left
//add  right
//move left , move right by 1 step

	// what is the condition ?? ?

	// right < n  - valid
	// left < k

	// left , right , n , k


	while (left < n - k + 1)
	{
		maxSum = max(maxSum , windowSum);

		windowSum -= arr[left];
		windowSum += arr[right];

		left++;
		right++;
	}

	cout << "maxsum  =" << maxSum << endl;


	return 0;
}









#include<bits/stdc++.h>
using namespace std;

int main() {

	int n, k; cin >> n >> k;
	vector<int>arr(n);
	for (int i = 0; i < n; i++)cin >> arr[i];


	int windowSum = 0 , maxSum = 0;
	for (int i = 0; i < k; i++)
	{
		windowSum += arr[i];
	}

	int left = 0, right = k;

//remove left
//add  right
//move left , move right by 1 step

	// what is the condition ?? ?

	// right < n  - valid
	// left < k

	// left , right , n , k


	while (left < n - k + 1)
	{
		maxSum = max(maxSum , windowSum);

		windowSum -= arr[left];
		windowSum += arr[right];

		left++;
		right++;
	}

	cout << "maxsum  =" << maxSum << endl;


	return 0;
}






fixed size sliding window


variable size sliding window


2 5 1 3 1 6 1 2 7
0 1 2 3 4 5 6 7 8
l
r

0 - 6
1 - 6
2 - 6

why 3 - 6 , is invalid



0 - 6   1 - 6    2 - 6
0 - 7   1 - 7    2 - 7
0 - 8   1 - 8    2 - 8



minimum size subarray , with all ones


size 6 , size 7 , size 8  , size 9

total_ones = 3;

ones_count = 0;

int left = 0 , right = 0;

int min_size = INT_MAX;

while (left <= right)
{
	if (arr[right] == 1) {
		ones_count++;
	}

	while (ones_count == total_ones) {
		min_size = min(min_size , right - left + 1);
		left++;
		if (arr[left] == 1) {
			ones_count--;
		}
	}
	right++;
}












































