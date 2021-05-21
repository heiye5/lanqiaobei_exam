package wuyou.ch11;

import java.awt.*;
import java.awt.event.*;
//*********Found**********
import javax.swing.*;

//*********Found**********
public class Java_3 extends JPanel{

  private int counter = 0;

  private JButton closeAllButton;

  public Java_3() {
    JButton newButton = new JButton("New");
    //*********Found**********
    add(newButton);
    newButton.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent evt){
        CloseFrame f = new CloseFrame();
        counter++;
        f.setTitle("窗体 " + counter);
        f.setSize(200, 150);
        f.setLocation(30 * counter, 30 * counter);
        //*********Found**********
        f.setVisible(true);
        closeAllButton.addActionListener(f);
      }
    });

    closeAllButton = new JButton("Close all");
    add(closeAllButton);
  }

  public static void main(String[ ] args) {
    JFrame frame = new JFrame();
    frame.setTitle("多窗体测试");
    frame.setSize(300, 200);
    frame.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });

    Container contentPane = frame.getContentPane();
    contentPane.add(new Java_3());

    frame.setVisible(true) ;
  }
}

//*********Found**********
class CloseFrame extends JFrame implements ActionListener {
  public void actionPerformed(ActionEvent evt) {
    setVisible(false);
  }
}
