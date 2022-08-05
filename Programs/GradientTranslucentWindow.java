import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagLayout;
import java.awt.Paint;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UnsupportedLookAndFeelException;

public class GradientTranslucentWindow extends JPanel{

   public static void main(String[] args)        
      throws ClassNotFoundException, InstantiationException,        
      IllegalAccessException, UnsupportedLookAndFeelException {
       
      JFrame.setDefaultLookAndFeelDecorated(true);
      // Create the GUI on the event-dispatching thread
      SwingUtilities.invokeLater(new Runnable() {
         @Override
         public void run() {
            createWindow();                      
         }
      });
   }

   private static void createWindow() {          
      JFrame frame = new JFrame("Translucent Window");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      createUI(frame);
      frame.setVisible(true);          
   }

   private static void createUI(JFrame frame){
      frame.setLayout(new GridBagLayout());
      frame.setSize(255, 255);            
      frame.setLocationRelativeTo(null);
      frame.setBackground(new Color(0,0,0,0));

      JPanel panel = new javax.swing.JPanel() {
         protected void paintComponent(Graphics g) {
            if (g instanceof Graphics2D) {
               final int R = 100;
               final int G = 100;
               final int B = 100;                
               Paint p =
                  new GradientPaint(0.0f, 0.0f, new Color(R, G, B, 0),
                  getWidth(), getHeight(), new Color(R, G, B, 255), true);
               Graphics2D g2d = (Graphics2D)g;
               g2d.setPaint(p);
               g2d.fillRect(0, 0, getWidth(), getHeight());
            } else {
               super.paintComponent(g);
            }
         }
      };
      panel.setLayout(new GridBagLayout());
      // panel.add(new JButton("Hello World"));
      frame.setContentPane(panel);
   }
}