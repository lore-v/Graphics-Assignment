import java.applet.*;
import java.awt.*;

public class q1 extends Applet {

    public void init() {
        setBackground(Color.red);
    }

    public void paint(Graphics g) {
        int originX = (getX() + getWidth()) / 2;
        int originY = (getY() + getHeight()) / 2;
        g.setColor(Color.BLACK);
        g.drawLine(0, originY, getWidth(), originY);
        g.drawLine(originX, 0, originX, getHeight());
    }

}