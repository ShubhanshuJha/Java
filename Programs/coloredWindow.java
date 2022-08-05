import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JApplet;
import javax.swing.JFrame;

public class coloredWindow extends JApplet {

  public void init() {
    setBackground(Color.blue);
    // setForeground(Color.white);
  }

  public void paint(Graphics g) {
    Graphics2D g2 = (Graphics2D) g;
    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
        RenderingHints.VALUE_ANTIALIAS_ON);

    g2.setPaint(Color.gray);
    int x = 2;
    int y = 2;
    // fill RoundRectangle2D.Double
    GradientPaint bg = new GradientPaint(x, y, Color.blue, 200, y,
        Color.green);
    g2.setPaint(bg);
    g2.fill(new Rectangle2D.Double(x, y, 255, 255));
    g2.setPaint(Color.black);
  }

  public static void main(String s[]) {
    JFrame f = new JFrame("W_4_2");
    f.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });
    JApplet applet = new coloredWindow();
    f.getContentPane().add("Center", applet);
    applet.init();
    f.pack();
    f.setSize(new Dimension(274, 296));
    f.show();
  }
}