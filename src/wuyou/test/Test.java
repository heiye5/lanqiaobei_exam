package wuyou.test;

public class Test {
    public static void main (String args[]){
        PrintNumber p = new PrintNumber();
        Thread t = new Thread( p );
        t.start();
        p.run();
    }
    static class PrintNumber implements Runnable{
        int i;
        public void run( ){
            while( true ){
                System.out.println(Thread.currentThread().getName()+"i=" + i++);
                if(i==2)
                    break;
            }
        }
    }
}
