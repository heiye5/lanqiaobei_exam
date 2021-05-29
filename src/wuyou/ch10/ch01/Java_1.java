package wuyou.ch10.ch01;

import javax.swing.JOptionPane;  //����JOptionPane��

public class Java_1 {
   public static void main( String args[] )
   {
//*********Found********
      JOptionPane.showMessageDialog(
         null, "欢迎\\n你\\n参加\\nJava\\n考试!" );
      System.exit( 0 );  // 结束程序
   }
}
/* JOptionPane类的常用静态方法如下：
   showInputDialog()
   showConfirmDialog()
   showMessageDialog()
   showOptionDialog()
*/