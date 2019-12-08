package com.company.model;

public class LoginException extends Exception {

    private String login;
    private String message;

    public LoginException() {
    }

    public LoginException(String login) {
        this.login = login;
    }



    @Override
    public String getMessage() {
        return "Not unique login: " + login;
    }
}
