package wuyou.ch02;

import java.awt.*;
import java.applet.*;

//*********Found********
public class Java_2 extends Applet
{
    TextArea outputArea;

    public void init()
    {
        setLayout(new BorderLayout());
        outputArea = new TextArea();
     //*********Found********
        add( outputArea );

      //计算0至10的阶乘
        for ( long i = 0; i <= 10; i++ )
            //*********Found********
            outputArea.append(i + "! = " + factorial(i) + "\n" );
    }

   // 用递归定义阶乘方法
    public long factorial( long number )
    {
        if ( number <= 1 )  //基本情况
            return 1;
        else
            //*********Found********
            return number * factorial( number - 1 );
    }
}
