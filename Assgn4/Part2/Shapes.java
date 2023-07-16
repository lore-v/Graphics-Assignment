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

public class Shapes extends Applet implements ActionListener {
    int j = 80;
    int originX = 0;
    int originY = 0;
    Button B1, B2, B3, B4, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, B18, B19, B20, B21, B22, B23, B24,
            B25;
    int animal = 0;
    int bksz1 = 0, bkt1 = 0, esh1 = 0, bdsp1 = 0, bdh1 = 0, tsh1 = 0, lgsp1 = 0, lgh1 = 0, asp1 = 0, ah1 = 0;
    int bksz2 = 0, bkt2 = 0, esh2 = 0, bdsp2 = 0, bdh2 = 0, tsh2 = 0, lgsp2 = 0, lgh2 = 0, asp2 = 0, ah2 = 0;

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == B1) {
            if (j < 100) {
                j = j + 10;
                repaint();
            }
        } else if (e.getSource() == B2) {
            if (j > 10) {
                j = j - 10;
                repaint();
            }
        }
        // else if (e.getSource() == B3) {
        // animal = 0;
        // repaint();
        // } else if (e.getSource() == B4) {
        // animal = 1;
        // repaint();
        // }
        else if (e.getSource() == B6) {
            if (bksz1 == 0) {
                bksz1 = 1;
            } else {
                bksz1 = 0;
            }
            repaint();
        } else if (e.getSource() == B7) {
            if (bkt1 == 0) {
                bkt1 = 1;
            } else {
                bkt1 = 0;
            }
            repaint();
        } else if (e.getSource() == B8) {
            if (esh1 == 0) {
                esh1 = 1;
            } else {
                esh1 = 0;
            }
            repaint();
        } else if (e.getSource() == B9) {
            if (bdsp1 == 0) {
                bdsp1 = 1;
            } else {
                bdsp1 = 0;
            }
            repaint();
        } else if (e.getSource() == B10) {
            if (bdh1 == 0) {
                bdh1 = 1;
            } else {
                bdh1 = 0;
            }
            repaint();
        } else if (e.getSource() == B11) {
            if (tsh1 == 0) {
                tsh1 = 1;
            } else if (tsh1 == 1) {
                tsh1 = 2;
            } else {
                tsh1 = 0;
            }
            repaint();
        } else if (e.getSource() == B12) {
            if (lgsp1 == 0) {
                lgsp1 = 1;
            } else {
                lgsp1 = 0;
            }
            repaint();
        } else if (e.getSource() == B13) {
            if (lgh1 == 0) {
                lgh1 = 1;
            } else {
                lgh1 = 0;
            }
            repaint();
        } else if (e.getSource() == B14) {
            if (asp1 == 0) {
                asp1 = 1;
            } else {
                asp1 = 0;
            }
            repaint();
        } else if (e.getSource() == B15) {
            if (ah1 == 0) {
                ah1 = 1;
            } else {
                ah1 = 0;
            }
            repaint();
        } else if (e.getSource() == B16) {
            if (bksz2 == 0) {
                bksz2 = 1;
            } else {
                bksz2 = 0;
            }
            repaint();
        } else if (e.getSource() == B17) {
            if (bkt2 == 0) {
                bkt2 = 1;
            } else {
                bkt2 = 0;
            }
            repaint();
        } else if (e.getSource() == B18) {
            if (esh2 == 0) {
                esh2 = 1;
            } else {
                esh2 = 0;
            }
            repaint();
        } else if (e.getSource() == B19) {
            if (bdsp2 == 0) {
                bdsp2 = 1;
            } else {
                bdsp2 = 0;
            }
            repaint();
        } else if (e.getSource() == B20) {
            if (bdh2 == 0) {
                bdh2 = 1;
            } else {
                bdh2 = 0;
            }
            repaint();
        } else if (e.getSource() == B21) {
            if (tsh2 == 0) {
                tsh2 = 1;
            } else if (tsh2 == 1) {
                tsh2 = 2;
            } else {
                tsh2 = 0;
            }
            repaint();
        } else if (e.getSource() == B22) {
            if (lgsp2 == 0) {
                lgsp2 = 1;
            } else {
                lgsp2 = 0;
            }
            repaint();
        } else if (e.getSource() == B23) {
            if (lgh2 == 0) {
                lgh2 = 1;
            } else {
                lgh2 = 0;
            }
            repaint();
        } else if (e.getSource() == B24) {
            if (asp2 == 0) {
                asp2 = 1;
            } else {
                asp2 = 0;
            }
            repaint();
        } else if (e.getSource() == B25) {
            if (ah2 == 0) {
                ah2 = 1;
            } else {
                ah2 = 0;
            }
            repaint();
        }
    }

    public void paint(Graphics g) {
        for (int i = originY; i >= 0; i -= j / 2) {
            g.drawLine(0, i, getWidth(), i);
        }
        for (int i = originY; i <= getHeight(); i += j / 2) {
            g.drawLine(0, i, getWidth(), i);
        }
        for (int i = originX; i >= 0; i -= j / 2) {
            g.drawLine(i, 0, i, getHeight());
        }
        for (int i = originX; i <= getWidth(); i += j / 2) {
            g.drawLine(i, 0, i, getHeight());
        }
        g.setColor(Color.RED);
        g.drawLine(0, originY, getWidth(), originY);
        g.drawLine(originX, 0, originX, getHeight());

    }

    public void plotPoint(int x, int y, Color c, Graphics g) {
        originX = (getX() + getWidth()) / 2;
        originY = (getY() + getHeight()) / 2;
        Color temp = g.getColor();
        g.setColor(c);
        g.fillOval(originX + j * x / 2 - j / 2, originY - j * y / 2 - j / 2, j, j);
        g.setColor(temp);
    }

    public void midPointCircleDraw(Graphics g, int x_corr, int y_corr, int r) {
        int x = 0, y = r;
        double P = (double) 5 / 4 - r;
        while (x <= y) {
            plotPoint(x + x_corr, y + y_corr, Color.BLACK, g);
            plotPoint(-x + x_corr, y + y_corr, Color.BLACK, g);
            plotPoint(x + x_corr, -y + y_corr, Color.BLACK, g);
            plotPoint(-x + x_corr, -y + y_corr, Color.BLACK, g);
            plotPoint(y + x_corr, x + y_corr, Color.BLACK, g);
            plotPoint(-y + x_corr, x + y_corr, Color.BLACK, g);
            plotPoint(y + x_corr, -x + y_corr, Color.BLACK, g);
            plotPoint(-y + x_corr, -x + y_corr, Color.BLACK, g);
            x++;
            if (P <= 0)
                P = P + 2 * x + 1;
            else {
                y--;
                P = P + 2 * x - 2 * y + 1;
            }
            // if (y < x)
            // break;
        }
    }

    public void dda(point p1, point p2, Color c, Graphics g) {
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

    public void Ellipse(int rx, int ry, Color c, int sx, int sy, double angle, Graphics g) {
        double radians = Math.toRadians(angle);
        int x = 0, y = ry;
        double p = ry * ry + 0.25 * rx * rx - rx * rx * ry;
        while (2 * x * (ry * ry) < 2 * y * (rx * rx)) {
            plotPoint((int) (x * Math.cos(radians) - y * Math.sin(radians)) + sx,
                    (int) (x * Math.sin(radians) + y * Math.cos(radians)) + sy, c, g);
            plotPoint((int) ((-x) * Math.cos(radians) - y * Math.sin(radians)) + sx,
                    (int) ((-x) * Math.sin(radians) + y * Math.cos(radians)) + sy, c, g);
            plotPoint((int) (x * Math.cos(radians) - (-y) * Math.sin(radians)) + sx,
                    (int) ((x * Math.sin(radians) + (-y) * Math.cos(radians))) + sy, c, g);
            plotPoint((int) ((-x) * Math.cos(radians) - (-y) * Math.sin(radians)) + sx,
                    (int) ((-x) * Math.sin(radians) + (-y) * Math.cos(radians)) + sy, c, g);
            if (p < 0) {
                x += 1;
                p += 2 * ry * ry * x + ry * ry;
            } else {
                p += 2 * ry * ry * x + ry * ry - 2 * rx * rx * y;
                y -= 1;
                x += 1;
            }
        }
        double p2 = ry * ry * (x + 0.5) * (x + 0.5) + (y - 1) * (y - 1) * rx * rx - rx * rx * ry * ry;

        while (y >= 0) {
            plotPoint((int) (x * Math.cos(radians) - y * Math.sin(radians)) + sx,
                    (int) (x * Math.sin(radians) + y * Math.cos(radians)) + sy, c, g);
            plotPoint((int) ((-x) * Math.cos(radians) - y * Math.sin(radians)) + sx,
                    (int) ((-x) * Math.sin(radians) + y * Math.cos(radians)) + sy, c, g);
            plotPoint((int) (x * Math.cos(radians) - (-y) * Math.sin(radians)) + sx,
                    (int) ((x * Math.sin(radians) + (-y) * Math.cos(radians))) + sy, c, g);
            plotPoint((int) ((-x) * Math.cos(radians) - (-y) * Math.sin(radians)) + sx,
                    (int) ((-x) * Math.sin(radians) + (-y) * Math.cos(radians)) + sy, c, g);
            if (p2 < 0) {
                x += 1;
                y -= 1;
                p2 += 2 * ry * ry * x - 2 * rx * rx * y + rx * rx;
            } else {
                y -= 1;
                p2 += rx * rx - 2 * rx * rx * y;
            }
        }

    }

}