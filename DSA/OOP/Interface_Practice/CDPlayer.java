package DSA.OOP.Interface_Practice;

public class CDPlayer implements Player {

    @Override
    public void start(){
        System.out.println("Music Playing");
    }


    @Override
    public void stop(){
        System.out.println("Music Stopped Playing");
    }

    
}
