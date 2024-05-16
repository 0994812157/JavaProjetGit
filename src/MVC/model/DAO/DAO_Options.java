package MVC.model.DAO;

import MVC.model.DataAccesLayer;
import MVC.model.entity.Option;

import java.util.ArrayList;

public class DAO_Options implements DataAccesLayer {
    private ArrayList<Option> options;

    public DAO_Options() {
        options = new ArrayList<>();
    }


    @Override
    public int addItem(Object option) {
        //return 0;
        if (option instanceof Option) {
            //((Option) option).setNClient(idcourant++);
            options.add((Option) option);
            return ((Option) option).getCode();
        }
        return -1;
    }

    @Override
    public boolean updateItem(Object option) {
        if (option instanceof Option) {
            Option updateItem = (Option) option;
            for (int i = 0; i < options.size(); i++) {
                if (options.get(i) != null &&
                        ((Option) options.get(i)).getCode() == updateItem.getCode()) {
                    options.set(i, updateItem);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean deleteItem(int id) {
        return options.removeIf(a -> a != null && ((Option) a).getCode() == id);
    }

    @Override
    public boolean deleteItem(Object appart) {
        return options.remove(options);
    }

    @Override
    public Object getItemById(int id) {
        for (Object a : options) {
            if (a instanceof Option && ((Option) a).getCode() == id) {
                return a;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Object> getList() {
        ArrayList<Object> copy = new ArrayList<>();
        for (Object a : options) {
            if (a instanceof Option) {
                copy.add(((Option)a).clone());
            }
        }
        return copy;
    }

    @Override
    public String toString() {
        return "DAO_Options{" +
                "options=" + options.toString() +
                '}';
    }

    public static void main(String[] args)
    {
        DataAccesLayer dao = new DAO_Options();
        dao.addItem(new Option());
        dao.addItem(new Option(8965,"chien", 153.3f));
        dao.addItem(new Option(1234,"lit enfant", 88.65f));
        dao.addItem(new Option());
        System.out.println(dao);
        Option a = (Option) dao.getItemById(1);
        System.out.println("Option ayant l'id 1 = " + a);
        a.setPrix(62.65f);
        dao.updateItem(a);
        System.out.println(dao);
        dao.deleteItem(3);
        System.out.println(dao);


    }

}
