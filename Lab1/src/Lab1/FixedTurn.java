package Lab1;

/**
 * Created by Dmitry on 22.09.2017.
 */
public class FixedTurn implements intTurn {
    private int turn[];
    private int tail;
    public FixedTurn(int size){
        turn=new int [size];
        tail=1;
    }
    public void place(int el){
        if (tail==turn.length-1)
            System.out.println("В очереди нет места!");
        else turn[++tail]=el;
    }
    public int goOut(){
        int i,k;
        if(tail<0){
            System.out.println("Очередь пуста!");
            return 0;
        }
        else {
            k=turn[0];
            for (i=1; i<=tail; i++)
                turn[i-1]=turn[i];
            tail --;
            return k;
        }
    }
}