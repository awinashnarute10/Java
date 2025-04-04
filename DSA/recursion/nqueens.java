package DSA.recursion;

import java.util.Arrays;

public class nqueens {

    public static void main(String[] args) {
        boolean[][] board = new boolean[4][4];
        

        System.out.println(queens(board, 0));
    }

    public static int queens(boolean[][] board, int row) {
        if (row >= board.length) {
            display(board);

            return 1;
        }

        int count = 0;
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
               board[row][col]= true;
               count+=queens(board, row+1);
               board[row][col]=false;
            }
        }

        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <=maxLeft; i++) {
            if(board[row-i][col-i]){
                return false;
            } 
        }

        int maxRight = Math.min(row,board.length-col-1);
        for (int i = 1; i <=maxRight; i++) {
            if(board[row-i][col+i]){
                return false;
            }
        }

        for (int i = 1; i <=row; i++) {
            if(board[row-i][col]){
                return false;
            }
        }

        return true;

    }

    private static void display(boolean[][] board) {
        
        for (boolean[] bs : board) {
            for (boolean bs2 : bs) {
                if (bs2) {
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

}
