package com.company.model;

public enum NoteBook {
    MARINA123("Marina123", "marina123"),
    NATASHA15("Natasha15", "natasha15"),
    ALEX120("Alex120", "alex120");


    private final String firstName;
    private final String login;

    NoteBook(String firstName, String login) {
        this.firstName = firstName;
        this.login = login;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLogin() {
        return login;
    }
}
