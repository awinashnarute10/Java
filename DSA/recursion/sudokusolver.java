package DSA.recursion;

public class sudokusolver {

    public static void main(String[] args) {
        int[][] board = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        if (solve(board)) {
            display(board);
        }
    }

    public static boolean solve(int[][] board){
        int n = board.length;
        int row = -1;
        int col = -1;

        
// replacing r, c from arguments 
boolean emptyleft = true; 
        for(int i = 0; i<n; i++){
            for (int j = 0; j <n; j++) {

                if(board[i][j]==0){
                    row=i;
                    col = j;
                    emptyleft = false;
                    break;                   
                }
                
            }
            if(emptyleft==false){
                break;
            }
        }

        if(emptyleft==true){
            return true;
        }

        for (int num = 1; num<=9; num++) {

            if(isSafe(board, row, col, num)){
                board[row][col] = num;
                
                if(solve(board)){
                    return true;
                }
                else{
                    board[row][col] = 0;
                }
            }
            
        }
        return false;
    }

    public static void display(int[][] board){
        for (int[] is : board) {
            for (int num : is) {
                System.out.print(num+" ");
                
            }
            System.out.println();
        }
    }

    public static boolean isSafe(int[][] board, int row, int col, int num){
        for (int i = 1; i <=9; i++) {

            if(board[row][col]==num){
                return false;
            }
           
            
        }


        for (int[] is : board) {

            if(is[col]==num){
                return false;
            }
            
        }


        int sqrt = (int)(Math.sqrt(board.length));

        int rowstart = row-(row%sqrt);
        int colstart = col-(col%sqrt);

        for (int i = rowstart; i < rowstart+sqrt; i++) {
            
            for (int j = colstart; j < colstart+sqrt; j++) {

                if(board[i][j]==num){
                    return false;
                }
                
            }
        }

        return true;
        
    }
    
}
