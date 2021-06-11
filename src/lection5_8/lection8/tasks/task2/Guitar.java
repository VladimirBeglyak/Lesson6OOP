package lection5_8.lection8.tasks.task2;

public class Guitar implements Instrument {
    private int countOfStrunes;

    public Guitar(int countOfStrunes) {
        this.countOfStrunes = countOfStrunes;
    }

    @Override
    public void play() {
        System.out.printf("Играет гитара, с характеристиками : колличество струн - %d",countOfStrunes);
    }
}
