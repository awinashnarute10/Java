package DSA.Searching;

public class ceilingnumber {

    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int s = 0;
        int e = arr.length-1;
        int t = 17;
        int m = 0;
        if(t>arr[arr.length-1])
        {
            System.out.println("Invalid Target");
            System.exit(0);
        }
        while (s<e) {
            m = (e-s)+s/2;
            if (t<arr[m]) {
                e = m-1;
                
            }
            if (t>arr[m]) {
                s = m+1;
                
            }
            if(t==arr[m])
            {
                System.out.println("target found at "+m+" index");
            }
        }
           System.out.println(arr[s]);
           
    }
    
}
