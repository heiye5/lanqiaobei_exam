package wuyou.ch20.ch22;

public class Java_1 extends TT
{
   //*********Found**********
   public static void main(String args[])
   {
      Java_1 t = new Java_1("小龙");
   }
   public Java_1(String s)
   {
      super(s);
      System.out.println("您好吗？");
   }
   public Java_1()
   {
      this("我是文明");
   }
}

class TT
{
   public TT()
   {
      System.out.println("多高兴啊！");
   }
   public TT(String s)
   {
   //*********Found**********
      this();
      System.out.println("我是"+s);
   }
}
