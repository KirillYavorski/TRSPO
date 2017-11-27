package Lab1;

/**
 * Created by Dmitry on 22.09.2017.
 */
public class lab1 {
    public static void main(String[] args) {
        FixedTurn t1=new FixedTurn(3);
        t1.place(1);
        t1.place(2);
        t1.place(3);
        t1.place(4);
        System.out.print(t1.goOut()+"  ");
        System.out.print(t1.goOut()+"  ");
        System.out.print(t1.goOut()+"  ");
        DynTurn t2=new DynTurn(1);
        t2.place(100);
        t2.place(200);
        t2.place(300);
        t2.place(400);
        System.out.print(t2.goOut()+" ");
        System.out.print(t2.goOut()+" ");
        System.out.print(t2.goOut()+" ");
    }

}