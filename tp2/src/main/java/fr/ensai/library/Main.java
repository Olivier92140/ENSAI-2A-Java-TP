package fr.ensai.library;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Library library = new Library("City Library");

        String csvFilePath = "books.csv";
        library.loadBooksFromCSV(csvFilePath);

        library.addItem(new Magazine("Tech Monthly", 2023, 120, "1234-5678", "Vol. 15, Issue 3"));
        library.addItem(new Magazine("Vogue Style", 2024, 250, "9876-5432", "September Edition"));
        library.addItem(new Magazine("Scientific Discoveries", 2022, 88, "1122-3344", "Issue 247"));

        library.displayItems();

        System.out.println("\n**********************************************");
        System.out.println("* Books by Stephen King                      *");
        System.out.println("**********************************************");

        ArrayList<Book> skingsBooks = library.getBooksByAuthor(new Author("Stephen King"));

        for (Book b : skingsBooks) {
            System.out.println(b);
        }
    }
}