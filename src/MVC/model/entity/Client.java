package MVC.model.entity;

import java.time.LocalDate;
import java.util.Objects;

public class Client extends Personne {
    private String NumTel;
    private static int NumClient = 0;
    private int NClient;

    public Client() {
        super();
        this.NClient = ++NumClient;
        this.NumTel = "04/";
    }

    public Client(String nom, String prenom, LocalDate ddn, String gsm) throws PersonneException {
        super(nom, prenom, ddn);
        this.NClient = ++NumClient;
        this.NumTel = gsm;
    }

    public String getNumTel() {
        return NumTel;
    }

    public void setNumTel(String numTel) {
        this.NumTel = numTel;
    }

    @Override
    public String toString() {
        return super.toString() + "Client{" +
                ", NumClient='" + NClient + '\'' +
                ", NumTel='" + NumTel + '\'' +
                '}';
    }

    @Override
    public int getNumero() {
        return NumClient;
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
        Client client = null;
        try {
            client = new Client("Doe", "line", LocalDate.of(1985, 5, 15),"0478459632");
        } catch (PersonneException e) {
            throw new RuntimeException(e);
        }
        //client.setNumTel("0123456789");
        System.out.println(client);
    }
}
