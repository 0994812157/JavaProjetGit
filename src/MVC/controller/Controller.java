package MVC.controller;

import MVC.model.DAO.*;
import MVC.model.*;
import MVC.model.entity.Employe;
import MVC.view.Gui.*;
import MVC.view.ViewAppart;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {
    private DataAccesLayer model;
    private JDialogConnexion view;


    public Controller(DataAccesLayer m,JDialogConnexion v){
        this.model=m;
        this.view=v;
        this.view.setController(this);
    }
    public void run(){
        view.run();
    }
    public void actionPerformed(ActionEvent e) {

        if(e.getActionCommand().equals("connexion")){
            if(((DAOEmployes)model).containt(view.getitems().getNom(),view.getitems().getMdp())){
                view.showMessage("bienvenu");
                view.setConnecte(true);
                view.dispose();
                JFrameFenetreFinal A=new JFrameFenetreFinal();
                A.displayListe(model.getList());
            }
            else{
                view.showErroMessage("mon ou mot de passe erroner");
            }
        }
    }
}
