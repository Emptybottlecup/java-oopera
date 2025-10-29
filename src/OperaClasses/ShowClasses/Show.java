package OperaClasses.ShowClasses;

import OperaClasses.CharactersClasses.Actor;
import OperaClasses.CharactersClasses.Director;

import java.util.ArrayList;

public class Show {
    private final String title;
    private final int duration;
    private final Director director;
    private ArrayList<Actor> listOfActors;

    public Show (Director director, String title, int duration) {
        this.director = director;
        this.title = title;
        this.duration = duration;
        this.listOfActors = new ArrayList<>();
    }

    public void addNewActor(Actor newActor) {
        if (listOfActors.contains(newActor)) {
            System.out.println("Данный актер уже присутствует в группе.");
        } else {
            System.out.println("Актер успешно добавлен.");
            listOfActors.add(newActor);
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
