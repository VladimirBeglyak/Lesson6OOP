package lection5_8.lection8.tasks.task1;

public class Magazine implements Printable{

    private String name;

    public Magazine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println("Magazine "+name);
    }

    public static void printMagazines(Printable[] printable){
        for (Printable element: printable) {
            if (element instanceof Magazine){
                element.print();
            }
        }
    }
}
