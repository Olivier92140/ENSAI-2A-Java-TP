package fr.ensai.mediaplayer;


import java.util.Objects;

// Attributes
public class Artist {
    private String firstName;
    private String lastName;
    private String nationality;

    
    // Constructor

    public Artist(String firstName, String lastName, String nationality) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationality = nationality;
    }

   
    public String toString() {
        return String.format("Artist %s %s", this.firstName, this.lastName);
    }
}
