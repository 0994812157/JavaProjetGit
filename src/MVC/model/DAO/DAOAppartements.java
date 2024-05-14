package MVC.model.DAO;

import MVC.model.DataAccesLayer;
import MVC.model.entity.*;
import java.lang.Object;

import java.util.ArrayList;

public class DAOAppartements implements DataAccesLayer {
    private ArrayList<Appartement> appartements;
    private static int idcourant = 1;

    public DAOAppartements() {
        appartements = new ArrayList<>();
    }


    @Override
    public int addItem(Object appart) {
        if (appart instanceof Appartement) {
            ((Appartement) appart).setId(idcourant++);
            appartements.add((Appartement) appart);
            return ((Appartement) appart).getId();
        }
        return -1;
    }

    @Override
    public boolean updateItem(Object appart) {
        if (appart instanceof Appartement) {
            Appartement updateItem = (Appartement) appart;
            for (int i = 0; i < appartements.size(); i++) {
                if (appartements.get(i) != null &&
                        ((Appartement) appartements.get(i)).getId() == updateItem.getId()) {
                    appartements.set(i, updateItem);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean deleteItem(int id) {
        return appartements.removeIf(a -> a != null && ((Appartement) a).getId() == id);
    }

    @Override
    public boolean deleteItem(Object appart) {
        return appartements.remove(appart);
    }

    @Override
    public Object getItemById(int id) {
        for (Object a : appartements) {
            if (a instanceof Appartement && ((Appartement) a).getId() == id) {
                return a;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Object> getList() {
        ArrayList<Object> copy = new ArrayList<>();
        for (Object a : appartements) {
            if (a instanceof Appartement) {
                copy.add(((Appartement)a).clone());
            }
        }
        return copy;
    }

    @Override
    public String toString() {
        return "DAOAppartements{" +
                "appartements=" + appartements +
                '}';
    }

    public static void main(String[] args)
    {
        DataAccesLayer dao = new DAOAppartements();
        try {
            dao.addItem(new Appartement());
            ArrayList<Image> im1 = new ArrayList<Image>();
            dao.addItem(new Appartement("appart1",im1,"8888888888",500.0,2,200));
            dao.addItem(new Appartement("cerises",im1,"ihhffgcvxd",600.06f,8,300));
            dao.addItem(new Appartement());
            System.out.println(dao);
            Appartement a = (Appartement) dao.getItemById(1);
            System.out.println("Appartement ayant l'id 1 = " + a);
            a.setSuperficie(25.2);
            a.setPrixLocation(8.63f);
            dao.updateItem(a);
            System.out.println(dao);
            dao.deleteItem(3);
            System.out.println(dao);
        } catch (AppartementException e) {
            System.out.println("Erreur : " + e.getMessage());
        }

    }


}