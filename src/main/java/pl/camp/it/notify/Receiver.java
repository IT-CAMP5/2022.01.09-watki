package pl.camp.it.notify;

public class Receiver implements Runnable {
    @Override
    public void run() {
        try {
            synchronized (Main.notifyObject) {
                System.out.println("Odbieracz czeka !!");

                while(!Main.flag) {
                    Main.notifyObject.wait();
                }

                System.out.println("Odebrałem sygnał !!");
                System.out.println(Main.message);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
