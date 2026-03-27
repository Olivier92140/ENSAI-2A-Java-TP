package fr.ensai.mediaplayer;

public class Podcast extends Media{
 
    // Attributes
    private String title;
    private String host;
    private String topic;
    private int duration;
    private int year;
    private String subtitles;

    // Constructor
    
    public Podcast(String title, String host, String topic, int duration, int year, String subtitles){
        super(title, duration, year);
        this.host = host;
        this.topic = topic;
        this.subtitles = subtitles;
    }

    public String play(){
        return this.subtitles;
    }

    public String toString() {
        return String.format("Podcast %s is %s",this.title, this.topic);
    }
}
