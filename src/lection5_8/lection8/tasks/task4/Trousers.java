package lection5_8.lection8.tasks.task4;

public class Trousers extends Clothes implements MannerClothes,WomanClothes{

    public Trousers(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void wearMann() {
        System.out.println("Мужчина одел штаны");
    }

    @Override
    public void wearWoman() {
        System.out.println("Женщина одела штаны");
    }
}
