package DSA;

import java.util.Scanner;

public class gradefunction {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        grade(n);
        sc.close();
        
    }
static void grade(int n)
{
      if(n<=40)
      {
        System.out.println("Fail");
      }
      if(n>=41&&n<=50)
      {
        System.out.println("DD");
      }
      if(n>=51&&n<=50)
      {
        System.out.println("CD");
      }
      if(n>=61&&n<=70)
      {
        System.out.println("BC");
      }
      if(n>=71&&n<=80)
      {
        System.out.println("BB");
      }
      if(n>=81&&n<=90)
      {
        System.out.println("AB");
      }
      if(n>=91&&n<=100)
      {
        System.out.println("AA");
      }

}
}
