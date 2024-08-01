package DSA.recursion;

public class functioncallingandreverse {

    public static void main(String[] args) {
        message1();
    }

    static void message1() {
        System.out.println("Hello1");
        message2();
        System.out.println("Reverse4");
    }

    static void message2() {
        System.out.println("Hello2");
        message3();
        System.out.println("Reverse3");
    }

    static void message3() {
        System.out.println("Hello3");
        message4();
        System.out.println("Reverse2");
    }

    static void message4() {
        System.out.println("Hello4");
        System.out.println("Reverse1");

    }

}
