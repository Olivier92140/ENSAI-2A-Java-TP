package fr.ensai.library;

import java.util.Objects;

/**
 * Represents an Author.
 */
public class Author {

    // Attributes
    private String name;

    /**
     * Constructs a new Author object.
     */
    public Author(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    /**
     * Two authors are considered equal if their names are equal.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        Author author = (Author) obj;
        return Objects.equals(name, author.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Author " + name;
    }
}