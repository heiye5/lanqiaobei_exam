package ch_2013;

import javax.lang.model.type.ArrayType;
import java.util.ArrayList;

/**
 * 题目标题: 颠倒的价牌
 * 小李的店里专卖其它店中下架的样品电视机，
 * 可称为：样品电视专卖店。其标价都是4位数字（即千元不等）。
 * 小李为了标价清晰、方便，使用了预制的类似数码管的标价签，
 * 只要用颜色笔涂数字就可以了。
 *
 * 这种价牌有个特点，对一些数字，倒过来看也是合理的数字。
 * 如：1 2 5 6 8 9 0 都可以。这样一来，如果牌子挂倒了，
 * 有可能完全变成了另一个价格，比如：1958 倒着挂就是：8561，差了几千元啊！！
 *
 * 当然，多数情况不能倒读，比如，1110 就不能倒过来，因为0不能作为开始数字。
 *
 * 有一天，悲剧终于发生了。某个店员不小心把店里的某两个价格牌给挂倒了。
 * 并且这两个价格牌的电视机都卖出去了！
 *
 * 庆幸的是价格出入不大，其中一个价牌赔了2百多，
 * 另一个价牌却赚了8百多，综合起来，反而多赚了558元。
 *
 * 请根据这些信息计算：赔钱的那个价牌正确的价格应该是多少？
 *
 */

public class DianDao_201304 {
    public static void main(String[] args) {
        ArrayList<Price> a1 = new ArrayList<Price>();
        ArrayList<Price> a2 = new ArrayList<Price>();

        for(int i=1000;i<10000;i++) {
            String numStr = i + "";             //转成字符串

            if(numStr.contains("3") || numStr.contains("4") || numStr.contains("7")){
                continue;
            }

            String reNum = reverse(numStr);     //翻转之后的字符串
            int num = Integer.parseInt(reNum);  //转成int
            int plus = num - i;

            if (plus < -200 && plus > -300) {
                a1.add(new Price(i, plus));
            }
            if (plus < 900 && plus > 800) {
                a2.add(new Price(i,plus));
            }

            for (Price p1: a1
                 ) {
                for (Price p2: a2
                     ) {
                    if(p1.plus + p2.plus == 558){
                        System.out.println(p1.P + " " + p1.plus);
                        System.out.println(p2.P + " " + p2.plus);
                    }
                }
            }

        }
    }

    private static class Price{
        int P;              //原价
        int plus;           //颠倒价

        public Price(int p, int plus) {
            P = p;
            this.plus = plus;
        }
    }

    //颠倒数字
    private static String reverse(String num) {
        char[] chars = new char[num.length()];
        for(int i=chars.length-1,j=0;i>=0;i--,j++){
            char c = num.charAt(i);
            if(c == '6'){
                chars[j] = '9';
            }else if(c == '9'){
                chars[j] = '6';
            }else{
                chars[j] = c;
            }
        }
        return new String(chars);
    }
}
