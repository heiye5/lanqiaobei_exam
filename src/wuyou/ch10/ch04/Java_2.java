package wuyou.ch10.ch04;

//*********Found**********
public class Java_2 implements Runnable{
   private int x=0;
   private int y=0;

   public static void main(String[]args){
      Java_2 r = new Java_2();
      //*********Found**********
      Thread t = new Thread( r );
      t.start();
   }
   public void run() {
      //*********Found**********
      int k = 0;
      for(;;){
         x++;
         //*********Found**********
         y++;
         k++;
         if (k>5) break;
         System.out.println("x=" + x + ",y ="+ y);
      }
   }
}