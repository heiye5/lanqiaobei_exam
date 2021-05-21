package weilai.ch01;

import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import javax.swing.*;

public class Java_3
{
   public static void main(String[] args)
   {
      FontFrame frame = new FontFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
}

     //*********Found********
class FontFrame extends JFrame
{
   public FontFrame()
   {
      setTitle("��԰��.ѩ");
      setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
      FontPanel panel = new FontPanel();
      Container contentPane = getContentPane();
     //*********Found********
      contentPane.add(new FontPanel());
   }
   public static final int DEFAULT_WIDTH = 300;
   public static final int DEFAULT_HEIGHT = 200;
}

     //*********Found********
class FontPanel extends JPanel
{
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);
      Graphics2D g2 = (Graphics2D)g;
      String message = "��������������񳯣�";
      Font f = new Font("����", Font.BOLD, 24);
      g2.setFont(f);
      FontRenderContext context = g2.getFontRenderContext();
      Rectangle2D bounds = f.getStringBounds(message, context);
      double x = (getWidth() - bounds.getWidth()) / 2;
      double y = (getHeight() - bounds.getHeight()) / 2;
      double ascent = -bounds.getY();
      double baseY = y + ascent;
      g2.setPaint(Color.RED);
     //*********Found********
      g2.drawString(message, (int)x, (int)(baseY));
   }
}