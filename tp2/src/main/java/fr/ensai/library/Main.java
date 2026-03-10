package fr.ensai.library;

public class Main {

    public static void main(String[] args) {


        Library lib = new Library("agora");
        lib.loadBooksFromCSV("books.csv");
        lib.displayBooks();
        
    }
}