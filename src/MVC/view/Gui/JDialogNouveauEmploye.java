package MVC.view.Gui;

import javax.swing.*;
import java.awt.event.*;

public class JDialogNouveauEmploye extends JDialog {
    private JPanel contentPane;
    private JButton buttonCreer;
    private JButton buttonAnnuler;
    private JTextField textFieldNom;
    private JTextField textFieldPrenom;
    private JPasswordField passwordFieldMDP;
    private JComboBox comboBoxFonction;
    private JLabel JLabelNom;
    private JLabel JLabelPrenom;
    private JLabel JLabelMDP;
    private JLabel JLabelFonction;


    private String nom;
    private String prenom;
    private String MDP;
    private String fonction;


    public JDialogNouveauEmploye() {
        super();
        JDialogConnexion formconnection=new JDialogConnexion();
        if(!formconnection.getconnecte()){
            formconnection.pack();
            formconnection.setVisible(true);
        }
        if(formconnection.getconnecte()) {
            setContentPane(contentPane);
            setModal(true);
            getRootPane().setDefaultButton(buttonCreer);
            setTitle("---- | Nouveau Employe |----");

            comboBoxFonction.addItem("Administrateur");
            comboBoxFonction.addItem("Employe");
            buttonCreer.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    onOK();
                    nom = textFieldNom.getText();
                    prenom = textFieldPrenom.getText();
                    MDP = (String) passwordFieldMDP.getToolTipText();
                    fonction = comboBoxFonction.getToolTipText();
                    setVisible(false);
                }
            });

            buttonAnnuler.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    onCancel();
                    setVisible(false);
                }
            });

            // call onCancel() when cross is clicked
            setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
            addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    onCancel();
                }
            });

            // call onCancel() on ESCAPE
            contentPane.registerKeyboardAction(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    onCancel();
                }
            }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        }
    }

    private void onOK() {
        // add your code here
        dispose();
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

    public static void main(String[] args) {
        JDialogNouveauEmploye dialog = new JDialogNouveauEmploye();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
        System.out.println("Employe: " + dialog.getNom() + " - " + dialog.getPrenom() + " - " + dialog.getMDP() + " - " + dialog.getFonction());
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getMDP() {
        return MDP;
    }

    public String getFonction() {
        return fonction;
    }
}
