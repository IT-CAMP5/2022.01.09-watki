package pl.camp.it.watki;

public class Watek extends Thread {

    private int threadNumber;

    public Watek(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for(int i = 0; i < 1000; i++) {
            System.out.println("Watek: " + this.threadNumber + " i: " + i);
        }
    }
}
