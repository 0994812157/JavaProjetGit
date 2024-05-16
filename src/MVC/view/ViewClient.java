package MVC.view;

import MVC.controller.Controlleur;
import MVC.model.entity.Client;

import java.util.ArrayList;

public interface ViewClient {
    Client promptForNewClient();
    Client promptForUpdateClient(Client client);
    Integer promptForClientById();
    void showErroMessage(String message);
    void showMessage(String message);
    void displayListClient(ArrayList<Client> clients);
    void run();
    void setController(Controlleur c);
}
