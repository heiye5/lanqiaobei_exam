package practice.basics;

/**
 * 01字串
 * 问题描述
 * 对于长度为5位的一个01串，每一位都可能是0或1，一共有32种可能。它们的前几个是：
 *
 * 00000
 *
 * 00001
 *
 * 00010
 *
 * 00011
 *
 * 00100
 *
 * 请按从小到大的顺序输出这32种01串。
 *
 * 输入格式
 * 本试题没有输入。
 * 输出格式
 * 输出32行，按从小到大的顺序每行一个长度为5的01串。
 * 样例输出
 * 00000
 * 00001
 * 00010
 * 00011
 * <以下部分省略>
 */

public class ZiChuan {
    public static void main(String[] args) {
        f3();
    }

    public static void f1(){
        for(int a=0;a<2;a++){
            for(int b=0;b<2;b++){
                for(int c=0;c<2;c++){
                    for(int d=0;d<2;d++){
                        for(int e=0;e<2;e++){
                            System.out.println(a+ "" + b +c+d+e);
                        }
                    }
                }
            }
        }
    }

    public static void f2(){
        String str = "00000";
        char c[] = str.toCharArray();
        for(int i=0;i<32;i++){
            System.out.println(c[0] + "" +c[1]+c[2]+c[3]+c[4]);
            c[4] += 1;
            for(int j=4;j>0;j--){
                if(c[j] == '2'){
                    c[j-1] += 1;
                    c[j] = '0';
                }
            }
        }
    }

    public static void f3(){
        for(int i=0;i<32;i++){
            System.out.println(i%32/16 + "" + i%16/8 + i%8/4 + i%4/2 + i%2);
        }
    }


}
