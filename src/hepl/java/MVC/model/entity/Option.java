package hepl.java.MVC.model.entity;

import java.util.Objects;

public class Option {
    private String type;
    private float prix;

    // Constructeur par défaut
    public Option() {
        this.type = "fumeur";
        this.prix =0;
    }

    // Constructeur avec paramètres
    public Option(String type, float prix) {
        this.type = type;
        this.prix = prix;
    }

    // Getter pour type
    public String getType() {
        return type;
    }

    // Setter pour type
    public void setType(String type) {
        this.type = type;
    }

    // Getter pour prix
    public float getPrix() {
        return prix;
    }

    // Setter pour prix
    public void setPrix(float prix) {
        this.prix = prix;
    }

    // Méthode toString surchargée
    @Override
    public String toString() {
        return "Option{" +
                "type='" + type + '\'' +
                ", prix=" + prix +
                '}';
    }

    // Méthode equals surchargée
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Option option = (Option) o;
        return Float.compare(option.prix, prix) == 0 && Objects.equals(type, option.type);
    }

    public static void main(String[] args) {
        Option option1 = new Option("Assurance", 150.0f);
        Option option2 = new Option("GPS", 99.99f);
        Option option3 = new Option("Assurance", 150.0f);

        System.out.println("Option 1: " + option1);
        System.out.println("Option 2: " + option2);
        System.out.println("Option 3: " + option3);

        // Comparer option1 avec option2
        System.out.println("Est-ce que option1 est égale à option2? " + option1.equals(option2));

        // Comparer option1 avec option3
        System.out.println("Est-ce que option1 est égale à option3? " + option1.equals(option3));
    }
}
