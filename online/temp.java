import java.util.HashMap;

class Temp{
    public static void main(String[] args){
        int arr[] = {2,4,6,8};
        int n = arr.length;
        int target=10;
        //two sum 
         int comparisons=0;


           //O(n* n) = O(n^2)
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<n; j++){
        //         comparisons++;
        //         if(arr[i]+arr[j]==target){
        //             System.out.println(arr[i]+" and "+arr[j]);
        //             System.out.println(arr[j]+" and "+arr[i]);
        //         }
        //     }
        // }




         //O(n* (n-1))/2 = O(n^2)
        // for(int i=0; i<n; i++){
        //     for(int j=i+1; j<n; j++){
        //         comparisons++;
        //         if(arr[i]+arr[j]==target){
        //             System.out.println(arr[i]+" and "+arr[j]);
        //             System.out.println(arr[j]+" and "+arr[i]);
        //         }
        //     }
        // }


        // if size of array is n=100 
        // 100*100= 10^4 comparisons  

        // n=10^5 
        // 10^5 * 10^5 = 10^10 comparisons 

        // if any algorithm taakes more than 10^8 iterations/comparisons it leads to TLE (Time Limit Exceeded)
        // 1 sec , 2 sec  

        // 5 sec , 10 sec 



        // 2 pointer approach - O(n)
        int l=0,r=n-1;
        
        while(l<r)//condition l!=r will fail in even length cases 
        {
           // System.out.println("----> l : "+l+" r : "+r); 
        comparisons++;
        int val=arr[l]+arr[r];
        if(val==target){
            System.out.println(arr[l]+" and "+arr[r]);
            l++;
            r--;
        }
        else if(val<target){
            l++;
        }
        else if(val>target){
            r--;
        }
        }

        //O(n) space and O(n) time

        //optimal way using map 
        //O(n) time and O(n) space 

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            int val = target-arr[i];
            if(map.containsKey(val))
            {
                System.out.println(arr[i]+" and "+val);
            }
            map.put(arr[i],i);
        }

        System.out.println("Comparisons : "+comparisons);

        // i=1 ---> j=2,3,4,5,6,7,9,10
        // i=2 ---> j=3,4,5,6,7,9,10
        // i=3 ---> j=4,5,6,7,9,10
        // i=4 ---> j=5,6,7,9,10
        // i=5 ---> j=6,7,9,10

        // i=7 ---> j=9,10
        // i=9 ---> j=10
        // i=10 --->

        // (8*(7) )/2 = 28




        //dry run 
        // 1 2 3 4 5 6 7 9 10

        // arr[i]=1 , arr[j]=1 , arr[j]=2 , arr[j]=3 , arr[j]=4 , arr[j]=5 , arr[j]=6 , arr[j]=7 , arr[j]=9 , arr[j]=10

        // arr[i]=2 , arr[j]=1 , arr[j]=2 , arr[j]=3 , arr[j]=4 , arr[j]=5 , arr[j]=6 , arr[j]=7 , arr[j]=9 , arr[j]=10

        // Time Complexity : O(n^2)
        // n=9 

        // 1 - 9 comparsion
        // 2 - 9 comparsion
        // 3 - 9 comparsion
        // 4 - 9 comparsion

        // 9 - 9 comparsion 

        // 9*9 = 81 comparisons were done 


        //optimise the code 



    }
}