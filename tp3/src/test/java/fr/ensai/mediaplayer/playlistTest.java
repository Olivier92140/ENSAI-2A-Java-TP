package fr.ensai.mediaplayer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class playlistTest {

   
    private Playlist playlist;
    private Song song1;
    private Song song2;

    @Test
    void testInvertValid() {
        // GIVEN
        Artist artist1 = new Artist("Laurent", "Voulzy", null);
        Song song1 = new Song("title1", artist1, 1975, 354, "Is this the real life?", artist1, artist1, Genre.ROCK);
        //Song song2 = new ~,/Song("title1", "singer1", 1970, 300, "bla bla bla?", "Author1", "composer1", 
        //"genre1");

        

        Playlist playlist = new Playlist("Test Playlist");


        // WHEN

        playlist.addMedia(song1);

        // THEN
        
        assertTrue(playlist.getMedias().contains(song1));
        //assertFalse(playlist.getMedias().contains(song2));
    }

    
}
