package DSA.OOP.Interface_Practice;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        car.startEngine();
        car.stopEngine();

        car.Upgrade();
        
        car.startEngine();
        car.stopEngine();
        
        car.startPlayer();
        car.stopPlayer();
    }
    
}
