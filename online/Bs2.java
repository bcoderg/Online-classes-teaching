public class Bs2 {
    public static void main(String[] args) {
        // finding first occurence of a number 
        //int arr[] = {2, 4, 10, 10, 10, 18, 20};

        //another example with diff values 
         int arr[] = {2, 4, 4 , 4 , 4 , 4 , 4 , 4 , 4 , 6, 8, 10, 12};

        // 2 4 10 10 10 18 20

        int n = arr.length;
        int first_occurence = -1; 
        int target = 4; 


        //linear search
        // for(int i=0; i<n; i++)
        // {
        //     if(arr[i]==target)
        //     {
        //         first_occurence=i;
        //         break;
        //     }
        // }

        int l=0 , r=n-1;
        while(l<=r)
        {
            int mid=l+(r-l)/2;

            if(arr[mid]==target)
            {
                System.out.println("----> l : "+l+" r : "+r+" mid : "+mid+" so moving to the left side");
                first_occurence=mid;
                r=mid-1; ///reducing the search space by ignoring the right part
            }

            else if(arr[mid]<target)
            {
                System.out.println("----> l : "+l+" r : "+r+" mid : "+mid+" so moving to the right side");
                l=mid+1;
            }
            else
            {
                System.out.println("----> l : "+l+" r : "+r+" mid : "+mid+" so moving to the left side");
                r=mid-1;
            }

        }


        System.out.println("\n\n====>First occurence of "+target+" is at index : "+first_occurence); 


        System.out.println("\n for last occurence of number \n\n");
        //for last occurence of number 
        int last_occurence=-1;

        l=0 ;
        r=n-1;
        while(l<=r)
        {
            int mid=l+(r-l)/2;

            if(arr[mid]==target)
            {
                System.out.println("----> l : "+l+" r : "+r+" mid : "+mid+" so moving to the right side");
                last_occurence=mid;
                l=mid+1; ///reducing the search space by ignoring the left part
            }

            else if(arr[mid]<target)
            {
                System.out.println("----> l : "+l+" r : "+r+" mid : "+mid+" so moving to the right side");
                l=mid+1;
            }
            else
            {
                System.out.println("----> l : "+l+" r : "+r+" mid : "+mid+" so moving to the left side");
                r=mid-1;
            }

        }

        System.out.println("\n\n====>Last occurence of "+target+" is at index : "+last_occurence);

    }
}








// binary search resources 
code for reference , first and last occurence 
https://ideone.com/9FOpvX


code for reference ,iterative implementing
https://ideone.com/k9UJfu

https://leetcode.com/discuss/study-guide/1233854/a-noobs-guide-to-the-binary-search-algorithm

https://leetcode.com/discuss/interview-question/313216/binary-search-interview-questions

https://www.geeksforgeeks.org/problems/row-with-max-1s0023/1

https://leetcode.com/discuss/general-discussion/691825/Binary-Search-for-Beginners-Problems-or-Patterns-or-Sample-solutions

https://www.geeksforgeeks.org/java-equivalent-of-cpp-lower_bound-method/

lower bound , upperbound: https://codeforces.com/blog/entry/109920
https://codeforces.com/blog/entry/109920








//dry run 
//4,5,6,0,1,2,3

bs on rotated sorted array   

target = 6

4 5 6 0 1 2 3
0 1 2 3 4 5 6 
l     m     r  
l   r 
    lr
m=(l+r)/2


//dry run 
l 
r 
m 










