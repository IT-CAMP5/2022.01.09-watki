package pl.camp.it.incremetator;

public class Incrementator implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i < 1000; i++) {
            synchronized (Main.lock) {
                Main.counter++;
            }
            Main.cos.increment();
        }
    }
}
