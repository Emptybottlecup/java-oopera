package OperaClasses.CharactersClasses;

class Person {
    protected final String name;
    protected final String surName;
    protected final Gender gender;

    public Person(Gender gender, String name, String surName) {
        this.gender = gender;
        this.name = name;
        this.surName = surName;
    }

    public Gender getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    @Override
    public String toString() {
        return "name=" + name + ", " + "surName=" + surName;
    }
}
