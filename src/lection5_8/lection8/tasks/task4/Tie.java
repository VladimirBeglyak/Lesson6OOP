package lection5_8.lection8.tasks.task4;

public class Tie extends Clothes implements MannerClothes{

    public Tie(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void wearMann() {
        System.out.println("Мужчина одел галстук");
    }
}
