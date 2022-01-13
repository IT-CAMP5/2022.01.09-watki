package pl.camp.it.pi;

import java.util.Random;

public class PointsGenerator implements Runnable {

    long pointsToGenerate;
    Random random = new Random();

    public PointsGenerator(long pointsToGenerate) {
        this.pointsToGenerate = pointsToGenerate;
    }

    @Override
    public void run() {
        long pointsInCircle = 0;
        for(int i = 0; i < pointsToGenerate; i++) {
            double x = randomMinusOneToOne();
            double y = randomMinusOneToOne();

            double distanceFromCenter = Math.sqrt((x*x) + (y*y));

            if(distanceFromCenter <= 1) {
                pointsInCircle++;
            }
        }

        App2.results.add(pointsInCircle);
    }

    public double randomMinusOneToOne() {
        return this.random.nextDouble() * 2 - 1;
    }
}
