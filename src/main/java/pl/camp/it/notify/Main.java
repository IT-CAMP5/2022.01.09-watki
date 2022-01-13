package pl.camp.it.notify;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {

    public static final Object notifyObject = new Object();
    public static boolean flag = false;
    public static String message = "";
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(2);

        scheduledExecutorService.schedule(new Receiver(), 0, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(new Sender(), 5, TimeUnit.SECONDS);

        scheduledExecutorService.shutdown();
    }
}
