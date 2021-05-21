package algorithm;

import java.util.Scanner;

/**
 * 欧几里得算法/辗转相除法
 */

public class Euclid {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int m = sca.nextInt();
        int num1 = n;
        int num2 = m;

        int t;
        while(m != 0){
            t = n % m;
            n = m;
            m = t;
        }
        System.out.println(num1 + "和" + num2 + "的最大公因数是 : " + n);
    }
}
