package DSA.recursion;

public class linearsearch {

    public static void main(String[] args) {
        int[] arr  = {1,5,7,4,9};
        int target = 7;
        System.out.println(isPresent(arr, target, target));
    }

    public static boolean isPresent(int[] arr, int target, int index)
    {
         if(index==arr.length)
         {
            return false;
         }       
         if(arr[index]==target){
            return true;
         }

         return isPresent(arr, target, index+1);
    }

    
}
