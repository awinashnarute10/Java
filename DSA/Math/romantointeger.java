package DSA.Math;

public class romantointeger {

    public static void main(String[] args) {
        String s =  "MCMXCIV";
        System.out.println(convert(s));
        
    }

    public static int convert(String s)
    {
         int pre = 0;
         int sum = 0;

         for (int i = 0; i < s.length(); i++) {

            int current = 0;
            char ch = s.charAt(i);

            switch (ch) {
                case 'I':
                    current = 1;
                    break;

                case 'V':
                   current = 5;
                   break;

                   case 'X':
                   current = 10;
                   break;

                   case 'L':
                   current = 50;
                   break;

                   case 'C':
                   current = 100;
                   break;

                   case 'D':
                   current = 500;
                   break;

                   case 'M':
                   current = 1000;
                   break;
            
                default:
                    break;
            }
            if(pre<current)
            {
                sum+=current - (2*pre);
            }
            else{
                sum+= current;
            }
            pre = current;
         }

         return sum;
    }
    
}
