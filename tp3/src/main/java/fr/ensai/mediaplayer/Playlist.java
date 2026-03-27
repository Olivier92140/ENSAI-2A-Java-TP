package fr.ensai.mediaplayer;

import java.util.List;

public class Playlist {

    //Attributes
    private String nom;
    private List<Media> fichier_media;
    private int duree; 

    //constructor
    public Playlist(String nom, List<Media> fichier_media, int duree){
        this.nom = nom;
        this.fichier_media = fichier_media;
        this.duree = duree;
    }

    public void addMedia(Media media){
            fichier_media.add(media);
            duree = media.getDuration();

    }

}
    
