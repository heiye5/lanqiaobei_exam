package wuyou.ch20.ch22;

import java.awt.*;
import javax.swing.*;

//*********Found**********
public class Java_3 extends JApplet
{
   //*********Found**********
   public void init ()
   {
      Container contentPane = getContentPane();
      JLabel label = new JLabel("One World  One Dream",SwingConstants.CENTER);
      label.setFont(new Font("Arial", Font.BOLD, DEFAULT_SIZE));
      //*********Found**********
      contentPane.add(label);
   }
   private static final int DEFAULT_SIZE = 24;
}
