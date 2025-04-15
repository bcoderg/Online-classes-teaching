#include<bits/stdc++.h>
using namespace std;
#define nl "\n";
const int N = 0;


void badhri() {
	int n; cin >> n;
	cout << "n  = " << n;

}

signed main() {

	badhri();
}



sum of three numbers = target





//MOTIVATION PROBLEM
                       Q) Given an array of integers  , find if there exists a pair whose sum which equals target , print that pair

testcase 1:

7
1 5 2 6 8 7 3

target = 8


         testcase 2:
         4
         1 4 3 9

         target = 6



//Approach
                  1 5 2 6 8 7 3
                  0 1 2 3 4 5 6

                  0 == >  1  , 2 , 3 , 4 , 5 , 6
                  1 == > 1  , 2 , 3 , 4 , 5 , 6
                  2 == > 1  , 2 , 3 , 4 , 5 , 6

                  6 == > 1  , 2 , 3 , 4 , 5 , 6



                  vector<int>arr = {1 , 5, 2 , 6 , 8 , 7, 3};


for (int i = 0; i < n; i++)
{
for (int j = 0; j < n; j++)
	{
		if (arr[i] + arr[j] == target) {
			cout << arr[i] << " " << arr[j] << endl;
		}
	}
}



7 * 7 = 49
        n = 7
            49  ,

            n * n

            checks = 49


                     0 == > 1 , 2 , 3 , 4 , 5 , 6
                     1 == > 2 , 3 , 4 , 5 , 6
                     2 == > 3 , 4 , 5 , 6
                     3 == > 4 , 5 , 6
                     4 == >  5, 6
                     5 == > 6
                     6 == >

                     checks = 21

                              checks = 6 , 5 , 4 , 3 , 2 , 1


                                       n * (n + 1) / 2  = 21
                                               checks = 21


                                                       for (int i = 0; i < n; i++)
{
for (int j = 0; j < n; j++)
	{
		if (arr[i] + arr[j] == target) {
			cout << arr[i] << " " << arr[j] << endl;
		}
	}
}

//49 checks


for (int i = 0; i < n; i++)
{
for (int j = i + 1; j < n; j++)
	{
		if (arr[i] + arr[j] == target) {
			cout << arr[i] << " " << arr[j] << endl;
		}
	}
}
//21 checks

1 5 2 6 8 7 6 3



hashmap
complement exists or not


sorting , two pointers


for ()
{

}

4 -- >= 8 - 4
1 -- > 8 - 1
6 -- > 8 - 6

sorted array in ascending order

1 5 2 6 8 7 3

n*logn


r

1 2 3 5 6 7 8
l

sum = 9


      1, 8 > 9
      2, 8 > 9
      3, 8 > 9
      5, 8 > 9


      decrement r

      1, 8 > 8
      1 + 7 == 8

      target = 4
               1 + 3

               found

               l
               1 2 3 5 6 7 8
               r



               checks = 2
                        1, 8
                        r--
                        1, 7

                        , target = 4
                                   1, 8
                                   1, 7
                                   1, 6
                                   1, 5
                                   1, 3 == 4

                                   checks = 5




                                           int l = 0 , r = n - 1;


//keep checking till we get answer
while (l <= r)
{


int sum = arr[l] + arr[r];

//check if equals to target
	if (sum == target) {
		// sum == target
// print answer
		cout << arr[l] << " " << arr[r] << endl;
	}



// if sum greater
// 	//make the sum less , decrease r
	else if (sum > target) {
		r--;
	}

// if sum lesser
// 	//make the sum big , increase l

	else if (sum < target) {
		l++;
	}

}









cycle exists in linked list or not

two pointers





1->2->3->4->6-> -5->8->3 10 12


cycle exists in array







[3, 1, 2, 4]


even 2 4
odd 3 1

2 , 4 , 3  , 1



l = 0 , r = n - 1

            arr[r]
            r--

            even
            arr[l]
            l++




            ab - cd
            l   r

            abcd
            l  r

            dbca
            lr

            dcba


            4 2 5 7
            0 1 2 3




