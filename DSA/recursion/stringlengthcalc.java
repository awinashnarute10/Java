package DSA.recursion;

public class stringlengthcalc {

    public static void main(String[] args) {
        String s = "Awinash";
        System.out.println(calc(s));
    }

    static int calc(String s) {
        if(s=="")
        {
            return 0;
        }
        return calc(s.substring(1)) +1;

    }

}
