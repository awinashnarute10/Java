package DSA.sTring;

public class longpressedname {

    public static void main(String[] args) {
        String name = "alex";
        String typed = "aaleexa";
        System.out.println(isLongPressedName(name, typed));
    }

    public static boolean isLongPressedName(String name, String typed) {
        if(typed.length()<=name.length()&&!typed.equals(name)) return false;
      
      char[] real = name.toCharArray();
      char[] typo = typed.toCharArray();
       
       int i =0, j = 0;
       while(i<real.length&&j<typo.length)
       {
          if(real[i]==typo[j])
          {
           
            i++;
            j++;
            continue;
           
          }
          else if(i>0&&real[i-1]==typo[j])
          {
            
            j++;
            continue;
          }
          else return false;

       }
       if(i<real.length) return false;   // this means the typed is greater in length but some character are missing therefore false
       while(j<typo.length)    // this to check characters after the last character on name in typed 
       {
        if(real[i-1]!=typo[j]) return false;
        j++;
       }
     return true;
    }
    
}
