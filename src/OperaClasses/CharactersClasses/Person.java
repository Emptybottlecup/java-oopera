package OperaClasses.CharactersClasses;

class Person {
    private final String name;
    private final String surName;
    private final Gender gender;

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
}
