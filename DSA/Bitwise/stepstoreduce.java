package DSA.Bitwise;

public class stepstoreduce {

    public static void main(String[] args) {
        int n = 14;
        System.out.println(numberOfSteps(n));
    }
    
    public static int numberOfSteps(int num) {
        int steps = 0;
        while(num>0)
        {
            steps++;
            if((num&1)==0)
            {
                num>>=1;
            }
            else{
                num = num-1;
            }
        }
        return steps;

    }
}
