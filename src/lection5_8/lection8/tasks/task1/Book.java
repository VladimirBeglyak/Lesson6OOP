package lection5_8.lection8.tasks.task1;

public class Book implements Printable{

    private String name;

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Book() {
    }

    @Override
    public void print() {
        System.out.println("Book "+name);
    }

    public static void printBooks(Printable[] printable){
        for (Printable element: printable) {
            if (element instanceof Book){
                element.print();
            }
        }
    }
}
