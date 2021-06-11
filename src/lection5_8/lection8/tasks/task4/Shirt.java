package lection5_8.lection8.tasks.task4;

public class Shirt extends Clothes implements MannerClothes,WomanClothes{

    public Shirt(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void wearMann() {
        System.out.println("Мужчина одел футболку");
    }

    @Override
    public void wearWoman() {
        System.out.println("Женщина одела футболку");
    }
}
