package fr.ensai.mediaplayer;

import java.util.ArrayList;
import java.util.List;

public class Playlist {

    //Attributes
    private String name;
    private List<Media> medias;
    private int totalDuration; 

    //constructor
    public Playlist(String name){
        this.name = name;
        this.medias = new ArrayList<>();
        this.totalDuration = 0;
    }

    public List<Media> getMedias() {
        return this.medias;
    }

    public void addMedia(Media media){
            medias.add(media);
            totalDuration += media.getDuration();
    }

     public void removeMedia(Media media) {
            this.medias.remove(media);
            this.totalDuration -= media.getDuration();
        
    }

    public void removeMedia(int index){
        this.medias.remove(index);
    }

    public void play(boolean random){


    }
}
    
