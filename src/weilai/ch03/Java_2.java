package weilai.ch03;

import javax.swing.*;
import java.awt.event.*;

public class Java_2 extends JFrame {
    private JButton b;
    public Java_2(String s){
        setTitle(s);
        b=new JButton("Hello");
        getContentPane().add(b);
     //*********Found********
        b.addActionListener(new HandleButton());
	setSize(150,150);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     //*********Found********
	setVisible(true);
    }
    class HandleButton implements ActionListener{
        public void actionPerformed(ActionEvent e){
             //*********Found********
            if ( "Hello".equals(e.getActionCommand()) )
                b.setText("你好");
            else
                b.setText("Hello");
        }
    }
    public static void main(String args[]){
         //*********Found********
        new Java_2("二级Java");
    }
}