import java.awt.*;

public class Tank  extends  Surface{
    int x , y ;
    static  int dlugosc_tank = 250;
    static int  wysokosc_tank = 100;

    Tank(int x , int y , Graphics g)
    {
     this.x = x;
     this.y = y;
     initUI(g);
    }

    public void  initUI(Graphics g)
    {
        g.setColor(new Color(21, 85, 16, 215));
        g.fillRect(x, y, dlugosc_tank, wysokosc_tank);
        g.fillArc(x-50, y, 110, 100, 100, 300);
        g.setColor(new Color(85, 16, 60, 158));
        g.fillRect(x+ 30 ,y - 50,dlugosc_tank - 50,wysokosc_tank - 50);
        g.setColor(new Color(85, 27, 16, 232));
        for(int i = 0 ; i < 13 ; i++) {
            int temp = 20 * i;
            g.fillOval(x + temp - 30, y + 100, 50, 50);
        }
        g.fillRect(x-200,y - 25,dlugosc_tank,10);


    }







}
