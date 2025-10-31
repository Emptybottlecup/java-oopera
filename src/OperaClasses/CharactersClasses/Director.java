package OperaClasses.CharactersClasses;

public class Director extends Person {

    private final int numberOfShows;

    public Director(Gender gender, String name, String surName, int numberOfShows) {
        super(gender, name, surName);
        this.numberOfShows = numberOfShows;
    }

    public int getNumberOfShows() {
        return numberOfShows;
    }

}
