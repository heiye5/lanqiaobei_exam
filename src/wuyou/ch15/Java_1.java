package wuyou.ch15;

public class Java_1 {
    public static void main(String[] args) {
        int a,x = 2008;
        //*********Found**********
        System.out.print(  x + " -> " );
        while( x != 0 ){
            //*********Found**********
            a = x%10;
            System.out.print(a);
            //*********Found**********
            x = x/10;
        }
    }
}