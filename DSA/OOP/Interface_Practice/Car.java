package DSA.OOP.Interface_Practice;

public class Car {

    private Engine engine = new PowerEngine();
    private Player player = new CDPlayer();

    public void Upgrade(){
        this.engine = new ElectricEngine();
        System.out.println("Engine Upgraded to Electric Engine");
    }

    public void startEngine(){
        engine.start();
    }

    public void stopEngine(){
        engine.stop();
    }

    public void accelerate(){
        engine.acc();
    }

    public void startPlayer(){
        player.start();
    }

    public void stopPlayer(){
        player.stop();
    }
    
}
