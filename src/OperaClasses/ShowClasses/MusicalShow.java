package OperaClasses.ShowClasses;

import OperaClasses.CharactersClasses.Director;

class MusicalShow extends Show {
    private final String musicAuthor;
    private final String librettoText;

    public MusicalShow(Director director, String title, int duration, String musicAuthor, String librettoText) {
        super(director, title, duration);

        this.librettoText = librettoText;
        this.musicAuthor = musicAuthor;
    }

    public void printLibretto() {
        System.out.println(librettoText);
    }

    public String getLibrettoText() {
        return librettoText;
    }

    public String getMusicAuthor() {
        return musicAuthor;
    }
}
