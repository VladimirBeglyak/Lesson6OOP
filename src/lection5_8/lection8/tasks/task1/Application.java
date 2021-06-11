package lection5_8.lection8.tasks.task1;

public class Application {
    public static void main(String[] args) {
        Printable[] array = array(new Book("Book1"), new Magazine("Magazine1"),new Book("Book2"),new Magazine("Book2"));



        /*for (Printable printable : array) {
            printable.print();
        }*/

        //System.out.println();
       // Magazine.printMagazine(array);
        System.out.println();
        Book.printBooks(array);



    }
    public static Printable[] array(Printable...printables){
        return printables;
    }



}
