package DSA.Math;

public class excelcolumnnumber {

    public static void main(String[] args) {
        String s = "FXSHRXW";
        System.out.println(titleToNumber(s));
        
        
    }

    public static int titleToNumber(String columnTitle) {
        int sum = 0;
        for(char c : columnTitle.toCharArray()){
            sum = sum*26 + (c-'A'+1);
        }
        return sum;
    }
    
}
