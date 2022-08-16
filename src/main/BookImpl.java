package main;

import data.Book;

public class BookImpl {
    public static void main(String[] args) {
        Book book = new Book();
        book.setBookName("Chemistry");
        book.setGenre("Science");
        book.setTitle("Molecules");
        book.setISBNNo(2354);
        book.setPrice(199f);
        // print
        System.out.println("The book detail is " + book.getBookName() +" "+ book.getISBNNo() +" "+ book.getGenre() +" "+ book.getTitle() +" "+"₹ "+ book.getPrice());
    }
}
