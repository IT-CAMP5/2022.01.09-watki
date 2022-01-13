package pl.camp.it.pi;

import java.util.Random;

public class App {
    public static Random random = new Random();
    public static void main(String[] args) {
        int allPoints = 2000000000;
        int pointsInCircle = 0;

        long t1 = System.currentTimeMillis();
        for(int i = 0; i < allPoints; i++) {
            double x = randomMinusOneToOne();
            double y = randomMinusOneToOne();

            double distanceFromCenter = Math.sqrt((x*x) + (y*y));

            if(distanceFromCenter <= 1) {
                pointsInCircle++;
            }
        }

        double PI = (4.0 * (double) pointsInCircle) / (double) allPoints;
        long t2 = System.currentTimeMillis();
        System.out.println(PI);
        System.out.println(t2-t1);
    }

    public static double randomMinusOneToOne() {
        return random.nextDouble() * 2 - 1;
    }
}
