package lection5_8.lection8.tasks.task4;

public class Skirt extends Clothes implements WomanClothes{

    public Skirt(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void wearWoman() {
        System.out.println("Женщина одела юбку");
    }
}
