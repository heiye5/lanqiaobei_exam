package wuyou.ch20.ch27;

public class Java_1
{
   
   public static void main(String[] args)
   {
      long sum;
      //*********Found**********
      sum = 0;
      for(int i=1;i<8;i+=2){
          long b=1;
          //*********Found**********
          for(int j=1; j<=i; j++)
          //*********Found**********  
              b *= j;
          System.out.println( i + "!= " + b);
          sum+=b;
      }
      System.out.println("sum=" + sum);
      
   }
}