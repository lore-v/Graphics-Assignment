import java.applet.*;
import java.awt.*;
import java.awt.event.*;




public class q3 extends Applet implements ActionListener, MouseWheelListener
{
 

    Button button1, button2;
    int x=40;
    float r=1f;
    int originX=0;
    int originY=0;
    public void init()
    {   
        this.setSize(new Dimension(800, 600));
        button1= new Button("Zoom In");
        add(button1);
        button2= new Button("Zoom Out");
        add(button2);
        button1.addActionListener(this);
        button2.addActionListener(this);
        addMouseWheelListener(this);
        originX = (getX() + getWidth()) / 2;
        originY = (getY() + getHeight()) / 2;
    }

    public void plotpoint (int x1, int y1, Color C, Graphics G)
    {
        int thickness=x;
        G.setColor(C);
        G.fillOval(originX-thickness/2+x1*(int)x, originY-thickness/2-y1*(int)x, thickness,thickness);
        if(x>10)
        {
            G.drawString(String.valueOf(x1), originX-thickness/2+x1*(int)x , originY-thickness/2-y1*(int)x);
            G.drawString(",", originX-thickness/2+x1*(int)x+7 , originY-thickness/2-y1*(int)x);
            G.drawString(String.valueOf(y1), originX-thickness/2+x1*(int)x+10 , originY-thickness/2-y1*(int)x);
        }
    }

    public void drawHline(int x1, int x2, int y,Graphics f)
    {

        while(x1<x2)
        {
            plotpoint(x1,y,Color.RED,f);
            x1++;
        }
    }

    public void drawVline(int y1, int y2, int x,Graphics f)
    {

        while(y1<y2)
        {
            plotpoint(x,y1,Color.RED,f);
            y1++;
        }
    }

    public void paint(Graphics f)
    {  
        originX = (getX() + getWidth()) / 2;
        originY = (getY() + getHeight()) / 2;
        plotpoint(-50, 50, Color.GREEN, f);
        plotpoint(2,2,Color.GREEN,f);
        f.setColor(Color.red);
        int radius = 1;
        radius*=x;
        //f.fillRect(originX-radius/2+50*(int)x, originY-radius/2+50*(int)x, radius, radius);
        f.fillOval(originX-radius/2, originY-radius/2, radius, radius);
        f.setColor(Color.black);
        int i,k;
        for(i=0,k=0;originY+i<getHeight();i+=x,k++){
        
            f.drawLine(originX - getWidth(), originY + i , originX +getWidth(), originY +i ); //drwaing horizontal lines
            if(x>10)
            f.drawString(String.valueOf(-k), originX , originY+i);
            f.drawLine(originX - getWidth(), originY - i , originX +getWidth(), originY -i );
            if(x>10)
            f.drawString(String.valueOf(k), originX , originY-i);
        }

        for(i=0,k=0;(originX+i<getWidth())||(originX-i>0);i+=x,k++){ //drawing vertical lines
            f.drawLine(originX +i, originY + getHeight() , originX +i, originY -getHeight());
            if(x>10)
            f.drawString(String.valueOf(k), originX+i , originY);
            f.drawLine(originX - i , originY - getHeight() , originX - i, originY +getHeight());
            if(x>10)
            f.drawString(String.valueOf(-k), originX-i , originY);
        }

        drawHline(-10, 10, 10, f);
        drawHline(-10, 10, -10, f);
        drawVline(-10, 10, -10, f);
        drawVline(-10, 10, 10, f);
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

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==button1)
        {
            x++;
        }
        else if(e.getSource()==button2){
            if(x-r>0)
            x-=r;
        }
        repaint();
    }
    

    
    

}