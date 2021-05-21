package practice.basics;

/**
 * 回文数
 * 问题描述
 * 　　1221是一个非常特殊的数，它从左边读和从右边读是一样的，编程求所有这样的四位十进制数。
 * 输出格式
 * 　　按从小到大的顺序输出满足条件的四位十进制数。
 */

public class HuiWenShu {
    public static void main(String[] args) {
        for(int i=1000;i<=9999;i++) {
            if(checkNum(i)){
                System.out.println(i);
            }
        }
    }

    private static boolean checkNum(int num) {
        String numStr = num + "";
        char c[] = numStr.toCharArray();
        for(int i=0,j=c.length-1;i<c.length/2;i++,j--){
            if(c[i] != c[j]){
                return false;
            }
        }

        return true;
    }
}
