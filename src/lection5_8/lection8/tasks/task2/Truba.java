package lection5_8.lection8.tasks.task2;

public class Truba implements Instrument {
    private int diametr;

    public Truba(int diametr) {
        this.diametr = diametr;
    }

    @Override
    public void play() {
        System.out.printf("Играет труба, с характеристиками : диаметр - %d",diametr);
    }
}
