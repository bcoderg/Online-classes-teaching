import java.util.ArrayList;
import java.util.HashMap;

public class SumO {
    public static void main(String[] args) {
        int n = 5;
        // int[] nums = {1, 2, 3, 4, 5};
        int[] nums = {1, 2, 3, 4, 0};
        int[] res = new int[n];
        int[] leftPrefix = new int[n];
        int[] rightPrefix = new int[n];
        leftPrefix[0] = nums[0];
        int prod=nums[0];

        // arr   1 2 3 4 5
        // left  1 2 6 24 120
        //      120 120 60 20 1   

            //   1    2   3  4 5
            //   120 120 60 20 5


        for(int i=1;i<n;i++) {
            prod *= nums[i];
            leftPrefix[i] = leftPrefix[i-1] * nums[i];
        }
        // nums[n-1] = 1; -----> bug 
        rightPrefix[n-1] = nums[n-1];
        for(int i=(n-2);i>=0;i--) {
             rightPrefix[i] = rightPrefix[i+1] * nums[i]; 
            //----> bug

            //correct calculation

        }
        for(int i=0;i<n;i++) {
            int leftVal = (i==0)?1:leftPrefix[i-1];
            int rightVal = (i==n-1)?1:rightPrefix[i+1]; 
            res[i] = leftVal * rightVal;
        }


        for(int i=0;i<n;i++) {
            System.out.print(res[i]+" ");
        }
        // System.out.println();
        // for(int i=0;i<n;i++) {
        //     System.out.print((prod/nums[i])+" ");
        // }




        we are counting subarrays , 
        whose sum = 0 

        [0, 0, 5, 5, 0, 0]

        if element = 0  
        nums[i]=0 

        [0 , 0]
        0 
        0 
        0 0 
        3 sub arrays

        [0, 0, 5, 5, 0, 0]
        0 , 0 , 0 , 0 ==> 4 zeroes , forms 4 sub arrays  
        0 0  - 1
        0 0  - 1

        total ===> 4 + 2 = 6 subarrays 

        ArrayList<Integer> res = new ArrayList<>();
        res.add(0);
        res.add(1);
        res.add(5); 

        //first element 
        res.get(0);

        //last element 
        int n=res.length();
        res.get(n-1);
        
        res.first();
        res.last();


        //res.put( index , new val);

        HashMap<Integer, Integer> map = new HashMap<>();
        hm.put(0, 1);
        int val = hm.getOrDefault(key, defaultVal);




    }
}



1 2 3 5 8 7
      i 

arr[]
prefix[]


edge list 
adjacency list 
adjacency matrix:

  0 1 2 3 4 5
0 0 1 0 0 0 0
1 1 0 0 0 0 1
2 0 0 0 0 0 0
3 0 1 0 0 0 0
4 0 0 0 0 0 0
5 0 0 0 0 0 0

edge list:
0 1 
1 5 
1 0
3 1 
0 3 

adjacency list:
0 -> 1,3 
1 -> 0,5
2 ->
3 -> 1,0 
4 ->
5 -> 1

mat[][] = new int[n][n];
mat[0][1] = 'S';
mat[3][4]='E'; 








