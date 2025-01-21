package DSA.recursion;

public class nknights {

    public static void main(String[] args) {
        boolean[][] board = new boolean[4][4];
        knights(board, 0, 0, board.length);

    }

    public static void knights(boolean[][] board, int row, int col, int k){
         if(k==0){
            display(board);
            return;
         }

         if (row == board.length) {
            
            return;
        }
    
        if (col == board.length) {
            
            knights(board, row + 1, 0, k);
            return;
        }

         if(isSafe(board,row,col)){
            board[row][col]=true;
            knights(board, row, col+1, k-1);
            board[row][col]=false;

         }

         knights(board, row, col+1, k);

         



    }

    public static boolean isSafe(boolean[][] board, int row, int col){
        if(row==0){
            return true;
        }
        if(isValid(board, row-2, col+1)){
        if(board[row-2][col+1]){
            return false;
        }
    }

       if(isValid(board, row-2, col-1)){
        if(board[row-2][col-1]){
            return false;
        }
    }

        if(isValid(board, row-1, col+2)){
        if(board[row-1][col+2]){
            return false;
        }
    }

        if(isValid(board, row-1 ,col-2)){
        if(board[row-1][col-2]){
            return false;
        }
    }

        return true;
    }

    public static boolean isValid(boolean[][] board, int row, int col){
        if(row>=0&&row<board.length&&col>=0&&col<board.length){
            return true;
        }
        return false;
    }

    public static void display(boolean[][] board){
        for (boolean[] bs : board) {
            for (boolean bs2 : bs) {
                if(bs2){
                    System.out.print("K");
                }
                else{
                    System.out.print("O");
                }

                
            }
            System.out.println();
        }
        System.out.println();
    }
    
}
