package DSA.Sorting;

public class smallestletterthantarget {
    public static void main(String[] args) {
        char[] array = {'x','x','y','y'};
        char target = 'z';
        System.out.println(nextGreatestLetter(array, target));
    }

     public static char nextGreatestLetter(char[] letters, char target) {
        
      for(int i=0; i<letters.length; i++)
      {
        if(letters[i]>target)
        {
            return letters[i];
        }
      }
      return letters[0];

    //   binary search 
    //   char res=letters[0];
    //     int start=0;
    //     int end=letters.length-1;
    //     while(start<=end)
    //     {
    //         int mid=start+(end-start)/2;
    //         if(letters[mid]==target)
    //         {
    //             start=mid+1;
    //         }
    //         else if(target>letters[mid])
    //         {
    //             start=mid+1;
    //         }
    //         else if(letters[mid]>target)
    //         {
    //             res=letters[mid];
    //             end=mid-1;
    //         }
    //     }
    //     return res;
    }
    
}
