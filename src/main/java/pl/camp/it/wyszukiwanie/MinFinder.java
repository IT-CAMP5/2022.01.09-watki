package pl.camp.it.wyszukiwanie;

public class MinFinder implements Runnable {
    int minIndex;
    int maxIndex;

    public MinFinder(int minIndex, int maxIndex) {
        this.minIndex = minIndex;
        this.maxIndex = maxIndex;
    }

    @Override
    public void run() {
        int min = App2.tab[this.minIndex];

        for(int i = this.minIndex; i < this.maxIndex; i++) {
            if(App2.tab[i] < min) {
                min = App2.tab[i];
            }
        }

        App2.results.add(min);
    }
}
