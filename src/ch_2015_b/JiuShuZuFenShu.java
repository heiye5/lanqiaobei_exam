package ch_2015_b;

/**
 * 九数组分数
 *
 * 1,2,3...9 这九个数字组成一个分数，其值恰好为1/3，如何组法？
 *
 * 下面的程序实现了该功能，请填写划线部分缺失的代码。
 *
 * public class A
 * {
 *     public static void test(int[] x)
 *     {
 *         int a = x[0]*1000 + x[1]*100 + x[2]*10 + x[3];
 *         int b = x[4]*10000 + x[5]*1000 + x[6]*100 + x[7]*10 + x[8];
 *         if(a*3==b) System.out.println(a + " " + b);
 *     }
 *
 *     public static void f(int[] x, int k)
 *     {
 *         if(k>=x.length){
 *             test(x);
 *             return;
 *         }
 *
 *         for(int i=k; i<x.length; i++){
 *             {int t=x[k]; x[k]=x[i]; x[i]=t;}
 *             f(x,k+1);
 *             _______________________________________       // 填空
 *         }
 *     }
 *
 *     public static void main(String[] args)
 *     {
 *         int[] x = {1,2,3,4,5,6,7,8,9};
 *         f(x,0);
 *     }
 * }
 *
 *
 */

public class JiuShuZuFenShu {
    public static void test(int[] x)
    {
        int a = x[0]*1000 + x[1]*100 + x[2]*10 + x[3];
        int b = x[4]*10000 + x[5]*1000 + x[6]*100 + x[7]*10 + x[8];
        if(a*3==b) System.out.println(a + " " + b);
    }

    public static void f(int[] x, int k)
    {
        if(k>=x.length){        //形成一个排列
            test(x);            //检查
            return;
        }

        for(int i=k; i<x.length; i++){
            {int t=x[k]; x[k]=x[i]; x[i]=t;}        //交换，确定这一位
            f(x,k+1);
            {int t=x[k]; x[k]=x[i]; x[i]=t;}      // 填空
        }
    }

        public static void main(String[] args)
        {
            int[] x = {1,2,3,4,5,6,7,8,9};
            f(x,0);
        }
}
