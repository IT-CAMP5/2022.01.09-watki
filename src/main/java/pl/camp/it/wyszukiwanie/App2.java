package pl.camp.it.wyszukiwanie;

import java.util.ArrayList;
import java.util.Random;
import java.util.List;

public class App2 {
    public static final int[] tab = new int[700000000];
    public static final List<Integer> results = new ArrayList<>();
    public static void main(String[] args) {
        Random random = new Random();
        for(int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(1000000000);
        }

        long time1 = System.currentTimeMillis();

        Thread t1 = new Thread(new MinFinder(0,100000000));
        Thread t2 = new Thread(new MinFinder(100000000,200000000));
        Thread t3 = new Thread(new MinFinder(200000000,300000000));
        Thread t4 = new Thread(new MinFinder(300000000,400000000));
        Thread t5 = new Thread(new MinFinder(300000000,500000000));
        Thread t6 = new Thread(new MinFinder(500000000,600000000));
        Thread t7 = new Thread(new MinFinder(600000000,700000000));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
            t6.join();
            t7.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int min = results.get(0);

        for(int element : results) {
            if(element < min) {
                min = element;
            }
        }

        long time2 = System.currentTimeMillis();
        System.out.println(min);
        System.out.println(time2 - time1);
    }
}
