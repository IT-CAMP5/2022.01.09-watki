package pl.camp.it.executors;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        /*ExecutorService singleExecutor = Executors.newSingleThreadExecutor();

        singleExecutor.submit(new Watek(1));
        singleExecutor.submit(new Watek(2));
        singleExecutor.submit(new Watek(3));

        singleExecutor.shutdown();*/

        /*ExecutorService multiExecutor = Executors.newFixedThreadPool(3);

        multiExecutor.submit(new Watek(1));
        multiExecutor.submit(new Watek(2));
        multiExecutor.submit(new Watek(3));
        multiExecutor.submit(new Watek(4));
        multiExecutor.submit(new Watek(5));
        multiExecutor.submit(new Watek(6));

        multiExecutor.shutdown();*/

        /*ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(4);

        scheduledExecutorService.schedule(new Watek(1), 2, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(new Watek(2), 1, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(new Watek(3), 10, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(new Watek(4), 5, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(new Watek(5), 15, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(new Watek(6), 0, TimeUnit.SECONDS);

        scheduledExecutorService.shutdown();*/

        long time = System.currentTimeMillis();

        System.out.println(time);

        for(int i = 0; i < 100000000; i++) {
            Random random = new Random();
            random.nextInt(1001);
        }

        long time2 = System.currentTimeMillis();

        System.out.println(time2);

        System.out.println(time2 - time);

        System.out.println("zaczynam czekać !!!");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Koniec czekania !!!");
    }
}
