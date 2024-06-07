package DSA.Sorting;
import java.util.*;

public class arrayintersection {
    public static void main(String[] args) {
       int[] nums1 = {1,2,2,1}, nums2 ={2,2};
       System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
    //     ArrayList<Integer> list = new ArrayList<> (20);

    // Arrays.sort(nums1);
    // Arrays.sort(nums2);

    //     for(int i = 0; i<nums1.length; i++)
    //     {
    //         if(!list.contains(nums1[i]))
    //         {
    //             for(int j =0; j<nums2.length; j++)
    //             {
    //                 if(nums1[i]==nums2[j])
    //                 {
    //                     list.add(nums1[i]);
    //                     break;
    //                 }
    //             }
    //         }
    //     }
    //     int[] arr = new int[list.size()];
        
    //     for(int i = 0; i<list.size(); i++)
    //     {
    //         arr[i] = list.get(i);
    //     }

    //     return arr;

    // 0ms answer:-
         int[] temp = new int[1000];
         for (int i : nums1) {
            temp[i]=1;
            
         }
         int c = 0;
         for(int i : nums2)
         {
            if(temp[i]==1)
            {
               temp[i]=2;
               c++;
            }
         }
          int j = 0;
         int[] arr = new int[c];
          for (int i : nums2) {
            if(temp[i]==2)
            {
                temp[i]=1;
                arr[j]=i;
                j++;
            }
          }

        return arr;

    
        
    }

    
}
