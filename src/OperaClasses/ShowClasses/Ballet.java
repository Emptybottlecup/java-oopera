package OperaClasses.ShowClasses;

import OperaClasses.CharactersClasses.Actor;
import OperaClasses.CharactersClasses.Director;

import java.util.ArrayList;

public class Ballet extends MusicalShow {
    private final String choreographer;


    public Ballet(Director director, String title, int duration, String musicAuthor, String librettoText, String choreographer) {
        super(director, title, duration, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

    public String getChoreographer() {
        return choreographer;
    }
}
