package DSA.sTring;

import java.util.ArrayList;

public class string {

    public static void main(String[] args) {
        String a  = new String("Awinash");
        String b = new String("Awinash");
        String c = "Awinash";
        String d = "Awinash";
        
        System.out.println(a==b); //false as comapring two differnet objects(even tho same value) will give false
        System.out.println(c==d);// true as both are pointing to same object 
        System.out.println(a.equals(b));// true as this method only checks value and not objects
        
        
        
        float x = 23.23443f;
        System.out.printf("Formatted numeer is %.2f", x);// her the number is formatted and rounded off to 2 digits afer decimal using printf instead of println
        // after percent(without space ) whatever written is space holder and is different for every data type and can only be used with printf and s is format specifier
System.out.println();
        System.out.printf("%s is very %s","Awinash","Cool"); //%s is space holder for string data type
System.out.println();

System.out.println((char)('a'+3));// using + operator between 2 primitive types will always lead to its conversion in int
System.out.println("a"+1);// here 1 will is integer and will be converted to Integer(wrapper class) therefore toString method will be called

System.out.println("Awinash"+new ArrayList<>());// here for arraylist toString is called again
// System.out.println(new Integer(56)+new ArrayList<>());// gives error as with '+' operator both value should be primitive type or atleast 1 object should be string

      
        }
        
        
    }
    

