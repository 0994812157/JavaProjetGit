package MVC.view.Gui;

import MVC.controller.Controlleur;
import MVC.model.entity.Client;
import MVC.view.ViewClient;
import MVC.view.ViewItems;

import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class JdialogNouveauClient extends JDialog implements ViewClient {
    private JPanel contentPane;
    private JButton buttonCreer;
    private JButton buttonAnnuler;
    private JTextField textFieldNom;
    private JTextField textFieldPrenom;
    private JTextField textFieldGSM;
    private String nom;
    private JLabel JLabelNom;
    private JLabel JLabelPrenom;
    private JLabel JLabelGSM;
    private String prenom;
    private String gsm;

    public JdialogNouveauClient() {

        JDialogConnexion formconnection=new JDialogConnexion();
        if(!formconnection.getconnecte()){
            formconnection.pack();
            formconnection.setVisible(true);
            formconnection.setConnecte(true);
        }
        if(formconnection.getconnecte()) {
            setContentPane(contentPane);
            setModal(true);
            getRootPane().setDefaultButton(buttonCreer);
            setTitle("----| Nouveau Client |----");

            buttonCreer.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    nom = textFieldNom.getText();
                    prenom = textFieldPrenom.getText();
                    gsm = textFieldGSM.getText();
                    setVisible(false); // Assumant que vous souhaitez fermer ce dialogue après création.
                }
            });

            buttonAnnuler.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    setVisible(false);
                }
            });

            // Gérer la fermeture de la fenêtre via la croix
            setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
            addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    onCancel();
                }
            });
        }
    }

    private void onCancel() {
        // Mettez ici le code à exécuter lorsque l'utilisateur ferme le dialogue via la croix
        setVisible(false);
    }

    public Object promptForNewItem()
    {
        JdialogNouveauClient jdialogNouveauClient;
        jdialogNouveauClient = new JdialogNouveauClient(this,null);

    }

    public static void main(String[] args) {
        JdialogNouveauClient dialog = new JdialogNouveauClient();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getGSM() {
        return gsm;
    }
//----------------------------------------------------------------
    @Override
    public Client promptForNewClient() {
        return null;

    }

    @Override
    public Client promptForUpdateClient(Client client) {
        return null;
    }

    @Override
    public Integer promptForClientById() {
        return null;
    }

    @Override
    public void showErroMessage(String message) {

    }

    @Override
    public void showMessage(String message) {

    }

    @Override
    public void displayListClient(ArrayList<Client> clients) {

    }

    @Override
    public void run() {

    }

    @Override
    public void setController(Controlleur c) {

    }
}
