package wuyou.ch24;

public  class  Java_2
{
   public static void main(String[] args)
   {
      Thread t = new SimpleThread("Testing_Thread");
       //*********Found**********
      t.start();
   }
}
 //*********Found**********
class SimpleThread extends Thread
{
   public SimpleThread(String str)
   {
      //*********Found**********
      super(str);
   }
    //*********Found**********
   public void run()
   {
      System.out.println("Running the " + getName() + ":");
      for (int i = 0; i < 5; i++)
      {
         System.out.println("---" + i + "---" + getName());
         try
         {
            sleep((int)(2 * 100));
         }
         //*********Found**********
         catch (InterruptedException e) { }
      }
   }
}