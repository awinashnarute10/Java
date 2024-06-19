package DSA.sTring;

public class SB {
    public static void main(String[] args) {
        // Q. Print series a-z
        String series = "";
        for(int i = 0; i<26; i++)
        {
            char ch = (char)('a'+i); // here castin to char is done as + between leads to int only
            series+=ch; // no casting required as + between string and anything leads to string only
        }
        System.out.println(series);
        // the problem with this solution is that as string cannot be modified, everytime we add one character to existing string we are actually
        //  creating a new object and not modifying the existing object therefor a lot of objects are unused at the end of the program
        // therefore we will use StrinfBuilder as it modifies the existing created object instead of creating new object

        // better solution:- 
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i <26; i++) {
            char ch = (char)('a'+i);
            builder.append(ch);
        }
        System.out.println(builder);
    }
    
}
