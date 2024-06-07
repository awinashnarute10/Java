package DSA.Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class arrayintersection2 {
    public static void main(String[] args) {
        int[] nums1 ={1,2,2,1};
        int[] nums2 ={2};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>(10);
       
        for(int i : nums1)
        {
             
            {
                for(int j=0; j<nums2.length; j++)
                {
                    if(i==nums2[j])
                    {
                        
                        list.add(i);
                        nums2[j]=-1;
                       
                        break;
                    }
                }
            }
        }

        int[] arr = new int[list.size()];
        for(int i = 0; i<arr.length; i++)
        {
            arr[i] = list.get(i);
        }
        return arr;

          //   0ms:- 
      // int[] count = new int[1001];
      // for(int num : num1){
      //     count[num]++;
      // }

      // int[] result = new int[1001];
      // int index = 0;

      // for(int num : num2){
      //     if(count[num] > 0){
      //         count[num]--;
      //         result[index++] = num;
              
      //     }
      // }
      // return Arrays.copyOfRange(result, 0, index);
  }
    }

