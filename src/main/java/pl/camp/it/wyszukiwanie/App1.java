package pl.camp.it.wyszukiwanie;

import java.util.Random;

public class App1 {
    public static void main(String[] args) {
        int[] tab = new int[700000000];

        Random random = new Random();
        for(int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(1000000000);
        }

        /*for(int i : tab) {
            System.out.println(i);
        }*/

        long t1 = System.currentTimeMillis();

        int min = tab[0];

        for(int element : tab) {
            if(element < min) {
                min = element;
            }
        }

        long t2 = System.currentTimeMillis();
        System.out.println(min);
        System.out.println(t2-t1);
    }
}
