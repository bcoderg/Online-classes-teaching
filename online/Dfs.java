import java.util.Stack;

public class Dfs {

    public boolean isValid(int i , int j , int[][]mat , int[][]visited)
    {
        //if invalid , return 
        if(i<0 || j<0 || i>=mat.length || j>=mat[0].length)
        {
            return false;
        }
        if(visited[i][j]==1){
            return false;
        }
        return true;
    }

    public void check(int i , int j , int[][] mat , int[][] visited)
        {

            System.out.println(" currently at "+i+" "+j);

            //check for invalid
            if(i<0 || i>=mat.length || j<0 || j>=mat[0].length)
            {
                System.out.println("Current;y t i,j = "+i+" "+j+" is invalid");
                return;
            }

            //mark visited
            visited[i][j]=1;

            //reached end or not 
            if(i==4 && j==4){
            	System.out.println("reached end 4,4");
            	return;
            }

        //currently at i,j 
        // mat[i+1][j]; //bottom 
        // mat[i-1][j]; //top
        // mat[i][j+1]; //right
        // mat[i][j-1]; //left

        //check if i+1,j is valid  

        // check(i+1,j,mat);
        // check(i-1,j,mat);
        // check(i,j+1,mat);
        // check(i,j-1,mat);


        // mat[i+1][j]; //bottom 
        // mat[i-1][j]; //top
        // mat[i][j-1]; //left
        // mat[i][j+1]; //right

        // 1 , -1 , 0 , 0  //i
        // 0 , 0 , -1 , 1  //j 

        int arr_i[]={1 , -1 , 0 , 0 };
        int arr_j[]={ 0 , 0 , -1 , 1};

        //instead of this 
        for(int idx=0;idx<4;idx++)
        {
            if(isValid(i+arr_i[idx],j+arr_j[idx],mat,visited))
            {
                check(i+arr_i[idx],j+arr_j[idx],mat,visited);
            }
        }

        }

        public void recursiveCheck(int i , int j , int[][] mat , int[][] visited)
        {
            Stack<int[]>stack=new Stack<int[]>();
            // arr[0] - i , 
            // arr[1] - j

            stack.push(new int[]{i,j});
            while(!stack.isEmpty())
            {
                //getting top of stack 
                int[]top=stack.pop();
                int newi=top[0];
                int newj=top[1]; 
            

                System.out.println(" currently at "+newi+" "+newj);

                //if reached 4,4
                if(newi==4 && newj==4){
                    System.out.println("reached end 4,4");
                    return;
                }

                //mark visited
                visited[newi][newj]=1;

                //check for all 4 directions
                int arr_i[]={1 , -1 , 0 , 0 };
                int arr_j[]={ 0 , 0 , -1 , 1};

        //instead of this 
        for(int idx=0;idx<4;idx++)
        {
            if(isValid(i+arr_i[idx],j+arr_j[idx],mat,visited))
            {
                // check(i+arr_i[idx],j+arr_j[idx],mat,visited);

                //here we should add it to our , created stack "stack"
                stack.push(new int[]{i+arr_i[idx],j+arr_j[idx]});
            }
        }


            }
        }


    public static void main(String[] args) {
        int n=5;
        int[][]mat=new int[n][n];
        int[][]visited=new int[n][n]; 
        Dfs obj=new Dfs();
        obj.check(0,0,mat,visited); //i , j , matrix


        //recursive check
        //obj.recursiveCheck(0,0,mat,visited);
    }
}
















 //class dfs_new
 void dfs_new(int i , int j , int[][] vis , char[][] grid)
 {
    //check invalid case  , if it is water case 
    if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]=='0' || vis[i][j]==1)
    {
        return;
    }

    //check all neighbours(top , left , bottom , right) , if they are valid , 
    //they are land , recursively call dfs , mark as visited 

 }









