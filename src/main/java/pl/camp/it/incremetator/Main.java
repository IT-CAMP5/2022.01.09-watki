package pl.camp.it.incremetator;

public class Main {

    public static int counter = 0;
    public static final Object lock = new Object();
    public static Cos cos = new Cos();

    public static void main(String[] args) {

        Thread t1 = new Thread(new Incrementator());
        Thread t2 = new Thread(new Incrementator());

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(counter);
    }
}
