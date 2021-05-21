package wuyou.ch18;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

public class Java_3 extends JFrame {
    private JLabel label;
    private JFileChooser fileChooser;
    private ImagePanel panel;
    public Java_3() {
        setTitle("图片浏览器");
        setSize(500, 400);
        fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File("."));//设置默认路径为当前目录
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        JMenu menu = new JMenu("文件");
        menuBar.add(menu);
        JMenuItem openItem = new JMenuItem("打开图片");
        menu.add(openItem);
        panel = new ImagePanel();
        add(panel);
        //*********Found********
        openItem.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                int result = fileChooser.showOpenDialog(null);
                if(result==JFileChooser.APPROVE_OPTION){
                    String name = fileChooser.getSelectedFile().getPath();
                    //*********Found********
                    panel.setImage(name);
                    panel.repaint();
                }
            }
        });
        JMenuItem exitItem = new JMenuItem("退出图片");
        menu.add(exitItem);
        exitItem.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        //*********Found********
        Java_3 frame = new Java_3 ();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //*********Found********
        frame.setVisible(true);
    }
}


//*********Found********
class ImagePanel extends JPanel {
    private Image image;
    private int showWidth;
    private int showHeight;
    public void setImage(String fileName) {
        try {
            image = ImageIO.read(new File(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (image == null)
            return;
        int imageWidth = image.getWidth(this);
        int imageHeight = image.getHeight(this);
        int width = getWidth();
        int height = getHeight();
        if(imageWidth>width){
            this.showWidth = width;
        }else{
            this.showWidth = imageWidth;
        }
        if(imageHeight>height){
            this.showHeight = height;
        }else{
            this.showHeight = imageHeight;
        }
        g.drawImage(image, 0, 0, showWidth, showHeight, null, null);
    }
}
