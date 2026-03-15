package fr.ensai.library;

/**
 * Represents a book.
 */
public class Book extends Item {

    // Attributes
    private String isbn;
    private Author author;

    /**
     * Constructs a new Book object.
     */
    public Book(String isbn, String title, Author author, int year, int pageCount) {
        super(title, year, pageCount);   // appel au constructeur de Item
        this.isbn = isbn;
        this.author = author;
    }

    public Author getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

     public String getTitle() {
        return title;
    }


    @Override
    public String toString() {
        return "Book '" + getTitle() + "' written by " + author.toString();
    }
}