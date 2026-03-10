package fr.ensai.library;

/**
 * Represents a book.
 */
public class Book {

    // Attributes
    private String isbn;
    private String title;
    private Author author;
    private int year;
    private int pageCount;

    /**
     * Constructs a new Book object.
     */
    public Book(String isbn, String title, Author author, int year, int pageCount) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.year = year;
        this.pageCount = pageCount;
    }

    public Author getAuthor() {
<<<<<<< HEAD
        return author;
=======
        return this.author;
>>>>>>> dd8a231b0c3fe8d317f6cb28620f2bd9867f27de
    }

    @Override
    public String toString() {
<<<<<<< HEAD
        return "Book " + title + " written by " + author.toString();
=======
        return String.format("Book %s written by %s", this.title, this.author);
>>>>>>> dd8a231b0c3fe8d317f6cb28620f2bd9867f27de
    }

}
