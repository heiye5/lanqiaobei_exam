package wuyou.ch20.ch28;

public class Java_1 {
    public static void main(String args[]) {
        
        int x,n;
        
     //*********Found********
        n = 0;
        for( x = 100 ; x <= 200 ; x++)
            if  ( x % 9 == 0 ) {
     //*********Found********
                System.out.print("  " + x);
                n++;
     //*********Found********
                if ( n % 5 == 0 ) System.out.println( );
            }
    }
}