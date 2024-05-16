package MVC.view.Gui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.util.ArrayList;

import MVC.controller.Controller;
import MVC.model.entity.Client;
import MVC.model.entity.Employe;
import MVC.view.ViewAppart;
import MVC.view.Viewitems;
import MVC.view.Viewliste;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.IntelliJTheme;
public class JFrameFenetreFinal extends JFrame implements Viewliste<Employe> {
    private JPanel MainPanel;
    private JPanel JpanelPhoto;
    private JComboBox comboBoxListAppart;
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
    private JTable table1;
    private JScrollBar scrollBar1;

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

        //JListEmployes.add("dh","kn",1);
        //System.exit(0);
    }


    @Override
    public void displayListe(ArrayList<Employe> employes) {

        String[] columnNames = {"Nom", "Prénom"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Aucune cellule ne peut être modifiée
            }
        };


        for (Employe emp : employes) {
            model.addRow(new Object[]{emp.getNom(), emp.getPrenom()});
        }

        // Set the new model to the existing table
        table1.setModel(model);



        // Création du JTable avec le modèle

        /*String[] a= new String[employes.size()];
        for(int i=0;i<employes.size();i++){
            a[i]="Matricule"+employes.get(i).getMatricule()+ "NOM:"+employes.get(i).getNom()+"     PRENOM:"+employes.get(i).getPrenom();
        }
        // Utiliser setListData pour mettre à jour le JList
        JListEmployes.setListData(a);
        //JListEmployes.se*/
    }
}
