package ch_2015_b;

/**
 * 立方变自身 2015 Java B组
 * 观察下面的现象,某个数字的立方，按位累加仍然等于自身。
 * 1^3 = 1
 * 8^3 = 512 5+1+2=8
 * 17^3 = 4913 4+9+1+3=17
 * …
 *
 * 请你计算包括1,8,17在内，符合这个性质的正整数一共有多少个？
 */

public class LiFangBianZiShen {
    public static void main(String[] args) {
        int count = 0;
        for(int i=1;i<99;i++){
            int i1 = i*i*i;
            int sum = sum(i1);
            if(sum == i){
                count++;
                System.out.println(i + " " + i1);
            }
        }
        System.out.println(count);
    }

    private static int sum(int i1) {
        String s = String.valueOf(i1);
        int sum = 0;
        for(int i=0;i<s.length();i++){
            sum += s.charAt(i) - '0';
        }
        return sum;
    }
}
