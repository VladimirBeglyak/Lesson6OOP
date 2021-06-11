package lection5_8.lection8.tasks.task4;

public class Atelie {


    public static void wearWoman(Clothes[] clothes){
        for (Clothes clothe : clothes) {
            if (clothe instanceof WomanClothes){
                ((WomanClothes) clothe).wearWoman();
                System.out.println("Цвет : "+clothe.getColor());
                System.out.println("Цена : "+clothe.getPrice());
                System.out.println("Размер : "+clothe.getSize()+"\nЕвропейский размер : "+clothe.getSize().getEuroSize());
                System.out.println(clothe.getSize().getDescription());
                System.out.println();
            }
        }

    }

    public static void wearMann(Clothes[] clothes){
        for (Clothes clothe : clothes) {
            if (clothe instanceof MannerClothes){
                ((MannerClothes) clothe).wearMann();
                System.out.println("Цвет : "+clothe.getColor());
                System.out.println("Цена : "+clothe.getPrice());
                System.out.println("Размер : "+clothe.getSize()+"\nЕвропейский размер : "+clothe.getSize().getEuroSize());
                System.out.println(clothe.getSize().getDescription());
                System.out.println();
            }
        }
    }
}
