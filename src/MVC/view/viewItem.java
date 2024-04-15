package MVC.view;

import MVC.controller.Controlleur;
import java.util.ArrayList;

public interface viewItem {
    Object promptForNewItem();
    Object promptForUpdateItem(Object item);
    Integer promptForItemById();
    void showErroMessage(String message);
    void showMessage(String message);
    void displayListItem(ArrayList<Object> item);
    void run();
    void setController(Controlleur c);
}
