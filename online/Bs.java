class Bs{
    public static void main(String[] args){
        
        //search space 
        // initial 24 hrs 
        // then - 12 hrs 
        // then - 6hrs 

        // binary search
        int n=32;
        int left=0 , right=n;
        int target=32 , comparisons=0;

        while(left<=right)
        {
        comparisons++;

        int mid=(left+right)/2; 

        int mid=left + (right-left)/2;


        if(mid==target)//condition
        {
            System.out.println("Element found at "+mid);
            break;
        }
        else if(mid<target)//condition
        {
            left=mid+1;
        }
        else
        {
            right=mid-1;
        }

        }

        System.out.println("Comparisons : "+comparisons);



        //O(n)
        //for(int i=0; i<n; i++)

        //O(n/2)
        // for(int i=0; i<n/2; i++) 
        // for(int i=0; i<n ; i+=2)
        //                    i*=2 
        //                    i*i 
        //                     i^2




        // mid=(left+right)/2
        // //integer overflow 
        // // 10^9 + 10^9 = 2*10^9

        // (left + right)/2 
        // = left/2 + right/2 


        // a + b 
        // sum = a+b 
        // sum>a , sum >b 

        // diff = a-b

        // (l+r)/2 
        // l/2 + r/2 

        // l/2 , r/2 

        // (l+r) ===> overflow 
        // (r+l) ===> overflow  

        // (r-l) ===> no overflow

        // (r-l)/2 
        // r/2 - l/2  + l/2 + l/2

        // r/2 + l/2 





        //multiple variation question , where binary search can be used 
        // 1. find the peak element
        // 2. find the element in rotated sorted array
        // 3. find the square root of a number
        // 4. find the element in a sorted array
        // 5. find the element in a sorted array with duplicates
        // 6. find the element in a sorted array with infinite size

        Q) count no.of zeroes in an array of 0s,1s  
        
        arr[] = [0 , 0 , 0  , 0 , 1 , 1]

        //if you count the first occurence of 1 , then you can find the no.of zeroes

        //first occurence of 1 , last occurence of 0 

        Q)find frequency of an element in a sorted array with duplicates 

        arr[] = [1 , 1, 1 , 2 , 2 , 3 , 3 , 3 , 3 , 4 , 4 , 4 , 4 , 4 ]; 

        element = 3  
        //first occurence of 3 , last occurence of 3 

        lower bound , upper bound








    }
}