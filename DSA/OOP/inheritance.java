package DSA.OOP;

public class inheritance {

    public static void main(String[] args) {
        Box box = new Box(4);
           box.info();
        System.out.println(box.w+" "+box.l+" "+box.h);

        Boxweight box2  = new Boxweight(0, 0, 0, 0);
    }
    
}

class Box{
    double w;
    double l; 
        double h;
    
        Box(){
            this.w = -1;
            this.l = -1;
            this.h = -1;
        }
    
        Box(double side){
            this.w = side;
            this.l = side;
            this.h = side;
        }
    
        Box(double h, double l, double w){
            this.w = w;
            this.l = l;
            this.h = h;
    }

    public void info(){
        System.out.println("Box is running");
    }
}

 class Boxweight extends Box{
    double weight;

    public Boxweight(double l, double h, double w, double weight){
        super(h, l, w);
        System.out.println("Boxweight constructor");
        this.weight = weight;
    }
    
}
