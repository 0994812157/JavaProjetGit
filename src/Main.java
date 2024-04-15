import MVC.controller.Controlleur;
import MVC.model.DAO.DAOAppartements;
import MVC.view.console.ViewAppartConsole;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        Controlleur controlleur = new Controlleur(new DAOAppartements(),new ViewAppartConsole());
        controlleur.run();
    }
}