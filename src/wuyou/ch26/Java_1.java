package wuyou.ch26;

public class Java_1
{
   //*********Found**********
   public static void main(String []args)
   {
      char ch='d';
   //*********Found**********
      switch(ch)
      { 
         case 'a': System.out.print("a");break;
         case 'b': System.out.print("b");
         case 'c': System.out.print("c");break;
         //*********Found**********
         default: System.out.print("abc");
      }
   } 
}
