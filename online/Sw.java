public class Sw {
    public static void main(String[] args){
        // int arr[] = {2,4,6,8,10,12};
        // int n = arr.length;
        //  int comparisons=0;  

        // 2 4 6 8 10 12  
        // 0 1 2 3 4   5

        // sum of all subarrays of size 3 

        //your logic code / approach

        //brute force 
        //O(n^3)
        // for(int i=0; i<n; i++)
        // {
        //     for(int j=i+1; j<n; j++)
        //     {
        //         int sum=0;
        //         for(int k=i+2; k<i+3; k++)
        //         {
        //             sum=arr[i]+arr[j]+arr[k];
        //             System.out.println(sum);
        //         }
        //     }
        // }


        //better approach
        //O(n^2)
        // for(int i=0;i<n-2;i++)
        // {
        //     int sum=0;
        //     for(int j=i;j<i+3;j++)
        //     {
        //         comparisons++;
        //         System.out.println("--->j is at "+j);
        //         sum+=arr[j];
        //     }   
        //     System.out.println(sum);
        // }

        //indices traversed by j loop 
        // 0 1 2 
        //   1 2 3 
        //     2 3 4 
        //       3 4 5

        //algorithm in english 
        //1. start from 0th index
        //2. take sum of 0th, 1st and 2nd index 
        //3. print sum
        //4. remove starting element  , add last element 

    //    2 4 6 8 10 12  
    //    0 1 2 3 4   5
    //    i     i+3

    // int sum=0;

    // for(int i=0;i<3;i++)
    // {
    //     sum+=arr[i];
    // }
    // System.out.println(sum); 
    // comparisons++;

    //remove i , add i+3 
    // for(int i=0;i<n-3;i++)
    // {
    //     sum-=arr[i]; //removing ith element
    //     sum+=arr[i+3]; //adding i+3 th element
    //     System.out.println(sum);
    //     comparisons++;
    // }


    //while loop 
    // int l=0 , r=3; 
    // while(l<n-3)
    // {
    //     sum-=arr[l];
    //     sum+=arr[r];
    //     System.out.println(sum);
    //     l++;r++;
    //     comparisons++; // just for printing the comparisons
    // }
    // System.out.println("comparisons : "+comparisons);


    //Sliding window approach - O(n) 
    // n=10^5 
    // n*n 

    // n - 10^5 

    //variable length sliding window/
    
    //************************************************************************************************ */

    //Q2) maximum length of subarray with all even numbers 

    int arr[] = {1 ,2,4, 3 ,6,8,10,12 , 5 , 14 };
    int n = arr.length;
    //int comparisons=0;  

    //0 2 4 3 6 8 10 12 5 14
    int l=0 , r=0;
    int odd_count=0;
    int ans=0; 

    //optimal code 
    while(l<n && r<n)
    {
        if(arr[r]%2!=0)
        {
            odd_count++;
        }

        //when odd count is more than 1 , then we need to change the window size
        while(l<r && odd_count>1)
        {
            //keep removing from the left side
            if(arr[l]%2!=0)
            {
                odd_count--;
            }
            l++;
        }
        ans=Math.max(ans,r-l+1);
        r++;
    }


   
    System.out.println(ans);



    //************************************************************************************************ */

    //Q3) max sub array , with at max 1 odd number allowed 

    //1 2 4 3 6 8 10 12 5 14




    Q4)

    s="abcabcbb";

    //should not directly tell optimal code in an interview 

    //in interview , you should follow some steps 

    for(i=0;i<s.length;i++)
int freq[]=new int[10]
for(j=i;j<s.length;j++)
if(freq[currentchar>0){
break;
freq[currentcharchar]++
maxlength=math.max(maxlength,j-i+1) 

    }
}
