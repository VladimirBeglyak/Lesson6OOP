package lection5_8.lection8.tasks.task4;

public class Application {
    public static void main(String[] args) {
        /*Size[] sizes = Size.values();

        for (Size size : sizes) {
            System.out.println(size);
            System.out.println(size.getDescription());
            System.out.println();
        }*/

        Clothes[] clothes = arrayOfClothes(
                new Shirt(Size.S, 1500, "Green"),
                new Skirt(Size.XXS,200,"Red"),
                new Tie(Size.L,50,"Blue"),
                new Trousers(Size.M,800,"Gold"));

        Atelie.wearWoman(clothes);
        Atelie.wearMann(clothes);

    }

    public static Clothes[] arrayOfClothes(Clothes... clothes){
        return clothes;
    }
}
