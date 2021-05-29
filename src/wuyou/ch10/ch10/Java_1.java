package wuyou.ch10.ch10;

import java.io.*;
public class Java_1 {
    public static void main(String[ ] args) throws IOException {
        InputStreamReader ir;
        BufferedReader in;
        int max, x;
        String data;

        max = 0;
        ir = new InputStreamReader(System.in);
        in = new BufferedReader(ir);
        System.out.println("请输入5个正整数：");
        //*********Found**********
        for (int i = 1; i<=5; i++) {
            data = in.readLine();
            //*********Found**********
            x = Integer.parseInt(data);
            if ( max < x )
                //*********Found**********
                max = x;
        }
        System.out.println("输入的最大值是  "+ max);
    }
}
