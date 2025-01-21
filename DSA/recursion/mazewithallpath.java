package DSA.recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class mazewithallpath {

    public static void main(String[] args) {
        boolean[][] board = {
            {true,true,true},
            {true,true,true},
            {true,true,true},
        };

        int r = 0, c = 0;
        String p = "";

        path(p, board, r, c);
System.out.println();
        int[][] maze = {
            {0,0,0},
            {0,0,0},
            {0,0,0},
        };

        pathwithnumbers(p, maze, r, c, 1);

    }

    public static void path(String p, boolean[][] board, int r, int c){
        if(r==2&&c==2){
            System.out.println(p);
            return;
        }
        if(!board[r][c]){
            return;
        }

        board[r][c] = false;

        if(r<2){
            path(p+'R', board, r+1, c);
        }
        if(c<2){
            path(p+'D', board, r, c+1);
        }
        if(r>0){
            path(p+'L', board, r-1, c);
        }
        if(c>0){
            path(p+'U', board, r, c-1);
        }

        board[r][c] = true;
        return;


    }

    public static void pathwithnumbers(String p, int[][] maze, int r, int c, int step){
        if(r==2&&c==2){
              maze[r][c] = step;
            for (int[] is : maze) {
                System.out.println(Arrays.toString(is));
            }
            System.out.println(p);
            System.out.println();
        }

        if(maze[r][c]!=0){
            return;
        }
        maze[r][c]=step;


        if(r<2){
            pathwithnumbers(p+'D', maze, r+1, c,step+1);
        }
        if(c<2){
            pathwithnumbers(p+'R', maze, r, c+1,step+1);
        }
        if(r>0){
            pathwithnumbers(p+'U', maze, r-1, c,step+1);
        }
        if(c>0){
            pathwithnumbers(p+'L', maze, r, c-1,step+1);
        }

        maze[r][c] = 0;
        return;
        
    }
    
}
