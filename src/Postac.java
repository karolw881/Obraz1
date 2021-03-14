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

public class Postac extends Surface {
    int   reka_a, reka_b ;

    Postac(int reka_a , int reka_b , Graphics g)
    {

        this.reka_a = reka_a;
        this.reka_b = reka_b;
        initUI(g);
    }
    public int reka_A() {
        return reka_a;
    }
    private  void initUI(Graphics g)
    {

        Graphics2D g2d = (Graphics2D) g;
        g2d.setPaint(Color.blue);
        g2d.drawLine(this.reka_a, this.reka_b+100,this.reka_a  +50, this.reka_b + 50);
        g2d.drawLine(this.reka_a + 50, this.reka_b + 50 ,  this.reka_a + 100, this.reka_b +100  );

        g2d.drawLine( this.reka_a+50,this.reka_b+150,this.reka_a + 50, this.reka_b + 50);

        g2d.drawLine( this.reka_a+50,this.reka_b+150,this.reka_a + 100, this.reka_b + 200);
        g2d.drawLine( this.reka_a+50,this.reka_b+150,this.reka_a , this.reka_b + 200);

        g2d.fillOval(this.reka_a +30, this.reka_b+ 10, 40, 40);






    }

    }


