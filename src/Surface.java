import sun.swing.SwingUtilities2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.font.TextAttribute;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import java.text.AttributedString;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
class Surface extends JPanel implements ActionListener{

    private final int DELAY = 150;
    private Timer timer;

    public Surface() {

        initTimer();
    }

    private void initTimer() {

        timer = new Timer(DELAY, this);
        timer.start();
    }

    public Timer getTimer() {

        return timer;
    }

    private void doDrawing(Graphics g) {

        Postac p1 = new Postac(300,100 , g);
        Postac p2 = new Postac(100,300,g);
        Postac p3 = new Postac(200,500,g);
        Postac p4 = new Postac(300,700,g);
        Postac p5 = new Postac(100,750,g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setPaint(Color.blue);
        setBackground(Color.BLACK);
        Ak47 ak47 = new Ak47(300,200,g);
        Ak47 ak47a = new Ak47(100,400,g);
        Ak47 ak47b = new Ak47(200,600,g);
        Ak47 ak47c = new Ak47(300,800,g);
        Ak47 ak47d = new Ak47(100,850,g);

        g2d.setColor(Color.ORANGE);

        for (int i = 1; i <= 10; i++) {

            float alpha = i * 0.1f;
            AlphaComposite alcom = AlphaComposite.getInstance(
                    AlphaComposite.SRC_OVER, alpha);
            g2d.setComposite(alcom);
            g2d.fillRect(50 * i, 20, 40, 40);
        }

        for (int i = 1; i <= 10; i++) {
            g.setColor(new Color(14, 165, 22, 148));
            float alpha = i * 0.1f ;
            AlphaComposite alcom = AlphaComposite.getInstance(
                    AlphaComposite.SRC_OVER, alpha);
            g2d.setComposite(alcom);
            g2d.fillRect(50 * i + 300, 20, 40, 40);
        }

        for (int i = 1; i <= 10; i++) {
            g.setColor(new Color(199, 26, 147, 148));
            float alpha = i * 0.1f ;
            AlphaComposite alcom = AlphaComposite.getInstance(
                    AlphaComposite.SRC_OVER, alpha);
            g2d.setComposite(alcom);
            g2d.fillRect(50 * i + 500, 20, 40, 40);
        }
        for (int i = 1; i <= 10; i++) {
            g.setColor(new Color(121, 116, 14, 148));
            float alpha = i * 0.1f ;
            AlphaComposite alcom = AlphaComposite.getInstance(
                    AlphaComposite.SRC_OVER, alpha);
            g2d.setComposite(alcom);
            g2d.fillRect(50 * i + 700, 20, 40, 40);
        }
        for (int i = 1; i <= 10; i++) {
            g.setColor(new Color(229, 221, 37, 148));
            float alpha = i * 0.1f ;
            AlphaComposite alcom = AlphaComposite.getInstance(
                    AlphaComposite.SRC_OVER, alpha);
            g2d.setComposite(alcom);
            g2d.fillRect(50 * i + 1000, 20, 40, 40);
        }
        for (int i = 1; i <= 10; i++) {
            g.setColor(new Color(12, 118, 59, 148));
            float alpha = i * 0.1f ;
            AlphaComposite alcom = AlphaComposite.getInstance(
                    AlphaComposite.SRC_OVER, alpha);
            g2d.setComposite(alcom);
            g2d.fillRect(50 * i + 1200, 20, 40, 40);
        }
        Tank t1 = new Tank(1600,200,g);
        Tank t2 = new Tank(1400,500,g);
        Tank t3 = new Tank(1400,800,g);

        Duch d1 = new Duch(1000,300,g);
        Duch d2 = new Duch(800,600,g);
        Duch d3 = new Duch(600,200,g);

        dziki_napis(g);

    }


    public  void dziki_napis(Graphics d)
    {
        d.setColor(Color.pink);
        //String words = "to nie ja bylam ewaaaaaaaa";
        //AttributedString as1 = new AttributedString(words);
      //  as1.addAttribute(TextAttribute.FOREGROUND, Color.red, 0, 6);
       // d.drawString(as1.getIterator(), 100, 100);
       napisv3(d);


    }

    public void napisv3(Graphics d2d) {
        Graphics2D g2d = (Graphics2D) d2d.create();

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        String sz = "STICK VS GHOST VS TANK";

        Font font = new Font("Courier", Font.PLAIN, 50);

        g2d.translate(200, 500);

        FontRenderContext frc = g2d.getFontRenderContext();

        GlyphVector gv = font.createGlyphVector(frc, sz);
        int length = gv.getNumGlyphs();

        for (int i = 0; i < length; i++) {

            Point2D p = gv.getGlyphPosition(i);
           double theta = (double) i / (double) (length - 1)  ;
            AffineTransform at = AffineTransform.getTranslateInstance(p.getX(),
                    p.getY());
            at.rotate(theta + 200);

            Shape glyph = gv.getGlyphOutline(i);
            Shape transformedGlyph = at.createTransformedShape(glyph);
            g2d.fill(transformedGlyph);

        }
        g2d.dispose();
    }


    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        doDrawing(g);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
}





