import java.applet.*;
import java.awt.*;
import java.awt.event.*;

class point {
    int x;
    int y;

    point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class dda extends Applet implements ActionListener {
    int j = 30;
    int originX = 0;
    int originY = 0;
    Button B1, B2;
    int x=40;
    float r=1f;

    // @Override
    public void init() {
        setBackground(Color.white);
        originX = (getX() + getWidth()) / 2;
        originY = (getY() + getHeight()) / 2;
        B1 = new Button("zoomin");
        add(B1);
        B1.addActionListener(this);
        B2 = new Button("zoomout");
        add(B2);
        B2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == B1) {
            if (j < 70) {
                j = j + 10;
                repaint();
                // paint(getGhics());
            }
        } else {
            if (j > 10) {
                j = j - 10;
                repaint();
                // paint(getGraphics());
            }
        }
    }

    public void mouseWheelMoved(MouseWheelEvent e) {
        int notches = e.getWheelRotation();
        if (notches < 0) {
          x+=r;
        } else {
          if(x-r>0)
            x-=r;
        }
        repaint();
      }

    @Override
    public void paint(Graphics g) {
        // for (int i = originY; i >= 0; i -= j) {
        //     g.drawLine(0, i, getWidth(), i);
        // }
        // for (int i = originY; i <= getHeight(); i += j) {
        //     g.drawLine(0, i, getWidth(), i);
        // }
        // for (int i = originX; i >= 0; i -= j) {
        //     g.drawLine(i, 0, i, getHeight()); 
        // }
        // for (int i = originX; i <= getWidth(); i += j) {
        //     g.drawLine(i, 0, i, getHeight());
        // }

        int i,k;
        for(i=0,k=0;originY+i<getHeight();i+=x,k++){
        
            g.drawLine(originX - getWidth(), originY + i , originX +getWidth(), originY +i ); //drwaing horizontal lines
            if(x>10)
            g.drawString(String.valueOf(-k), originX , originY+i);
            g.drawLine(originX - getWidth(), originY - i , originX +getWidth(), originY -i );
            if(x>10)
            g.drawString(String.valueOf(k), originX , originY-i);
        }

        for(i=0,k=0;(originX+i<getWidth())||(originX-i>0);i+=x,k++){ //drawing vertical lines
            g.drawLine(originX +i, originY + getHeight() , originX +i, originY -getHeight());
            if(x>10)
            g.drawString(String.valueOf(k), originX+i , originY);
            g.drawLine(originX - i , originY - getHeight() , originX - i, originY +getHeight());
            if(x>10)
            g.drawString(String.valueOf(-k), originX-i , originY);
        }


        g.setColor(Color.red);
        g.drawLine(0, originY, getWidth(), originY);
        g.drawLine(originX, 0, originX, getHeight());
        plotLine(new point(-5,-2), new point(10, 8), Color.black, g);
    }
    public void plotPoint(int x, int y, Color c, Graphics g) {
        originX = (getX() + getWidth()) / 2;
        originY = (getY() + getHeight()) / 2;
        Color temp = g.getColor();
        g.setColor(c);
        g.fillOval(originX + j * x - 5, originY - j * y - 5, 10, 10);
        g.setColor(temp);
    }
    public void plotLine(point p1, point p2, Color c, Graphics g) {
        int x1 = p1.x, y1 = p1.y;
        int x2 = p2.x, y2 = p2.y;
        int dx = Math.abs(x2 - x1), dy = Math.abs(y2 - y1);
        int steps = Math.max(dy, dx);
        double inx = dx / ((1.0) * steps), iny = dy / ((1.0) * steps);
        if (x2 < x1)
            inx *= -1;
        if (y2 < y1)
            iny *= -1;
        double x3 = x1, y3 = y1;
        for (int i = 0; i <= steps; i++) {
            int demo = (int) Math.round(x3);
            int demo1 = (int) Math.round(y3);
            plotPoint(demo, demo1, c, g);
            x3 = x3 + inx;
            y3 = y3 + iny;
        }
    }
}