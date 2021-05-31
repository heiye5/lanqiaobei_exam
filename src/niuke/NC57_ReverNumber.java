package niuke;

/**
 * 反转数字
 * 描述
 * 将给出的32位整数x翻转。
 * 例1:x=123，返回321
 * 例2:x=-123，返回-321
 *
 * 你有注意到翻转后的整数可能溢出吗？因为给出的是32位整数，则其数值范围为[−2^{31}, 2^{31} − 1][−2
 * 31
 *  ,2
 * 31
 *  −1]。翻转可能会导致溢出，如果反转后的结果会溢出就返回 0。
 *
 * 示例1
 * 输入：
 * -123
 * 复制
 * 返回值：
 * -321
 */

public class NC57_ReverNumber {
    public static void main(String[] args) {
        int n = 0;
        int re = reverse(n);
        System.out.println(re);
    }

    public static int reverse (int x) {
        String num = x + "";
        if(num.length() == 1){
            return x;
        }
        int tmp = Math.abs(x);
        String numStr = "";

        while(tmp != 0){
            int t = tmp % 10;
            numStr += t;
            tmp /= 10;
        }

        if(x < 0){
            numStr = "-" + numStr;
        }

        return Integer.parseInt(numStr);
    }
}
