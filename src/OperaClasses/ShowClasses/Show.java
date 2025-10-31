package OperaClasses.ShowClasses;

import OperaClasses.CharactersClasses.Actor;
import OperaClasses.CharactersClasses.Director;

import java.util.ArrayList;

public class Show {
    protected final String title;
    protected final int duration;
    protected final Director director;
    protected ArrayList<Actor> listOfActors;

    public Show(Director director, String title, int duration) {
        this.director = director;
        this.title = title;
        this.duration = duration;
        this.listOfActors = new ArrayList<>();
    }

    public void addNewActor(Actor newActor) {
        if (listOfActors.contains(newActor)) {
            System.out.println("Данный актер уже присутствует в группе.");
        } else {
            listOfActors.add(newActor);
            System.out.println("Актер успешно добавлен.");
        }
    }

    public void changeActors(Actor newActor, String surNameChangingActor) {
        int indexToChange = -1;
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurName().equals(surNameChangingActor)) {
                indexToChange = i;
                break;
            }
        }

        if (indexToChange != -1) {
            listOfActors.set(indexToChange, newActor);
            System.out.println("Актер успешно заменен");
        } else {
            System.out.println("В данном спектакле отсутствует актер с такой фамилией");
        }
    }

    public void printActors() {
        System.out.println(listOfActors);
    }

    public void printDirector() {
        System.out.println(director);
    }

    public Director getDirector() {
        return director;
    }

    public int getDuration() {
        return duration;
    }

    public ArrayList<Actor> getListOfActors() {
        return listOfActors;
    }

    public String getTitle() {
        return title;
    }
}
