package hepl.java.MVC.view.Gui;

import javax.swing.*;

public class JFrameReservation extends JFrame {
    private JPanel mainPanel;
    private JTable table2;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JLabel numclient;
    private JLabel prenom;
    private JLabel nbpersonne;
    private JSpinner spinner1;
    private JLabel datedebut;
    private JTextField textField4;
    private JSpinner spinner2;
    private JLabel nbnuit;
    private JCheckBox animauxCheckBox;
    private JCheckBox litEnfantCheckBox;
    private JCheckBox fumeurCheckBox;
    private JCheckBox petitDeujCheckBox;
    private JButton reserverButton;
    private JPanel PhotoPanel;
    private JComboBox comboBox1;
    private JTextPane nomAppart;
    private JTextPane dimension;
    private JTextPane capacite;
    private JTextPane Prix;
    private JList listReservation;
    private JList listClient;
    private JTextPane textTotal;
    private JButton nouvelleButton;
    private JButton supprimerButton;
    private JButton factureButton;

    public JFrameReservation()
    {

        add(mainPanel);
        setTitle("my first");
        setSize(1500,800);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        JMenuBar Jmenubar = new JMenuBar();
        JMenu connexion = new JMenu("Connexion");
        Jmenubar.add(connexion);
        JMenu addNewEmploye = new JMenu("Ajouter employe");
        Jmenubar.add(addNewEmploye);
        JMenu addNewAppart = new JMenu("Ajouter appartement");
        Jmenubar.add(addNewAppart);

        setJMenuBar(Jmenubar);


    }
    public static void main(String[] args)
    {
        JFrameReservation monPanel = new JFrameReservation();
        monPanel.setVisible(true);
    }

}
