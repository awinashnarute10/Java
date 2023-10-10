package DSA;

public class switch1 {
  
    public static void main(String[] args) {
      
       fun(1,2);
          
    }

    static void fun(int ...v){
     
       System.out.println("varargs");


}

static void fun(int a, int b)
{
    System.out.println("normal");
}
}