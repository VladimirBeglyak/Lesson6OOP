package lection5_8.lection8.tasks.task3;

import java.sql.SQLOutput;

public enum Seasons {
    SPRING(18.2) {
        @Override
        String getDescription() {
            return "Весна теплее зимы, но лето-то жарче";
        }
    },
    SUMMER(26.2) {
        @Override
        String getDescription() {
            return "Теплое время года";
        }
    },
    AUTUMN(10.5) {
        @Override
        String getDescription() {
            return "Осень дождливая пора года";
        }
    },
    WINTER(1.5) {
        @Override
        String getDescription() {
            return "Холодное время года";
        }
    };

    private double mediumTemperature;


    Seasons(double mediumTemperature) {
        this.mediumTemperature=mediumTemperature;
    }

    String getDescription(){
        return "Холодное время года";
    }

    static void getSeason(Seasons seasons) {
        switch (seasons) {
            case AUTUMN:
                System.out.println("Я люблю осень!");
                break;
            case WINTER:
                System.out.println("Я люблю зиму!");
                break;
            case SPRING:
                System.out.println("Я люблю весну!");
                break;
            case SUMMER:
                System.out.println("Я люблю лето!");
                break;
            default:
                System.out.println("Нет такой поры года");
        }

    }

    public double getMediumTemperature() {
        return mediumTemperature;
    }
}
