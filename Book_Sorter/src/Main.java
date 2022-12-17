import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<Book> bookName = new ArrayList<>();
        bookName.add(new Book("Don Quixote",1077,"Miguel de Cervantes",1605));
        bookName.add(new Book("Anna Karenina",864,"Leo Tolstoy",1877));
        bookName.add(new Book("To Kill a Mockingbird",281,"Harper Lee",1960));
        bookName.add(new Book("Frankenstein",280,"Mary Shelley",1818));
        bookName.add(new Book("The Woman in White",696,"Wilkie Collins",1859));

        Collections.sort(bookName);

        System.out.println("---------------------- Sorts The Book By Name ----------------------------");
        for (Book name : bookName) {
            System.out.println(name.toString());
        }
        System.out.println();
        System.out.println("--------------------- Sorts The Book By Page  Number ---------------------");
        OrderPageComparator bookPage = new OrderPageComparator();
        Collections.sort(bookName, bookPage);
        for (Book page : bookName) {
            System.out.println(page.toString());
        }
    }
}