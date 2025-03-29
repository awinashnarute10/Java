package DSA.OOP;

public class comparing implements Comparable<comparing> {
      
    int rollno;
    int marks;

    public comparing(int rollno, int marks){
           this.rollno  = rollno;
           this.marks = marks;
    }

@Override
public int compareTo(comparing o){
    int diff  = (int)(this.marks-o.marks);
    return diff;
}

    
    public static void main(String[] args) {
        comparing Comparing  = new comparing(12, 50);
        comparing Comparing2 = new comparing(13, 60);

        System.out.println(Comparing.compareTo(Comparing2));
    }
    
}
