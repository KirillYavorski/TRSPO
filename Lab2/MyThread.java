package Lab2_1;



/**
 * Created by Dmitry on 04.10.2017.
 */
public class MyThread extends Thread {

    String name;


    MyThread(String name){
        this.name=name;
    }

    public void run() {
        while (true) {


            System.out.println(" Я работаю" + name);

            try {
                Thread.sleep(5000);
            } catch (Exception e) {
            }
        }
    }


}

