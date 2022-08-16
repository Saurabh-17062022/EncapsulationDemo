package data;

public class Book {
    private int ISBNNo;
    private String title;
    private String bookName;
    private String genre;
    private float price;


    public Book(int ISBNNo, String title, String bookName, String genre, float price) {
        this.ISBNNo = ISBNNo;
        this.title = title;
        this.bookName = bookName;
        this.genre = genre;
        this.price = price;
    }

    public Book() {

    }

    public int getISBNNo() {
        return ISBNNo;
    }

    public void setISBNNo(int ISBNNo) {
        this.ISBNNo = ISBNNo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
