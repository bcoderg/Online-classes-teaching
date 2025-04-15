import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Bfs {

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

        //instead of this , we use a queue to implement bfs 
        Queue<int[]>queue=new LinkedList<int[]>();
        queue.add(new int[]{i,j});
        visited[i][j]=1;

        while(!queue.isEmpty())
        {
            int[] top=queue.remove();
            int newi=top[0];
            int newj=top[1];

            System.out.println(" currently at "+newi+" "+newj);

            if(newi==4 && newj==4){
            	System.out.println("reached end 4,4");
            	return;
            }


            int arr_i[]={1 , -1 , 0 , 0 };
            int arr_j[]={ 0 , 0 , -1 , 1};
            for(int id=0;id<4;id++)
            {
                if(isValid(newi+arr_i[id],newj+arr_j[id],mat,visited))
                {
                    queue.add(new int[]{newi+arr_i[id],newj+arr_j[id]});
                    visited[newi+arr_i[id]][newj+arr_j[id]]=1;
                }
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
        Bfs obj=new Bfs();
        obj.check(0,0,mat,visited); //i , j , matrix


        //recursive check
        // obj.recursiveCheck(0,0,mat,visited);
    }
}



//FIFO 
//First In First Out - FIFO



//steps to implement BFS 
1. Create a queue
2. Add the starting node to the queue
3. Mark the starting node as visited
4. While the queue is not empty: 
            a. Remove the first node from the queue
            b. If the removed node has unvisited children,
                   mark them as visited and add them to the queue
5. Repeat step 4 until the queue is empty






//no .of islands - leetcode 
//sampl input:





