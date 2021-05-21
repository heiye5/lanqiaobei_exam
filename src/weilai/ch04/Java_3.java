package weilai.ch04;

import java.io.*;
import java.lang.Thread;


class MyThread extends Thread{
   public int x = 0;
//*********Found********
   public void run(){
    System.out.println(++x);
  }
}
//*********Found********
class RThread implements Runnable{
   private int x = 0;
   public void run(){
        System.out.println(++x);
  }
}

public class Java_3 {
  public static void main(String[] args) throws Exception{
    for(int i=0;i<5;i++){
       Thread t = new MyThread();
	//*********Found********
       t.start();
    }
    Thread.sleep(1000);
    System.out.println();
//*********Found********
    RThread r = new RThread();
//*********Found********
    for(int i=0;i<5;i++){
       Thread t = new Thread(r);
       t.start();
    }
  }
}