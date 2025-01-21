package DSA.recursion;

public class maze {

    public static void main(String[] args) {
        int r = 3, c = 3;
        System.out.println(count(r, c));
        r = 3;
        c = 3;
        System.out.println(countwihtdiagonal(r, c));

        String p = "";
        path(p, r, c);
        System.out.println("-------------");
        pathwithdiagonal(p, r, c);

        boolean[][] board = {
            {true,true,true},
            {true,false,true},
            {true,true,true},

        };

        System.out.println();
        r=0;
        c=0;
        p="";
        pathwithobstacle(p, board, r, c);


    }

    public static int count(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }

        int right = count(r - 1, c);
        int left = count(r, c - 1);

        return left + right;
    }

    public static int countwihtdiagonal(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }

        int right = countwihtdiagonal(r - 1, c);
        int left = countwihtdiagonal(r, c - 1);
        int middle = countwihtdiagonal(r - 1, c - 1);

        return left + right + middle;
    }

    public static void path(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }

        if (r > 1) {
            path(p + 'D', r - 1, c);
        }
        if (c > 1) {
            path(p + 'R', r, c - 1);
        }

        return;

    }

    public static void pathwithdiagonal(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }

        if (r > 1) {
            pathwithdiagonal(p + 'D', r - 1, c);
        }

        if (c > 1) {
            pathwithdiagonal(p + 'R', r, c - 1);
        }

        if (r > 1 && c > 1) {
            pathwithdiagonal(p + 'd', r - 1, c - 1);
        }
        return;
    }

    public static void pathwithobstacle(String p,boolean[][] board, int r, int c){
        if(r==2&&c==2){
         System.out.println(p);
         return;
        }

        if(!board[r][c]){
            return;
        }

        if(c<2){
            pathwithobstacle(p+'R', board, r, c+1);
        }
        if(r<2){
            pathwithobstacle(p+'D', board, r+1, c);
        }
        if(r<2&&c<2){
            pathwithobstacle(p+'d', board, r+1, c+1);
        }
        return;
    }

}
