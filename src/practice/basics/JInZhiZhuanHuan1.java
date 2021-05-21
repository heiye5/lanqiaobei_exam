package practice.basics;

import java.util.Scanner;


/**
 * 试题 基础练习 十六进制转八进制
 * 问题描述
 * 　　给定n个十六进制正整数，输出它们对应的八进制数。
 *
 * 输入格式
 * 　　输入的第一行为一个正整数n （1<=n<=10）。
 * 　　接下来n行，每行一个由0~9、大写字母A~F组成的字符串，表示要转换的十六进制正整数，每个十六进制数长度不超过100000。
 *
 * 输出格式
 * 　　输出n行，每行为输入对应的八进制正整数。
 *
 * 　　【注意】
 * 　　输入的十六进制数不会有前导0，比如012A。
 * 　　输出的八进制数也不能有前导0。
 *
 * 样例输入
 * 　　2
 * 　　39
 * 　　123ABC
 *
 * 样例输出
 * 　　71
 * 　　4435274
 */

public class JInZhiZhuanHuan1 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        String a[] = new String[n];
        int shiResult[] = new int[n];              //十进制结果

        for(int i=0;i<n;i++){
            a[i] = sca.next();
            shiResult[i] = zhuanHuan(a[i]);     //将字母转成数字并计算成十进制并存入int数组
        }

        for(int i=0;i<n;i++){
            System.out.println(Integer.toOctalString(shiResult[i]));
        }
    }


    /**
     * 十进制转二进制
     * */
    public static void changeBase2(Integer i){
        System.out.println(Integer.toBinaryString(i));
    }

    /**
     * 十进制转八进制
     * */
    public static void changeBase8(Integer i){
        System.out.println(Integer.toOctalString(i));
    }

    /**
     * 十进制转十六进制
     * */
    public static void changeBase16(Integer i){
        System.out.println(Integer.toHexString(i));
    }

    //将十六进制中字母转换成数字并计算成十进制
    private static int zhuanHuan(String str) {
        String numStr = "";
        int re = 0;
        char charStr[] = str.toCharArray();
//        System.out.println(charStr.length);
        for(int i=0,j=charStr.length-1;i<charStr.length;i++,j--){
            if(charStr[i] >= 'A' && charStr[i] <= 'F'){
                switch (charStr[i]){
                    case 'A':
                        numStr = "10";
                        break;
                    case 'B':
                        numStr = "11";
                        break;
                    case 'C':
                        numStr = "12";
                        break;
                    case 'D':
                        numStr = "13";
                        break;
                    case 'E':
                        numStr = "14";
                        break;
                    case 'F':
                        numStr = "15";
                        break;
                    default:
                        numStr = " ";
                        break;
                }
                re += Math.pow(16,j) * Integer.parseInt(numStr);
//                System.out.println("j = "+ j + ",Math.pow(16,j) = "+ Math.pow(16,j) +",re = " + re + ",Integer.parseInt(numStr) = " +Integer.parseInt(numStr));
            }else{
                re += Math.pow(16,j) * Integer.parseInt(String.valueOf(charStr[i]));
//                System.out.println("charStr[i] = " + charStr[i]);
            }
        }
        return re;
    }

}
