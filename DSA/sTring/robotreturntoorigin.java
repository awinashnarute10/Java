package DSA.sTring;

public class robotreturntoorigin {
    public static void main(String[] args) {
        String moves = "LL";
        System.out.println(judgeCircle(moves));
    }

    public static boolean judgeCircle(String moves) {
       // 8ms solution
        // int x =0, y = 0;
        // for(int i = 0; i<moves.length(); i++)
        // {
        //     if(moves.charAt(i)=='U') y++;
        //     else if(moves.charAt(i)=='D') y--;
        //    else if(moves.charAt(i)=='L') x--;
        //     else x++;
        // }
        // if(x==0&&y==0) return true;
        // return false;

        //0ms:- 
        int[] letter = new int[102];

        for (char c:moves.toCharArray()) {
            letter[c]++;   // as char will be concerted to ascii value
            
        }
        return letter['U']==letter['D'] && letter['L']==letter['R'];
    }
    
}
