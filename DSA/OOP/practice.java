package DSA.OOP;

public class practice {

    public static void main(String[] args) {
        Innerpractice awinash = new Innerpractice(0, "Awinash");

        System.out.println(awinash.rno);
        System.out.println(awinash.name);
    }
    
}

 class Innerpractice {

    int rno;
    String name;

    Innerpractice(int rno, String name){
            rno = rno;
            name = name;
    }
}
