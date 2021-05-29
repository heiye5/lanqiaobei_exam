package wuyou.ch20.ch12;

import java.io.*;
import java.awt.event.* ;
import javax.swing.*;

public class Java_3 implements ActionListener{
  public static void main(String args[]){
    Java_3 t = new Java_3();
    //*********Found**********
    JFrame f = new JFrame("Test");
    JButton b = new JButton("复制文件");
    b.setSize(100,40);
    b.addActionListener(t);
    f.setSize(400,400);
    //*********Found**********
    f.getContentPane().add(b);
    f.pack();
    f.setVisible(true) ;
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public void actionPerformed(ActionEvent event){
    try{
      //*********Found**********
      FileInputStream in=new FileInputStream("a.txt");
      //*********Found**********
      FileOutputStream out=new FileOutputStream("b.txt");
      int c;
      while ((c = in.read()) != -1)
        out.write(c);
      in.close();
      out.close();
    } catch( Exception e){
    }
  }
}
