package myTrials.MyTrialsall.Book;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Profesor", "Mickiewicz", "91080600251");
        Book book2 = new Book("Behawiorysta", "Mroz", "810609251");
        Book.addBook(book1);
        Book.addBook(book2);
        ArrayList<Book> bookCollection = Book.getBookCollection();
        System.out.println("List Books: ");
        for (Book book : bookCollection) {
            System.out.println(book.getTitle() + " write by " + book.getAuthor() + " ISBN: " + book.getISBN());
        }
        Book.removeBook(book1);
        System.out.println("\nremoving " + book1.getTitle() + ":");
        System.out.println("List of books:");
        for (Book book : bookCollection) {
            System.out.println(book.getTitle() + " write by " + book1.getAuthor() + " ISBN: " + book1.getISBN());
        }
    }
}
