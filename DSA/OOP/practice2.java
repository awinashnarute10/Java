package DSA.OOP;

import java.util.*;

public class practice2 {

    public static void main(String[] args) {
       Child child = new Child(0);
System.out.println(child.age);
       
        
       
    }
}

    abstract class Parent{
        int age  =10;
        String name;
Parent(){
    System.out.println("Parent called");
}
        Parent(int age){
                    this.age = 10;
                    System.out.println("Parent");
        }

        Parent(String name){
            this.name = name;
        }

        abstract void occupation();

    }


     class Child extends Parent{
        Child(int age){
            this.age = age;
            System.out.println("Child");
        }

        @Override
        void occupation(){
            System.out.println("I am an enginner");
        }
    }




