package MVC.model.entity;

import java.util.Objects;

public class Option implements EstIdentifiable {
    private int code;
    private String type;
    private float prix;

    // Constructeur par défaut
    public Option() {
        this.code = 0;
        this.type = "";
        this.prix = 0.0f;
    }

    // Constructeur avec paramètres
    public Option(int code, String type, float prix) {
        this.code = code;
        this.type = type;
        this.prix = prix;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    @Override
    public int getNumero() {
        return code;
    }

    @Override
    public String toString() {
        return "Option{" +
                "Code = '" + getCode() + '\'' +
                "Type = '" + getType() + '\'' +
                ", Prix = " + getPrix() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Option option = (Option) o;
        return Float.compare(option.prix, prix) == 0 && Objects.equals(type, option.type);
    }

    public static void main(String[] args) {
        Option option1 = new Option(125,"Assurance", 150.0f);
        Option option2 = new Option(456,"GPS", 99.99f);
        Option option3 = new Option(745,"Assurance", 150.0f);

        System.out.println("Option 1: " + option1);
        System.out.println("Option 2: " + option2);
        System.out.println("Option 3: " + option3);

        // Comparer option1 avec option2
        System.out.println("Est-ce que option1 est égale à option2? " + option1.equals(option2));

        // Comparer option1 avec option3
        System.out.println("Est-ce que option1 est égale à option3? " + option1.equals(option3));
    }

}
