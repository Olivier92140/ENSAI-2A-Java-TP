package fr.ensai.library;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {

    // -------------------------------------------------------
    // Attributes
    // -------------------------------------------------------
    private String name;
    private List<Item> items;

    /**
     * Constructs a new ...
     * 
     * @param name  nom du livre
     * @param books liste de livre
     */
    public Library(String name) {
        this.name = name;
        this.items = new ArrayList();
    }

    // -------------------------------------------------------
    // Methods
    // -------------------------------------------------------

    /**
     * ajoute un livre
     */
    public void addBook(Book b) {
        this.items.add(b);
    }

    /**
     * Increment value of attribute2
     * A parameter, return void
     * 
     * @param increment increment
     */
    public void displayBooks() {
        if (items == null) {
            System.out.println("librairie vide");
        } else {
            for (Book b : this.books) {
                System.out.println(b.toString());
            }
        }

    }

    /**
     * Checks if attribute2 is odd.
     *
     * @return true if attribute2 is odd, false otherwise.
     */

    /**
     * Main method
     */
    public void loadBooksFromCSV(String filePath) {

        URL url = getClass().getClassLoader().getResource(filePath);

        try (BufferedReader br = new BufferedReader(new FileReader(url.getFile()))) {
            Map<String, Author> authors = new HashMap<>();
            String line;
            br.readLine(); // Skip the header line

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                if (data.length == 5) {
                    String isbn = data[0].trim();
                    String title = data[1].trim();
                    String authorName = data[2].trim();
                    int year = Integer.parseInt(data[3].trim());
                    int pageCount = Integer.parseInt(data[4].trim());

                    // Check if author already exists in the map
                    Author author = authors.get(authorName);
                    if (author == null) {
                        author = new Author(authorName);
                        authors.put(authorName, author);
                        // System.out.println(String.format("Create %s", author));
                    }
                    Book book = new Book(isbn, title, author, year, pageCount);

                    this.addItem(items);
                }
            }
        } catch (

        IOException e) {
            System.Error.println("Error reading the file: " + e.getMessage());
        }
    }
}
