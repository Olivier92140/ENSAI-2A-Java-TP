package fr.ensai.mediaplayer;

public class Main {

    public static void main(String[] args) {

        Artist laurent = new Artist("Laurent", "Voulzy", null);
        Genre folk = Genre.FOLK;
        Song song = new Song(
            "Belle-Île-en-Mer",
            laurent,
            1989,
    202,
    """
    Belle-Île-en-Mer, Marie-Galante
    Saint-vincent, loin Singapour, Seymour Ceylan
    Vous, c'est l'eau, c'est l'eau qui vous sépare
    Et vous laisse à part
    """,
    null,
    null,
    folk
);

        song.play(); // doit être DANS le main
    }
}