import java.applet.*;
import java.awt.*;
import java.awt.event.*;



public class q2 extends Applet implements ActionListener, MouseWheelListener
{
    Button button1, button2,button3,button4;
    int x=40;
    float r=5f;
    int originX=0;
    int originY=0;
    public void init()
    {
        
        this.setSize(new Dimension(800, 600));

        

        button1= new Button("Zoom In");
        add(button1);
        button2= new Button("Zoom Out");
        add(button2);
        // button3=new Button("<-");
        // add(button3);
        // button4=new Button("->");
        // add(button4);
        button1.addActionListener(this);
        button2.addActionListener(this);
        // button3.addActionListener(this);
        // button4.addActionListener(this);
    
        addMouseWheelListener(this);
        originX = (getX() + getWidth()) / 2;
        originY = (getY() + getHeight()) / 2;
    
        
    
    }

    public void paint(Graphics f)
    {  

        f.setColor(Color.red);
        int radius = 1;
        radius*=x;
        f.fillRect(originX-radius/2+5*(int)x, originY-radius/2+5*(int)x, radius, radius);
        f.fillOval(originX-radius/2, originY-radius/2, radius, radius);
        f.setColor(Color.black);
        int i;
        for(i=0;originY+i<getHeight();i+=x){
        
            f.drawLine(originX - getWidth(), originY + i , originX +getWidth(), originY +i ); //drwaing horizontal lines
            f.drawLine(originX - getWidth(), originY - i , originX +getWidth(), originY -i );
        }

        for(i=0;(originX+i<getWidth())||(originX-i>0);i+=x){ //drawing vertical lines
            f.drawLine(originX +i, originY + getHeight() , originX +i, originY -getHeight());
            f.drawLine(originX - i , originY - getHeight() , originX - i, originY +getHeight());
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

    public void actionPerformed(ActionEvent e)
    {
        // int l=20;
        if(e.getSource()==button1)
        {
            x++;
        }
        else if(e.getSource()==button2){
            if(x-r>0)
            x-=r;
        }
        // else if(e.getSource()==button3)
        // {
        //     if(originX+l*x<=800)
        //     originX+=l*x;
        // }
        // else if (e.getSource()==button4)
        // {
        //     if(originX-l*x>=0)
        //     originX-=l*x;
        // }
        repaint();
    }
    


}