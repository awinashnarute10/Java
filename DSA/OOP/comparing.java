package DSA.OOP;

import java.util.Arrays;
import java.util.Comparator;

public class comparing implements Comparable<comparing> {
      
    int rollno;
    int marks;

    public comparing(int rollno, int marks){
           this.rollno  = rollno;
           this.marks = marks;
    }

@Override
public int compareTo(comparing o){
    return this.marks-o.marks;
}


@Override
public String toString() {
    return rollno+" ";
}

    
    public static void main(String[] args) {
        comparing Comparing  = new comparing(14, 50);
        comparing Comparing2 = new comparing(13, 60);

        System.out.println(Comparing.compareTo(Comparing2));

        comparing[] list = {Comparing, Comparing2};

        System.out.println(Arrays.toString(list));
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));


        Arrays.sort(list, new Comparator<comparing>() {
             
            public int compare(comparing o, comparing p){
                return o.marks-p.marks;
            }
        });


        Arrays.sort(list, (o1,p1) -> (p1.marks-o1.marks));

        System.out.println(Arrays.toString(list));
       
    }
    
}
