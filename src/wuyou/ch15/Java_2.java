package wuyou.ch15;

//*********Found**********
public class Java_2  extends Thread{
    private String sThreadName;
    public static void main(String argv[]){
        Java_2 first = new Java_2("first");
        //*********Found**********
        first.start();
        Java_2 second = new Java_2("second");
        //*********Found**********
        second.start();
    }

    //*********Found**********
    public Java_2(String s){
        sThreadName = s;
    }

    public String getThreadName(){
        return sThreadName;
    }

    public void run(){
        for(int i = 0; i < 4; i ++){
            //*********Found**********
            System.out.println(getThreadName()+i);
            try{
                 Thread.sleep(100);
            } catch(InterruptedException e){
            	System.out.println(e.getMessage());
            }
        }
    }
}