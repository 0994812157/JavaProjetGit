package hepl.java.MVC.model.entity;
import java.time.LocalDate;
import java.util.Objects;

public class Client extends Personne {
    private int NumClient;
    private String NumTel;

    public Client() {
        super(); // Appelle le constructeur par défaut de la classe parente Personne
        NumClient = -1; // Valeur par défaut indiquant un client non initialisé
    }

    public Client(String nom, String prenom, LocalDate ddn) {
        super(nom, prenom, ddn); // Appelle le constructeur avec paramètres de la classe parente Personne
        NumClient = -1; // Valeur par défaut
    }

    public int getNumClient() {
        return NumClient;
    }

    public void setNumClient(int numClient) {
        NumClient = numClient;
    }

    public String getNumTel() {
        return NumTel;
    }

    public void setNumTel(String numTel) {
        NumTel = numTel;
    }

    @Override
    public String toString() {
        return "Client{" +
                "Nom='" + getNom() + '\'' +
                ", Prenom='" + getPrenom() + '\'' +
                ", dateNaissance=" + getDateNaissance() +
                ", NumClient=" + NumClient +
                ", NumTel='" + NumTel + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client)) return false;
        if (!super.equals(o)) return false; // Compare également les attributs hérités de Personne
        Client client = (Client) o;
        return NumClient == client.NumClient && Objects.equals(NumTel, client.NumTel);
    }

    public static void main(String[] args) {
        Client client = new Client("Doe", "John", LocalDate.of(1985, 5, 15));
        client.setNumClient(12345);
        client.setNumTel("0123456789");

        System.out.println(client);
    }
}
