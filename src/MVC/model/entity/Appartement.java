package MVC.model.entity;

import javax.swing.*;

public class Appartement {
    private int id;
    private String Nom;
    private ImageIcon[] images;
    private String adresse;
    private double superficie;
    private int nbChambres;
    private double prixLocation;

    public Appartement() {

    }

   public Appartement(int id, String nom, ImageIcon[] images, String adresse, double superficie, int nbChambres, double prixLocation) {
        this.id = id;
        this.Nom = nom;
        this.images = images;
        this.adresse = adresse;
        this.superficie = superficie;
        this.nbChambres = nbChambres;
        this.prixLocation = prixLocation;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public ImageIcon[] getImages() {
        return images;
    }

    public void setImages(ImageIcon[] images) {
        this.images = images;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public int getNbChambres() {
        return nbChambres;
    }

    public void setNbChambres(int nbChambres) {
        this.nbChambres = nbChambres;
    }

    public double getPrixLocation() {
        return prixLocation;
    }

    public void setPrixLocation(double prixLocation) {
        this.prixLocation = prixLocation;
    }

    @Override
    public String toString() {
        return "Appartement{" +
                "id=" + id +
                ", nom=" + Nom +
                ", images=" + (images != null ? images.length : 0) + " image(s)" +
                ", adresse='" + adresse + '\'' +
                ", superficie=" + superficie +
                ", nbChambres=" + nbChambres +
                ", prixLocation=" + prixLocation +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Appartement that = (Appartement) o;
        return id == that.id;
    }

    public static void main(String[] args) {
        // Création d'un tableau d'images pour l'exemple (les images doivent exister)
        ImageIcon[] imagesPourApp1 = {
                new ImageIcon("chemin/vers/image1.jpg"),
                new ImageIcon("chemin/vers/image2.jpg")
        };

        Appartement app1 = new Appartement(1,"Duplex", imagesPourApp1, "123 Rue de Paris", 75.0, 2, 1200.0);

        System.out.println(app1);
    }

}
