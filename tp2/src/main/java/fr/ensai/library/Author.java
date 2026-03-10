package fr.ensai.library;

import java.util.Objects;

/**
 * Represents an Author.
 */
public class Author {

    // Attributes
    private String name;
    private int age;
    private String nationality;

    /**
<<<<<<< HEAD
     * Constructs a new Book object.
=======
     * Constructs a new Author object.
>>>>>>> dd8a231b0c3fe8d317f6cb28620f2bd9867f27de
     */
    public Author(String name, int age, String nationality) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
    }

    public String getName() {
        return this.name;
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     * Two authors are considered equal if their names are equal.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        Author author = (Author) obj;
<<<<<<< HEAD
        return Objects.equals(name, author.name);
=======
        return Objects.equals(this.name, author.name);
>>>>>>> dd8a231b0c3fe8d317f6cb28620f2bd9867f27de
    }

    @Override
    public String toString() {
<<<<<<< HEAD
        return "Author " + name;
=======
        return String.format("Author %s", this.name);
>>>>>>> dd8a231b0c3fe8d317f6cb28620f2bd9867f27de
    }

}
