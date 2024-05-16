package MVC.view;

import MVC.controller.Controlleur;
import MVC.model.entity.Employe;

import java.util.ArrayList;

public interface ViewEmploye {
    Employe promptForNewEmploye();
    Employe promptForUpdateEmploye(Employe employe);
    Integer promptForEmployeById();
    void showErroMessage(String message);
    void showMessage(String message);
    void displayListEmploye(ArrayList<Employe> employe);
    void run();
    void setController(Controlleur c);
}
