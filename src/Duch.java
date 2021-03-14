import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Duch  extends Surface {
    int x ;
    int y ;
    Duch(int x , int y , Graphics g2)
    {
        this.x = x;
        this.y = y;
        initUI(g2);
    }
    public void initUI(Graphics g2)
    {
        g2.setColor(Color.blue);
        g2.fillArc(x-50, y, 250, 700, 4, 175);
        g2.setColor(Color.BLACK);
        g2.fillOval(x,y+300,80,75);
        g2.fillOval(x-50,y+300,78,70);
        g2.fillOval(x+100,y+300,72,56);
        g2.fillOval(x+150,y+300,72,56);
        g2.fillOval(x+200,y+300,72,56);
        g2.fillOval(x+50,y+300,72,56);
        g2.fillOval(x,y+300,72,56);
        g2.fillOval(x-100,y+300,72,56);
        oka(g2);
        //usta(g2);


    }

    public void oka(Graphics g2)
    {
        g2.setColor(Color.red);
        g2.fillOval(this.x+20,this.y+50,30,30);
        g2.fillOval(this.x+80,this.y+50,30,30);
    }

    public void usta(Graphics g2)
    {
        g2.setColor(Color.YELLOW);
        g2.fillRect(this.x,this.y-300,this.x+30,this.y-300);
    }
}
