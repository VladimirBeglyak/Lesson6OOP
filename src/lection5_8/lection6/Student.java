package lection5_8.lection6;

public class Student {
    private String name;
    private int age;
    private double averageScore;

    public Student(String name, int age, double averageScore) {
        this.name = name;
        this.age = age;
        this.averageScore = averageScore;
    }

    public String getInfo() {
        return "Имя : " + name +
                "\nВозраст : " + age +
                "\nСредний балл: " + averageScore;
    }
}
