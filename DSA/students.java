package DSA;

public class students {
    int roll_no;
    int age;
    String name;

    
students(String name, int roll_no, int age)
{
    this.name = name;
    this.roll_no=roll_no;
    this.age = age;
}






    public static void main(String[] args) {
        students s1 = new students("awinasg", 2205143, 18);
        students s2 = new students("chabbi", 2205008, 20);
        students s3 = new students("shubham", 2205014, 19);

        System.out.println("Student name = "+s1.name+" roll no = "+s1.roll_no+" age = "+s1.age);
        System.out.println("Student name = "+s2.name+" roll no = "+s2.roll_no+" age = "+s2.age);
        System.out.println("Student name = "+s3.name+" roll no = "+s3.roll_no+" age = "+s3.age);
    }
    
}
