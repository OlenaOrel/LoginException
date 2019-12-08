package com.company.controller;

import com.company.model.User;
import com.company.view.View;

import java.util.Scanner;

/**
 * Created by student on 26.09.2017.
 */
public class Controller {
    private User user;
    private View view;

    public Controller(User user, View view) {
        this.user = user;
        this.view = view;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);
        InputNoteNoteBook inputNoteNoteBook =
                new InputNoteNoteBook(view, sc);

        user = inputNoteNoteBook.inputNote();

        view.printMessage(user.toString());
    }
}
