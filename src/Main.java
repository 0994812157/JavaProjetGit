import MVC.controller.Controlleur;
import MVC.model.DAO.DAOAppartements;
import MVC.model.DAO.DAOEmployes;
import MVC.view.console.ViewAppartConsole;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        Controlleur controlleur = new Controlleur(new DAOEmployes(),new ViewAppartConsole());
        controlleur.run();
    }
}