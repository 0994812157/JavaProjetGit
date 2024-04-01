package hepl.java.MVC.model.entity;

public class Image {
    private String chemin;
    private String titre;

    // Constructeur
    public Image(String chemin, String titre) {
        this.chemin = chemin;
        this.titre = titre;
    }

    // Getters et Setters
    public String getChemin() {
        return chemin;
    }

    public void setChemin(String chemin) {
        this.chemin = chemin;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    // Méthode toString
    @Override
    public String toString() {
        return "Image{" +
                "chemin='" + chemin + '\'' +
                ", titre='" + titre + '\'' +
                '}';
    }
}
