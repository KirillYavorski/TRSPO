package javaapplication1.lab2;


public class Lab2 {
    static Pot1 pot1;
    static Pot2 pot2;
    
    
    public static void main(String[] args) {
       
       pot1 = new Pot1();
       pot2= new Pot2();
       
       Thread myThready1 = new Thread(pot1);
       Thread myThready2 = new Thread(pot2);
       myThready1.start();
       myThready2.start();
       
    }
    
}
class Pot1 implements Runnable{
    public void run(){
       
       for(int i=1; i<5; i++){
            System.out.println("Первый поток!");
           
        }
          
    }
}
class Pot2 implements Runnable{
    public void run(){
        for(int i=1; i<5; i++){
            System.out.println("Второй поток!");
           
        }
    }
}
