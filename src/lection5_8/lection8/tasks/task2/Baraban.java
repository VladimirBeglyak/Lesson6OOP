package lection5_8.lection8.tasks.task2;

public class Baraban implements Instrument {
    private int size;

    public Baraban(int size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.printf("Играет барабан, с характеристиками : размер - %d",size);
    }
}
