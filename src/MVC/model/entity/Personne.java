package MVC.model.entity;

import java.time.LocalDate;

public class Personne implements EstIdentifiable {
    private String Nom;
    private String Prenom;
    private LocalDate dateNaissance;

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String prenom) {
        Prenom = prenom;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public Personne() {
        this.Nom = "inconnu";
        this.Prenom = "inconnu";
        this.dateNaissance = LocalDate.of(2000, 1, 1);
    }

    public Personne(String nom, String prenom) {
        this(nom, prenom, LocalDate.of(2000, 1, 1));
    }

    public Personne(String nom, String prenom, LocalDate ddn) {
        this.Nom = nom;
        this.Prenom = prenom;
        this.dateNaissance = ddn;
    }

    @Override
    public int getNumero() {
        return 0;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "Nom = '" + Nom + '\'' +
                ", Prenom = '" + Prenom + '\'' +
                ", dateNaissance = " + dateNaissance +
                '}';
    }

    public static void main(String[] args) {
        Personne personne = new Personne();
        System.out.println("p1 = " + personne);
    }
}
