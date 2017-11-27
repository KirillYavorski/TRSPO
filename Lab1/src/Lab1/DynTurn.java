package Lab1;

/**
 * Created by Dmitry on 22.09.2017.
 */
public class DynTurn implements intTurn {
    private int turn[];
    
    private int tail;

    public DynTurn(int size){
        turn=new int [size];
        tail=-1;
    }
    public void place(int el){
        if (tail==turn.length-1){
            int mas[]=new int [turn.length+1];

            for(int i=0; i<=turn.length-1; i++)
                mas[i]=turn[i];
            turn=mas;
        }
        turn[++tail]=el;
    }
    public int goOut(){
        int i, k;
        if (tail<0){
            System.out.println("2 Очередь пуста!");
            return 0;
        }
        else {
            k=turn[0];
            for(i=1; i<=tail; i++)
                turn[i-1]=turn[i];
            tail--;
            return k;
        }
    }
}
