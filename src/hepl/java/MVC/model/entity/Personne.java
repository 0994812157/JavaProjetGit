package hepl.java.MVC.model.entity;
import java.time.LocalDate;

public class Personne {
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
        Nom = "inconnu";
        Prenom = "inconnu";
        dateNaissance = LocalDate.of(2000, 1, 1);
    }

    public Personne(String nom, String prenom) {
        this(nom, prenom, LocalDate.of(2000, 1, 1));
    }

    public Personne(String nom, String prenom, LocalDate ddn) {
        Nom = nom;
        Prenom = prenom;
        dateNaissance = ddn;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "Nom='" + Nom + '\'' +
                ", Prenom='" + Prenom + '\'' +
                ", dateNaissance=" + dateNaissance +
                '}';
    }

    public static void main(String[] args) {
        Personne personne = new Personne();
        System.out.println("p1 = " + personne);
    }
}
