package OperaClasses.ShowClasses;

import OperaClasses.CharactersClasses.Actor;
import OperaClasses.CharactersClasses.Director;

import java.util.ArrayList;

public class Opera extends MusicalShow {
    private final int choirSize;

    public Opera(Director director, String title, int duration, String musicAuthor, String librettoText, int choirSize) {
        super(director, title, duration, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }

    public int getChoirSize() {
        return choirSize;
    }
}
