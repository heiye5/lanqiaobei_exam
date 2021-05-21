package wuyou.ch15;

import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.awt.*;

//*********Found**********
public class Java_3 implements ActionListener{
    JFrame f;
    JPanel p;
    JColorChooser cc;
    Container c;
    Color myColor;
    JMenuBar mb;
    JMenu m1;
    JMenuItem mi1;
    public static void main(String args[]){
        Java_3 demo=new Java_3();
        demo.go();
    }
    void go(){
        JFrame f=new JFrame("File Chooser Demo");
        mb=new JMenuBar();
        f.setJMenuBar(mb);
        //*********Found**********
        m1=new JMenu("Edit");
        mb.add(m1);
        mi1=new JMenuItem("Choose Color");
        m1.add(mi1);
        //*********Found**********
        mi1.addActionListener(this);
        c=f.getContentPane();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p=new JPanel();
        myColor=Color.red;
        p.setBackground(myColor);
        c.add("Center",p);
        f.setSize(300,300);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        cc=new JColorChooser();
        //*********Found**********
        myColor=cc.showDialog(c,"Choose window background color",Color.white);
        p.setBackground(myColor);
    }
}