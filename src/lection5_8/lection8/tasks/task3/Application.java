package lection5_8.lection8.tasks.task3;

/**
 * Создать перечисление, содержащее названия времен года.
 * Создать переменную содержащую ваше любимое время года и распечатать всю информацию о нем.
 * Создать метод, который принимает на вход переменную созданного вами enum типа. Если значение равно Лето, выводим на консоль “Я люблю лето” и так далее. Используем оператор switch.
 * Перечисление должно содержать переменную, содержащую среднюю температуру в каждом времени года.
 * Добавить конструктор принимающий на вход среднюю температуру.
 * Создать метод getDescription, возвращающий строку “Холодное время года”. Переопределить метод getDescription - для константы Лето метод должен возвращать “Теплое время года”.
 * В цикле распечатать все времена года, среднюю температуру и описание времени года.
 * Смотрите решение задачи в видео
 */

public class Application {

    public static void main(String[] args) {

        Seasons myFavoriteSeason = Seasons.WINTER;
        Seasons.getSeason(myFavoriteSeason);
        System.out.println(myFavoriteSeason);
        System.out.println(myFavoriteSeason.getDescription());
        System.out.println(myFavoriteSeason.getMediumTemperature());


        System.out.println();
        Seasons[] seasons = Seasons.values();

        for (Seasons season : seasons) {
            System.out.println("Время года : "+season.name()+
                    "\nСредняя температура : " +season.getMediumTemperature()+"оС\n"+
                    "Описание : "+season.getDescription());
            System.out.println();
        }



    }



}
