package MVC.view.Gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.IntelliJTheme;
public class JFrameFenetreFinal extends JFrame {
    private JPanel MainPanel;
    private JPanel JpanelPhoto;
    private JComboBox comboBoxListAppart;
    private JList JListEmployes;
    private JLabel listeEmpLabel;
    private JTextField textFieldNum;
    private JTextField textFieldNom;
    private JTextField textFieldPrenom;
    private JTextField textFieldNbPersonne;
    private JTextField textFieldDateDebut;
    private JSpinner spinnerNbNuits;
    private JLabel LabelNbNuits;
    private JCheckBox checkBoxDej;
    private JCheckBox checkBoxEnf;
    private JCheckBox checkBoxFumeur;
    private JCheckBox checkBoxAnnimaux;
    private JList listOptions;
    private JLabel LabelClient;
    private JButton ButtonEnregistrer;
    private JButton nouveauButton;
    private JButton supprimerButton;
    private JButton factureButton;
    private JTable tableReservation;
    private JList listClients;
    private JLabel LabelNumClient;
    private JLabel LabelNom;
    private JLabel LabelPrenom;
    private JLabel LabelTotal;
    private JLabel LabelNomAppart;
    private JLabel LabelDimension;
    private JLabel LabelCapacite;
    private JLabel LabelPrix;
    private JLabel LabelAppart;

    private JMenuItem Cli, Emp;

    public JFrameFenetreFinal()
    {
        //FlatDarkLaf.setup();
        JDialogConnexion formconnection=new JDialogConnexion();
        if(!formconnection.getconnecte()){
            formconnection.pack();
            formconnection.setVisible(true);
        }
        if(formconnection.getconnecte()) {

            add(MainPanel);
            setTitle("my first");
            setSize(1200, 600);
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            setVisible(true);

            JMenuBar Jmenubar = new JMenuBar();
            JMenu connexion = new JMenu("Deconnexion");
            Jmenubar.add(connexion);

            JMenu addNewPersonne = new JMenu("Personne");
            Jmenubar.add(addNewPersonne);
            Cli = new JMenuItem("Ajouter Client");
            Emp = new JMenuItem("Ajouter Employé");
            addNewPersonne.add(Cli);
            addNewPersonne.add(Emp);

            JMenu addNewAppart = new JMenu("appartement");
            Jmenubar.add(addNewAppart);

            setJMenuBar(Jmenubar);
            Cli.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    JdialogNouveauClient fenetrecli=new JdialogNouveauClient();
                    fenetrecli.pack();
                    fenetrecli.setVisible(true);
                    fenetrecli.dispose();
                }
            });
            Emp.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    JDialogNouveauEmploye fenetreemp=new JDialogNouveauEmploye();
                    fenetreemp.pack();
                    fenetreemp.setVisible(true);
                    fenetreemp.dispose();
                }
            });

            addNewAppart.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    JDialogNouvelAppart fenetreappart=new JDialogNouvelAppart();
                    fenetreappart.pack();
                    fenetreappart.setVisible(true);
                    fenetreappart.dispose();
                }
            });
            connexion.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    JDialogmessage fenetrem=new JDialogmessage("Au revoir !");
                    fenetrem.pack();
                    fenetrem.setVisible(true);
                    fenetrem.dispose();
                    System.exit(0);
                }
            });

        }
        else{
            System.exit(0);
        }
    }

    public static void main(String[] args)
    {
        JFrameFenetreFinal monPanel = new JFrameFenetreFinal();
        monPanel.setVisible(true);
        //System.exit(0);
    }

}
