package OperaClasses.CharactersClasses;

import java.util.Objects;

public class Actor extends Person {
    private final double height;

    public Actor(Gender gender, String name, String surName, double height) {
        super(gender, name, surName);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, getName(), getSurName());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;

        Actor compareActor = (Actor) obj;

        return compareActor.getName().equals(this.getName()) && compareActor.getSurName().equals(this.getSurName()) &&
                (compareActor.getHeight() == height);
    }

    @Override
    public String toString() {
        return "Actor{" +
                "name=" + getName() + ", " +
                "surName=" + getSurName() + ", " +
                "height=(" + height + ')' +
                '}';
    }

}
