package hepl.java.MVC.model.entity;

import java.time.LocalDate;

public class Employe extends Personne {

    private int matricule;
    private String fonction;

    public int getMatricule() {
        return matricule;
    }

    public void setMatricule(int mat) {
        this.matricule = mat; // Utilisez `this` pour clarifier l'usage des variables d'instance

    }

    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }
    public Employe() {
        super(); // Appelle le constructeur par défaut de Personne
        this.matricule = -1;
        this.fonction = "manager";
    }

    public Employe(String nom, String prenom, LocalDate ddn, String fonction) {
        super(nom, prenom, ddn); // Appelle le constructeur avec paramètres de Personne
        this.matricule = -1;
        this.fonction = fonction;
    }

    @Override
    public String toString() {
        // Accède aux attributs Nom et Prenom via les getters pour respecter l'encapsulation
        return "Employe{" +
                "matricule=" + matricule +
                ", nom='" + getNom() + '\'' +
                ", prenom='" + getPrenom() + '\'' +
                ", dateNaissance=" + getDateNaissance() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employe)) return false;
        Employe employe = (Employe) o;
        return matricule == employe.matricule;
    }

    public static void main(String[] args) {
        Employe employe = new Employe("Doe", "John", LocalDate.of(1980, 4, 15),"magasinier");
        employe.setMatricule(12345);
        System.out.println(employe);
    }


}
