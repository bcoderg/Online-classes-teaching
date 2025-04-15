package recursion;

public class subsetsum {
    public static void subsets(int[] arr,int i,int sum) {
        //base case
        if(i==arr.length) {
            System.out.println(sum);
            return;
        }
        subsets(arr,i+1,sum+arr[i]); //pick the element
        subsets(arr,i+1,sum); //not pick the element
    }
    public static void main(String[] args) {
        int[] arr = {1,2,8};
        int n = arr.length;
        
        //all valid subsets 
        // 1,2,8,1+2,1+8,2+8,1+2+8 , {} 
        int mx=(1<<n);
        for(int i=0;i<mx;i++)//loop from 0 to 2^n 
        {
            int sum=0; 
            for(int j=0;j<n;j++)
            {
                if( (i&(1<<j)) !=0)//if jth bit is set
                {
                    sum+=arr[j];
                }
            }
            System.out.println(sum);
        } 

        //recursive code
        subsets(arr,0,0);
    }
}
























class Solution {
    void subsets(int[] arr,int i,int sum,List<Integer> temp,List<List<Integer>> ans) {
        //base case
        if(i==arr.length) {
            // System.out.println(sum);
            ans.add(new ArrayList<>(temp));
            return;
        }
        temp.add(arr[i]);
        subsets(arr,i+1,sum+arr[i],temp,ans); //pick the element
        temp.remove(temp.size()-1);
        subsets(arr,i+1,sum,temp,ans); //not pick the element
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        ans.add(temp);
        subsets(nums,0,0,temp,ans);
        return ans;
        
    }
}







class Solution {
    Set<List<Integer>> set = new HashSet<>();
    void subsets(int[] arr,int i,int sum,List<Integer> temp,List<List<Integer>> ans) {
       //base case
       if(i==arr.length) {
           // System.out.println(sum);
              if(!set.contains(temp)) {
                set.add(new ArrayList<>(temp));
                ans.add(new ArrayList<>(temp));
              }
           return;
       }
       temp.add(arr[i]);
       subsets(arr,i+1,sum+arr[i],temp,ans); //pick the element
       temp.remove(temp.size()-1);
       subsets(arr,i+1,sum,temp,ans); //not pick the element
   }
   public List<List<Integer>> subsetsWithDup(int[] nums) {
       List<List<Integer>> ans = new ArrayList<>();
       List<Integer> temp = new ArrayList<>();
       subsets(nums,0,0,temp,ans);
       return ans;
       
   }
}
