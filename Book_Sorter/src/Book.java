import java.util.Comparator;

public class Book implements Comparable<Book>, Comparator<Book> {
    private String bookName;
    private int numberOfPage;
    private String authorName;
    private int releaseDate;

    public Book(String bookName, int numberOfPage, String authorName, int releaseDate) {
        this.bookName = bookName;
        this.numberOfPage = numberOfPage;
        this.authorName = authorName;
        this.releaseDate = releaseDate;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public void setNumberOfPage(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public int compareTo(Book o) {
        return getBookName().compareTo(o.getBookName());
    }

    @Override
    public int compare(Book o1, Book o2) {
        return o1.numberOfPage - o2.numberOfPage;
    }

    @Override
    public String toString() {
        return  "Book Name = " + bookName  +
                ", Number Of Page = " + numberOfPage +
                ", Author Name = " + authorName  +
                ", Release Date = " + releaseDate ;
    }

}
