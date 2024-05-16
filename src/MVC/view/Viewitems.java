package MVC.view;

import MVC.controller.*;

import java.util.ArrayList;

public interface  Viewitems<T> {
    T getitems();
    void showErroMessage(String message);
    void showMessage(String message);
    void run();
    void setController(Controller c);
}
