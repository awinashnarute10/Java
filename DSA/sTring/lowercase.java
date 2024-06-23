package DSA.sTring;

public class lowercase {
    public static void main(String[] args) {
       String s = "Hello";
       System.out.println(toLowerCase(s));
    }
    public static String toLowerCase(String s) {
        // char[] ss = s.toCharArray(); // to store character of string 
        // int[] sss = new int[s.length()]; // to store ascii value of characters
        // for(int i = 0; i<sss.length; i++)
        // {
        //     sss[i] = (int)ss[i]; // converting char to ascii int 
        //     if(sss[i]<91&&sss[i]>64) // setting range for ascii value of capital letters only 
        //     {
        //         sss[i]+=32; // adding 32 as difference between ascii value of capital and its small letter is 32
        //         ss[i]= (char)sss[i]; // storing the changed ascii int back to letter 
        //     }
        // }
        //  s = String.copyValueOf(ss); // converting array back to string 
        // return s;


        // char[] arr = s.toCharArray();

        // for(int i = 0; i<arr.length; i++)
        // {
        //     if(arr[i]>='A'&&arr[i]<='Z')
        //     {
        //         arr[i] = (char)(arr[i]+32);
        //     }
        // }
        // return new String(arr);


        StringBuilder builder = new StringBuilder();

        for(int i=0; i<s.length(); i++)
        {
               char c = s.charAt(i);
               if(c>='A'&&c<='Z')
               {
                c = (char)(c+32);
               }
               builder.append(c);
        }
        
        return builder.toString();

    }
    
}
