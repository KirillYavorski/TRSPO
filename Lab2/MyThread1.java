package Lab2_1;

import java.util.Scanner;

/**
 * Created by Dmitry on 04.10.2017.
 */
public class MyThread1 extends Thread {
    int a,b;
    Scanner scan = new Scanner(System.in);
    @Override
    public void run () {
        while(true){
            System.out.println("Введите первое число");
            a = scan.nextInt();
            System.out.println("Введите второе число");
            b = scan.nextInt();
            System.out.println("Сумма равна "+(a+b));
        }
    }
}