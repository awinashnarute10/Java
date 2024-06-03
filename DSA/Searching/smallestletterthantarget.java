package DSA.Searching;

public class smallestletterthantarget {
    public static void main(String[] args) {
        char[] array = {'x','x','y','y'};
        char target = 'x';
        System.out.println(nextGreatestLetter(array, target));
    }

     public static char nextGreatestLetter(char[] letters, char target) {
        
      // for(int i=0; i<letters.length; i++)
      // {
      //   if(letters[i]>target)
      //   {
      //       return letters[i];
      //   }
      // }
      // return letters[0];

        int s =0, e = letters.length-1;
        int mid = 0;
        while (s<=e) {
           mid = s+(e-s)/2;
          if(target<letters[mid])
          {
                e = mid-1;
          }
          else
          {
            s = mid+1;
          }       
        }
        System.out.println(s);
        return s==letters.length? letters[0]:letters[s];
    }
    
}
