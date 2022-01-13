package pl.camp.it.pi;

import java.util.ArrayList;
import java.util.List;

public class App2 {

    public static final List<Long> results = new ArrayList<>();
    public static void main(String[] args) {
        long allPoints = 20000000000L;
        int threadNumber = 8;

        long timeStart = System.currentTimeMillis();
        Thread t1 = new Thread(new PointsGenerator(allPoints/threadNumber));
        Thread t2 = new Thread(new PointsGenerator(allPoints/threadNumber));
        Thread t3 = new Thread(new PointsGenerator(allPoints/threadNumber));
        Thread t4 = new Thread(new PointsGenerator(allPoints/threadNumber));
        Thread t5 = new Thread(new PointsGenerator(allPoints/threadNumber));
        Thread t6 = new Thread(new PointsGenerator(allPoints/threadNumber));
        Thread t7 = new Thread(new PointsGenerator(allPoints/threadNumber));
        Thread t8 = new Thread(new PointsGenerator(allPoints/threadNumber));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
            t6.join();
            t7.join();
            t8.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long sum = 0;
        for(long part : App2.results) {
            sum = sum + part;
        }

        double PI = (4.0 * (double) sum) / (double) allPoints;
        long timeEnd = System.currentTimeMillis();
        System.out.println(PI);
        System.out.println(timeEnd - timeStart);
    }
}
