package MVC.view.Gui;

import javax.swing.*;

import java.awt.*;

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
    private JPanel PhotoAppart;

    private JMenuItem Cli, Emp;

    public JFrameFenetreFinal()
    {

        add(MainPanel);
        setTitle("my first");
        setSize(1200,600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        JMenuBar Jmenubar = new JMenuBar();
        JMenu connexion = new JMenu("Connexion");
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
        // Charger l'image et l'ajouter au panneau PhotoAppart
        loadImage();
    }
    private void loadImage() {
        // Utilisez getResource pour charger l'image depuis le classpath
        String imagePath = "/MVC/view/Gui/images/Bateau1.jpg";
        ImageIcon imageIcon = new ImageIcon(getClass().getResource(imagePath));

        if (imageIcon.getIconWidth() == -1) {
            System.out.println("L'image ne peut pas être chargée. Vérifiez le chemin de l'image.");
        } else {
            JLabel imageLabel = new JLabel(imageIcon);
            PhotoAppart.setLayout(new BorderLayout());
            PhotoAppart.add(imageLabel, BorderLayout.CENTER);
        }
    }



    public static void main(String[] args)
    {
        JFrameFenetreFinal monPanel = new JFrameFenetreFinal();
        monPanel.setVisible(true);
    }

}
