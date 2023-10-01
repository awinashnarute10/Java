package DSA;

import java.util.Scanner;

public class countingoccurences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        sc.close();

        int n = String.valueOf(x).length()-2;
        System.out.println(n);
        
        int a,b,c,d,e,f,g,h,i,j;
        a=b=c=d=e=f=g=h=i=j=0;

        for(int k =1; k<=n; k++)
        {
           double z = x%10;
           int y = (int)(z);
           System.out.println(y);
           x = x/10;
           if(y==0)
           {
            a++;
           }
           if(y==1)
           {
            b++;
           }
           if(y==2)
           {
            c++;
           }
           if(y==3)
           {
            d++;
           }
           if(y==4)
           {
            e++;
           }
           if(y==5)
           {
            f++;
           }
           if(y==6)
           {
            g++;
           }
           if(y==7)
           {
            h++;
           }
           if(y==8)
           {
            i++;
           }
           if(y==9)
           {
            j++;
           }
        }
          
        if(a>0)
        {
            System.out.println("0 occured "+a+" times");
        }
         if(b>0)
        {
            System.out.println("1 occured "+b+" times");
        }
         if(c>0)
        {
            System.out.println("2 occured "+c+" times");
        }
         if(d>0)
        {
            System.out.println("3 occured "+d+" times");
        }
         if(e>0)
        {
            System.out.println("4 occured "+e+" times");
        }
         if(f>0)
        {
            System.out.println("5 occured "+f+" times");
        }
         if(g>0)
        {
            System.out.println("6 occured "+g+" times");
        }
         if(h>0)
        {
            System.out.println("7 occured "+h+" times");
        }
         if(i>0)
        {
            System.out.println("8 occured "+i+" times");
        }
         if(j>0)
        {
            System.out.println("9 occured "+j+" times");
        }

    }
    
}
