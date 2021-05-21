package wuyou.ch05;//*********Found**********
public class Java_1{
   public static void main(String args[]) {
      byte b = 10;   // 二进制表示00001010
      //*********Found**********
      byte c = 15;
      b = (byte)(b ^ c);
      //*********Found**********
      System.out.println("b的结果是：" + b);
   }
}