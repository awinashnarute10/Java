package DSA.recursion;

public class rotatedbinarysearch {

    public static void main(String[] args) {
         int[] arr = {5,6,7,8,9,10,1,2,3};
         int target = 6;
         int s = 0;
         int e = arr.length-1;

         System.out.println(bs(arr, target, s, e));


 }
    
   public static int bs(int[] arr, int target, int s, int e){
    if(s>e){
        return -1;
    }
           int mid = s+(e-s)/2;

           if(arr[mid]==target)
           {
            return mid;
           }

           if(arr[s]<arr[mid]){
             if(target>=arr[s]&&target<=arr[mid])
             {
                return bs(arr, target, s, mid-1);
             }
             else{
                return bs(arr, target, mid+1, e);
             }
           }

           if(target>=arr[mid]&&target<=arr[e]){
            return bs(arr, target, mid+1, e);
           }

           return bs(arr, target, s, mid-1);


   }
}
