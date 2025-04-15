
given an array

find next smaller to right
find next smaller to left


arr =



// -1 -1  1 1  3s

// 5   3 10 6 20


// 5
// 3



  vector<int> get_smaller_to_left( vector<int>&arr )
{
	int n = arr.size();

	vector<int>ans(n, -1);

	stack<int>stk;

	for (int i = n - 1; i >= 0; i--)
	{

		while (!(stk.empty()) && arr[i] < arr[stk.top()])
		{
			ans[stk.top()] = i;
			stk.pop();
		}

		stk.push(i);
	}

	return ans;
}


//
Given array all elements as 0 ,

Given q queries ,

l , r , x

add x from l to r




APPRAOCH 1 : BRUTE FORCE == > O(n*q)


APPROACH 2: PREFIX SUM   == => O(n + q)




x       - x
0 1 2 3 4 5 6 7 8
y       - y
l     r


left - l
right - r


at l == > add x

at r + 1 == > subtract x



arr:

2 5 3 7 1 6


queries:

0 3 5

1 2 3

2 4 - 4

1 5 7





0 1 2 3   4  5

2 5 3 7   1  6
5 3   - 3 - 5
- 4        + 4
7              | -7




0 1  2   3  4 5
--
2 5  3   7  1 6

5 10 - 4 - 3 - 5  4

7 22




Q3)

Given 2 Strings s1 , s2

convert s1 into s2

1) delete any char in s1
2)update any character in s1
3)add any character in s1




s1: horse
s2: ros

return min no.of operations required


       3 operations:

       update h to r
       delete r
       delete e


       answer = 3



                horse
                ros
                1 , 2 , 3






                if characters are in between , can update



                hashmap => for characters in s2




	                q4)
	K th largest element in an array


APPROACH 1 : SORT and get K th largest

APPROACH 2 : Use Priority queue

MAX HEAP - for all elements :
TC : O(N * logN )
SC : O(N)

maintain of min - heap of size k :
TC : O(N * logK )
SC : O(K)



		1 2 35 7 3 8

		3rd

		2 7 35
		7 8 35



