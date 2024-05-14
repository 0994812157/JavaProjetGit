package MVC.view.Gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JDialogConnexion extends JDialog {
    private JPanel contentPane;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton connexionButton;
    private JLabel connexionLabel;
    private JPanel panel1;
    private JPanel panel2;
    private JButton buttonOK;
    private JButton buttonCancel;
    private static boolean connecte =true;

    public JDialogConnexion() {

        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
        //this.setSize(600, 600);
        this.setPreferredSize(new Dimension(600, 600));
        this.setMinimumSize(new Dimension(600, 600));
        this.setMaximumSize(new Dimension(800, 800));
        setTitle("---- | formulaire de connexion |----");
        createUIComponents();
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
    private void onOK() {
        // add your code here
        dispose();
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

    public static void main(String[] args) {
        JDialogConnexion dialog = new JDialogConnexion();
       //JLabel titre = new JLabel("Connexion", SwingConstants.CENTER);
       //dialog.add(titre, BorderLayout.NORTH);
        //gestion_menu(dialog);


        dialog.setTitle("connexion");
        dialog.pack();
        dialog.setVisible(true);
        //System.exit(0);
    }
    private  static void gestion_menu(JDialogConnexion dialog){
        JMenuBar menuBar=new JMenuBar();
        JMenu connexion=new JMenu("connexion");
        JMenu employer=new JMenu("employer");
        JMenu apartements=new JMenu("apartments");
        applyMenuStyle(employer);
        applyMenuStyle(connexion);
        applyMenuStyle(apartements);
        menuBar.add(connexion);
        menuBar.add(employer);
        menuBar.add(apartements);
        menuBar.setFont(new Font(Font.SERIF,Font.ITALIC,100));
        dialog.setJMenuBar(menuBar);
    }
    private static void applyMenuStyle(JMenu menu) {
        menu.setFont(new Font("Arial Narrow", Font.ITALIC, 18));
        menu.setForeground(Color.BLUE);
        menu.setBackground(Color.red);
    }
    public boolean getconnecte(){
        return connecte;
    }
    public void setConnecte(boolean a){
        connecte=a;
    }
    private void createUIComponents() {
        textField1 = new JTextField();
        passwordField1 = new JPasswordField();
        connexionButton = new JButton("Connexion");

       // textField1.setBorder(new border(new Color(28,105,207),7));
       // passwordField1.setBorder(new border(new Color(28,105,207),7));
       // connexionButton.setBackground(new Color(28,105,207));
        //connexionButton.setBorder(new border(new Color(28,105,207),7));
    }
}
