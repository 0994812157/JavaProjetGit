import MVC.controller.*;
import MVC.model.DAO.DAOAppartements;
import MVC.model.DAO.DAOEmployes;

import MVC.model.entity.PersonneException;
import MVC.view.Gui.JDialogConnexion;

import MVC.view.Gui.JDialogNouveauEmploye;
import MVC.view.Gui.JFrameFenetreFinal;

import MVC.view.console.ViewAppartConsole;

public class Main {
    public static void main(String[] args)  {
        //System.out.println("Hello world!");

        try {
            Controller controller = new Controller(new DAOEmployes(),new JDialogConnexion());
            controller.run();
        } catch (PersonneException e) {
            throw new RuntimeException(e);
        }

    }
}