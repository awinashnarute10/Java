package DSA.recursion;

public class removealla {

    public static void main(String[] args) {
        String up = "baccadh";
        String p = "";
        skip(p, up);

        System.out.println(skip1(up));

        String apple = "afdtfappleajds";
        System.out.println(skipapple(apple));

        String appnotapple = "aidsbsappaojf";
        System.out.println(skipappnotapple(appnotapple));
    }

    public static void skip(String p, String up)
    {
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        if(ch=='a'){
            skip(p, up.substring(1));
        }
        else{
            skip(p+ch, up.substring(1));
        }
    }

    public static String skip1(String up){
        if(up.isEmpty()){
            return "";
        }

        char ch = up.charAt(0);

        if(ch=='a'){
            return skip1(up.substring(1));
        }
        else{
            return ch+skip1(up.substring(1));
        }
    }

    public static String skipapple(String apple){

        if(apple.isEmpty()){
            return "";
        }

        if(apple.startsWith("apple")){
            return skipapple(apple.substring(5));
        }
        else{
                return apple.charAt(0)+skipapple(apple.substring(1));
        }

    }

    public static String skipappnotapple(String appnotapple){

        if(appnotapple.isEmpty()){
            return "";
        }

        if(appnotapple.startsWith("app")&&!appnotapple.startsWith("apple")){
            return skipappnotapple(appnotapple.substring(5));
        }
        else{
                return appnotapple.charAt(0)+skipappnotapple(appnotapple.substring(1));
        }

    }
    
}
