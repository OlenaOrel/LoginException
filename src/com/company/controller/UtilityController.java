package com.company.controller;

import com.company.model.LoginException;
import com.company.model.NoteBook;
import com.company.view.TextConstant;
import com.company.view.View;

import java.util.Scanner;

/**
 * Created by student on 26.09.2017.
 */
public class UtilityController {
    private Scanner scanner;
    private View view;

    public UtilityController(Scanner scanner, View view) {
        this.scanner = scanner;
        this.view = view;
    }

    String inputStringValueWithScanner(String message, String regex) {
        String res;
        view.printStringInput(message);
        while( !(scanner.hasNext() &&
                (res = scanner.next()).matches(regex))) {
            view.printWrongStringInput(message);
        }
        return res;
    }

    String inputLoginWithScanner() {
        String login = null;
        view.printStringInput(TextConstant.LOGIN_DATA);
        while(scanner.hasNext()){
            login = scanner.next();
            if (!(login.matches(RegexContainer.REGEX_LOGIN))){
                view.printWrongStringInput(TextConstant.LOGIN_DATA);
            } else {
                try {
                    checkLogin(login);
                    return login;
                } catch (LoginException e) {
                    System.err.println(e.getMessage());
                    view.printStringInput(TextConstant.LOGIN_DATA);
                }
            }
        }
        return login;
    }

    private void checkLogin(String login) throws LoginException {
        for (NoteBook note : NoteBook.values()){
            if (note.getLogin().equals(login)) throw new LoginException(login);
        }
    }

}
