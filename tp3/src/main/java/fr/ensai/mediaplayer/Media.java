package fr.ensai.mediaplayer;

public abstract class Media {

    // Attributs
    protected String title;
    protected int duration;
    protected int year;

   
    // Constructor
    protected Media(String title, int duration, int year) {
        this.title = title;
        this.duration = duration;
        this.year = year;
    }

    public int getDuration(){
            return this.duration;
    }
}
