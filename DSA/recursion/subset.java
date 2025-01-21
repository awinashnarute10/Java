package DSA.recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class subset {

    public static void main(String[] args) {
        int[] nums = {1,2};
      ArrayList<ArrayList<Integer>> ans   = subsetwithoutduplicate(nums);
      for (ArrayList<Integer> list: ans) {
        System.out.println(list);
         
      }

      int [] nums1 = {1,2,2};
      System.out.println(subsetwithduplicates(nums1));
    }

    public static ArrayList<ArrayList<Integer>> subsetwithoutduplicate(int[] nums){
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
           outer.add(new ArrayList<>());// so that there is one [] inside 
        for(int num : nums){
            int n = outer.size();
            
            for (int i = 0; i < n; i++) {
                ArrayList<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
                
            }
        }
        return outer;
    }

    public static ArrayList<ArrayList<Integer>> subsetwithduplicates(int[] nums){

        Arrays.sort(nums);
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
int start = 0;
int end = 0;
        for(int i =0; i<nums.length; i++){
            start=0;
            if(i>0&&nums[i]==nums[i-1]){
                start = end+1;
            }
            int n = outer.size();
            end = outer.size()-1;

            for (int j = start; j <n; j++) {

                ArrayList<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(nums[i]);
                outer.add(inner);

                
            }
        }

        return outer;


    }
    
}
