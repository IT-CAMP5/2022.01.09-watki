package pl.camp.it.watki;

public class Main {
    public static void main(String[] args) {
        /*Watek w1 = new Watek(1);
        Watek w2 = new Watek(2);
        Watek w3 = new Watek(3);
        Watek w4 = new Watek(4);
        Watek w5 = new Watek(5);
        Watek w6 = new Watek(6);
        Watek w7 = new Watek(7);
        Watek w8 = new Watek(8);

        w1.start();
        w2.start();
        w3.start();
        w4.start();
        w5.start();
        w6.start();
        w7.start();
        w8.start();*/

        Thread t1 = new Thread(new LepszyWatek());
        Thread t2 = new Thread(new LepszyWatek());
        Thread t3 = new Thread(new LepszyWatek());

        t1.start();
        t2.start();
        t3.start();

        System.out.println("Wszystkie wątki wystartowane !!!");
    }
}
