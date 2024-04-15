package MVC.model;
import MVC.model.entity.Appartement;
import java.util.ArrayList;
import java.lang.Object;
public interface DataAccesLayer {
    int addItem(Object appart);
    boolean updateItem(Object appart);
    boolean deleteItem(int id);
    boolean deleteItem(Object appart);
    Object getItemById(int id);
    ArrayList<Object> getList();

}
