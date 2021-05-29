package wuyou.ch20.ch25;

// 阅读下列代码：
public class Java_1
{
   //*********Found**********
   public static void main(String []args)
   {
      String s1=new String("你正在考试");
      String s2=new String("你正在考试");
      System.out.println(s1==s2);
      //*********Found**********
      System.out.println(s1.equals(s2));
   }
}
