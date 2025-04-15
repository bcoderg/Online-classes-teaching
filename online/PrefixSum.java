class PrefixSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] prefixSum = new int[arr.length];

        //given q queries , l , r sum of eleement sin rage( l , r )


        //optimise by prefix sum 
        // 1 2 3 4 5
        // 1 3 6 10 15


        //O(n) time complexity - pre computation 
        for(int i=0; i<arr.length; i++)
        {
            if(i==0)
            {
                prefixSum[i]=arr[i];
            }
            else
            {
                prefixSum[i]=prefixSum[i-1]+arr[i];
            }
        }
        
        while(q-- > 0)
        {
            int l = sc.nextInt();
            int r = sc.nextInt();
            
            //brute force 
            int sum=0;
            for(int i=l; i<=r; i++)
            {
                sum+=arr[i];
            }
            System.out.println("Sum of elements in range "+l+" "+r+" is : "+sum);



            //optimised
            //prefixSum[r] - prefixSum[l-1];

            if(l==0)
            {
                System.out.println("Sum of elements in range "+l+" "+r+" is : "+prefixSum[r]);
            }
            else
            {
                System.out.println("Sum of elements in range "+l+" "+r+" is : "+(prefixSum[r]-prefixSum[l-1]));
            }


        }

//         0 1 - sum = 1
//         0 2 - sum = 1+2
//         0 3 - sum = 1+2+3
//         0 4 - sum = 1+2+3+4

//         2 4 - sum = ? 
//         1 4 - sum = ? 


//         arr[] = {1, 2, 3, 4, 5}

//              0 1 2 3 4 
//              1 2 3 4 5 
// prefixarray  1 3 6 10 15

// 0-4   ==> 15 (0,1,2,3,4)
// -
// 0-1   ==> 3  (0,1)  
// ______________________________
//           12  (2,3,4)

// 0-2   ==> 6  (0,1,2)





        
    
}







//Given an array of numbers , and a index idx 
//product of all numbers except it self arr[idx]

int[] arr = {1, 2, 3, 4, 5};
int n = arr.length;

idx=2 

1 2 3 4 5 
1 

res[0] , 
res[1] , 
res[4]


prod=1;
for(int i=0; i<n; i++)
{
   prod*=arr[i];
}

1*2*3*4*5 = total

except value -- answer 
1       120/1         120
2       120/2          60
3       120/3          40
4       120/4          30
5       120/5           24


int arr[] = {1, 2, 3, 0, 5};
product = 0 

product /1 = 0 
product /2 = 0
product /3 = 0
product /0 = 0  
 0 / 0     = 0  (1*2*3*5)
 30 

//input 2 
1 0 2 3 0 5 0 








num = 70
this =0 

70/0 - run time error 




int product = 1;
int zeroCount=0;

for(int i=0;i<n;i++) {
    if(nums[i]==0)
    {
        zeroCount++;
        continue;
    }
   product *= nums[i];
}


for(int i=0;i<n;i++) {
    if(nums[i] != 0 && zeroCount==0){
        res[i] = product/nums[i];
    }
    else if(nums[i]==0 && zeroCount==1){
        res[i] = product;
    }
    else if(zeroCount>1){
        res[i] = 0;
    }
}
return res;



prefix sum    
1 2 3 4  5 
1 3 6 10 15

int arr[] = {1, 2, 3, 4, 5};
int pre[n];
pre[0] = arr[0];
for(int i=1; i<n; i++)
{
    pre[i] = pre[i-1]+arr[i];
}



//prefix product 
1 2 3 4  5 

left prefix product   
1 2 6 24 120


right prefix product 
1    2   3   4  5 
120  120 60  20 1





array:
1 2 3 4 5 

prefix product:
1 1*2 1*2*3 1*2*3*4 1*2*3*4*5
1 2  6     24       120    



1 2 3  4  5  
1 2 6 24 120

left to right 


right to left:
1 2 3 4 5
120 60 20 5 1

product of all except arr[2]

1*2*4*5 = 40 


   i-1 i i+1
1 2  6 24 120   ===> left

120 60 20 5 1  ===> right







leftProduct[0]=[1];
for(int i=1;i<nums;i++){
arr[i]=arr[i-1]*arr[i-1]
}
rightProduct[0]=1;
for(int j=n-2;j<nums;j++){
arr[j]=arr[j+1]*arr[j+1]}
for (int i = 0; i < n; i++) {
prod[i] = left[i] * right[i];
}return prod;
just the logic sir







int arr[] = {1, 2, 3, 4, 5}; 


arr = 1 2 3  4  5 
pre = 1 3 6 10  15

pre[2]

pre[4]


sum of first 4 elements 
arr[0]+arr[1]+arr[2]+arr[3] 


sum of first 3 elements: 
arr[0]+arr[1]+arr[2] 

sum of first 5 elements:
arr[0]+arr[1]+arr[2]+arr[3]+arr[4]






// //merge 2 sorted arrays 
// arr1[] = {1, 3, 5, 7}
// arr2[] = {2, 4, 6, 8} 

// { 1,3,5,7,0,0,0,0 }


// finalarray[]={1, 2, 3, 4, 5, 6, 7, 8};

// 1 3 5 7 
//        i 

// 2 4 6 8
//       j


//topics covered

Two pointer technique
problems on 2 pointers 

Sliding window

Binary Search: 

    1 D binary search 
    2 D binary search
    binary search on matrices 
    binary search on answer 

    koko eating bananas(google)

prefix Sum: 
    subarray sum equals k 
    contiguous subarray sum 
    product of array except self 
    maximum subarray sum

BFS , DFS 

basics about graphs: 

ways to represent graphs:-
    1.adjacency matrix
    2.adjacency list 
    3.edge list 


//implement DFS and write a pseudo code for it 


//pseudocode for helloworld 
main(){
    print("hello world")
}


//pseudocode for DFS

//pseudo code for dfs -------> 
dfs()
{
    if invalid
    {
        return;
    }

    //do some actions , mark as visited 

    //if not visited before , then call neighbours
    dfs(neighbour1);
    dfs(neighbour2);
    dfs(neighbour3);
    dfs(neighbour4);
}

main(){
    vis[][]
    dfs();
}


1.what is BFS 

2.which datastructure 

3.how do we implement 

4.pseudocode for BFS

bfs()
{
    bfs();
    bfs();
    bfs();
}

main()
{

}




