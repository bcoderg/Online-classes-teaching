
import java.util.*;
import java.lang.*;
import java.io.*;


class JJ {

    static void m1() {
        System.out.println("from m1");
    }


    public static void main(String[] args) {
        // calling m1 without creating
        // any object of class Test
        m1();
    }
}




class BeingZero {
    //List<String> k=new ArrayList<>();

    void fun(int i ,  int j , int grid[][] , int R , int C, String s , int vis[][] , List<String>ans) {


        if (i == R - 1 && j == C - 1) {
            ans.add(s);
        }

        if (i < 0 || j < 0 || i >= R || j >= C || grid[i][j] == 0 || vis[i][j] == 1)return;
        vis[i][j] = 1;
        fun(i + 1, j, grid, R, C, s + "D", vis, ans);
        fun(i, j - 1, grid, R, C, s + "L", vis, ans);
        fun(i, j + 1, grid, R, C, s + "R", vis, ans);
        fun(i - 1, j, grid, R, C, s + "U", vis, ans);
        vis[i][j] = 0;

    }
    public List<String> solve(int grid[][], int R, int C) {
        List<String> ans = new ArrayList<>();
        //complete the function

        int[][] vis = new int[R][C];
        for (int i = 0; i < vis.length; i++)Arrays.fill(vis[i] , 0);


        fun(0, 0, grid, R, C, "", vis, ans);
        Collections.sort(ans);
        return ans;

    }
}