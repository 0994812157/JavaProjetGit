package MVC.view.Gui.classe;

import javax.swing.border.Border;
import java.awt.*;

public class border implements Border {
    private  int  radius;
    private Color color;
    border(Color color, int radius) {
        this.radius = radius;
        this.color=color;
    }

    public Insets getBorderInsets(Component c) {
        return new Insets(5, 5, 5, 5);
    }

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        g.setColor(color);

            g.drawRoundRect(x , y , width-1, height-1 ,radius,radius);

    }

    public boolean isBorderOpaque() {
        return true;
    }
}
