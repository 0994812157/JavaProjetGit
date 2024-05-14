package MVC.view;

import MVC.controller.Controlleur;
import MVC.model.entity.Appartement;

import java.util.ArrayList;

public interface ViewItems {
    Object promptForNewItem();
    Object promptForUpdateItem(Object item);
    Integer promptForItemById();
    void showErroMessage(String message);
    void showMessage(String message);
    void displayListItem(ArrayList<Object> item);
    void run();
    void setController(Controlleur c);
}
