package DSA.OOP;

import java.util.Arrays;
import java.util.List;

public class customArrayList<T extends Number> { // here T should be Number or subclasses of Number
    
    private int size=0;//also works as index
    private Object[] data;
    private static int DEFAULT_SIZE = 10;

    public customArrayList(){
        this.data = new Object[DEFAULT_SIZE];
    }

    public void getList(List<? extends Number> list){
        // java wildcard 
        // here now list can have subclasses of Number eg float number   
        
    }

    public void add(T num){
        if (isFull()) {
            reSize();
            
        }
        data[size++] = num;
    }

    private void reSize(){
        Object[] temp = new Object[data.length*2];

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }

        data = temp;
    }

    private boolean isFull(){
        return size==data.length;
    }

    public T remove(){
        T removed = (T)(data[--size]);
        return removed;
    }

    
    public T get(int index){
        return (T)(data[index]);
    }

    public void set(int index, T value){
        data[index] = value;
    }

    @Override
    public String toString(){
            return Arrays.toString(data);
        
    }

    
    public static void main(String[] args) {
        customArrayList<Integer> list = new customArrayList<>();
        list.add(10);
        list.add(20);
        list.remove();
        list.add(30);
        System.out.println(list.toString());
    }

}
