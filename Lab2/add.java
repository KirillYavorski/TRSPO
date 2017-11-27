package Lab2_1;


import java.util.Scanner;

/**
 * Created by Dmitry on 04.10.2017.
 */
public class add {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true)
        {
            String  name  = scan.nextLine();
            MyThread p = new MyThread(name);
            p.start();


        }


    }

}



