package DSA.Searching;

public class linearsearchstring {
    public static void main(String[] args) {
        String name = "Awinash";
        char target = 'w';
         boolean ans =lsearch(name, target);
         System.out.println(ans);
    }
    static boolean lsearch(String name, char target)
    {
        if(name.length()==0)
        {
            return false;
        }
         for (int i = 0; i < name.length(); i++) {
            if (target == name.charAt(i)) {
                System.out.println("Found at index "+(i+1));
                return true;
            }
            
         }
         return false;
    }
}
