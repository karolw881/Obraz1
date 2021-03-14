import java.awt.*;

public class Ak47 extends Surface {
    int dlugosc , a , b;
    Ak47(int a , int b , Graphics g)
    {
        this.a = a;
        this.b = b;
        dlugosc = 150;
        initUI(g);

    }
    private  void initUI(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setPaint(Color.RED);
        g2d.drawLine(a,b,a+dlugosc,b);
        g2d.drawLine(a + 20,b, a   ,b + 40);
        g2d.fillArc(a + 60, b, 30, 30, 100, -150);



    }
    }

