package MVC.model.entity;

import java.time.LocalDate;

public class Employe extends Personne {
    private int matricule;
    private String fonction;
    private String mdp;

    public static String ADMINISTRATEUR = "ADMINISTRATEUR";
    public static String EMPLOYE = "EMPLOYE";

    public Employe() {
        super();
        this.matricule = -1;
        this.fonction = "";
        this.mdp = "";
    }

    public Employe(String nom, String prenom, LocalDate ddn, int matricule, String fonction, String mdp) {
        super(nom, prenom, ddn);
        this.matricule = matricule;
        this.fonction = fonction;
        this.mdp = mdp;
    }

    public int getMatricule() {
        return matricule;
    }

    public void setMatricule(int mat) {
        this.matricule = mat;
    }

    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        if(fonction.equals(ADMINISTRATEUR) || fonction.equals(EMPLOYE)) {
            this.fonction = fonction;
        }
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    @Override
    public int getNumero() {
        return matricule;
    }

    @Override
    public String toString() {
        return super.toString() + " Employe{" +
                "matricule=" + getMatricule() +
                ", fonction='" + getFonction() + '\'' +
                ", mdp='" + getMdp() + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employe)) return false;
        if (!super.equals(o)) return false;
        Employe employe = (Employe) o;
        return matricule == employe.matricule;
    }

    public static void main(String[] args) {
        Employe employe = new Employe("Doe", "John", LocalDate.of(1980, 4, 15), 12345, "EMPLOYE", "password123");
        System.out.println(employe);
    }
}
