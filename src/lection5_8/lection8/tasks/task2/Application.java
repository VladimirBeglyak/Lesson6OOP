package lection5_8.lection8.tasks.task2;

/**
 * Создать интерфейс Инструмент и реализующие его классы Гитара, Барабан и Труба.
 * Интерфейс Инструмент содержит метод play() и переменную String KEY ="До мажор".
 * Гитара содержит переменные класса количествоСтрун,  Барабан - размер, Труба - диаметр.
 * Создать массив типа Инструмент, содержащий инструменты разного типа.
 * В цикле вызвать метод play() для каждого инструмента, который должен выводить строку "Играет такой-то инструмент, с такими-то характеристиками".
 */

public class Application {
    public static void main(String[] args) {

        Instrument[] instruments = takeInstrument(
                new Baraban(10),
                new Guitar(6),
                new Truba(50),
                new Guitar(4),
                new Baraban(20),
                new Truba(15)
        );
        String key = Instrument.KEY;
        System.out.println(key);


        for (Instrument instrument : instruments) {
            instrument.play();
            System.out.println();
        }

    }
    public static Instrument[] takeInstrument(Instrument...instruments){
        return instruments;
    }
}
