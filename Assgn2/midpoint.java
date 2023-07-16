import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class midpoint extends Applet implements ActionListener {
    int j = 30;
    int originX = 0;
    int originY = 0;
    Button B1, B2;
    int x=40;
    @Override
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
                
            }
        } else {
            if (j > 10) {
                j = j - 10;
                repaint();
                
            }
        }
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
        plotLine(-10, -10, 10, 10, Color.black, g);
    }

    public void plotPoint(int x, int y, Color c, Graphics g) {
        originX = (getX() + getWidth()) / 2;
        originY = (getY() + getHeight()) / 2;
        Color temp = g.getColor();
        g.setColor(c);
        g.fillOval(originX + j * x - 5, originY - j * y - 5, 10, 10);
        g.setColor(temp);
    }

    public void plotLine(int x0, int y0, int x4, int y4, Color c, Graphics g) {
        int x = x0;
        int y = y0;
        double dx = x4 - x0;
        double dy = y4 - y0;
        double m = dy / dx;
        System.out.println(m);
        if (Math.abs(m) >= 1.0) {
            double p = 1 - (m / 2);
            while (y <= y4) {
                if (p >= 0.0) {
                    plotPoint(x, y, c, g);
                    x = x + 1;
                    p = p + 1 - m;
                } else {
                    plotPoint(x, y, c, g);
                    p = p + 1;
                }
                y = y + 1;
            }
        } else {
            double p = 0.5 - m;
            while (x <= x4) {
                if (p >= 0.0) {
                    plotPoint(x, y, c, g);
                    p = p - m;
                } else {
                    plotPoint(x, y, c, g);
                    p = p + 1 - m;
                    y = y + 1;
                }
                x = x + 1;
            }
        }
    }
}
