package DSA.Math;

import java.util.ArrayList;
import java.util.List;

public class Sieveoferatosthenes{

    public static void main(String[] args) {
        int n = 40;
        boolean[] mark = new boolean[n+1];

        System.out.println(prime(n, mark));


    }
    
    public static List<Integer> prime(int n, boolean[] mark)
    {
             for(int i = 2; i*i<=n; i++)
             {
                if(!mark[i])
                {
                        for (int j = i*i; j <=n; j+=i) {
                            mark[j] = true;
                            
                        }
                }
             }
             
             List<Integer> li = new ArrayList<>();

             for (int i = 2; i <mark.length; i++) {
                     if(!mark[i])
                     {
                        li.add(i);
                     }
                
             }

             return li;
    }
    
}
